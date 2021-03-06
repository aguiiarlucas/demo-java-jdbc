package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

 
public interface SellerDao {

	void insert(Seller obj);

	void update(Seller obj);

	void deleteByID(Integer id);

	Seller findById(Integer id); // pegar o id e consultar n bd se exister.

	List<Seller>findAll(); // retorna todos
	List<Seller>findByDepartment(Department department);
}
