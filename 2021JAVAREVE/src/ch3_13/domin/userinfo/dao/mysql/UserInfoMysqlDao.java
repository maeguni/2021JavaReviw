package ch3_13.domin.userinfo.dao.mysql;

import ch3_13.domin.userinfo.UserInfo;
import ch3_13.domin.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
	
		@Override
		public void insertUserInfo(UserInfo userInfo) {
			System.out.println("Insert into MySQL DB userID =" + userInfo.getUserId());
			
		}
	
		@Override
		public void updateUserInfo(UserInfo userInfo) {
			System.out.println("update into MySQL DB userID =" + userInfo.getUserId());
			
		}
	
		@Override
		public void deleteUserInfo(UserInfo userInfo) {
			System.out.println("delete into MySQL DB userID =" + userInfo.getUserId());
			
		}

	
	
	
	
}


