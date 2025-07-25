package application;

import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Test 1: department findById =====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);

		System.out.println("===== Test 2: department findAll =====");
		System.out.println(departmentDao.findAll());
		
		System.out.println("===== Test 3: department insert =====");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New Department with Id = "+newDep.getId());
		
		System.out.println("===== Test 4: department update =====");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed!");
		
		System.out.println("===== Test 5: department deleteById =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department with id("+id+") was deleted!");
		
		sc.close();
	}

}
