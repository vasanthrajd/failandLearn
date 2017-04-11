package com.sasken.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.sasken.exception.InvalidCountryException;
import com.sasken.exception.InvalidRunsException;
import com.sasken.exception.PlayerDaoException;
import com.sasken.exception.PlayerNotFoundException;
import com.sasken.vo.Player;

/* Poi which referes to the xls sheet.
 * then get the correct sheet number 
 * get the row number 
 *  you neeed to skip the first row then you need to proceed to next levels of the code
 *  
 */

public class PlayerXldao implements DaoI{

	@Override
	public List<Player> viewPlayer(int ctryId) throws PlayerNotFoundException,
			InvalidCountryException {
		List<Player> players= new ArrayList<Player>();
		Player player=null;
		int count=0;
		try {
			HSSFWorkbook wb= new HSSFWorkbook(new FileInputStream("player.xls"));
			HSSFSheet sheet = wb.getSheet("Sheet1");
			Iterator it=sheet.rowIterator();
			HSSFRow row=null;
			while(it.hasNext()){
				row= (HSSFRow)it.next();
				if(row.getRowNum() > 0){
					
				int pid= (int)row.getCell((short)0).getNumericCellValue();
				String pname=row.getCell((short)1).getStringCellValue();
				int runs= (int) row.getCell((short)2).getNumericCellValue();
				int cid= (int)row.getCell((short)3).getNumericCellValue();
				if(cid== ctryId){
					++count;
					try{
					player=new Player();
					player.setPlayerId(pid);
					player.setPlayerName(pname);
					player.setRuns(runs);
					players.add(player);
				}catch( InvalidRunsException e){
					System.out.println("Minimum must be 2000");
				}
				}
				}
				
			}
			
		if(count==0){
			throw new InvalidCountryException("Invalid Country ID");
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return players;
	}

	@Override
	public Set<Player> viewPlayer(String ctryName)
			throws PlayerNotFoundException, InvalidCountryException {
		
		return null;
	}

	@Override
	public int savePlayer(Player player) throws PlayerDaoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int savePlayer(Player player, int cid) throws PlayerDaoException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
