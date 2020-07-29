package proyecto;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.Box;
import javafx.scene.PointLight;

public class FiguraSola extends Application{
    @Override
   public void start(Stage stage){
       //Crear un cubo  3D, anchura, altura y profundidad
       Box box = new Box(100,100,100);
       
       //Crear una luz puntual
       PointLight light = new PointLight();
       light.setTranslateX(-350);
       light.setTranslateY(-180);
       light.setTranslateZ(-500);
       
       Group root = new Group(box, light);
       
       //Crear ñla escena, true para activar eñ buffer de profunidad
       Scene scene = new Scene(root, 1280, 768, true, SceneAntialiasing.BALANCED);
       
       //Crear una camara en perspectiva
       PerspectiveCamera camera = new PerspectiveCamera();
       camera.setTranslateX(scene.getWidth() / -2.0);
       camera.setTranslateY((scene.getHeight() / -2.0)- 150);
       
       scene.setCamera(camera);
       stage.setTitle("JavaFX Graficos 3D");
       stage.setScene(scene);
       stage.show();
   }
   
   public static void main (String [] args){
       launch(args);
   }
    
}
