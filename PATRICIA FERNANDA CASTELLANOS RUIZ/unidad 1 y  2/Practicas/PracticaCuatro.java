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

public class PracticaCuatro extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {    
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
         gc.setFill(Color.WHITE);
         gc.setLineWidth(5);    
         gc.strokeRoundRect(210, 181,86, 19, 10, 10);//cuello
         gc.fillRoundRect(210, 181, 86, 19, 10, 10);
         gc.strokeRoundRect(192, 79, 120, 100, 40, 10);//cabeza
         gc.fillRoundRect(192, 79, 120, 100, 40, 10);
         gc.stroke(); // fin cabeza
         gc.setStroke(Color.BLACK);
         gc.strokeOval(229, 121, 14, 10);//ojos
         gc.strokeOval(266, 120, 14, 10);
         gc.setFill(Color.RED);//labios
         gc.setStroke(Color.RED);
         gc.beginPath();
         gc.appendSVGPath("M 225 151 L 246 141 L 250 152 L 257 141 L 278 148 L 265  170  L 253 173 L 234 170z");
         // 225 163 L 246 158 L 248 160 L
         gc.closePath();
         gc.fill();
         gc.stroke();
         gc.setFill(Color.BLACK);//Boca
         gc.setStroke(Color.BLACK);
         gc.beginPath();
         gc.appendSVGPath("M 216 137 L 216 138 L 221 146  z");
         gc.appendSVGPath("M 221 146 L 283 146 L 268 170 L 232 170 z");
         gc.appendSVGPath("M 290 134 L 283 146  z");
         gc.closePath();
         gc.fill();
         gc.stroke();
         gc.setStroke(Color.YELLOW);//dientes
         gc.setFill(Color.YELLOW);
         gc.beginPath();
         gc.appendSVGPath("M 230 152 L 274 152 L 263 165 L 238 165 ");
         gc.closePath();
         gc.fill();
         gc.stroke();
         gc.setStroke(Color.BLACK);//cara
         gc.setFill(Color.GREEN);
         double ceja []={215,225, 231, 250,228, 215};
         double ceja2[]={110,95,95,114,100, 110 };
         gc.fillPolygon(ceja, ceja2, 6);
         double cotoj []={215,225, 231, 247,252,247,228, 215};
         double cotoj2[]={119,109,109, 121,122,121, 109, 119 };
         gc.strokePolygon(cotoj, cotoj2, 8);
         double cejaizq []={256,278, 283, 292,278, 256};
         double cejaiz[]={115,95,95,110,101, 115 };
         gc.fillPolygon(cejaizq, cejaiz, 6);
         double cotojx []={256,260,278, 283, 293,280,260};
         double cotojy[]={123,123,110,110,120,110, 123};
         gc.strokePolygon(cotojx, cotojy, 7);
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.GREEN);
         double pelo  []={188, 188, 202, 202, 247, 247, 300,300,314,314, 320,320, 329, 329, 333, 335, 315, 308,296,281, 272,249, 232, 211,193,177, 169, 171, 175, 179, 181, 188};
         double pelo2 []={142, 141, 141,85, 80, 85, 80,111,111, 142, 137, 111,105, 97, 77,61,50,50,48,35,35,25,35, 43,49,54, 67, 84, 104, 117, 135,142};
         gc.strokePolygon(pelo, pelo2, 32);
         gc.fillPolygon(pelo, pelo2, 32);
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.PURPLE);
         gc.strokeRect(178, 379,150, 30);//cuerpo morado bajo
         gc.fillRect(178, 379, 150, 30);  
         gc.setFill(Color.PURPLE);
         gc.strokeRoundRect(170, 201,166, 184, 40, 40);//cuerpo morado
         gc.fillRoundRect(170, 201, 166, 184, 40, 40);       
         gc.setStroke(Color.GREEN);
         gc.setFill(Color.GREEN);
         gc.beginPath();
         gc.appendSVGPath("M 175 370 L 210 383 L 180 380  z");
         gc.appendSVGPath("M 237 383 L 253  383 L 253 378  z");
         gc.appendSVGPath("M 260 383 L 270 383  L 260 378 z");
         gc.appendSVGPath("M 172 220 L 168 260 L 185 260 L 175 212 z");
         gc.appendSVGPath("M 290 382 L 325 382 L 330 375 z");
         gc.appendSVGPath("M 334 209 L 334 264 L 328 264z");
         gc.closePath();
         gc.fill();
         gc.stroke();
        
         gc.setStroke(Color.BLACK);
         gc.beginPath();
         gc.appendSVGPath("M 255 390 L 255 369 z");
         gc.closePath();
         gc.fill();
         gc.stroke();
         gc.setStroke(Color.BLACK);
         double saco []={178,185,170,169 , 230, 255, 242, 262 };
         double saco2[]={210, 264,264, 365, 383, 369, 360, 318};
         gc.strokePolygon(saco, saco2, 8);
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.PURPLE);
         double sacox []={255, 285, 335, 355, 328, 323, 328,240,240};
         double sacoy[]={ 369, 384, 369, 269, 264, 258, 220,300,360 };
         gc.strokePolygon(sacox, sacoy, 9);
         gc.fillPolygon(sacox, sacoy, 9);     
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.GREEN);
         double camisax []={258, 236, 243,317,278};
         double camisay[]={200,228,280, 200,200 };
         gc.strokePolygon(camisax, camisay, 5);
         gc.fillPolygon(camisax, camisay, 5);
         double camisa []={199, 210, 240, 233, 253, 199};
         double camisa2[]={202, 220,281,230,201,202 };
         gc.strokePolygon(camisa, camisa2, 6);
         gc.fillPolygon(camisa, camisa2, 6);
         gc.setStroke(Color.RED);   
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.FUCHSIA);
         double solapa []={193, 179, 183, 197, 189, 240, 198, 193};
         double solapa2[]={206, 213,229, 232, 242, 290, 209, 206 };
         gc.strokePolygon(solapa, solapa2, 8);
         gc.fillPolygon(solapa, solapa2, 8);
         double solapax []={235, 323, 309, 330, 330, 315, 244,235};
         double solapay []={298, 240,234, 230, 207, 207,280, 298};
         gc.strokePolygon(solapax, solapay, 8);
         gc.fillPolygon(solapax, solapay, 8);   
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.ORANGE);
         double moño []={205,215,205,246,245};
         double moño2[]={197,213,230,222, 214};
         gc.strokePolygon(moño, moño2, 5);
         gc.fillPolygon(moño, moño2, 5);
         double moñox []={ 258, 292, 283, 294,258};
         double moñoy[]={214,195, 213,228, 222};
         gc.strokePolygon(moñox, moñoy, 5);
         gc.fillPolygon(moñox, moñoy, 5);
         gc.strokeOval(239, 209, 20, 20);
         gc.fillOval(239, 209, 20, 20);
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.FUCHSIA);
         double bol []={290, 325, 324, 288};
         double bol2 []={325, 315,325,332 };
         gc.strokePolygon(bol, bol2, 4);
         gc.fillPolygon(bol, bol2, 4);
         double bols []={180,215, 220, 184};
         double bols2 []={312,323, 330, 320};
         gc.strokePolygon(bols, bols2, 4);
         gc.fillPolygon(bols, bols2, 4);
         //botones
         gc.strokeOval(249, 234, 10, 10);
         gc.strokeOval(249, 255, 10, 10);
         gc.strokeOval(258, 374, 10, 10);
         gc.setFill(Color.WHITE);
         gc.strokeOval(249, 299, 18, 18);
         gc.fillOval(249, 299, 18, 18);
         gc.strokeOval(249, 339, 18, 18);
         gc.fillOval(249, 339, 18, 18);
         gc.strokeOval(269, 305, 6, 6);//cadena
         gc.fillOval(269, 305, 6, 6);
         gc.strokeOval(275, 306, 6, 6);
         gc.fillOval(275, 306, 6, 6);
         gc.strokeOval(281, 310, 6, 6);
         gc.fillOval(281, 310, 6, 6);
         gc.strokeOval(287, 315, 6, 6);
         gc.fillOval(287, 315, 6, 6);
         gc.strokeOval(289, 319, 6, 6);
         gc.fillOval(289, 319, 6, 6);
         gc.strokeOval(293, 324, 6, 6);
         gc.fillOval(293, 324, 6, 6);
         gc.strokeOval(299, 330, 6, 6);
         gc.fillOval(299, 330, 6, 6);
         gc.strokeOval(305, 330, 6, 6);
         gc.fillOval(305, 330, 6, 6);
        
         gc.setFill(Color.WHITE);
         gc.strokeOval(312, 325, 6, 6);
         gc.fillOval(312, 325, 6, 6);
         gc.strokeOval(312, 318, 6, 6);
         gc.fillOval(312, 318, 6, 6);
         gc.strokeOval(312, 311, 6, 6);
         gc.fillOval(312, 311, 6, 6);
         gc.strokeOval(317, 311, 6, 6);
         gc.fillOval(317, 311, 6, 6);
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.PURPLE);
         gc.strokeRect(178, 435,64, 70);//pierna derecha baja
         gc.fillRect(178, 435, 64, 70);
         gc.strokeRoundRect(178, 405,66, 40, 20, 20);//pierna derecha arriba
         gc.fillRoundRect(178, 405, 66, 40,20, 20);
         gc.strokeRect(176, 503,66, 30);//pie derecho
         gc.fillRect(176, 503, 66, 30);
         gc.strokeRoundRect(245, 405,15, 40, 8, 8);//medio
         gc.fillRoundRect(245, 405, 15, 40,8, 8);
         gc.strokeRect(263, 435,64, 70);//pierna izquierda baja
         gc.fillRect(263, 435, 64, 70);
         gc.strokeRoundRect(263, 405,66, 40, 20, 20);//pierna izquierda arriba
         gc.fillRoundRect(263, 405, 66, 40,20, 20);
         gc.strokeRect(263, 503,66, 30);//pie izquierdo
         gc.fillRect(263, 503, 66, 30);
         gc.setStroke(Color.BLACK);
         gc.setFill(Color.GREEN);
         gc.strokeRoundRect(130, 221,36, 134, 10, 10);//brazo derecho
         gc.fillRoundRect(130, 221, 36, 134, 10, 10);
         gc.strokeRoundRect(340, 221,36, 134, 10, 10);//brazo izquierdo
         gc.fillRoundRect(340, 221, 36, 134, 10, 10);
            //rayas chaleco
         gc.beginPath();
         gc.appendSVGPath("M 185 266 L 193 299 L 193 310 z");
         gc.appendSVGPath("M  193 330 L 190 373 z");
         gc.appendSVGPath("M 325 260 L320 310z"); 
         gc.appendSVGPath("M 320 330 L 320 374 z");
         gc.closePath();
         gc.fill();
         gc.stroke();
         gc.setStroke(Color.WHITE);
         gc.setFill(Color.WHITE);
         gc.fillRoundRect(140, 357, 20, 20, 10, 10); //brazo derecho
         gc.fillRoundRect(350, 357, 20, 20, 10, 10);//brazo izquierdo
         gc.setLineWidth(10);
         gc.strokeArc(120, 375, 50, 60, 0, 180, ArcType.OPEN);//mano derecha
         // gc.fillArc(100, 358, 100, 190, 70, 70, ArcType.OPEN);
         gc.strokeArc(340, 375, 50, 60, 0, 180, ArcType.OPEN); // mano izquierda
        
      
        
    }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

