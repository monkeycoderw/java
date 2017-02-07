package com.imooc.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class TestAction {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GoddessAction action = new GoddessAction();
		
		/*// 新增
		Goddess g = new Goddess();
		g.setUser_name("小青");
		g.setSex(1);
		g.setAge(25);
		g.setBirthday(new Date());
		g.setEmail("xiaoqing@163.com");
		g.setMobile("1568888888");
		g.setIsdel(0);
		g.setCreate_user("大牛");
		g.setUpdate_user("大牛哥");

		action.add(g);*/
		
		// 删除
		//action.del(2);
		
		/*// 修改
		Goddess g = new Goddess();
		g.setId(3);
		g.setUser_name("小青1");
		g.setSex(11);
		g.setAge(251);
		g.setBirthday(new Date());
		g.setEmail("xiaoqing@163.com1");
		g.setMobile("15688888881");
		g.setIsdel(1);
		g.setUpdate_user("大牛哥1");

		action.edit(g);*/
		
	/*	// 查询
		List<Goddess> result = action.query();
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId());
			//System.out.println(result.get(i).getUser_name());
		}*/
		
		// 查询
		List<Map<String, Object>> params = new ArrayList<Map<String, Object>> ();
		Map<String, Object> map = new HashMap<String, Object> ();
		
		map.put("name", "user_name");
		map.put("rela",  "=");
		map.put("value", "'小青'");
		
		params.add(map);
		
		List<Goddess> result = action.query(params);
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId());
			//System.out.println(result.get(i).getUser_name());
		}
		
		
	}

}
