package caleva.Programacion;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a,b, resultado;
		System.out.println("Dame un numero entero");
		a=teclado.nextInt();
		System.out.println("Dame otro numero entero");
		b=teclado.nextInt();
		teclado.close();
		resultado=a+b;
		System.out.println(" El resultado de la suma de a + b es = " + resultado);
	}

}
