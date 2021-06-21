package application;

import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name2 = sc.next();
		
		
		
		
		System.out.println("Nome: "+name+" idade: "+idade+" Nome2: "+name2);
		
		sc.close();

	}

}
