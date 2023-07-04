import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		/// TODO Auto-generated method stub
		VBox root = FXMLLoader.load(getClass().getResource("CalculatorController.fxml"));
		Scene scene = new Scene(root);
		stage.setMinWidth(300);
		stage.setMinHeight(450);

		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
