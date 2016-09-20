package com.panda.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panda.vo.User;

/*
* @author MrC
* @date 2016��9��20������12:15:43
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String index() {
		System.out.println(user.getName()+"fafaf");
		if (!user.getName().equals("")) {
			return SUCCESS;
		}
		return ERROR;
	}

	@Override
	public User getModel() {
		return user;
	}

}
