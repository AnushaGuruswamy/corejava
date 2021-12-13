package com.Anusha.stringOperations.crud1;

public class Crud1
{
		String []names = new String[10];
		int index = 0;
		
		public void add(String name)
		{
			names[index]=name;
			index++;
		}
	
		public void read(String name) {
			
			if(index<names.length) {
			names[index] = name;
			index++;
			}
			else {
				System.out.println("No Space");
			}
		}
		
		public String update(String oldName,String newName) {
			
			String res = "null";
			
			for(int index = 0 ; index < names.length ; index++) {
				if(names[index].equals(oldName)) {
					names[index]= newName;
					res = "Updated";
				}	
			}
			return res;
		}
		
		public void printAll() {
			for(int index = 0 ; index < names.length ; index++) {
				System.out.println(names[index]);
			}
		}
}
