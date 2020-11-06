package caleva.Programacion;

import java.util.Scanner;

public class ParImpar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("Dame un numero entero");
		numero=teclado.nextInt();
		teclado.close();
		if (numero%2==0) {
			System.out.println(" El numero que has introducido " + numero + " es par ");
		}
		else {
			System.out.println(" El numero que has introducido " + numero + " es impar ");
		}
	}

}
