/**
 * 
 */
package tour.core;

/**
 * @author andy
 *登录接口
 */
public interface ILogin {
	/**
	 * 用户登录
	 * @param userId 用户ID
	 * @param password 用户密码
	 * @return 返回有效的token
	 */
	String login(int userId,String password);
}
