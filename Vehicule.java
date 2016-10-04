package com.iia.shop.entity;
import java.io.*;

public class Vehicule {
	
	public String marque;
	public int year;
	public String modele;
	public String color;
	public double price;
	public int speed;
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void Start()
	{
		methodStart();
	}
	public void methodStart() {
		System.out.println("Le véhicule est en marche");
	}
	
	public void Stop()
	{
		methodStop();
	}
	public void methodStop() {
		System.out.println("Le véhicule est à l'arrêt");
	}
	
	public void speed()
	{
		Speedup(1);
	}
	public int Speedup(int speedup)
	{
		System.out.println("La vitesse que vous avez obtenu est : "+ speedup);
		return speedup + 1;
	}
	
	public void speed1()
	{
		Speeddown(1);
	}
	public int Speeddown(int speeddown)
	{
		System.out.println("La vitesse que vous avez obtenu est : "+ speeddown);
		return speeddown - 1;
	}
	
}

