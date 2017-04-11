package com.sasken.client;



import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sasken.dao.DaoI;
import com.sasken.exception.InvalidCountryException;
import com.sasken.exception.PlayerNotFoundException;
import com.sasken.util.PlayerUtil;
import com.sasken.vo.Player;

public class ViewPlayers1 {
public static void main(String[] args){
		int p;
		DaoI dao=PlayerUtil.getInstance();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the country id..");
		p= scan.nextInt();
		try{
			List<Player> lst= dao.viewPlayer(p);
			Collections.sort(lst, new Player.RunComparator());
			Collections.reverse(lst);
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
