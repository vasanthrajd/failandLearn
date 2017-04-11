package com.sasken.serivce;

public class MutiTable {
	public void displayTable(int num){
		for(int i=1;i<=num;i++){
			System.out.printf("%d * %d = %d\n", i, num, (num * i));
			}
	}
		public void displayTable(int num,int rows){
			for(int i=1;i<=rows;i++){
				System.out.printf("%d * %d = %d\n", i, num, (num * i));
				}
		}
			public void displayTable(int num,int start, int end){
				for(int i=start;i<=end;i++){
					System.out.printf("%d * %d = %d\n", i, num, (num * i));
					}
	}
}
