package com.sasken.client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.sasken.dao.DaoI;
import com.sasken.exception.InvalidCountryException;
import com.sasken.exception.PlayerNotFoundException;
import com.sasken.util.PlayerUtil;
import com.sasken.vo.Player;

public class ViewPlayers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cname;
		DaoI dao=PlayerUtil.getInstance();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the country id..");
		cname= scan.next();
		try{
			Set<Player> lst= dao.viewPlayer(cname);
			for(Player player : lst){
				System.out.println(player.getPlayerId()+ " " + player.getPlayerName() + " " + player.getRuns() );
				
			}
		}catch(PlayerNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidCountryException e){
			System.out.println(e.getMessage());
		}
		
	}

}
