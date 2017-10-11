package com.gk;

import org.junit.Test;

import java.sql.*;

public class UtilTest {
    @Test
    public void praparedStatementTest() throws ClassNotFoundException, SQLException {
        String sql = "select viewuserre0_.id as id1_8_, viewuserre0_.classId as classId2_8_, viewuserre0_.content as content3_8_, viewuserre0_.courseId as courseId4_8_, viewuserre0_.createTime as createTi5_8_, viewuserre0_.createUserId as createUs6_8_, viewuserre0_.createUserName as createUs7_8_, viewuserre0_.isDel as isDel8_8_, viewuserre0_.dirId as dirId9_8_, viewuserre0_.fileExt as fileExt10_8_, viewuserre0_.fileId as fileId11_8_, viewuserre0_.fileName as fileNam12_8_, viewuserre0_.fileSize as fileSiz13_8_, viewuserre0_.fileUrl as fileUrl14_8_, viewuserre0_.isPublic as isPubli15_8_, viewuserre0_.serverUrl as serverU16_8_, viewuserre0_.title as title17_8_, viewuserre0_.updateTime as updateT18_8_ from file.view_user_res_info viewuserre0_ where viewuserre0_.fileName=? and viewuserre0_.dirId=? and viewuserre0_.createUserId=?";
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/file";
        String user = "root";
        String psd = "root";
        Connection connection = DriverManager.getConnection(url, user, psd);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"hello");
        preparedStatement.setLong(2,1l);
        preparedStatement.setLong(3,1l);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getLong(1));
        }
    }
}
