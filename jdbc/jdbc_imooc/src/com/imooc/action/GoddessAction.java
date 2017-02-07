package com.imooc.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	
	public void add(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.addGoddess(goddess);
	}
	
	public List<Goddess> get(Integer id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		return dao.get(id);
	}
	
	public void edit(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.updateGoddess(goddess);
	}
	
	public void del(Integer id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.delGoddess(id);
	}
	
	public List<Goddess> query() throws SQLException {
		GoddessDao dao = new GoddessDao();
		return dao.query();
	}
	
	public List<Goddess> query(List<Map<String, Object>> params) throws SQLException {
		GoddessDao dao = new GoddessDao();
		return dao.query(params);
	}
	
	public static void main(String[] args) throws SQLException {
		GoddessDao gd = new GoddessDao();
		List<Goddess> gs = null;
		
		/*Goddess g1 = new Goddess();
		g1.setUser_name("小丽");
		g1.setAge(22);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("xiaoxia@163.com");
		g1.setMobile("123456");
		g1.setCreate_user("大牛");
		g1.setCreate_date(new Date());
		g1.setUpdate_user("大牛哥");
		g1.setUpdate_date(new Date());
		g1.setIsdel(1);
		gd.addGoddess(g1);*/
		
		/*Goddess g1 = new Goddess();
		g1.setId(2);
		g1.setUser_name("小丽");
		g1.setAge(22);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("xiaoxia@163.com");
		g1.setMobile("123456");		
		g1.setUpdate_user("大牛哥");
		g1.setUpdate_date(new Date());
		g1.setIsdel(1);
		System.out.println("user_name: " + g1.getUser_name());
		gd.updateGoddess(g1);*/
		
		//gd.delGoddess(2);
		
		/*
		gs = gd.get(3);
		for(Goddess g: gs) {
			System.out.println(g.getUser_name());
		}*/
		
		/*gs = gd.query();
		System.out.println("Start query");
		for(Goddess g: gs) {
			System.out.println(g.getUser_name());
		}*/
		
	    gs = gd.query("小丽");
		System.out.println(gs.size());
		for(int i = 0; i < gs.size(); i++) {
			System.out.println(gs.get(i).toString());
		}
		
		/*List<Map<String, Object>> params = new ArrayList<Map<String, Object>> ();
		Map<String, Object> param = new HashMap<String, Object> ();
		
		param.put("name", "user_name");
		param.put("rela", "like");
		param.put("value", "'%小%'");
		params.add(param);
		
		param = new HashMap<String, Object> ();
		param.put("name", "mobile");
		param.put("rela", "like");
		param.put("value", "'%6%'");
		params.add(param);
		
		gs = gd.query(params);
		System.out.println(gs.size());
		for(int i = 0; i < gs.size(); i++) {
			System.out.println(gs.get(i).toString());
		}*/
	}
}
