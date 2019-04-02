import javafx.application.Application;
import javafx.stage.*;

public class Main extends Application{

	private Stage primaryStage;
	public static void main (String args[]){
		launch(args);
	}

	public void start(Stage primaryStage){
		this.primaryStage=primaryStage;
		primaryStage.setScene(new FormScene(this));
		primaryStage.show();
	}

	public void showResultScene(ResultScene rs){
		primaryStage.setScene(rs);
	}



}