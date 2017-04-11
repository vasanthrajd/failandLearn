import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.sasken.service.CarService;


public class ClientB {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws ClassNotFoundException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		// TODO Auto-generated method stub
		
		CarService ser= new CarService();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the class name to test");
		String str=scan.next();
		int pass=0;
		int fail=0;
		Class clazz=Class.forName(str);
		Object obj= clazz.newInstance();
		System.out.println("class"+obj.getClass().getName());
		
		Method[] mths = obj.getClass().getDeclaredMethods();
		
		
		for(Method m:mths){
			String mname=m.getName();
			System.out.println("method name"+mname);
			if(mname.startsWith("test")){
				try{
				m.invoke(obj, null);
				pass=pass+1;
			}catch(Exception ex){
				fail=fail+1;
			}
			}
			System.out.println("---------------");
		}
		System.out.println("Passed "+ pass);
		System.out.println("Failed "+ fail);

	}

}
