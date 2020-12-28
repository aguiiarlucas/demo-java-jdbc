package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramSeller {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("=== Teste 1 : Seller findById === ");
		   Seller seller = sellerDao.findById(3);
			System.out.println(seller);

		System.out.println("\n === Teste 2 : Seller findByDepartment === ");
			Department department = new Department(2, null);
			List<Seller> list = sellerDao.findByDepartment(department);
			for (Seller obj : list) {
			System.out.println(obj);
			}
			
		System.out.println("\n === Teste 3 : Seller findAll === ");
		 	list = sellerDao.findAll();
			for (Seller obj : list) {
			System.out.println(obj);
			}

		System.out.println("\n === Teste 4 : Seller insert === ");
			Seller newSeller = new Seller("Greg", "greg@hotmail.com", null, new Date(), 4000.0, department);
			sellerDao.insert(newSeller);
			System.out.println("Insert! new id : "+ newSeller.getId());
		 
	System.out.println("\n === Teste 5 : Seller Update === ");
		    seller = sellerDao.findById(11);
			seller.setEmail("josemaria@hotmail.com"); 
			sellerDao.update(seller );
			System.out.println("Update Complete! ");
			
		System.out.println("\n === Teste 6 : Delete Update === ");
			System.out.println("Enter id for delete test: ");
			int id = sc.nextInt();
			sellerDao.deleteByID(id);
			System.out.println("Delete completed");
			
			sc.close();
		}

	}


