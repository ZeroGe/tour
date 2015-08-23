/**
 * 
 */
package tour.core;

/**
 * @author andy
 * 用户管理类
 */
public class UserBao implements ILogin{
	
	static DBHelper mDBHelper;
	
	@Override
	public String login(int userId, String password) {
		
		return null;
	}
	/**
	 * 用户注册
	 * @param phone 	手机号
	 * @param codeMMD5  验证码MD5字符串
	 * @return
	 */
	public String register(String phone,String codeMMD5){
		
		return null;
	}
	
}
