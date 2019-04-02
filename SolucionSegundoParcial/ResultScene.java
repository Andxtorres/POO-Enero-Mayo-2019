import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class ResultScene extends Scene{
	private Label resultado;


	public ResultScene(Main m,double resultadoDouble){
		super(new VBox());
		resultado= new Label();
		VBox vbox= (VBox)super.getRoot();
		resultado.setText(""+resultadoDouble);
		vbox.getChildren().add(resultado);
		m.showResultScene(this);
	}	

}