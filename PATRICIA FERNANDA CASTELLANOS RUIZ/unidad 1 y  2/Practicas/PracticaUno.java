package proyecto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class PracticaUno extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
       
        Canvas canvas = new Canvas(2000, 1000);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        root.getChildren().add(canvas);
        
        Scene scene = new Scene(root, 600,400, Color.LIGHTGRAY);
        
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Dibujo de linea");
        //inicio cabeza
        primaryStage.show();
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        gc.setLineWidth(5);
        gc.strokeRoundRect(223, 60, 55, 16, 10, 10);
        gc.fillRoundRect(223, 60, 55, 16, 10, 10);
        gc.strokeRoundRect(210, 181,86, 19, 10, 10);//cuello
        gc.fillRoundRect(210, 181, 86, 19, 10, 10);
        gc.strokeRoundRect(192, 79, 120, 100, 40, 10);//cabeza
        gc.fillRoundRect(192, 79, 120, 100, 40, 10);
        
        gc.setLineWidth(3);//Quitar grosor a las líneas
        gc.setStroke(Color.BLACK); //RAYAS cara
        gc.strokeLine(210, 79, 294, 180);
        gc.strokeLine(294, 79, 201, 180);
        gc.strokeLine(253, 79, 253, 173);
        gc.strokeLine(190, 129, 310, 129); 
        gc.strokeOval(210, 79, 90, 100);
        gc.strokeOval(230, 90, 50, 70); //Fin rayas cara  
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        gc.beginPath(); //ojos
        gc.appendSVGPath("M 200 91 L 244 130 L 207 149 z");
        gc.appendSVGPath("M 298 93 L 253 130 L 288 149 z");
        gc.closePath();
        gc.fill();
        gc.stroke(); // fin cabeza
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.DARKCYAN);
        
        gc.setFill(Color.BLUE);//Poner el torso azul
        gc.strokeRect(178, 379,150, 30);//cuerpo azul bajo
        gc.fillRect(178, 379, 150, 30);
        gc.strokeRoundRect(170, 201,166, 184, 40, 40);//cuerpo azul
        gc.fillRoundRect(170, 201, 166, 184, 40, 40);
        gc.setStroke(Color.BLACK);
        gc.strokeRoundRect(189, 270, 130, 40, 28 ,20);//negro en azul
        gc.strokeLine(168, 283, 190, 287);
        gc.strokeLine(168, 297, 190, 300);
        gc.strokeLine(320, 288, 335, 280);
        gc.strokeLine(320, 298, 335, 298);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        double solapa []={184,179, 195, 215,170,175,328, 333, 290, 308, 328,318};
        double solapa2[]={207, 237, 257, 347,350,375,375,350, 347 , 260, 237, 207};
        gc.strokePolygon(solapa, solapa2, 12);
        gc.fillPolygon(solapa, solapa2, 12);
        gc.setStroke(Color.BLACK);// rayas verticales
        gc.strokeLine(195, 258, 205, 207);
        gc.strokeLine(225, 370, 228, 207);
        gc.strokeLine(255, 370, 255, 207); 
        gc.strokeLine(285, 370, 285, 207);
        gc.strokeLine(315, 253, 305, 207);
        gc.setFill(Color.BLACK);
        gc.fillOval(240, 245, 30, 50);
        gc.strokeLine(184, 215, 325, 215);//rayas horizontales
        gc.strokeLine(180, 225, 325, 225);
        gc.strokeLine(185, 248, 318, 248);
        gc.strokeLine(330, 235, 180, 237);
        gc.strokeLine(308, 255, 202, 257);
        gc.strokeLine(308, 265, 202, 267);
        gc.strokeLine(308, 275, 202, 277);
        gc.strokeLine(301, 285, 202, 287);
        gc.strokeLine(298, 295, 202, 297);
        gc.strokeLine(298, 305, 210, 307);
        gc.strokeLine(295, 315, 210, 317);
        gc.strokeLine(292, 325, 211, 327);
        gc.strokeLine(292, 335, 211, 337);
        gc.strokeLine(290, 345, 210, 345);
        gc.strokeLine(328, 355, 180, 355);
        gc.strokeLine(328, 365, 180, 365);
        gc.strokeLine(328, 375, 180, 375);//fin rayas, fin cuerpo general
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.DARKCYAN);
        
        gc.setFill(Color.BLUE);//Poner todo el cuerpo en azul
        gc.strokeRect(178, 435,64, 70);//pierna derecha baja
        gc.fillRect(178, 435, 64, 70);
        gc.strokeRoundRect(178, 405,66, 40, 20, 20);//pierna derecha arriba
        gc.fillRoundRect(178, 405, 66, 40,20, 20);
        gc.strokeRect(176, 490,66, 30);//pie derecho
        gc.fillRect(176, 490, 66, 30);
        
        gc.strokeRoundRect(245, 405,15, 40, 8, 8);//medio
        gc.fillRoundRect(245, 405, 15, 40,8, 8);
        gc.strokeRect(263, 435,64, 70);//pierna izquierda baja
        gc.fillRect(263, 435, 64, 70);
        gc.strokeRoundRect(263, 405,66, 40, 20, 20);//pierna izquierda arriba
        gc.fillRoundRect(263, 405, 66, 40,20, 20);
        gc.strokeRect(263, 490,66, 30);//pie izquierdo
        gc.fillRect(263, 490, 66, 30);
          
        gc.strokeRoundRect(130, 221,36, 134, 10, 10);//brazo derecho
        gc.fillRoundRect(130, 221, 36, 134, 10, 10);
        gc.strokeRoundRect(340, 221,36, 134, 10, 10);//brazo izquierdo
        gc.fillRoundRect(340, 221, 36, 134, 10, 10);
         
        gc.setStroke(Color.RED);
        gc.setFill(Color.RED);
        gc.setLineWidth(10);
        gc.strokeArc(120, 360, 50, 60, 0, 180, ArcType.OPEN);
         // gc.fillArc(100, 358, 100, 190, 70, 70, ArcType.OPEN);
        gc.strokeArc(340, 360, 50, 60, 0, 180, ArcType.OPEN);
          
    }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

