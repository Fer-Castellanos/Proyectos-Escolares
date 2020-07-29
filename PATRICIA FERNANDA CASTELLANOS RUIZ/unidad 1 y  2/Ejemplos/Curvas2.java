package ejercicios30;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Curvas2 extends Application
{
    public static void main(String [] args)
    {
        launch(args);
    }
    
    @Override
    
    public void start (Stage primaryStage)
    {
        Group root = new Group();
        //Creación de una zona de dibujo (canvas) de 600 x 600 puntos
        Canvas canvas = new Canvas(600,600);
        //Obteción del contexto gráfico del canvas anterior que 
        //permitirá realizar posteriormente los dibujos
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //Se añade el canvas al contenedor principal (root)
        root.getChildren().add(canvas);
        //Creación del área (scenen) correspondiente al contenido
        //que tendrá la ventana, de 600 x 600 puntos, con color
        //gris claro, indicando que el elemento root va a ser
        //el contenedor principal de este espacio
        Scene scene = new Scene(root, 600, 600, Color.LIGHTGRAY);
        //Se asocia la ventana (scene) al parámetro primaryStage
        //(escenario principal). El parámetro primaryStage se 
        //recibe en este método start
        primaryStage.setScene(scene);
        //Título que se aparecerá en la ventana 
        primaryStage.setTitle("Dibujo de Cuva");
        //Orden para que se muestre la ventana
        primaryStage.show();
        gc.setLineWidth(5,0);
        gc.setStroke(Color.BLUE);
        
        gc.bezierCurveTo(75, 25, 150, 75, 75, 150);
        gc.stroke();
        
        //Texto en JavaFX
        gc.setFont(Font.font("Arial",20));
        gc.setFill(Color.AQUAMARINE);
        gc.fillText("Ejemplo de curva", 200, 125);
        gc.setFill(Color.BROWN);
        gc.fillText("curva de bazier", 200, 200);
        
        
    }
}
