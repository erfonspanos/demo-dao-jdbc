package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Mark Revv", "mark@gmail.com", new Date(), 4000.0, obj);
		
		System.out.println(seller);
		
	}
}
