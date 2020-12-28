package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== Teste 1 : Department findById === ");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println("\n === Teste 2 : Department findAll === ");
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		/*System.out.println("\n === Teste 3 : Department insert === ");
		Department department = new Department(null, "Music");
		depDao.insert(department);
		System.out.println("Inserted! new Id: "+ department);
		
		/*System.out.println("\n === Teste 4 : Department Update === ");
		dep =depDao.findById(1);
		dep.setName("Food");
		depDao.update(dep);
		System.out.println("Update Complete!");*/
		
		System.out.println("\n === Teste 5 : Delete Update === ");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}
}