// we literally doing nothing here...

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LifeGame extends Application {
	public void start(Stage stage) throws Exception {
		Parent root = (Parent)

		FXMLLoader.load(getClass().getResource("LifeGame.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("LifeGame");
		stage.setScene(scene);
		stage.show();

	}
	
	static LifeGameController controller = new LifeGameController();

	public static void main(String[] args) {
		launch(args);

	}
}