//Program to demonstrate PreparedStatement Interface
package com.tnsif.preparedstatement.client;

import com.tnsif.preparedstatement.service.PreparedStatementDemo;

public class Executor {

	public static void main(String[] args) {
		PreparedStatementDemo.addEmployee(12, "Nayna", 88000);
		PreparedStatementDemo.showEmp();
		PreparedStatementDemo.updateEmpName(3, "Neha");
		PreparedStatementDemo.updateEmpSalary(3, 65000);
		PreparedStatementDemo.showEmp();
		if(!PreparedStatementDemo.deleteEmp(11));
			System.err.println("No such employee...");
	
		PreparedStatementDemo.showEmp();

	}

}
