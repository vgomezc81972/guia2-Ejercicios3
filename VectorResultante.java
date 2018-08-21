/*Escriba un programa en Java que permita crear dos vectores o listas A y B de tamaños N y P 
 respectivamente, y a partir de estos dos, crear un tercer vector o lista C, el cual contenga 
 los elementos no comunes (no repetidos) de A y B, sin que queden valores repetidos en C.
 N: Número de elementos del vector A.
 P: Número de elementos del vector B.
 A, B y C: Nombres de los tres vectores.
 dif: Número de elementos para el vector C.
 i, k: Variables para control de los ciclos  */

import java.util.Arrays;

import java.util.Scanner;

public class VectorResultante {

    public static void main(String[]args){

        int N, P, i, k, dif;

		Scanner leer = new Scanner(System.in);

		int[] c;

		System.out.print("Número de elementos del vector A: ");

		N=leer.nextInt();

		System.out.print("Número de elementos del vector B: ");

		P=leer.nextInt();

 		int A[] = new int [N];

		for(i=0;i<N;i++){

			System.out.print("Elemento del vector A: ["+i+"]");

			A[i]=leer.nextInt();
		}

 		int b[] = new int [P];

		for(k=0;k<P;k++){

			System.out.print("Elemento del vector B: ["+k+"]");

			b[k]=leer.nextInt();
		}
		
			int aux = 0;

			dif = 0;

			for (int d=0; d<P; d++){

				aux = b[d];

				if(!duplicado(aux, A)){

					dif++;
				}
	 		}
			
			System.out.println("El tamaño del array C sera "+ (dif+N));

			 c = new int [dif + N];

                         System.arraycopy(A, 0, c, 0, A.length);

                         aux=0;

                         int g = 0;

                         for(i = 0; i < b.length; i++){

                             aux = b[i];

                             if(!duplicado(aux, A)){

                                 c[A.length+g] = aux;

                                 g++;
                             }
                         }

                         for (int j=0; j < c.length; j++) {

                             System.out.println("C["+j+"]: "+c[j]);
                         }
    }

    public static boolean duplicado(int a, int array[]){

	int index;

	Arrays.sort(array);

        index=Arrays.binarySearch(array, a);

	if(index < 0){

            //Si NO se encuentra

            return false;

	}else if (index >= 0){

            return true;
	}
        return false;
    }
}
