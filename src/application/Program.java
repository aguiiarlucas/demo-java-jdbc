package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Teste 1 : Seller findById === ");
			Seller seller = sellerDao.findById(3);
			System.out.println(seller);

		/*System.out.println("\n === Teste 2 : Seller findByDepartment === ");
			Department department = new Department(2, null);
			List<Seller> list = sellerDao.findByDepartment(department);
			for (Seller obj : list) {
			System.out.println(obj);
			}
			
			System.out.println("\n === Teste 3 : Seller findAll === ");
		 
			list = sellerDao.findAll();
			for (Seller obj : list) {
			System.out.println(obj);
			}*/

			/*System.out.println("\n === Teste 4 : Seller insert === ");
				Seller newSeller = new Seller("Greg", "greg@hotmail.com", null, new Date(), 4000.0, department);
				sellerDao.insert(newSeller);
				System.out.println("Insert! new id : "+ newSeller.getId());*/
		 
			System.out.println("\n === Teste 5 : Seller Update === ");
			seller = sellerDao.findById(28);
			seller.setName("Marta");
			seller.setEmail("marta@hotmail.com"); 
			sellerDao.update(seller );
			
			System.out.println("Update Complete! ");
		}

	}


