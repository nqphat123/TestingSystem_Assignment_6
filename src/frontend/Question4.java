package frontend;

import entity.Department;

public class Question4 {
	public static void main(String[] args) {
		Department dep1 = new Department(1, "Department1");
		Department dep2 = new Department(2, "Department2");
		Department dep3 = new Department(3, "Department3");
		Department[] depArray = {dep1, dep2, dep3};
		
		try {
			System.out.println(depArray[10]);
		} catch (Exception e) {
			System.out.println("Cannot find Department in Array");
		}
		
	}
}
