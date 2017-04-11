package com.sasken.util;

import java.util.ResourceBundle;

import com.sasken.dao.DaoI;
import com.sasken.dao.PlayerJdbcDao;
//  Logic which is repective to our application 
import com.sasken.dao.PlayerXldao;
public class PlayerUtil {
   private static ResourceBundle rb;
   private static DaoI dao;
   private static PlayerJdbcDao playerdao= new PlayerJdbcDao();
   private static PlayerXldao xldao = new PlayerXldao();
   public static ResourceBundle getBundle(){		// to place the driver funtion in a common file
	   if(rb==null){
		   rb=ResourceBundle.getBundle("sasken");
		  
	   }
	   return rb;
   }
   
   public static DaoI getInstance(){
	   String str =rb.getString("dao");
	   if(str.equals("jdbc")){
		   dao=playerdao;
	  }else if( str.equals("xl")){
		  dao=xldao;
	  }
	   return dao;
   }
	
	
}
