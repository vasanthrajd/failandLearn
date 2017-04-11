package com.sasken.util;

import java.util.Properties;
import java.util.ResourceBundle;

import javax.imageio.stream.FileImageInputStream;

import com.sasken.dao.DaoI;
import com.sasken.dao.MySqlDao;
import com.sasken.dao.oracleDAO;

public class daoUtil {
	
	private static ResourceBundle rb;
	
	static
	{
		rb=ResourceBundle.getBundle("sasken");
	}

	public static DaoI getInstance()
	{
		DaoI dao=null;
		//Properties prop=new Properties(new FileImageInputStream("sasken.properties"));
		String str=rb.getString("daotype");
		
		if(str.equals("mysql"))
		{
			dao=new MySqlDao();
		}
		else if(str.equals("oracle"))
		{
			dao=new oracleDAO();
		}
		return dao;
	}
}
