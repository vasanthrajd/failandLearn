package com.sasken.dao;

import java.util.List;
import java.util.Set;

import com.sasken.exception.InvalidCountryException;
import com.sasken.exception.PlayerDaoException;
import com.sasken.exception.PlayerNotFoundException;
import com.sasken.vo.Player;

public interface DaoI  {		// Interface for the methods to be override in more than one way
		public List<Player> viewPlayer(int ctryId) throws PlayerNotFoundException, InvalidCountryException;		// returns the player class as a list;
		public Set<Player> viewPlayer(String ctryName)throws PlayerNotFoundException, InvalidCountryException;
		
		public int savePlayer(Player player, int cid) throws PlayerDaoException;
		int savePlayer(Player player) throws PlayerDaoException;
}
