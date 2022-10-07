package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		System.out.println("Tableau :");
		 for ( int i=0; i< array.length; i++ ) {
			System.out.println( array [i]);
		}
		 
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Tableau inverse :");
		for ( int n=array.length-1; n>=0; n-- ) {
			System.out.println( array [n]);
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("valeur ayant plus que 3 :");
		for ( int i=0; i< array.length; i++ ) {
		      if ( (array[i]) > 3) {
				System.out.println( array [i]);
			}
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entier Valeur pair :");
		for ( int i=0; i< array.length; i++ ) {
		      if ( (array[i]) % 2 == 0) {
				System.out.println( array [i]);
			}
		}

		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entier Valeur Impair :");
		for ( int i=0; i< array.length; i++ ) {
		      if ( (array[i]) % 2 == 1) {
				System.out.println( array [i]);
			}
		}

		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entier Index Pair :");
		for ( int i=0; i< array.length; i++ ) {
		      if ( i % 2 == 0) {
				System.out.println( array [i]);
			}
		}

		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entier Index Impair :");
		for ( int i=0; i< array.length; i++ ) {
		      if ( i % 2 == 1) {
				System.out.println( array [i]);
			}
		}
	}

}
