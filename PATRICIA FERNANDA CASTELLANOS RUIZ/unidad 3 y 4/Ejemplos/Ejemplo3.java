package unidad.pkg3.y.pkg4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Ejemplo3 extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		// Create a Box CON LINE
		Box box = new Box(100, 100, 100);
		box.setDrawMode(DrawMode.LINE);
		box.setTranslateX(150);
		box.setTranslateY(0);
		box.setTranslateZ(400);
                
                // Create a Box CON FILL
		Box box2 = new Box(100, 100, 100);
		box2.setDrawMode(DrawMode.FILL);
		box2.setTranslateX(150);
		box2.setTranslateY(200);
		box2.setTranslateZ(400);

		// Create a Sphere
		Sphere sphere = new Sphere(50, 20);
		sphere.setDrawMode(DrawMode.LINE);
		sphere.setTranslateX(300);
		sphere.setTranslateY(-5);
		sphere.setTranslateZ(400);

		// Create a Cylinder
		Cylinder cylinder = new Cylinder(40, 120, 5);
		cylinder.setDrawMode(DrawMode.LINE);
		cylinder.setTranslateX(500);
		cylinder.setTranslateY(-25);
		cylinder.setTranslateZ(600);

		// Create a Light
		PointLight light = new PointLight();
		light.setTranslateX(350);
		light.setTranslateY(100);
		light.setTranslateZ(300);

		// Create a Camera to view the 3D Shapes
		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setTranslateX(100);
		camera.setTranslateY(-50);
		camera.setTranslateZ(300);

		// Add the Shapes and the Light to the Group
		Group root = new Group(box,box2, sphere, cylinder, light);

		// Create a Scene with depth buffer enabled
		Scene scene = new Scene(root, 400, 400, true);
		// Add the Camera to the Scene
		scene.setCamera(camera);

		// Add the Scene to the Stage
		stage.setScene(scene);
		// Set the Title of the Stage
		stage.setTitle("Ejemplo de Draw Mode");
		// Display the Stage
		stage.show();
	}

}
