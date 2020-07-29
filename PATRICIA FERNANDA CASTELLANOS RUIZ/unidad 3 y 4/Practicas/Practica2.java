package unidad.pkg3.y.pkg4;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.transform.*;
import javafx.animation.*;
import javafx.util.*;

public class Practica2 extends Application{
    
       public void start(Stage stage){
        Pane pn = new Pane();
        pn.setTranslateX(0);
        pn.setTranslateY(0);
        pn.setMinHeight(1500);
        pn.setPrefWidth(1500);
        PhongMaterial mat1 = new PhongMaterial();
        PhongMaterial mat2 = new PhongMaterial();
        PhongMaterial mat3 = new PhongMaterial();
        mat1.setDiffuseMap(new Image("https://s1.1zoom.me/big0/804/Cookies_Texture_Baking_505550.jpg"));
        mat2.setDiffuseMap(new Image("https://i.pinimg.com/originals/08/ef/de/08efde7b8d918a1a23f6099f72a6d7fc.jpg"));
        mat3.setDiffuseMap(new Image("https://i.pinimg.com/originals/4e/55/4a/4e554a449759010510f0e370185f4cb5.png"));
        
        //Cubo 1
        final PhongMaterial boxMaterial = new PhongMaterial();
        boxMaterial.setDiffuseColor(Color.BLUE);
        boxMaterial.setSpecularColor(Color.BLUE);
        
        final Box box = new Box(100,100,100);
        box.setMaterial(boxMaterial);
        box.setTranslateX(150);
        box.setTranslateY(0);
        box.setTranslateZ(400);
        box.setDrawMode(DrawMode.FILL);
        box.setCullFace(CullFace.BACK);
        
         //Cubo 2
        final PhongMaterial boxMaterial2 = new PhongMaterial();
        boxMaterial2.setDiffuseColor(Color.BLUE);
        boxMaterial2.setSpecularColor(Color.BLUE);
        
        final Box box2 = new Box(100,100,100);
        box2.setMaterial(boxMaterial);
        box2.setTranslateX(150);
        box2.setTranslateY(200);
        box2.setTranslateZ(400);
        box2.setDrawMode(DrawMode.FILL);
        box2.setCullFace(CullFace.BACK);
  
        //Cubo 3
        Box box3 = new Box(100, 100, 100);
        box3.setTranslateX(300);
        box3.setTranslateY(350);
        box3.setTranslateZ(120);
        box3.setMaterial(mat2);
        box3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.X_AXIS));
        box3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Y_AXIS));
        box3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Z_AXIS));
        pn.getChildren().add(box3);
        
        //Esfera 1
        final PhongMaterial esferaMaterial = new PhongMaterial();
        esferaMaterial.setDiffuseColor(Color.PINK);
        esferaMaterial.setSpecularColor(Color.PINK);
        
        final Sphere esfera = new Sphere(70);
        esfera.setMaterial(esferaMaterial);
        esfera.setTranslateX(500);
        esfera.setTranslateY(200);
        esfera.setTranslateZ(400);
        esfera.setDrawMode(DrawMode.FILL);
        esfera.setCullFace(CullFace.BACK);
        
        //Esfera 2  
        final PhongMaterial esferaMaterial2 = new PhongMaterial();
        esferaMaterial2.setDiffuseColor(Color.PINK);
        esferaMaterial2.setSpecularColor(Color.PINK);
        
        final Sphere esfera2 = new Sphere(70);
        esfera2.setMaterial(esferaMaterial);
        esfera2.setTranslateX(500);
        esfera2.setTranslateY(-25);
        esfera2.setTranslateZ(600);
        esfera2.setDrawMode(DrawMode.FILL);
        esfera2.setCullFace(CullFace.BACK);
        
        //Esfera 3
        Sphere esfera3 = new Sphere(70);
        esfera3.setTranslateX(520);         
        esfera3.setTranslateY(370);
        esfera3.setTranslateZ(200);
        esfera3.setMaterial(mat1);
        esfera3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.X_AXIS));
        esfera3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Y_AXIS));
        esfera3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Z_AXIS));
        pn.getChildren().add(esfera3);
        
        //Cilindro 1
         final PhongMaterial cilindroMaterial = new PhongMaterial();
        cilindroMaterial.setDiffuseColor(Color.GREEN);
        cilindroMaterial.setSpecularColor(Color.GREEN);
        
        final Cylinder cilindro = new Cylinder(40, 120,5);
        cilindro.setMaterial(cilindroMaterial);
        cilindro.setTranslateX(700);
        cilindro.setTranslateY(0);
        cilindro.setTranslateZ(600);
        cilindro.setDrawMode(DrawMode.FILL);
        cilindro.setCullFace(CullFace.BACK);
        
        //Cilindro 2
        final PhongMaterial cilindroMaterial2 = new PhongMaterial();
        cilindroMaterial2.setDiffuseColor(Color.GREEN);
        cilindroMaterial2.setSpecularColor(Color.GREEN);
        
        final Cylinder cilindro2 = new Cylinder(40, 120,5);
        cilindro2.setMaterial(cilindroMaterial2);
        cilindro2.setTranslateX(700);
        cilindro2.setTranslateY(250);
        cilindro2.setTranslateZ(400);
        cilindro2.setDrawMode(DrawMode.FILL);
        cilindro2.setCullFace(CullFace.BACK);  
        
        //Cilindro 3
        Cylinder cilindro3 = new Cylinder(40, 120, 5);
        cilindro3.setTranslateX(700);
        cilindro3.setTranslateY(390);
        cilindro3.setTranslateZ(120);
        cilindro3.setMaterial(mat3);
        cilindro3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.X_AXIS));
        cilindro3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Y_AXIS));
        cilindro3.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Z_AXIS));
        pn.getChildren().add(cilindro3);
        
               
	PerspectiveCamera camera = new PerspectiveCamera(false);
	camera.setTranslateX(100);
	camera.setTranslateY(-50);
	camera.setTranslateZ(300);

	Group root = new Group(box, box2,box3, esfera, esfera2, esfera3, cilindro, cilindro2, cilindro3);
        
	Scene scene = new Scene(root, 400, 400, true);
	scene.setCamera(camera);

	stage.setScene(scene);
	stage.setTitle("Ejemplo de Draw Mode");
	stage.show();
    }
       
         public static void main(String[] args)
	{
		Application.launch(args);
	}
}

