package dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import db.DBUtil;
import model.Goddess;

public class GoddessDao {
	public void addGod(){
		Connection connection=DBUtil.getConnection();
		
	}
	
	public void updateGodess(){
		
	}
	
	public void delGoddess(){
		
	}
	
	public java.util.List<Goddess>query() throws Exception{
		Connection connection=DBUtil.getConnection();
		Statement statement =connection.createStatement();
		ResultSet rs = statement.executeQuery("select name,age from student");
		
		java.util.List<Goddess> gs = new ArrayList<Goddess>();
		Goddess g =null;
		
		while(rs.next()){
			g=new Goddess();
			g.setUser_name(rs.getString("name"));
			g.setAge(rs.getInt("age"));
			gs.add(g);		
			
		}
		return gs;
	}
	
	
	public Goddess get(){
		
		return null;
	}
	
	
}
