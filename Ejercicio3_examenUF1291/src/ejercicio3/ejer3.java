package ejercicio3;

import java.util.Scanner;

public class ejer3 {

	static String usuario() 
	{
		Scanner teclado= new Scanner(System.in); 
		String nomUsuario="";
		System.out.println("Buenos días, ¿A quién me dirijo? Introduzca su nombre, por favor");
		nomUsuario=teclado.nextLine();
		teclado.close();
		return nomUsuario;
	}
	
	
	
	public static void main(String[] args) 
	{
		String nombreUsuario=usuario();
		System.out.println("Buenos días sr/sra: "+nombreUsuario);

	}

}
