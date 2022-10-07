package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ville = {"Lorient", "Quimperlé", "Quimper", "Vannes", "Rennes"};
		for ( int i=0; i< ville.length; i++ ) {
			System.out.println(ville [i]);
			}
		System.out.println("Taille du tableau : " + ville.length);
		
		 ville [3] = "Reims";
		 for ( int i=0; i< ville.length; i++ ) {
				System.out.println(ville [i]);
				}
	}

}
