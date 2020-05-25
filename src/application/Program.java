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
		
		System.out.println("====Test #1: seller - findById ====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n====Test #2: seller - findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findByDepartment(department);
		for(Seller s : sellerList) {
			System.out.println(s);
		}
		
		System.out.println("\n====Test #3: seller - findAll ====");
		sellerList = sellerDao.findAll();
		for(Seller s : sellerList) {
			System.out.println(s);
		}
		
	}

}
