/**
 * 
 */
package tour.core;

/**
 * @author andy
 *��¼�ӿ�
 */
public interface ILogin {
	/**
	 * �û���¼
	 * @param userId �û�ID
	 * @param password �û�����
	 * @return ������Ч��token
	 */
	String login(int userId,String password);
}
