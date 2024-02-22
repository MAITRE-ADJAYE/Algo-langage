import java.util.Scanner;

public class pair_impair {

	public static void main(String[] args) {
		
		
		//Déclaration des variables
		double nombre, reste; 
		
		// Enregistrement des valeurs tapées par l'utilisateur
		Scanner clavier = new Scanner(System.in); 
		System.out.print("veuillez saisie une nombre: ");
		nombre = clavier.nextDouble();
		reste = nombre%2;
		
		if(reste==0) {
			System.out.print("le nombre "+nombre+" est pair");
		}else {
			System.out.print("le nombre "+nombre+" est impair");
		}
		
		clavier.close(); 
			
	}

}
