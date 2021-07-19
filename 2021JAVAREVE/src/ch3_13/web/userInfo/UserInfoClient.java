package ch3_13.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch3_13.domin.userinfo.UserInfo;
import ch3_13.domin.userinfo.dao.UserInfoDao;
import ch3_13.domin.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$");
		userInfo.setUserName("LEE");
		UserInfoDao userInfoDao = null;
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoOracleDao();
		}		
		else {
			System.out.println("db error");
			return;
			
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}
			
}
