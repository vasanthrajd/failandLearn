package com.pack1;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res= approveLoan(22,9000);
			System.out.println("Status "+ res);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidIncomeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int approveLoan(int age, double income) throws InvalidAgeException, InvalidIncomeException{
			int status=0;
			if(age<18||age>45){
				throw new InvalidAgeException("Age Must be above 18 and below 45");
			}else if ( income < 300000){
				throw new InvalidIncomeException(" Income must be above 3 lakhs");
			}
		
			return ++status;
	}
}
