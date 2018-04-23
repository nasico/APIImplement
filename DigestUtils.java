package mobile.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestUtils {
	public static String Digest(String content, String type) throws NoSuchAlgorithmException{
		// MD5表示加密算法，可以选择其他参数，如SHA-1等
		try {
			MessageDigest digest = MessageDigest.getInstance(type);
			// 先调用update，再调动digest
			digest.update(content.getBytes());
			byte[] byteResult = digest.digest();
			char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
			char str[] = new char[16 * 2]; // 每个字节用 16 进制表示的话，使用两个字符
			int k = 0; // 表示转换结果中对应的字符位置
			for (int i = 0; i < 16; i++) { // 从第一个字节开始，对每一个字节,转换成 16 进制字符的转换
				byte byte0 = byteResult[i]; // 取第 i 个字节
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换, >>> 为逻辑右移，将符号位一起右移
				str[k++] = hexDigits[byte0 & 0xf]; // 取字节中低 4 位的数字转换
			}
			return  new String(str);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new NoSuchAlgorithmException(e);
		}
		
	}
}
