package unidad.pkg3.y.pkg4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

/**
 *
 * @author patyc
 */
public class P1 extends Application {
    
    @Override
    public void start(Stage stage) {
        
        //CILINDROS
        //crear un cilindro , radio y altura
        Cylinder cil = new Cylinder(90, 300);
        
        cil.setRotate(280);
        cil.setRotationAxis(new Point3D(1, 1, 0));
        
        cil.setTranslateX(220);
        cil.setTranslateY(160);
        
        //CUBOS
        // crear un cubo , anchura, altura y profundidad
        Box box1 = new Box(120, 120, 120);
        box1.setRotate(270);
        box1.setRotationAxis(new Point3D(1, 1, 0));
        
        box1.setTranslateX(450);
        box1.setTranslateY(300);
 
        //ESFERA
          
        // crear una esfera, anchura, altura y profundidad
        Sphere esfera33 = new Sphere(80, 80);

            esfera33.setTranslateX(320);
            esfera33.setTranslateY(450);
            esfera33.setTranslateZ(10);
            esfera33.setDrawMode(DrawMode.FILL);
            esfera33.setCullFace(CullFace.BACK);
            
        //Creacion de un grupo de objetos
        Group grupo = new Group(cil,box1,esfera33);
        
        //Creacion de una escena de cilindos
        Scene scene = new Scene(grupo,500,500);

        //Cambiar el titulo
        stage.setTitle("Figuras Geometricas    ");

        //Agregar la escena
        stage.setScene(scene);

        //Mostrar todos los contenidos
        stage.show();
    }
        
    public static void main(String args[]) {
        launch(args);
    }
    
}
