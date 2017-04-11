package com.sasken.vo;

import java.util.Comparator;

import com.sasken.exception.InvalidRunsException;

public class Player {
		private int playerId;
		private String playerName;
		private int runs;
		
		public int getPlayerId() {
			return playerId;
		}
		
		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}
		
		public String getPlayerName() {
			return playerName;
		}
		
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}
		
		public int getRuns() {  // To avoid the player who scored below 2000
				
					return runs;
		}
		
		public void setRuns(int runs) throws InvalidRunsException {
			if ( runs < 2000){
				throw new InvalidRunsException("Minimum must be 2000");
			}
			this.runs = runs;
		}
		
		@Override
		public boolean equals(Object obj) {		// To avoid Duplicate's for the player id
			Player player=(Player)obj;
			if(this == player || this.playerId== player.playerId){
				return true;
			}else{
				return false;
			}
			
			
		}

		@Override
		public int hashCode() {

			return playerId * 7;
		}
		public static class RunComparator implements Comparator<Player> {

			@Override
			public int compare(Player p1, Player p2) {
				if( p1.getRuns() > p2.getRuns()){
					return 1;
				}else if(p1.getRuns() < p2.getRuns() ){
					return 0;
				}else{
					return -1;
				}
					
			}
			
		}
		
}
