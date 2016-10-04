package com.iia.shop.entity;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vehicule> listeVehicule = new ArrayList<Vehicule>();
		
		Vehicule vehicule1 = new Vehicule();
		vehicule1.color = "red" ;
		vehicule1.marque = "seat" ;
		vehicule1.modele = "ibiza" ;
		vehicule1.price =  3000 ;
		vehicule1.speed =  150;
		vehicule1.year = 2001 ;
		listeVehicule.add(vehicule1);
		
		Vehicule vehicule2 = new Vehicule();
		vehicule2.color = "grey" ;
		vehicule2.marque = "peugeot" ;
		vehicule2.modele = "206" ;
		vehicule2.price =  2500 ;
		vehicule2.speed =  145;
		vehicule2.year = 2002 ;
		listeVehicule.add(vehicule2);
		
		System.out.println("-----MENU-----");
		System.out.println(" 1 - Create vehicule");
		System.out.println(" 2 - Read vehicule");
		System.out.println(" 3 - Update vehicule");
		System.out.println(" 4 - Delete vehicule");
		System.out.println(" Please select your choice");
		
		
		int choice = 0;
		int nbVehicule = listeVehicule.size();
		Scanner sc = new Scanner(System.in);
		
		switch(choice){
		case 1:
			// création d'un véhicule 
				 String marque;
				 int year;
				 String modele;
				 String color;
				 double price;
				 int speed;
				 
				
				System.out.println (" ADD A NEW VEHICULE"); 
				
				System.out.println (" ----------------"); 
				
				System.out.print (" Entrer a marque for your vehicule : "); 
				marque = sc.nextLine(); 
				System.out.print (" You enter this marque : " + marque); 
				
				System.out.print (" Entrer a year for your vehicule : "); 
				year = sc.nextInt(); 
				System.out.print (" You enter this year : " + year); 
				
				System.out.print (" Entrer a modele for your vehicule : "); 
				modele = sc.nextLine(); 
				System.out.print (" You enter this modele : " + modele); 
				
				System.out.print (" Entrer a color for your vehicule : "); 
				color = sc.nextLine(); 
				System.out.print (" You enter this color : " + color); 
				
				System.out.print (" Entrer a price for your vehicule : "); 
				price = sc.nextDouble(); 
				System.out.print (" You enter this price : " + price); 
				
				System.out.print (" Entrer a speed for your vehicule : "); 
				speed = sc.nextInt(); 
				System.out.print (" You enter this speed : " + speed); 
				
				Vehicule vehicule = new Vehicule();
				listeVehicule.add(vehicule);

				System.out.println (" Vehicule was successful added!"); 
			
			break;
		case 2:
			// lecture d'un véhicule
			System.out.println("VEHICULE ON THE STORE :"); 
			if ( nbVehicule > 0) 
			{ 
			for (int i = 0; i < nbVehicule; i++) { 
			System.out.println(listeVehicule.get(i).getMarque()); ; 
			} 
			} 
			break;
		case 3:
			// mise a jour d'un véhicule
			System.out.println (" MODIFY A VEHICULE"); 
			
			System.out.println (" ----------------"); 
			
			System.out.print (" Please select the vehicule you want to delete : "); 
			marque = sc.nextLine(); 
			listeVehicule.remove(marque);
			
			System.out.print (" Entrer a new marque for your vehicule : "); 
			marque = sc.nextLine(); 
			System.out.print (" You enter this marque : " + marque); 
			
			System.out.print (" Entrer a new year for your vehicule : "); 
			year = sc.nextInt(); 
			System.out.print (" You enter this year : " + year); 
			
			System.out.print (" Entrer a new modele for your vehicule : "); 
			modele = sc.nextLine(); 
			System.out.print (" You enter this modele : " + modele); 
			
			System.out.print (" Entrer a new color for your vehicule : "); 
			color = sc.nextLine(); 
			System.out.print (" You enter this color : " + color); 
			
			System.out.print (" Entrer a new price for your vehicule : "); 
			price = sc.nextDouble(); 
			System.out.print (" You enter this price : " + price); 
			
			System.out.print (" Entrer a new speed for your vehicule : "); 
			speed = sc.nextInt(); 
			System.out.print (" You enter this speed : " + speed); 
			
			Vehicule vehicule3 = new Vehicule();
			listeVehicule.add(vehicule3);

			System.out.println (" Vehicule was successful modified!"); 
			break;
		case 4:
			// suppression d'un véhicule
			System.out.println (" DELETE A  VEHICULE"); 
			
			System.out.println (" ----------------"); 
			
			System.out.print (" Please select the vehicule you want to delete : "); 
			marque = sc.nextLine(); 
			listeVehicule.remove(marque);
			
			System.out.println (" Vehicule was successful deleted!"); 
			
			break;
		case 5:
			break;
			default:
			System.out.println(" Merci d'avoir utilisé notre programme");
		}
		
		
		
	}

}
