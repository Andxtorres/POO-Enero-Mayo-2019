public class EdadNegativaException extends Exception{

	public EdadNegativaException(){
		super("No puede haber una edad negativa");
	}
}