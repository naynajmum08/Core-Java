package com.tnsif.jdbccruddemo;

public class Executor {

	public static void main(String[] args) {
		//DBUtil.getConnection();

		//StatementInterfaceDemo.addEmployee(8, "Divya", 80000);
		StatementInterfaceDemo.showEmp();
		System.out.println("-------------------");
		StatementInterfaceDemo.updateEmpName(9, "Pranjali Dhanokar");
		StatementInterfaceDemo.updateEmpSalary(9, 90000);
		StatementInterfaceDemo.showEmp();
		System.out.println("-------------------");
		StatementInterfaceDemo.deleteEmp(11);
		StatementInterfaceDemo.showEmp();
	}

}
