import jaco.mp3.player.MP3Player;
import java.io.File;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TriviaGame extends Application {
	private static String Dir = System.getProperty("user.dir");
	
	
	public static void main(String[] args) throws Exception{
		
		Trivia rid = new Trivia();
		 MP3Player play = new MP3Player(new File(Dir,"10 minutes of the Jeopardy theme song.mp3"));
		 play.play();
		  rid.Riddle1();
		  rid.Riddle2();
		  rid.Riddle3();
		  rid.Riddle4();
		  rid.Riddle5();
		 play.stop();
		 //Launches Applications class or the array args the has the video
		 //Data stored in array args */
		  launch(args);
	    }
	  
	
	 //Overrides Applications start Method
	 @Override
	  public void start(Stage stage) throws Exception {
		 //goes to user Directory to find mp4
		File f = new File(Dir, "Star Wars Battlefront Reveal Trailer.mp4");
	    
		
		//Converts media to string URL
	    Media media = new Media(f.toURI().toURL().toString());
	    javafx.scene.media.MediaPlayer player = new javafx.scene.media.MediaPlayer(media);
	    MediaView viewer = new MediaView(player);
	    
	    //change width and height to make it full screeen
	    DoubleProperty width = viewer.fitWidthProperty();
	    DoubleProperty height = viewer.fitHeightProperty();
	    width.bind(Bindings.selectDouble(viewer.sceneProperty(), "width"));
	    height.bind(Bindings.selectDouble(viewer.sceneProperty(), "height"));
	    viewer.setPreserveRatio(true);
	    
	    //Used to layout any manage child
	    StackPane root = new StackPane();
	    root.getChildren().add(viewer);
	    
	    //set the Scene
	    Scene scenes = new Scene(root, 500, 500, Color.BLACK);
	    stage.setScene(scenes);
	    stage.setTitle("Trivia Game");
	    stage.setFullScreen(true);
	    stage.show();   
	    player.play();
	    
	  }
}
					

