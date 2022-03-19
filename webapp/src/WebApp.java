import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import allansm.file.File;


public class WebApp extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		StackPane root = new StackPane();
		WebView view = new WebView();
		WebEngine engine = view.getEngine();
		
		engine.load(new File(".config").read());
		
		root.getChildren().add(view);

		Scene scene = new Scene(root, 640, 480);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) throws Exception {
		Application.launch(args);
	}
}
