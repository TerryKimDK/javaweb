package controller;

import java.util.Map;

import dao.UserInfoDao;
import servlet.DataBinding;
import servlet.UserInfoDaoImpl;


public class UserInfoUpdateController implements Controller, DataBinding {
	private UserInfoDao userinfoDao;
	public Object setUserInfoDao(UserInfoDaoImpl userinfoDao) {
		this.userinfoDao = userinfoDao;
		return this;
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getDataBinders() {
		// TODO Auto-generated method stub
		return new Object[] {
				"userinfo", test.UserInfo.class
		};
	}

}
