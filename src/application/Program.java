package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dp = new Department(1, "books");
		System.out.println(dp);
		Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.0, dp);
		
		System.out.println(seller);
	}

}
