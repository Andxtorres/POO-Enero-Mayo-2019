public enum Instrucciones{
	INST1,INST2,INST3,LLAVE1;


	String imprime(){
		switch(this){
			case INST1:
				return "Quita el comentario en la línea 13 y 21 de Main y haz compilar tu código";
			case INST2:
				return "Llegaste al primer paso y tu código compila, ¿Cuánto te tardaste?, veamos si para el siguiente paso tardas menos, quita el comentario de la línea 24 y 36";
			case INST3:
				return "Quita el comentario de la linea 39 y 45. Crea la clase que hace falta con su método constructor, seguramente contendrá una cadena de caracteres.";
			case INST4:
				return "Seguramente querrás avanzar, que te parece si convertimos tus ganas en un método...";
			case INST5
				return "Quita los comentarios de la linea 55 y 58 y dime... Que tanto quieres avanzar? ahora dime, sin eliminar tu método anterior, del 1 al 100 cuánto quieres avanzar.";
			case INST6
				return "Quita los comentarios de la linea 62 y 66";
			case INST7
				return "Ahora quita los comentarios de la linea 69 y 71. Haz que tu programa cumpla con la linea 73";
			default:
				return "Algo estás haciendo mal";


		}

	}

	String decodifica(){
		switch(this){
			case LLAVE1:
				return "extends";
			case LLAVE3:
				return "implements";
			default:
				return "ninguna";
		}
	}
}