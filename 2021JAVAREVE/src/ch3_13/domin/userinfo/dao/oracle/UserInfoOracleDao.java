package ch3_13.domin.userinfo.dao.oracle;

import ch3_13.domin.userinfo.UserInfo;
import ch3_13.domin.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID =" + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into Oracle DB userID =" + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into Oracle DB userID =" + userInfo.getUserId());
		
	}

}
