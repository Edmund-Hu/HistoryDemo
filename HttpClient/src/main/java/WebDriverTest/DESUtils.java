package WebDriverTest;

import java.security.Key;  
import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;  
  
import org.apache.commons.codec.binary.Base64;  
  
public class DESUtils {  
  
    // ��Կ  
    private static Key key;  
    // KEY����  
    private static String KEY_STR = "abc123!@BMWAudi";  
    // ����  
    public static final String UTF_8 = "UTF-8";  
    public static final String DES = "DES";  
  
    // ��̬��ʼ��  
    static {  
        try {  
  
            // KEY ������  
            KeyGenerator generator = KeyGenerator.getInstance(DES);  
            // ��ʼ��,��ȫ�������  
            generator.init(new SecureRandom(KEY_STR.getBytes(UTF_8)));  
            // ������Կ  
            key = generator.generateKey();  
            generator = null;  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * ��Դ�ַ�������,���� BASE64�����ļ����ַ��� 
     *  
     * @param source 
     *            Դ�ַ���,���� 
     * @return �����ַ��� 
     */  
    public static String encode(String source) {  
        try {  
            // ���ݱ����ʽ��ȡ�ֽ�����  
            byte[] sourceBytes = source.getBytes(UTF_8);  
            // DES ����ģʽ  
            Cipher cipher = Cipher.getInstance(DES);  
            cipher.init(Cipher.ENCRYPT_MODE, key);  
            // ���ܺ���ֽ�����  
            byte[] encryptSourceBytes = cipher.doFinal(sourceBytes);  
            // Base64������  
            Base64 base64Encoder = new Base64();  
  
            return base64Encoder.encodeToString(encryptSourceBytes);  
        } catch (Exception e) {  
            // throw Ҳ����һ�� return ·��  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * �Ա������� encode() �������ܺ���ַ������н���/���� 
     *  
     * @param encrypted 
     *            �����ܹ����ַ���,������ 
     * @return �����ַ��� 
     */  
    public static String decode(String encrypted) {  
        // Base64������  
  
        try {  
            // �Ƚ���base64����  
            byte[] cryptedBytes = Base64.decodeBase64(encrypted);  
            // DES ����ģʽ  
            Cipher cipher = Cipher.getInstance(DES);  
            cipher.init(Cipher.DECRYPT_MODE, key);  
            // �������ֽ�����  
            byte[] decryptStrBytes = cipher.doFinal(cryptedBytes);  
            // ���ø��������ʽ���ֽ��������ַ���  
            return new String(decryptStrBytes, UTF_8);  
        } catch (Exception e) {  
            // ������ʽȷʵ�ʺϴ�������  
            throw new RuntimeException(e);  
        }  
    }  
    public static void main(String[] args) {
//    	System.out.println(key.toString());
		String  source = "2017-09-05";
		String deString = DESUtils.encode(source);
		System.out.println("���ܺ�"+deString);
		System.out.println("���ܺ�"+DESUtils.decode("CmHnKSr1HVzKBSf29og/Uw=="));

		boolean result = source.matches("^20\\d{2}-[01]\\d{1}-[01]\\d{1}$");
		System.out.println(result);
	/*	Date date1 = new Date();
		Date date2 = new Date("2017/07/01");
		System.out.println((date1.getTime()-date2.getTime())/3600/24/1000);*/
         
	}
}  