package com.sasken.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sasken.exception.InvalidCountryException;
import com.sasken.exception.InvalidRunsException;
import com.sasken.exception.PlayerDaoException;
import com.sasken.exception.PlayerNotFoundException;
import com.sasken.vo.Player;

public class PlayerJdbcDao extends JdbcDao implements DaoI {

	@Override
	public List<Player> viewPlayer(int ctryId) throws PlayerNotFoundException, InvalidCountryException {
		List<Player> players=new ArrayList<Player>();
		Player player=null;
		Connection conn=null;
		isValidCountry(ctryId);  // throws Invalid COuntry Exception  
		try{
			conn=openConn();
			String sql="selec * from player where ctry_id = ?";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setInt(1, ctryId);		// which is received from the client by passing the values to this function . 
			ResultSet rs= st.executeQuery();
			rs.last();
			if( rs.getRow()==0){
				throw new  PlayerNotFoundException("No Players");
				
			}
			rs.beforeFirst();
			while(rs.next()) {	
				
				try {
				//player.setRuns(rs.getInt("runs"));					
				player=new Player();
				player.setPlayerId(rs.getInt("pid"));	// this is ths column name in sql table and it is for al below fields
				player.setPlayerName(rs.getString("pname"));
				player.setRuns(rs.getInt("runs"));
				players.add(player);
				}
				catch(InvalidRunsException e){
					System.out.println(e.getMessage());
				}
					
			}
			
		}
		catch(SQLException ex){
			
		}
		
		finally		// shouldn't throw the exceptinon always
		{
			closeConnection(conn);
		}
		return players;
	}

	@Override
	public Set<Player> viewPlayer(String ctryName) throws InvalidCountryException, PlayerNotFoundException {
		Set<Player> players =new HashSet<Player>();
		Connection conn =null;
		Player player=null;
		isValidCountry(ctryName);	// Invalid Country Exception
		
		try {
			conn=openConn();
			String sql="Select p.pid, p.pname, p.runs from country c Inner join Player p on c.cid= p.ctry_id where c.cname = ?";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1, ctryName);
			ResultSet rs=st.executeQuery();
			rs.last();
			if(rs.getRow() == 0){
				throw new PlayerNotFoundException("Player not found");
			}
			rs.beforeFirst();
			
			while(rs.next()){
				try {
					//player.setRuns(rs.getInt("runs"));					
					player=new Player();
					player.setPlayerId(rs.getInt("pid"));	// this is ths column name in sql table and it is for al below fields
					player.setPlayerName(rs.getString("pname"));
					player.setRuns(rs.getInt("runs"));
					players.add(player);
				
				
				} catch( InvalidRunsException e){
					System.out.println(e.getMessage());
				}
				
			}
				
		}
		catch (SQLException e){
			
		}
		finally{
			closeConnection(conn);
			
		}
		
		
		
		
		return players;
	}
	
	public boolean isValidCountry( int ctryId) throws InvalidCountryException{
		
		Connection conn=null;
		try{
			conn=openConn();
			String sql= "select * from country where cid= ?";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setInt(1,ctryId);
			ResultSet rs=st.executeQuery();
			rs.last();
			if(rs.getRow() == 0){
				throw new InvalidCountryException("Invalid Ctry ID");
			}
			return true;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}finally{
			closeConnection(conn);
		}
		return false;
	}
	
public boolean isValidCountry( String ctryName) throws InvalidCountryException{
		
		Connection conn=null;
		try{
			conn=openConn();
			String sql= "select * from country where cname= ?";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1,ctryName);
			ResultSet rs=st.executeQuery();
			rs.last();
			if(rs.getRow() == 0){
				throw new InvalidCountryException("Invalid Ctry ID");
			}
			return true;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}finally{
			closeConnection(conn);
		}
		return false;
	}

@Override
public int savePlayer(Player player, int cid) throws PlayerDaoException {
	Connection conn = null;
	try {
		conn = openConn();
		String sql="insert into player values (?, ? , ? ,?)";
		PreparedStatement st=conn.prepareStatement(sql);
		st.setInt(1, player.getPlayerId());
		st.setString(2,player.getPlayerName());
		st.setInt(3, player.getRuns());
		st.setInt(4,cid);
		int res= st.executeUpdate();
		return res;
	}catch(SQLException ex){
		String str = ex.getMessage();
		if(str.startsWith("Duplicate")){
			throw new PlayerDaoException("player already exists",ex);
		}if(str.startsWith("Cannot add")){
			throw new PlayerDaoException("country Id does not exist", ex);
		}
	}finally {
		closeConnection(conn);
	}
	
	return 0;
}

@Override
public int savePlayer(Player player) throws PlayerDaoException {
	// TODO Auto-generated method stub
	return 0;
}

}
