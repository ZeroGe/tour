/**
 * 
 */
package tour.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author andy
 * MD5������
 */
public class MD5Bao {
	/**
	 * ���ַ���ת����MD5
	 * @param s
	 * @return
	 */
	public static String toMD5String(String s){
		try {
			byte[] buf = s.getBytes();
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(buf);
			byte [] tmp = md5.digest();
			StringBuilder sb = new StringBuilder();
			for (byte b:tmp) {
			    sb.append(Integer.toHexString(b&0xff));
			}
			
			System.out.println(sb);
			
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
