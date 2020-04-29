package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import domain.Department;
import domain.Employee;
import domain.ParkinSpace;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private  EntityManager entityManager;
	
	public EmployeeRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public void save(Employee employee) {
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit(); 
		
	}

	@Override
	public void insertDepartment(Department department) {
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(department);
		transaction.commit();
		
	}

	@Override
	public void parkingSpaceAdd(ParkinSpace parkingSpace) {
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(parkingSpace);
		transaction.commit();
		
	}

}
