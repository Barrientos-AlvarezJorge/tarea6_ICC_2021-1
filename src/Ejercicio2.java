import java.util.Scanner;

/**
 * Ejercicio 2 de la tarea 6 del curso de ICC 2021-1
 * Clase que crea una matriz triangular de caracteres
 * @auhor Jorge Miguel Aaron Barrientos Alvarez NC:421111666
 * @since Curso de ICC 2021-1
 * @version 1.0 enero 2021
 */

public class Ejercicio2{
    /**
     * Metodo que muestra en pantalla una matriz bidimensional de 
     * caracteres
     * @param matriz la matriz a mostrar en pantalla
     */
    public static void muestra(char[][] matriz){
	for(int i=0; i<matriz.length; i++){
	    for(int k=0; k<matriz[i].length; k++)
		System.out.print(matriz[i][k]);
	    System.out.print("\n");
	}
    }
    
    /**
     * Metodo que crea la matriz triangular de caracteres
     * @param columnas cantidad de columnas en el ultimo nivel
     * @return matriz la matriz triangular de caracteres     
     */
    public static char[][] piramide(int columnas){
	/*
	 * Para que no haya problema por si pasan un numero negativo
	 * :b
	 */
	if(columnas<0)
	    columnas*=-1;
	
	/* La piramide se debe crear solo con cantidades impares de 
	 * columas en el último nivel, es por esto que si el usuario 
	 * ingresa un número par se le suma un 1 a este número para 
	 * que se convierta en un número impar y no haya problemas uwu 
	 */
	if(columnas%2==0)
	    columnas++;
	
	char[][] matriz=new char[(columnas+1)/2][];
	
	int m=1;
	for(int i=0; i<((columnas+1)/2); i++){
	    char[] buffer=new char[i+((columnas+1)/2)];
	    
	    for(int k=0; k<columnas-i-((columnas+1)/2); k++)
		buffer[k]=' ';

	    for(int j=0; j<m; j++)
		buffer[columnas-i-((columnas+1)/2)+j]=(char)(97+i);

	    m+=2;
	    matriz[i]=buffer;
	}

	return matriz;
    }
    
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int opcion=0;
	char respuesta='s';
	
	do{
	    System.out.println("\nIngresa la cantidad de columnas en la ultuma fila:\n ");
	    opcion=sc.nextInt();
	    sc.nextLine();
	    System.out.print("\n");
	    char[][] pruebas=piramide(opcion);
	    muestra(pruebas);
	    
	    System.out.print("\n¿Quieres hacerlo una vez mas? (S/N) ");
	    respuesta=sc.next().charAt(0);
	    sc.nextLine();
	    
	}while(respuesta=='s'||respuesta=='S'||respuesta=='y'||respuesta=='Y');	
    }
}
