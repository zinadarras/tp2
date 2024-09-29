package TP11;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		MaDate d1=new MaDate(19,4,2014);
		MaDate d2=new MaDate(29,3,2022);
		MaDate d3=new MaDate(8);
		d3.setJours(22);
		d3.setMois(5);
		if (d1.getJours()==d2.getJours() && d1.getMois()==d2.getMois() && d1.getAnnee()==d2.getAnnee()) {
			System.out.println("les 2 dates sont identiques");}
			else {
				System.out.println("les 2 dates ne sont pas identiques");
				}
		Scanner sc = new Scanner(System.in);
		boolean x=false;
		while (x==false) {
			System.out.println("voulez vous :\n 1) Ajouter un jour \n 2)Ajouter Plusieurs jours\n 3)Ajouter un mois\n 4)Ajouter une année \n");
			int y = sc.nextInt();
			if (y==1) {
				d1.ajouterUnJour();
				System.out.println(d1);
			}
			else if(y==2) {
				System.out.println("combien de jours?");
				int n= sc.nextInt();
				d1.ajouterPlusieursjours(n);
				System.out.println(d1);
			}
			else if (y==3) {
				d1.ajouterUnMois();
				System.out.println(d1);
			}
			else if (y==4) {
				d1.ajouterUnAn();
				System.out.println(d1);
			}
			else x=true;
		}
		}
}
