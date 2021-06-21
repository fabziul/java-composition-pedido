package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Programm {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client date:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birth);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
//		sc.nextLine();
		
		Order newOrder = new Order(status, client);
		
		for (int x=1; x<=n; x++) {
			System.out.println("Enter #"+x+" item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			newOrder.addItem(orderItem);
		}
		
		sc.close();
	}

}
