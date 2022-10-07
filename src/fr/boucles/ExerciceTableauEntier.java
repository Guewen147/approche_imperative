package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] entier = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for ( int i=0; i< entier.length; i++ ) {
		System.out.println(entier [i]);
		}
		System.out.println("Premier element du tableau : " + entier [0]);
		System.out.println("Taille du tableau : " + entier.length);
		System.out.println("Dernier element du tableau : " + entier [entier.length-1]);
		
		entier [4] = 8;
		 for ( int i=0; i< entier.length; i++ ) {
				System.out.println(entier [i]);
		 }
		 
	
	}

}
