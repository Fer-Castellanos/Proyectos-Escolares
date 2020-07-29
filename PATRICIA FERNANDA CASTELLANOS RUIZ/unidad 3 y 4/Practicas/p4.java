package unidad.pkg3.y.pkg4;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class p4 extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Practica 4");
        
        //create cylinder
        Cylinder cylinder = new Cylinder(40, 120, 5);
	cylinder.setDrawMode(DrawMode.LINE);
        cylinder.setTranslateX(500);
	cylinder.setTranslateY(170);
        cylinder.setTranslateZ(400);

        // Create a Box
        Box box = new Box(200, 200, 200);
	box.setCullFace(CullFace.NONE);
        box.setTranslateX(400);
	box.setTranslateY(500);
        box.setTranslateZ(400);
                
        // Create a Sphere
        Sphere sphere = new Sphere(100, 40);       
        sphere.setDrawMode(DrawMode.LINE);
        sphere.setTranslateX(200);
        sphere.setTranslateY(-10);
        sphere.setTranslateZ(400);

        
        
        // Create a red Light
        PointLight redLight = new PointLight();
        redLight.setColor(Color.RED);
        redLight.setTranslateX(250);
        redLight.setTranslateY(-100);
        redLight.setTranslateZ(250);

        // Create a green Light
        PointLight greenLight = new PointLight();
        greenLight.setColor(Color.GREEN);
        greenLight.setTranslateX(250);
        greenLight.setTranslateY(300);
        greenLight.setTranslateZ(300);
        
        // Create a aqua Light
        PointLight aquaLight = new PointLight();
        greenLight.setColor(Color.AQUA);
        greenLight.setTranslateX(250);
        greenLight.setTranslateY(200);
        greenLight.setTranslateZ(200);
        
        
        
        
        // Create a Camera to view the 3D Shapes
        PerspectiveCamera camera = new PerspectiveCamera(false);
	camera.setTranslateX(100);
        camera.setTranslateY(-50);
	camera.setTranslateZ(300);
        
        
              
        
        primaryStage.show();
        Group root = new Group(box, sphere, cylinder, redLight, greenLight);
        
        Scene scene = new Scene(root, 200, 300);

        primaryStage.setScene(scene);
        // Add the Camera to the Scene
        
         
        scene.setCamera(camera);
        primaryStage.show();
      
        // Get the Width of the Scene and the Text
        double sceneWidth = scene.getWidth();
        double textWidth = cylinder.getLayoutBounds().getWidth();
        
        // Define the Durations
        Duration startDuration = Duration.ZERO;
        Duration endDuration = Duration.seconds(10);
         
        // Create the start and end Key Frames
        KeyValue startKeyValue = new KeyValue(cylinder.translateXProperty(), 300);
        KeyFrame startKeyFrame = new KeyFrame(startDuration, startKeyValue);
        KeyValue endKeyValue = new KeyValue(cylinder.translateXProperty(), -0.2 * textWidth);
        KeyFrame endKeyFrame = new KeyFrame(endDuration, endKeyValue);
         
        // Create a Timeline
        Timeline timeline = new Timeline(startKeyFrame, endKeyFrame);       
        // Let the animation run forever
        timeline.setCycleCount(Timeline.INDEFINITE);
        // Run the animation
        timeline.play();
        
        
        
        TranslateTransition translateTransition = new TranslateTransition(); 
      
      //Setting the duration of the transition  
      translateTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      translateTransition.setNode(box); 
      
      //Setting the value of the transition along the x axis. 
      translateTransition.setByX(300); 
      
      //Setting the cycle count for the transition 
      translateTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      translateTransition.setAutoReverse(false); 
      
      //Playing the animation 
      translateTransition.play();
      
     
            //Creating a rotate transition    
      RotateTransition rotateTransition = new RotateTransition(); 
      
      //Setting the duration for the transition 
      rotateTransition.setDuration(Duration.millis(10000)); 
      
      //Setting the node for the transition 
      rotateTransition.setNode(sphere);       
      
      //Setting the angle of the rotation 
      rotateTransition.setByAngle(360); 
      
      //Setting the cycle count for the transition 
      rotateTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      rotateTransition.setAutoReverse(false); 
      
      //Playing the animation 
      rotateTransition.play();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    
}