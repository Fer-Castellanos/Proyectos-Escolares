package proyecto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Ejemplo extends Application
{ 
    public void start(Stage stage)
    {
        Group root = new Group();
        
        Canvas canvas = new Canvas (500, 500);
        canvas.setTranslateX(200);
        canvas.setTranslateY(150);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        CheckBox cb = new CheckBox("Trasladar");
        cb.setTranslateY(400);
        
        CheckBox cb1 = new CheckBox("Escalar");
        cb1.setTranslateY(425);
        
        CheckBox cb2 = new CheckBox("Rotar");
        cb2.setTranslateY(450);
        
        root.getChildren().add(canvas);
        
        //Fondo amarillo
        gc.setFill(Color.rgb(251, 215, 5));
        gc.fillOval(0, 0, 250, 250);
        
        //Ojo izquierdo
        gc.setLineWidth(3.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(0,0,0));
        gc.fillOval(50, 50, 50, 50);
        
        //Ojo derecho
        gc.setLineWidth(3.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(0, 0, 0));
        gc.fillOval(150, 50, 50, 50);
        
        //Sonrisa
        gc.setLineWidth(3.0);
        gc.setStroke(Color.BLACK);
        gc.fillOval(100, 150, 50, 80);
        
        Group r = new Group (root, cb, cb1, cb2);
        
        Scene scene = new Scene(r, 1000,700,Color.LIGHTGRAY);
        stage.setScene(scene);
        stage.setTitle("Trsansformaciones");
        stage.show();
        
        cb.setOnAction((ActionEvent event) ->
                    {trasladar(root);});
        
          cb.setOnAction((ActionEvent event) ->
                    {escalar(root);});
          
            cb.setOnAction((ActionEvent event) ->
                    {rotar(root);});
    }
    
    private void trasladar (Group root)
    {
        Translate translate =  new Translate();
        translate.setX(10);
        translate.setY(10);
        root.getTransforms().addAll(translate);
    }
    
    private void escalar (Group root)
    {
        Scale scale =  new Scale ();
        scale.setX(0.9);
        scale.setY(0.9);
        root.getTransforms().addAll(scale);
    }
    
    private void rotar (Group root)
    {
        Rotate rotate =  new Rotate();
        rotate.setAngle(1);
        root.getTransforms().addAll(rotate);
    }        
    
    public static void main (String [] args)
    {
        launch(args);
    }
}