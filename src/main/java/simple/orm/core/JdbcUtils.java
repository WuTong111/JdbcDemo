/**
 * $Id: JdbcUtils.java,v 1.0 2019/2/28 10:39 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package simple.orm.core;

import java.sql.*;

/**
 * @Description: 操作数据库- JdbcUtils工具类
 * @author Wuguang
 * @version $Id: JdbcUtils.java,v 1.1 2019/2/28 10:39 G Exp $
 * Created on 2019/2/28 10:39
 */
public class JdbcUtils {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wg","root","123");
            System.out.println(conn);
        }catch (Exception e){
            System.out.println("获取连接对象失败");
            e.printStackTrace();
        }
        return conn;
    }

    /**
    * 增删改
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    */
    public static int excuteUpdate(String sql, Object[] params){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = -1;
        try{
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i=0; i < params.length; i++){
                preparedStatement.setObject(i+1, params[i]);
            }
            result = preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println("更新数据库出现异常。");
            System.out.println(e.getMessage());
        } finally {
            release(preparedStatement, connection);
        }
        return result;

    }

    private static void release(Statement statement, Connection connection) {
        if (statement != null){
            try {
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            statement = null;
        }
        if (connection != null){
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            connection = null;
        }
    }

}