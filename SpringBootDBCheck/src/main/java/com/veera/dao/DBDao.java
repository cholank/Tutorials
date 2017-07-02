/**
 * 
 */
package com.veera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.veera.model.DBDatas;

/**
 * @author Cholan
 *
 */
public class DBDao {
	public boolean getStatus(DBDatas dbObj) throws Exception{
		Class.forName(dbObj.getDriver());
        Connection conn = DriverManager.getConnection(dbObj.getUrl(), dbObj.getUsername(), dbObj.getPassword());
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT SYSDATE FROM DUAL");
            if(rs.next()){
            	return true;
            }
        } finally {
            conn.close();
        }
		return false;
	}

}
