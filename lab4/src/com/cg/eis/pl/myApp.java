package com.cg.eis.pl;
import java.util.Scanner;

import Exercise2.Employee;
public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner (System.in);
   System.out.println("choose any one option below");
   System.out.println("1.Add Employee");
   System.out.println("2. Find Insurance Scheme");
   System.out.println("3. Gwt detail");
   
   int i = sc.nextInt();
   switch(i){
   case 1:
	   System.out.println("Enter Employee id: ");
	   int id = sc.nextInt();
	   System.out.println("Enter emp name: ");
	   String EmpName = sc.next();
	   System.out.println("Enter emp salary: ");
	   double salary = sc.nextDouble();
	   System.out.println("Enter emp designation");
	   String designation = sc.next();
	   
	   Employee emp = new Employee();
	   emp.setId(id);
	   emp.setName(EmpName);
	   emp.setDisgnation(designation);
	   emp.setSalary(salary);
	   
	   if(salary > 5000 || salary < 2000 && designation == "System Associate") {
		   emp.setinsuranceScheme("Scheme C");
	   }
	   else 
		   if (salary >= 2000 || salary< 4000 && designation == "Programer")
		   {
			   emp.setinsuranceScheme("Scheme B");
		   }
	   Employee newEmp = empService.addEmployee(emp);
	   System.out.println(newEmp);
	   
	   break;
   case 2:
	   break;
   case 3:
	   break;
	   default:
		   System.out.println("Enter any value between 1 and 3");
		   
   }
	}

}
