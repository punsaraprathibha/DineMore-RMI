package lk.edu.ijse.dineMore.client.other;

import resources.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class IDController {
    public static String getLastID(String tableName, String colName)throws Exception{
        String sql = " SELECT " +colName+ " FROM " +tableName+ " ORDER BY 1 DESC LIMIT 1 ";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
}
