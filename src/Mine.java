import java.util.Scanner;

public class Mine {

	public static void main(String[] args) {
		//ejercicio 1: programa para transformar grados Far en Cel
//		Scanner scan = new Scanner(System.in);
//		System.out.println("introduzca los grados Farenheit:  \n");
//		float far = scan.nextFloat();
//		float cel = ((far - 32)*5)/9;
//		System.out.println("el valor en grados Celsius es:" + cel + "ºC");
//		scan.close();

		
		
//		
////		Ejercicio 2:
//		Scanner scan = new Scanner (System.in);
//		System.out.println("introduzca el valor del radio: ");
//		float r = scan.nextFloat();
//		final float PI = 3.14f;
//		float area = 4 * PI * r * r;
//		System.out.println("el area es:" + area);
//		System.out.println("el volumen es: " + ((area* r)/3));
//		scan.close();
		
//		EJercicio 3
		// Scanner scan = new Scanner(System.in);
//		System.out.println("Intruduzca la nota (entre 0 y 10):");
//		int nota = scan.nextInt();
//		if (nota < 5) {
//			System.out.println("SUSPENSO");
//		} else if (nota < 7){
//			System.out.println("APROBADO");
//		} else if (nota < 9) {
//			System.out.println("NOTABLE");
//		} else {
//			System.out.println("SOBRESALIENTE!");
//		}
//		scan.close();
		
		//Ejericico 4
//		Scanner scan = new Scanner(System.in);
//		int a = 0, e = 0, i = 0, o = 0, u = 0;
//		String entrada = "HOLA";
//		
//		for(int x = 0; x < 20; x++) {
//			System.out.println("Introduzca un caracter: ");
//			entrada = scan.nextLine();
//			switch (entrada) {
//				case "a":
//					a++;
//					break;
//				case "e":
//					e++;
//					break;
//				case "i":
//					i++;
//					break;
//				case "o":
//					o++;
//					break;
//				case "u":
//					u++;
//					break;
//				default:
//					break;
//			}
//		}
//		
//		System.out.println("Número de a: " + a + "\n"
//				+ "Numero de e: " + e + "\n"
//				+ "Numero de i: " + i + "\n"
//				+ "Numero de o: " + o + "\n"
//				+ "Numero de u: " + u + "\n");
//		scan.close();
//		
		//Ejercicio 5
//		Scanner scan = new Scanner(System.in);
//		int n1, n2;
//		String ch = "";
//		while(!ch.equals("0")) {
//			System.out.println("introduzca el primer número:");
//			n1 = scan.nextInt();
//			System.out.println("introduzca el segundo número:");
//			n2 = scan.nextInt();
//			System.out.println("Selecciona una operación (+,-,*,/,%," + "Pulse 0 para salir");
//			ch = scan.next();
//			switch (ch) {
//				case "+":
//					System.out.println("el resultado es: " + (n1 + n2));
//					break;
//				case "-":	
//					System.out.println("el resultado es: " + (n1 - n2));
//					break;
//				case "*":
//					System.out.println("el resultado es: " + (n1 * n2));
//					break;
//				case "/":
//					System.out.println("el resultado es: " + (n1 / n2));
//					break;
//				case "0":
//					System.out.println("Fin del programa");
//					break;	
//				case "default":
//					System.out.println("error");
//					
//			} //fin del switch
//		} //fin del while
//	scan.close();
	
		
//		//Ejercicio 6
//		Scanner scan = new Scanner(System.in);
//		float num;
//		float sum = 0;
//		for(int i=0; i<20; i++) {
//			System.out.println ("introduzca un valor:");
//			num = scan.nextFloat();
//			sum+=num;
//			
//				}
//	System.out.println("la media es:" + (sum/20));
//		
//				
//		scan.close();
//		
//			
//			//ejercicio 7
//		Scanner scan = new Scanner(System.in);
//		int n;
//		int fac=1;
//		System.out.println ("introduzca el valor factorial");
//		n = scan.nextInt();
//		for(int i=1; i<=n; i++){  
//			fac*=i;
//		}
//	System.out.println("el factorial de " + n + " es: " + fac);
//		
		
		
			//ejercicio 8
		
//		Scanner scan = new Scanner(System.in);
//		int n, sum = 0;
//		System.out.println ("introduzca el número impar");
//		n = scan.nextInt();
//		n = n*2;
//		for (int i=1; i<n; i++) {
//			sum += i;
//			i++;
//		}
//		scan.close();
//		System.out.println("el resultado es:" + sum);
		
//		Ejericio 9
//		int res = 0;
//		for(int i=1; i<=500; i++) {
//			if((i%5) == 0 && (i%7) == 0) {
//				res += i;
//			}
//		}
//		System.out.println("El resultado es: " + res);
//		
		//Ejercicio 10
	
//		String tuit;
//		Scanner scan = new Scanner(System.in);
//		System.out.println ("introdulzca el tweet a evaluar");
//		tuit = scan.nextLine();
//		if(tuit.length() <=280) {
//			System.out.println ("tuiteable");
//		} else {
//			System.out.println ("no tuiteable");
//		}
//		scan.close();
//		
		
//		//Ejercicio 11
//		Scanner scan = new Scanner(System.in);
//		int min, d, h;
//		System.out.println("introduzca los minutos totales: ");
//		min = scan.nextInt();
//		d = (min/60)/24;
//		h = (min/60);
//		h = h - (24*d);
//		min = min - (h*60) - (d*24*60);
//		System.out.println (d + " días, " + h + " horas y " + min + "minutos.");
//		scan.close();
		
		//Ejercicio 12
//		Scanner scan = new Scanner(System.in);
//		int x, y, z;
//		System.out.println("introduzca el primer número:");
//		x = scan.nextInt();
//		System.out.println("introduzca el segundo número:");
//		y = scan.nextInt();
//		System.out.println("introduzca el tercer número:");
//		z = scan.nextInt();
//		if(( x % 2 == 0 && y % 2 ==0) ||( y % 2 == 0 && z % 2 == 0) || (x % 2 == 0 && z % 2 == 0)){
//			System.out.println ("almenos dos de los números son pares");
//		} else {
//			System.out.println (" no hay dos o más números pares");
//		}
//		scan.close();
		
		// ejercicio 13
//		Scanner scan = new Scanner(System.in);
//		int n1, n2;
//		System.out.println("introduzca el primer número:");
//		n1 = scan.nextInt();
//		System.out.println("introduzca el primer número:");
//		n2 = scan.nextInt();a
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("el producto es nulo");
//		}else if ((n1 < 0 && n2 < 0 )|| (n1 > 0 && n2 > 0)) {
//			System.out.println("el producto es positivo");
//		} else {
//			System.out.println("el producto es negativo");
//		}
//		scan.close();
		
			//Ejercicio 14
//		Scanner scan = new Scanner(System.in);
//		int x, y, res = 1;
//		System.out.println("introduzca el número:");
//		x = scan.nextInt();
//		System.out.println("introduzca la  potencia:");
//		y = scan.nextInt();
//		for (int i=0; i < y; i++) {
//			res *= x;
//		}
//		System.out.println(Math.pow(x, y));
//		System.out.println(x + "^" + y + " es " + res);
//		scan.close();
//		
//		//ejercicio 15
//		Scanner scan = new Scanner(System.in);
//		float max, min, entrada;
//		System.out.println("introduzca un valor");
//		min = max = entrada = scan.nextFloat();
//		for (int i=1; i<20; i++) {
//			System.out.println("introduzca el " + (i+1) + " valor ");
//			entrada = scan.nextFloat();
//			if (entrada > max) {
//				max = entrada; 
//			} else if (entrada < min) {
//				min = entrada;
//			}
//			}
//		System.out.println("el máximo es: "  + max + "el mínimo es" + min );
//		
//		scan.close();
//		
		
		//ejercicio 16
//		Scanner scan = new Scanner(System.in);
//		int x;
//		do {
//			System.out.println("introduzca un valor" +  "entre 1 y 9: ");
//			x = scan.nextInt();
//		} while ( x <= 0 || x >= 10);
//		if ( x==4 || x==6 || x>=8 ) {
//			System.out.println( x + " No es un número Primo.");
//		} else {
//			System.out.println ( x + " Es un número Primo.");
//		}
//		scan.close();
//		
		//ejericio 17
//		Scanner scan = new Scanner(System.in);
//		int x , max = 0;
//		do {
//			do {
//				System.out.println("Escribe un número positivo: \nPulse 0 para salir.");
//				x = scan.nextInt();
//			} while(x < 0);
//			
//			if(x > 0){
//				if(x > max) {
//					System.out.println(x + " es mayor que el anterior");
//					max = x;
//				} else {
//					max = x;
//				}
//			}
//		} while( x!= 0);
//		System.out.println("Bye!");
//		scan.close();
//		
		//Ejercicio 20
//		Scanner scan = new Scanner(System.in);
//		int n, sumpares = 0, resto;
//		System.out.println("introduzca el valor.");
//		n = scan.nextInt();
//		while (n != 0) {
//			resto = n%10;
//			if(resto % 2 ==0) {
//				sumpares += resto;
//			}
//			n = n/10;
//			System.out.println(resto);
//		}
//		System.out.println ("la suma de los pares es " + sumpares);
//		scan.close();
//		
		//Ejercicio 19
//		int valor [] = new int [10];
//		int sumatoria = 0;
//		float media = 0;
//		double varianza = 0.0;
//		double desviacion = 0.0;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("introducza números el valor de 10" + "como muestra");
//		for (int i=0; i<10; i++) {
//		/for(int i=0; i<20; i++) {
//		System.out.println ("introduzca un valor:");
//		num = scan.nextFloat();
//		sum+=num;
		
		//práctica 1
		//Algoritmo 1
//		Scanner scan = new Scanner (System.in);
//		int n=0; 
//		int sum;
//		System.out.println("Introduzca el Número: ");
//		n = scan.nextInt();
//		sum = 0;
//		for(int i=1; i<n; i++){
//			if(n % i == 0) { 
//				sum = sum +i;
//			}
//		}
//		if (sum == n) {                          
//            System.out.println("El número " + n + " es Perfecto");
//		} else {
//            	System.out.println("el número " + n + " no es perfecto");
//            }
//		scan.close();
////		
		
		//Algoritmo 2
//		Scanner scan = new Scanner (System.in);
//		int x = 0, max = 0; 
//		System.out.println("introduzca un número entero positivo y pulse enter: \n\nPulse en cualquier momento 0 y enter para salir");
//		max = scan.nextInt();
//		if (max != 0) {
//			do {
//					do { 
//						System.out.println("Introduzca otro número entero positivo y pulse enter: ");
//						x = scan.nextInt();
//						if (x < 0) {
//							System.out.println("El número " + x + " Es incorrecto");
//						}
//					} while(x < 0);
//					if(x > 0) {
//						if(x > max) {
//							System.out.println(" El número " + x + " es mayor que el anterior");
//							
//						} 
//						
//						if(x == max) {
//							System.out.println(" El número " + x + " es igual que el anterior");
//						} 
//						if(x < max) {
//							System.out.println(" El número " + x + " es menor que el anterior");
//						
//						} 
//						max = x;			
//					}
//			
//		} while (x != 0);
//	}
//System.out.println("chao");
//scan.close();

				
//Algoritmo 3
		
		int valor [] = new int[4];
		double var= 0.0;
		double desv = 0.0;  
		float media = 0;
		int sumatorio = 0;
		   
		  Scanner scan = new Scanner(System.in);
		  System.out .println("Ingrese el valor de 4 numeros"
		                                     +" como muestra");
		  for (int i = 0; i < 4; i++ ){
		   System.out.print("Ingrese el valor " + (i + 1) + ":");
		   valor[i] = scan.nextInt();
		   sumatorio = sumatorio + valor[i];
		  }
		  
		  media = sumatorio / 4;
		  for(int i = 0 ; i < 4; i++){
		   double rango;
		   rango = Math.pow(valor[i] - media, 2f);
		   var = var + rango;
		  }
		  var = var / 4f;
		  desv = Math.sqrt(var);
		  System.out.println("Media: " + media);
		  System.out.println("Desvianción Estándar: " + desv);
			
		  scan.close();
		}
		
		
		
	}
		
		
			
		
	
		

	

	
	
		
		
				
		
			
		
			
		
		
		
		
		
			
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
			
		
	


