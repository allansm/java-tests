package allan.git;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import java.io.File;


public class GitChart extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		StackPane root = new StackPane();
		WebView view = new WebView();
		WebEngine engine = view.getEngine();
		File f = new File("index.html");
		engine.load(f.toURI().toString());
		root.getChildren().add(view);
		Scene scene = new Scene(root, 680, 130);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) throws Exception {
		Application.launch(args);
	}
}
