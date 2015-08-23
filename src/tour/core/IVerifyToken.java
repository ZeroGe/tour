/**
 * 
 */
package tour.core;

/**
 * @author andy
 *
 */
public interface IVerifyToken {
	/**
	 * 验证token的有效性
	 * @param userId 用户ID
	 * @param token 有效的token
	 * @return 验证成功则返回true
	 */
	boolean verify(int userId,String token);
}
