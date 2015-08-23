/**
 * 
 */
package tour.core;

import java.util.UUID;

/**
 * @author andy
 * token的管理
 */
public class TokenBao {
	private int userId;
	public TokenBao(int userId){
		this.userId=userId;
	}
	
	public String createToken(){
		UUID uuid = UUID.randomUUID();
		//TODO:
		return uuid.toString();
	}
	
	/**
	 * 验证Token
	 * @param sToken
	 * @return
	 */
	public boolean verifyToken(String sToken){
		
		if(sToken==null)
			return false;
		
		boolean isValid=false;
		//TODO:
		if(isValid){
			this.updateTokenTime();
		}
		return false;
	}
	
	/**
	 * 更新Token时间
	 * @param sToken
	 * @return
	 */
	private void updateTokenTime(){
		
	}
}
