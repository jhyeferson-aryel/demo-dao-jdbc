package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		Scanner sc = new Scanner(System.in);
		
		Department department = new Department(2, null);
		
		Seller seller = new Seller();
		seller = sellerDao.findById(1);
		System.out.print("Digite o id:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");
		sc.close();
	}

}
