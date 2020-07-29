package proyecto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Eventos1 extends Application 
{
    @Override
    public void start(Stage theStage)
    {
        VBox root = new VBox();
        HBox hb = new HBox();
        
        StackPane sp = new StackPane();
        sp.setMinWidth(500);
        sp.setMinHeight(500);
        
        Canvas canvas = new Canvas(500, 500);
        
        root.getChildren().add(canvas);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
           
        btn.setText("azul");
        btn.setOnAction((ActionEvent event) ->{
        drawRectangulo(gc,Color.BLUE);});
        Button btn2 = new Button();
        btn2.setText("Rojo");
        btn2.setOnAction((ActionEvent event) ->{
        drawRectangulo(gc,Color.RED);
        });
        Button btn3 = new Button();
        btn3.setText("verde");
        btn3.setOnAction((ActionEvent event) ->{
        drawRectangulo(gc,Color.GREEN);
        });
        
        
        
            
    }
        
 }
    


