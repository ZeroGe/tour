/**
 * 
 */
package tour.core;

import java.util.UUID;

/**
 * @author andy
 * token�Ĺ���
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
	 * ��֤Token
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
	 * ����Tokenʱ��
	 * @param sToken
	 * @return
	 */
	private void updateTokenTime(){
		
	}
}
