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
	 * ��֤token����Ч��
	 * @param userId �û�ID
	 * @param token ��Ч��token
	 * @return ��֤�ɹ��򷵻�true
	 */
	boolean verify(int userId,String token);
}
