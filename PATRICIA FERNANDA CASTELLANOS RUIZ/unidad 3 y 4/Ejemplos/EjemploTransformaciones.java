package unidad.pkg3.y.pkg4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author Martha
 */
public class EjemploTransformaciones extends Application {
    
    @Override public void start(Stage stage) {
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE);
        material.setSpecularColor(Color.rgb(30, 30, 30));
      
        Box cubo = new Box(100, 100, 100);
            cubo.setMaterial(material);
            cubo.setTranslateX(300);
            cubo.setTranslateY(300);
            cubo.setTranslateZ(10);
            cubo.setRotate(35);
            cubo.setDrawMode(DrawMode.FILL);
            cubo.setCullFace(CullFace.BACK);
            
        Sphere esfera = new Sphere(50, 50);
            esfera.setMaterial(material);
            esfera.setTranslateX(600);
            esfera.setTranslateY(300);
            esfera.setTranslateZ(10);
            esfera.setDrawMode(DrawMode.FILL);
            esfera.setCullFace(CullFace.BACK);
            
        Cylinder cilindro = new Cylinder(50, 50);
            cilindro.setMaterial(material);
            cilindro.setTranslateX(600);
            cilindro.setTranslateY(500);
            cilindro.setDrawMode(DrawMode.FILL);
            cilindro.setCullFace(CullFace.BACK);    

        PointLight pointLight = new PointLight(Color.ANTIQUEWHITE);
        pointLight.setTranslateX(800);
        pointLight.setTranslateY(-100);
        pointLight.setTranslateZ(-1000);

        Group root = new Group(cubo, esfera, cilindro);
        root.getChildren().add(pointLight);
        
        Scene scene = new Scene(root, 800, 800, true);
        scene.setFill(Color.rgb(10, 10, 40));
        scene.setCamera(new PerspectiveCamera(false));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}