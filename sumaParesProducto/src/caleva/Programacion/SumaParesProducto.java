package caleva.Programacion;

import java.util.Scanner;

public class SumaParesProducto
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int suma, producto, i;
		teclado.close();
		for (i=1;i<=40;i++) 
		{
			if (i%2==0)
			{
				suma=i+1;
				System.out.println("La suma de los siguientes numeros pares son " + suma);
			}
			else {
				producto=i*1;
				System.out.println("La multiplicación de los siguientes numeros impares es " + producto);
			}

	}

}
}
