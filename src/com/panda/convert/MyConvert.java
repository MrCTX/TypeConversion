package com.panda.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.panda.vo.Tel;
import com.panda.vo.User;

/*
* @author MrC
* @date 2016年9月20日下午12:22:05
* @parameter
* @version
*/
public class MyConvert extends StrutsTypeConverter {

	@SuppressWarnings("rawtypes")
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		System.out.println("hello");
		Tel tel = new Tel();
		String str[] = arg1[0].split("-");
		tel.setTelone(str[0]);
		tel.setTwo(str[1]);
		return tel;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map arg0, Object arg1) {
		Tel tel = (Tel) arg1;
		return tel.getTelone()+tel.getTwo();
	}

}
