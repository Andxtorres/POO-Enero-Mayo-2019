import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.MouseEvent;


public class Main extends Application{
	private double resultadoDob=0.0;
	private Label resultado;
	private boolean isFirstClick=false;
	private String lastOperation="";
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){

		//Border pane
		/*
		BorderPane bp= new BorderPane();
		Scene sc= new Scene(bp);
		HBox hb= new HBox();

		Label label1= new Label("Label 1");
		Label label2= new Label("Label 2");
		Label label3= new Label("Label 3");
		Label label4= new Label("Label 4");
		Label label5= new Label("Label 5");
		bp.setMinHeight(400);
		bp.setMinWidth(400);
		hb.getChildren().add(label1);
		hb.getChildren().add(new Button("Boton1"));
		bp.setTop(hb);
		bp.setLeft(label2);
		bp.setRight(label3);
		bp.setCenter(label4);
		bp.setBottom(label5);
		bp.setMargin(label1,new Insets(20,0,20,0));
		primaryStage.setScene(sc);
		primaryStage.setTitle("Layouts");
		primaryStage.show();
		*/
		BorderPane bp = new BorderPane();

		GridPane gp= new GridPane();	
		gp.add(new Button("AC"),0,0);
		Button button7= new Button("7");
		button7.setId("7");
		button7.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());
		gp.add(button7,0,1);
		Button button4= new Button("4");
		button4.setId("4");
		button4.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button4,0,2);
		gp.add(new Button("1"),0,3);
		gp.add(new Button("C"),0,4);
		gp.add(new Button("+/-"),1,0);
		gp.add(new Button("8"),1,1);
		gp.add(new Button("5"),1,2);
		gp.add(new Button("2"),1,3);
		gp.add(new Button("0"),1,4);
		gp.add(new Button("%"),2,0);
		gp.add(new Button("9"),2,1);
		gp.add(new Button("6"),2,2);
		gp.add(new Button("3"),2,3);
		gp.add(new Button("."),2,4);
		Button buttonPlus= new Button("+");
		buttonPlus.setId("+");
		buttonPlus.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonPlus,3,2);	
		Button buttonEqual= new Button("=");
		buttonEqual.setId("=");
		buttonEqual.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraResultadoHandler());		
		gp.add(buttonEqual,3,3);				
		gp.setHgap(10);
		gp.setVgap(10);

		resultado=new Label(resultadoDob+"");
		bp.setTop(resultado);
		bp.setCenter(gp);	
		bp.setAlignment(resultado,Pos.TOP_RIGHT);			
		Scene sc= new Scene(bp);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Layouts");
		primaryStage.show();
	}

	public class BotonCalculadoraHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			if(!isFirstClick){
				resultado.setText("");
				isFirstClick=true;
			}
			Control c= (Control)e.getSource();
			resultado.setText(resultado.getText()+c.getId());
			System.out.println("Haz presionado un boton "+c.getId());
		}
	}
	public class BotonCalculadoraOperacionHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			Control c= (Control)e.getSource();
			switch(c.getId()){
				case "+":
					lastOperation="+";
					resultadoDob=Double.parseDouble(resultado.getText());
					resultado.setText("0.0");
					isFirstClick=false;
					break;
			}
		}
	}	
	public class BotonCalculadoraResultadoHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			switch(lastOperation){
				case "+":
					resultadoDob=resultadoDob+Double.parseDouble(resultado.getText());
					resultado.setText(resultadoDob+"");
					break;
			}
		}
	}		
}