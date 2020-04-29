package repository;

import domain.Department;
import domain.Employee;
import domain.ParkinSpace;

public interface EmployeeRepository {
		public void save(Employee employee);
		
		public  void insertDepartment(Department department);
		
		public void parkingSpaceAdd(ParkinSpace parkingSpace);
}
