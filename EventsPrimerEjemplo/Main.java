import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.beans.value.*;
public class Main extends Application{
	Label label;
	Usuario usuario;
	public static void main(String[] args){

		launch(args);
	}


	public void start(Stage primaryStage){
		primaryStage.setTitle("Mi aplicación de prueba");
		primaryStage.show();
		Button button= new Button("Login!");
		button.getStyleClass().add("boton");
		label= new Label("Iniciar sesión:");


		VBox vbox= new VBox();
		vbox.setMinHeight(300);
		vbox.setMinWidth(300);
		TextField name= new TextField();
		name.setPromptText("Nombre: ");
		PasswordField password= new PasswordField();
		password.setPromptText("Password: ");		
		vbox.getChildren().add(label);
		vbox.getChildren().add(name);	
		vbox.getChildren().add(password);
		vbox.getChildren().add(button);
		

		Scene scene= new Scene(vbox);
		scene.getStylesheets().add("style.css");
		primaryStage.setScene(scene);
		VBox vbox2= new VBox();
		vbox2.setMinHeight(300);
		vbox2.setMinWidth(300);
		Label label2= new Label("Esta label es de la scene 2");
		vbox2.getChildren().add(label2);
		Button button2= new Button("Regresar");
		vbox2.getChildren().add(button2);

		Scene scene2= new Scene(vbox2);

		scene2.setOnKeyPressed(new EventHandler<KeyEvent>(){
			public void handle(KeyEvent event) {
				switch (event.getCode()){
					case S: 
						vbox2.getChildren().add(new Label(usuario.saludar()));
						break;
				}
			}
		});
		button.addEventHandler(MouseEvent.MOUSE_CLICKED ,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				label.setText("Hola mundo desde el handler");
				vbox.getChildren().add(new Label("Y agregué esta label"));
				usuario= new Usuario(name.getText(),password.getText());
				vbox2.getChildren().add(new Label("Usuario:  "+usuario.getName()));
				vbox2.getChildren().add(new Label("Password:  "+usuario.getPassword()));
				Button sayHello= new Button("Saluda");
				sayHello.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
					public void handle(MouseEvent e){
						vbox2.getChildren().add(new Label(usuario.saludar()));
					}
				});
				vbox2.getChildren().add(sayHello);
				primaryStage.setScene(scene2);
			}
		});
		button2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				primaryStage.setScene(scene);

			}
		});	
	}
	/*
	public class MiEventHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			label.setText("Hola mundo desde el handler");
		}
	}*/

}