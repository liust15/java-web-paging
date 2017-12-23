package cn.liust.pdf.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//获取连接
public class DBFactory {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/test";
    String user = "root";
    String password = "root";
    public static DBFactory INSTANCE;

    static {
        INSTANCE = new DBFactory();
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("获取失败" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("驱动链接失败" + e);
        }
        return conn;
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
