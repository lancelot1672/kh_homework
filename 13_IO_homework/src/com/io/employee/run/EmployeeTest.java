package com.io.employee.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.io.employee.model.vo.Employee;

public class EmployeeTest 
{
	public static void main(String[] args) throws Exception{
		EmployeeTest et1 = new EmployeeTest();
		et1.saveEmployee();
		//et1.loadEmployee();
	}
	public void saveEmployee() {
		Employee[] employee = new Employee[3];
		employee[0] = new Employee(1, "kim1", 'M', "01011111111", "회계 1팀", 35000000, 130);
		employee[1] = new Employee(2, "Lee1", 'W', "01022222222", "회계 2팀", 35000000, 110);
		employee[2] = new Employee(3, "Baek1", 'W', "01033333333", "무역 1팀", 50000000, 150);
		
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));
				
			for(int i = 0; i < employee.length; i++) {
				System.out.println(i);
				oos.writeObject(employee[i]); // Employee 객체 단위로 출력!
				
			}
			oos.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void loadEmployee() throws ClassNotFoundException {
		Employee[] employee = new Employee[3];
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));
			
			for(int i = 0; i < employee.length; i++) {
				System.out.println(i);
				employee[i] = (Employee) ois.readObject(); // down casting
				
			}
			ois.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < employee.length; i++) {
			employee[i].printEmployee();	
		}
	}
}
