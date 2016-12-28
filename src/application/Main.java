package application;
	
import application.util.ConfirmBox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Tüp Bebek Sistemi");
			primaryStage.setOnCloseRequest(e -> {
	            e.consume();
	            this.closedProgram(primaryStage);
	        });
			Parent root = FXMLLoader.load(getClass().getResource("/application/view/IndexView.fxml"));
			Scene scene = new Scene(root, 800, 500);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void closedProgram(Stage window) {
        Boolean answer = ConfirmBox.display("Exit", "Are you want to exit?");
        if (answer == true) {
            window.close();
        }
    }
	public static void main(String[] args) {
		launch(args);
	}
}

