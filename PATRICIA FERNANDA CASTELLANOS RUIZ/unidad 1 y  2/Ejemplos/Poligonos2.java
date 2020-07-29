package ejercicios30;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Poligonos2 extends Application
{   
    @Override
    public void start(Stage primaryStage)
    {
        //CREACIÓN DE LA VENTANA Y DE LOS CONTENEDORES PRINCIPALES
        //Contenedor principal donde se alojan tidis los elementos
        
        Group root = new Group();
        //Creación de una zona de dibujo (canvas) de 600 x 600 puntos
        Canvas canvas = new Canvas(600,600);
        //Obteción del contexto gráfico del canvas anterior que puede
        //realizar posteriormente los dibujos
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //Se añade el canvas al contenedor pricnipal (root)
        root.getChildren().add(canvas);
        //creación del área (scene) correspondiente al contedido que
        //ventana, de 600 x 600 puntos, con color gris claro
        //elemento root va a ser el contenedor principal de este
        
        Scene scene = new Scene (root, 600, 600, Color.LIGHTGRAY );
	//Se asocia la ventana (scene) al parametro primaryStage
	//principal) El parametro primaryStage se recibe en este
        
        primaryStage.setScene(scene);
	//titulo que se aparecera en la ventana
	
	primaryStage.setTitle ("Dibujo de poligonos");
	//orden para que se muestre la ventana

	primaryStage.show ();
	gc.setLineWidth (5, 0);
	gc.setStroke (Color.BLUE);
	gc.setFill(Color.RED);
	gc.beginPath ();
	gc.appendSVGPath ("m 226 279 L 196 388 L 82 386 L 177 449"
	+ "L 139 557 L 229 486 L 320 555 L 280 448" + 
        "L 373 383 L 259 388 L 226 279 z");

	gc.closeFath();
	gc.fill();
	gc.stroke();
    }
}
