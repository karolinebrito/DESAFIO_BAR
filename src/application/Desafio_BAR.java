package application;

import java.util.Scanner;

public class Desafio_BAR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Genre (F/M): ");
		String genre = sc.nextLine();
		System.out.print("Consumed beers: ");
		int consumedBeer = sc.nextInt();
		System.out.print("Consumed soda: ");
		int consumedSoda = sc.nextInt();
		System.out.print("Consumed skewer: ");
		int consumedSkewer = sc.nextInt();		
		
		double priceBeer = 5.00; 
		double priceSoda = 3.00;
		double priceSkewer = 7.00;
		
		double consumption = priceBeer*consumedBeer + priceSoda*consumedSoda + priceSkewer*consumedSkewer;
		
		double ticket, coverCharge;
		
		System.out.println();
		System.out.println("Report: ");
		
		System.out.printf("Consumption = $ %.2f\n", consumption);
		
		if (genre.equals("F")) {
			System.out.printf("Ticket = $ %.2f\n", ticket = 8.00);			
			if (consumption > 30) {
				System.out.print("Cover Charge Exemption.");
				coverCharge = 0.00;
			}
			else {
				System.out.printf("Cover Charge = $ %.2f\n", coverCharge = 4.00);				
			}
			System.out.println();
			System.out.printf("Amount to pay: $ %.2f\n", consumption+ticket+coverCharge);
		}
		else {
			System.out.printf("Ticket = $ %.2f\n", ticket = 10.00);			
			if (consumption > 30) {
				System.out.print("Cover Charge Exemption.\n");
				coverCharge = 0.00;
			}
			else {
				System.out.printf("Cover Charge = $ %.2f\n", coverCharge = 4.00);				
			}
			System.out.println();
			System.out.printf("Amount to pay: $ %.2f\n", consumption+ticket+coverCharge);
		}
		
		sc.close();

	}

}
