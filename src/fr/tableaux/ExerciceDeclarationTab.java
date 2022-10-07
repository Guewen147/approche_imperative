package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tableau = { 8, -7, 12, 1, -2, 14, 17, 9 };
		for ( int i=0; i< tableau.length; i++ ) {
		System.out.println(tableau [i]);
		}
		System.out.println("Taille du tableau : " + tableau.length);
		System.out.println(tableau [tableau.length -1]);
		// System.out.println(tableau [10]); // Erreur car notre tableau ne contient que 8 charactere et non 11
		
	}

}
