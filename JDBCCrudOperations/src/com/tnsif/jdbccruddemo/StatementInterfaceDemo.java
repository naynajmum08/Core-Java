package com.tnsif.jdbccruddemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Create a statement
• Execute the statement
• Retrieve the result
• Close the statement and connection
*/
public class StatementInterfaceDemo {

	public static Connection cn;
	public static Statement st;
	static

	{
		cn = DBUtil.getConnection();

		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// add Employee

	public static int addEmployee(int id, String name, double salary) {
		int n = 0;
		String query = "INSERT INTO emp VALUES (" + id + ", '" + name + "', " + salary + ")";
		try {
			n = st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Error while inserting data.." + e.getMessage());
			n = 0;
		}
		return n;
	}

	// validate emp
	public static int validateEmp(int empId) {
		int n = 0;
		try {
			String query = "SELECT count(*) FROM emp where id=" + empId;
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;
	}

	// Delete Employee
	
	public static boolean deleteEmp(int id) {
		boolean status = false;

		try {

			int n = validateEmp(id);
			if (n == 1) {
				String query = "DELETE FROM emp WHERE id="+id;
				st.executeUpdate(query);
				status = true;
			}
			else
			{
				System.out.println("No such Employee");
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	
	//Update Name
	public static boolean updateEmpName(int id, String empName) {
		boolean status = false;
		try {

			if (validateEmp(id) == 1) {
				String query = "UPDATE emp set name='" + empName + "' WHERE id="+id;
				st.executeUpdate(query);
				status = true;
			} else

				System.out.println("No such Employee Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Update Salary
	public static boolean updateEmpSalary(int id, double salary) {
		boolean status = false;
		try {

			if (validateEmp(id) == 1) {
				String query = "UPDATE emp SET salary=" + salary + " WHERE id="+id;
				st.executeUpdate(query);
				status = true;
			} else
				System.out.println("No such Employee Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Retrieve all
	public static void showEmp() {
		try {

			String query = "SELECT * FROM emp";
			ResultSet rs = st.executeQuery(query);


			if (rs.next()) {
				while (rs.next()) {

					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
				}
			} else
				System.out.println("No Employee Records.....");
			rs.close();

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
