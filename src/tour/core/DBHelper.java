/**
 * 
 */
package tour.core;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;
import java.util.Properties;  
/**
 * @author andy
 * ���ݿ�С����
 */
public class DBHelper {
	private static String driver=null;
    private static  String  url=null; 
    private  static  String user=null;  
    private static String password=null;  
  
    public Connection conn = null;  
    public PreparedStatement pst = null;  
    
    /**
     * ����DBHelper
     */
    public DBHelper() {  
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("tourserver.properties");
        Properties p=new Properties();
        try {
            p.load(inputStream);
            this.url=p.getProperty("DBUrl");
            this.user=p.getProperty("DBUser");
            this.password=p.getProperty("DBPassword");
            this.driver=p.getProperty("DBDriver");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("��ȡ���ݿ������쳣");
            System.out.println(e);
        }
    }  
    
    /**
     * ����������
     */
	public void open() {
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("���ݿ�������");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���������쳣");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���������쳣");
		}

	}
   
    /**
     * �ر����ݿ�����
     */
    public void close() {  
        try {  
        	if(this.conn!=null&&(!this.conn.isClosed())){
        		this.conn.close(); 
        		this.conn=null;
        	}
            if(this.pst!=null&&(!this.pst.isClosed())){
            	this.pst.close(); 
            	this.pst=null;
            }
            System.out.println("���ݿ��ѹر�");
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    } 
    
    /**
     * ��ǰ���ݿ��Ƿ������
     * @return
     */
    public boolean isConnected(){
    	return (this.conn!=null);	
    }
}
