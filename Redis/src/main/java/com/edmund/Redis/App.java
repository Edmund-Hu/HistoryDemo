package com.edmund.Redis;

import com.edmund.Utils.JedisUtil;

import redis.clients.jedis.Jedis;

/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		JedisUtil Utils = JedisUtil.getInstance();
		//Jedis jedisCli = Utils.getJedis("172.18.73.21",6379);
		Jedis jedisCli = new Jedis("172.18.73.21", 6379);
		String string = jedisCli.get("name");
		System.out.println(string);
		jedisCli.append("name", "sssk");
		System.out.println(jedisCli.get("name"));
		
	}
}
