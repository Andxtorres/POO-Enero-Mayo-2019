import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Main extends Application{
	public static void main(String[] args){
		Application.launch(args);
	}
	public void start(Stage stage){
		stage.initStyle(StageStyle.DECORATED);
		stage.setTitle("Mi Stage");
		initComponents(stage);
		stage.setMaximized(true);
		stage.show();

	}

	public void initComponents(Stage stage){
		
		VBox vbox= new VBox(20);
		Scene sc= new Scene(vbox);
		sc.getStylesheets().add("styles.css");
		Button button= new Button("Push me!");
		button.getStyleClass().add("redButton");
		vbox.getChildren().add(button);
		Label label= new Label("Hola mundo");
		label.getStyleClass().add("label1");
		vbox.getChildren().add(label);
		CheckBox checkbox= new CheckBox("Estás ahí?");
		vbox.getChildren().add(checkbox);
		ToggleGroup tg= new ToggleGroup();
		Label labelGenero= new Label("Cuál es tu género?");
		ToggleButton rb1= new ToggleButton("Masculino");
		rb1.getStyleClass().add("toggleButton");
		rb1.setToggleGroup(tg);
		ToggleButton rb2= new ToggleButton("Masculino");
		rb2.setToggleGroup(tg);
		rb2.getStyleClass().add("toggleButton");
		HBox hboxGender= new HBox();
		hboxGender.getChildren().add(labelGenero);
		hboxGender.getChildren().add(rb1);
		hboxGender.getChildren().add(rb2);
		vbox.getChildren().add(hboxGender);
		stage.setScene(sc);
	}

}