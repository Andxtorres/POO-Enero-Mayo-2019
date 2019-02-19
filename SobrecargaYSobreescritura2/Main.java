public class Main{
	public static void main(String args[]){
		Estudiante e= new Estudiante();
		e.nombre="X";
		EstudianteBueno eb= new EstudianteBueno();
		eb.nombre="Y";
		EstuadianteMalo em= new EstudianteMalo();
		em.nombre="Z";

		e.estudiar();
		eb.estudiar();
		em.estudiar();
		e.estudiar(50);
		eb.estudiar(50);
		em.estudiar(50);
	}
}