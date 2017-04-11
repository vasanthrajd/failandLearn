package com.sasken.client;

import java.sql.SQLException;

import com.sasken.dao.DaoI;
import com.sasken.exception.InvalidRunsException;
import com.sasken.exception.PlayerDaoException;
import com.sasken.util.PlayerUtil;
import com.sasken.vo.Player;

public class SavePlayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		DaoI dao = PlayerUtil.getInstance();
		try{
		Player player = new Player();
		player.setPlayerId(7);		
		player.setPlayerName("srikanth");
		player.setRuns(8000);
		int res= dao.savePlayer(player, 1);
		if(res > 0){
			System.out.println("Inserted ");
		}else {
			System.out.println(" Not inserted");
		}
		}catch( InvalidRunsException e){
			System.out.println(e.getMessage());
		}catch ( PlayerDaoException  e){
			System.out.println(e.getMessage());
			
		}
	}

}
