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
 * 数据库小助手
 */
public class DBHelper {
	private static String driver=null;
    private static  String  url=null; 
    private  static  String user=null;  
    private static String password=null;  
  
    public Connection conn = null;  
    public PreparedStatement pst = null;  
    
    /**
     * 构造DBHelper
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
            System.out.println("读取数据库配置异常");
            System.out.println(e);
        }
    }  
    
    /**
     * 打开数据连接
     */
	public void open() {
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("数据库已连接");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据连接异常");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据连接异常");
		}

	}
   
    /**
     * 关闭数据库连接
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
            System.out.println("数据库已关闭");
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    } 
    
    /**
     * 当前数据库是否打开连接
     * @return
     */
    public boolean isConnected(){
    	return (this.conn!=null);	
    }
}
