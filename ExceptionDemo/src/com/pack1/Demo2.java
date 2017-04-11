package com.pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
		try {
			res = readData();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
		
	}
	public static int readData() throws DaoException{
		FileReader fr=null;
		BufferedReader br=null;
		int res=0;
		try{
			fr=new FileReader("abc.txt");
			br=new BufferedReader(fr);
			String str=br.readLine();
			return 1;
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
			throw new DaoException("File Not Available", ex);
		}
		catch(IOException e){
			e.printStackTrace();
			return 0;
		}finally {
			System.out.println("Finally Block..");
			closeReader(fr);
			closeReader(br);
		}
	}
	public static void closeReader(Reader r){
		if (r!=null){
			try{
					r.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
	}

	}
}