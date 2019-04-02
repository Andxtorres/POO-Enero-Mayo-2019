import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.input.*;



public class FormScene extends Scene{

	private TextField anchoT,largoT,altoT,distanciaT;
	private ChoiceBox<String> tipoCB;
	private Main m;
	private Envio e;

	public FormScene(Main m){
		super(new VBox());
		this.m=m;
		VBox vbox= (VBox)super.getRoot();
		vbox.getChildren().add(new Label("Agregar nuevo envío"));
		vbox.getChildren().add(new Label("Alto:"));
		altoT= new TextField();
		vbox.getChildren().add(altoT);
		vbox.getChildren().add(new Label("Ancho:"));
		anchoT= new TextField();
		vbox.getChildren().add(anchoT);
		vbox.getChildren().add(new Label("Largo:"));
		largoT= new TextField();
		vbox.getChildren().add(largoT);
		vbox.getChildren().add(new Label("Distancia:"));
		distanciaT= new TextField();
		vbox.getChildren().add(distanciaT);
		tipoCB= new ChoiceBox<String>();
		tipoCB.getItems().add("Normal");
		tipoCB.getItems().add("Prioritario");
		tipoCB.getItems().add("Urgente");
		vbox.getChildren().add(tipoCB);
		Button button= new Button("Calcular");
		button.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent ev){
				int ancho= Integer.parseInt(anchoT.getText());
				int largo= Integer.parseInt(largoT.getText());
				int distancia= Integer.parseInt(distanciaT.getText());
				int alto= Integer.parseInt(altoT.getText());
				
				switch(tipoCB.getValue()){

					case "Prioritario":
						e= new EnvioPrioritario(ancho,largo,alto,distancia);
						break;

					case "Urgente":
						e= new EnvioUrgente(ancho,largo,alto,distancia);
						break;

					case "Normal":
						e= new EnvioNormal(ancho,largo,alto,distancia);
						break;												
				}
				new ResultScene(m,e.calcularPrecio());

			}
		});
		vbox.getChildren().add(button);

	}

}