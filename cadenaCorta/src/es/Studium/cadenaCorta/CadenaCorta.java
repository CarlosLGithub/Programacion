/*Cadena más corta, realizar un programa que meta 10 cadenas en una tabla
 * y luego muestre la cadena mas corta. Usar una función que devuelva la cadena
 * más corta y que tenga como parametro la tabla.
 */
package es.Studium.cadenaCorta;

import java.util.Scanner;

public class CadenaCorta 
{

	public static void main(String[] args) 
	{
		final int TAM = 10;
		String []cadenas = new String [TAM];
		int i;
		Scanner teclado = new Scanner (System.in);

		for(i=0;i<TAM;i++)
		{
			System.out.println("Ingrese el valor de la posición "+i+":");
			cadenas[i]=teclado.nextLine();

		}

		for (i=0;i<TAM;i++)
		{
			System.out.println("Cadena["+i+"]="+cadenas[i]);
		}

		teclado.close();

		String funcion = devolvercorta (cadenas);
		System.out.println("La palabra o frase mas corta es " + funcion);		

	}


	public static String devolvercorta (String[]cadenas)
	{
		int cadenacorta=0;
		int posicioncorta=0;
		for (int i=0;i<cadenas.length;i++)
		{
			/* Si no hay nada escrito en la cadena pasa a la siguiente*/
			if (i==0)
			{
				cadenacorta=cadenas[i].length();
			}
			/*Si la cadena corta no esta en la posición 0, vamos recorriendo la tabla
			 * hasta dar con ella.
			 */
			else
			{
				if (cadenas[i].length()<cadenacorta)
				{
					cadenacorta=cadenas[i].length();
					posicioncorta=i; //en posicioncorta guardamos cual es mas corta
				}
			}
		}
		//Con ValueOf transformamos la cadena en un valor concreto
		return String.valueOf(cadenas[posicioncorta]);
	}
}