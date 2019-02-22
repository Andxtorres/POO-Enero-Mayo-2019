import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		/*
			Instrucciones: Para ganar no tienes permitido modificar la clase Main
			Salvo por las instrucciones que vayas descubriendo. Para ganar debes
			completar todos los puntos del rally y probar tu solución con el Main
			del profesor.

			Compila y corre el programa para que comiences. 
		*/

		System.out.println(Instrucciones.INST1.imprime());
		//Paso 1
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Cómo te llamas? Te preguntaré esto cada vez que intentes ganar!");
		String nombre= sc.nextLine();
		Usuario u= new Usuario();
		u.nombre=nombre;
		System.out.println("Hola "+u.nombre);
		System.out.println(Instrucciones.INST2.imprime());
		*/
		//Paso 2
		/*
		u.setNombre(nombre);

		System.out.println("Bien "+u.getNombre()+ " la contrasña para seguir es la palabra reservada para heredar");
		
		String password= sc.nextLine();
		if(password.equals(Instrucciones.LLAVE1.decodifica()){
			System.out.println("Password correcto");
			System.out.println(Instrucciones.INST3.imprime());
		}else{
			System.out.println("Password incorrecto");
		}
		*/
		//Paso 3
		/*
		Direccion d= new Direccion("A ver si me encuentras");
		u.setDireccion(d);
		
		System.out.prinln("Tu direccion es: "+u.getDireccion()+ " y vas bien");
		System.out.println(Instrucciones.INST4.imprime());
		*/
		//Paso 4
		/*
		String llave= u.avanzar("Quiero avanzar");
		
		System.out.println("Lo estás logrando... ");
		System.out.println(Instrucciones.INST5.imprime());
		*/

		//Paso 5
		/*
		int cuanto = sc.nextInt();
		u.avanzar("Quiero avanzar",cuanto);
		System.out.println(Instrucciones.INST6.imprime());
		*/

		//Paso 6
		/* 
		Usuario g= new Ganador();
		g.setNombre(nombre);
		System.out.println(Instrucciones.INST7.imprime());
		*/

		//Paso 7
		/*
		g.avanzar("Quiero avanzar",100);
		*/

		//Para ganar tu programa deberá imprimir: Hola soy "X" y gané. (X es tu nombre)


	}
}