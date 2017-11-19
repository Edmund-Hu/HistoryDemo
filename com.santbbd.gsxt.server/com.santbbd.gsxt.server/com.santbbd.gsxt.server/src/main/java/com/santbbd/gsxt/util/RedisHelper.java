package com.santbbd.gsxt.util;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.omg.CORBA.PUBLIC_MEMBER;

import redis.clients.jedis.BinaryJedisPubSub;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisHelper {
    private static JedisPool pool = null;
    static {
        if (pool == null) {
        JedisPoolConfig config = new JedisPoolConfig();
        // 控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
            // 如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
            config.setMaxTotal(500);
            // 控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
            config.setMaxIdle(10);
            // 在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
            config.setTestOnBorrow(true);
            config.setTestOnReturn(true);
// 获取连接池 100000毫秒延时
//             pool = new JedisPool(config, "192.168.1.150", 6379, 100000);
             pool = new JedisPool(config, "127.0.0.1", 6379, 100000);
        
        }
    }


/**
     * 构建redis连接池
     * 
     * @param ip
     * @param port
     * @return JedisPool
     */
     public static JedisPool getPool(){
       return pool;
    }

 /**
     * 返还到连接池
     * 
     * @param pool
     * @param redis
     */
 public static void returnResource(JedisPool pool, Jedis redis)
  {
    if (redis != null)
      pool.returnResource(redis);
  }


/**
     * 获取数据
     * 
     * @param key
     * @return
     */
public static String get(String key)
  {
    String value = null;

    JedisPool pool = null;
    Jedis jedis = null;
    try {
      pool = getPool();
      jedis = pool.getResource();
      value = jedis.get(key);
    }
    catch (Exception e) {
    // 释放redis对象
      pool.returnBrokenResource(jedis);
      e.printStackTrace();
    }
    finally {
    // 返还到连接池
      returnResource(pool, jedis);
    }

    return value;
  }

/**
     * 设置数据
     * 
     * @param key
     * @param value
     * @return
     */
  public static boolean set(String key, String value,int exprieTime)
  {
    JedisPool pool = null;
    Jedis jedis = null;
    boolean bool = false;
    try {
      pool = getPool();
      jedis = pool.getResource();
      jedis.setex(key,exprieTime,value);
      
      bool = true;
    }
    catch (Exception e) {
    // 释放redis对象
      pool.returnBrokenResource(jedis);
      e.printStackTrace();
    }
    finally {
    // 返还到连接池
      returnResource(pool, jedis);
    }
    return bool;
  }

  /**
     * 订阅频道
     * 
     * @param channelName
     * @throws Exception
     */
  public static void subscribe(BinaryJedisPubSub binaryJedisPubSub, byte[] channelName)
  {
    JedisPool pool = null;
    Jedis jedis = null;
    try {
      pool = getPool();
      jedis = pool.getResource();
      jedis.subscribe(binaryJedisPubSub, new byte[][] { channelName });
    }
    catch (Exception e) {
    // 释放redis对象
      pool.returnBrokenResource(jedis);
      e.printStackTrace();
    }
    finally {
    // 返还到连接池
      returnResource(pool, jedis);
    }
  }

/**
     * 取消订阅
     * 
     * @param binaryJedisPubSub
     * @return
     */
  public static boolean unsubscribe(BinaryJedisPubSub binaryJedisPubSub)
  {
    boolean bool = false;
    try
    {
      binaryJedisPubSub.unsubscribe();
      bool = true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return bool;
  }

/**
     * 取消订阅
     * 
     * @param binaryJedisPubSub
     * @param name
     * @return
     */
  public static boolean unsubscribeWithChannelName(BinaryJedisPubSub binaryJedisPubSub, String[] params)
  {
    boolean bool = false;
    byte[][] bytes = new byte[params.length][];
    int i = 0;
    try {
      String[] arr$ = params; int len$ = arr$.length; for (int i$ = 0; i$ < len$; ++i$) { String param = arr$[i$];
        bytes[i] = param.getBytes();
        ++i;
      }
      binaryJedisPubSub.punsubscribe(bytes);
      bool = true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return bool;
  }

/**
     * 推送信息
     * 
     * @param channelName
     * @param msg
     * @return
     */
  public static boolean publishMsgs(byte[] channelName, byte[] msg)
  {
    JedisPool pool = null;
    Jedis jedis = null;
    try {
      pool = getPool();
      jedis = pool.getResource();
      jedis.publish(channelName, msg);

      return true;
    }
    catch (Exception e)
    {
    // 释放redis对象
      pool.returnBrokenResource(jedis);
      e.printStackTrace();
      return false;

    }
    finally 
       { 
       // 返还到连接池
       returnResource(pool, jedis);
        }
  }

/**
     * 清空redis
     * @return
     */
public static boolean flushDB() {
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = getPool();
            jedis = pool.getResource();
            jedis.flushDB();
            return true;
} catch (Exception e) {
            // 释放redis对象
            pool.returnBrokenResource(jedis);
            e.printStackTrace();
            return false;
        }finally {
            // 返还到连接池
            returnResource(pool, jedis);
        }
    }

}