import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	// Do NOT rename this method to main in the hopes of running it directly:
	// "Error: JavaFX runtime components are missing, and are required to run
	// this application"
	// The main method must reside in a separate class not extending Application
	public static void launch(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Button button = new Button();
		button.setText("Say 'Hello World'");
		button.setOnAction(event -> System.out.println("Hello World"));

		StackPane root = new StackPane();
		root.getChildren().add(button);

		primaryStage.setScene(new Scene(root, 640, 480));
		primaryStage.setTitle("Hello World");
		primaryStage.show();
	}
}
