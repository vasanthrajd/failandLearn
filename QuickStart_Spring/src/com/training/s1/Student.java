package com.training.s1;

public class Student {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void displayInformation(){
			System.out.println("This method is invoked from the Configuration File and value also set from the configuration file \t"+name);
		}
}
