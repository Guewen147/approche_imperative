package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int i=1; i <= 10; i++ ) {
			System.out.println(i);
			}
		
		String nomPrenom = "Le Bechennec Guéwen";
		for ( int i=1; i <= 20; i++ ) {
			System.out.println(nomPrenom);
			}
		
		int pairs = 100;
	    System.out.println
	    		( "Les nombres pairs de 1 à "+pairs+" sont: ");
	    for (int i = 1; i <= pairs; i++) {
	      if (i % 2 == 0) {
	        System.out.println(i);
	        }
	    }
	    
	    int impairs = 99;
	    System.out.println
	    		( "Les nombres impairs de 1 à "+impairs+" sont: ");
	    for (int i = 1; i <= impairs; i++) {
	      if (i % 2 == 1) {
	        System.out.println(i);
	        }
	    }
	    
	    
	}
		
}
