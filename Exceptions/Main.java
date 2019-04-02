import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Usuario[] usuarios= new Usuario[3];
		boolean validated=false;
		Scanner sc=new Scanner(System.in);
		while(!validated){
			int edad= sc.nextInt();
			try{
				Usuario u=new Usuario("Andres",edad);
				validated=true;
				usuarios[0]=u;
				System.out.println(usuarios[0].getNombre()+" tiene "+usuarios[0].getEdad());
				System.out.println("Hola en try");
			}catch(NullPointerException e){
				System.out.println("Hola desde el catch ");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("No tengo tantos usuarios");
			}catch(EdadNegativaException e){

				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}
		System.out.println("Despues de ocurrir la exception");
	}
}