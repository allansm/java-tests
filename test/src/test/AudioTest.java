package test;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class AudioTest extends Application{
	public static MediaPlayer player;

	@Override
	public void start(Stage primaryStage) {
		player.play();
	}

	public static void play(String fn){	
		Media tmp = new Media(new File(fn).toURI().toString());
		player = new MediaPlayer(tmp);
		launch();
	}

	public static void main(String[]args){
		String fn = new Scanner(System.in).nextLine();
		play(fn);
	}
}
