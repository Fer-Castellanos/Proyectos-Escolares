package unidad.pkg3.y.pkg4;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica3 extends Application {

        @Override
	public void start(Stage stage) {
		
		
		
		Box box = new Box(100, 100, 100);
		box.setRotate(10);
		box.setLayoutX(-100);
		box.setLayoutY(-240);
                
                Box box2 = new Box(100, 100, 100);
		box2.setRotate(10);
		box2.setLayoutX(200);
		box2.setLayoutY(-240);
                
                Box box3 = new Box(100, 100, 100);
		box3.setRotate(10);
		box3.setLayoutX(400);
		box3.setLayoutY(-240);
                
                Box box4 = new Box(100, 100, 100);
		box4.setRotate(10);
		box4.setLayoutX(600);
		box4.setLayoutY(-240);
		
		Sphere esfera = new Sphere(30);
		esfera.setLayoutX(-100);
		esfera.setLayoutY(-340);
                
                Sphere esfera2 = new Sphere(30);
		esfera2.setLayoutX(100);
		esfera2.setLayoutY(-340);
                
                Sphere esfera3 = new Sphere(30);
		esfera3.setLayoutX(300);
		esfera3.setLayoutY(-340);
                
                Sphere esfera4 = new Sphere(30);
		esfera4.setLayoutX(600);
		esfera4.setLayoutY(-340);
		
		Cylinder cilindro = new Cylinder(30, 80);
		cilindro.setLayoutX(-100);
		cilindro.setLayoutY(-140);
                
                Cylinder cilindro2 = new Cylinder(30, 80);
		cilindro2.setLayoutX(100);
		cilindro2.setLayoutY(-140);
                
                Cylinder cilindro3 = new Cylinder(30, 80);
		cilindro3.setLayoutX(300);
		cilindro3.setLayoutY(-140);
                
                Cylinder cilindro4 = new Cylinder(30, 80);
		cilindro4.setLayoutX(600);
		cilindro4.setLayoutY(-140);
		
		PointLight light = new PointLight();
		light.setTranslateX(-350);
		light.setTranslateY(-180);
		light.setTranslateZ(-500);
		
		Group root = new Group(box, light, esfera, cilindro,
                                       box2, esfera2, cilindro2,                
                                       box3, esfera3, cilindro3,
                                       box4, esfera4, cilindro4);
		Scene scene = new Scene(root, 1080, 400, true, SceneAntialiasing.BALANCED);
		
            RotateTransition rotation1 = new RotateTransition(Duration.seconds(2), box);
	    rotation1.setCycleCount(Animation.INDEFINITE);
	    rotation1.setFromAngle(-25);
	    rotation1.setToAngle(90);
	    rotation1.setAutoReverse(true);
	    rotation1.setAxis(Rotate.Y_AXIS);
	    rotation1.play();
            
            RotateTransition rotation2 = new RotateTransition(Duration.seconds(2), cilindro);
	    rotation2.setCycleCount(Animation.INDEFINITE);
	    rotation2.setFromAngle(-25);
	    rotation2.setToAngle(90);
	    rotation2.setAutoReverse(true);
	    rotation2.setAxis(Rotate.Z_AXIS);
	    rotation2.play();
            
            RotateTransition rotation3 = new RotateTransition(Duration.seconds(2), esfera);
	    rotation3.setCycleCount(Animation.INDEFINITE);
	    rotation3.setFromAngle(-25);
	    rotation3.setToAngle(90);
	    rotation3.setAutoReverse(true);
	    rotation3.setAxis(Rotate.Y_AXIS);
	    rotation3.play();
	    
	    TranslateTransition trans1 = new TranslateTransition(Duration.seconds(2), esfera2);
	    trans1.setCycleCount(Animation.INDEFINITE);
	    trans1.setByX(200f);
	    trans1.setAutoReverse(true);	 
	    trans1.play();
            
            TranslateTransition trans2 = new TranslateTransition(Duration.seconds(2), box2);
	    trans2.setCycleCount(Animation.INDEFINITE);
	    trans2.setByX(200f);
	    trans2.setAutoReverse(true);	 
	    trans2.play();
            
            TranslateTransition trans3 = new TranslateTransition(Duration.seconds(2), cilindro2);
	    trans3.setCycleCount(Animation.INDEFINITE);
	    trans3.setByX(200f);
	    trans3.setAutoReverse(true);	 
	    trans3.play();

	     ScaleTransition sacl1 = new ScaleTransition(Duration.seconds(2), cilindro3);
	     sacl1.setByX(1.5f);
	     sacl1.setByY(1.5f);
	     sacl1.setCycleCount(Animation.INDEFINITE);
	     sacl1.setAutoReverse(true);
	     sacl1.play();
             
             ScaleTransition sacl2 = new ScaleTransition(Duration.seconds(2), box3);
	     sacl2.setByX(1.5f);
	     sacl2.setByY(1.5f);
	     sacl2.setCycleCount(Animation.INDEFINITE);
	     sacl2.setAutoReverse(true);
	     sacl2.play();
             
             ScaleTransition sacl3 = new ScaleTransition(Duration.seconds(2), esfera3);
	     sacl3.setByX(1.5f);
	     sacl3.setByY(1.5f);
	     sacl3.setCycleCount(Animation.INDEFINITE);
	     sacl3.setAutoReverse(true);
	     sacl3.play();
	    
	    
		
	    PerspectiveCamera camera = new PerspectiveCamera();
		camera.setTranslateX(scene.getWidth() / -2.0);
		camera.setTranslateY((scene.getHeight() / -2.0)-190);
		
		scene.setCamera(camera);
		stage.setTitle("JavaFX Graficos 3D");
		stage.setScene(scene);
		stage.show();
		
		
	}

	public static void main(String[]args) {
		launch(args);
	}

}