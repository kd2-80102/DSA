package com.sunbeam;

public class Question05 {

	
	public static int sortBySalary(Employee[] arr, double searchSalary) {
		int count = 0;
		for (int i = 1; i < searchSalary; i++) {
			count++;
			Employee temp = arr[i];
			int j = i - 1;
			while (j >=0 && arr[j].getSalary() > temp.getSalary()) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Alice", 50000.0);
        employees[1] = new Employee(102, "Bob", 60000.0);
        employees[2] = new Employee(103, "Charlie", 75000.0);
        employees[3] = new Employee(104, "David", 60000.0);
        employees[4] = new Employee(105, "Eve", 55000.0);


        System.out.println(sortBySalary(employees, employees.length));
		for(Employee e : employees)
		System.out.println(e);
        
	}



}
