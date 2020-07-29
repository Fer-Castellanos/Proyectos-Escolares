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

public class PracticaCinco extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         Group root = new Group();
       
        Canvas canvas = new Canvas(1000, 1000);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        root.getChildren().add(canvas);
        
        Scene scene = new Scene(root, 600,400, Color.LIGHTGRAY);
        
        primaryStage.setScene(scene);
         primaryStage.setTitle("Dibujo de Batichica");
        //inicio cabeza
        primaryStage.show();
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.DEEPPINK);
        double izquierda[]={270,272,259, 257,328,328,342,337,270};//pierna izquierda
        double izquierda1[]={486,453,447,382,383,442,451,483,486};
        gc.strokePolygon(izquierda, izquierda1, 9);
        gc.fillPolygon(izquierda, izquierda1, 9);
         double izquier[]={270,272,259, 257,238,234};
        double izquierd[]={486,453,444,382,388, 470};
        gc.strokePolygon(izquier, izquierd, 6);
        gc.fillPolygon(izquier, izquierd, 6);
       gc.strokeLine(272,453,342, 451);
       gc.strokeLine(259, 444,328,442);//fin pierna izquierda
         double pierna []={ 153,138, 170,172,162,173};//pierna derecha
        double pierna1 []={367,472,495,469,454,383};
        gc.strokePolygon(pierna, pierna1, 6);
        gc.fillPolygon(pierna, pierna1, 6);    
        double piernaf []={ 173,241,236,246,244,170,172,162,173};
        double piernafr []={383,383,450,467,489,495,469,454,383};
        gc.strokePolygon(piernaf, piernafr, 9);
        gc.fillPolygon(piernaf, piernafr, 9); 
          gc.strokeLine(172,469,246,467);
          gc.strokeLine(162, 454, 236, 450);//fin pierna derecha
       
        double capa []={38,78, 122, 142, 325, 345, 364, 350,311, 150, 139, 129, 93, 86,80, 75};
        double capa2[]={457,279,190,176, 179, 190, 431, 430,384, 395, 389, 395, 439, 439, 400, 396};
        gc.fillPolygon(capa, capa2, 16);
        gc.strokePolygon(capa, capa2, 16);
          double falda[]={ 177, 165, 96, 111, 115, 177, 339, 402,392, 361,303,361,330,255,206, 176,136,130,105, 157};
        double falda1[]={319,309, 360,383,370, 320,314,356,386,400, 320,402,410,416,398,424,424,380,385,334};
        gc.fillPolygon(falda, falda1,20);
        gc.strokePolygon(falda, falda1, 20);
        double cuerpo[]={ 205,182,150,175, 206,319, 336, 175,205 };
        double cuerpo1[]={183, 197, 306,320,183,182,313,319, 183};
        gc.strokePolygon(cuerpo, cuerpo1, 9);
        gc.fillPolygon(cuerpo, cuerpo1,9);
      //  gc.setFill(Color.PINK);
        double silueta[]={198,207,211, 201,183,332,313, 314, 314, 303,316,323,312,267,210,198};
        double silueta1[]={233,248,272,284,313,310,272,270,248,253,248,228,187,194,188,233};
        gc.strokePolygon(silueta, silueta1, 16);
        gc.fillPolygon(silueta, silueta1, 16);
        gc.strokeArc(242, 245, 50, 20, 0, 180, ArcType.OPEN);
        gc.strokeLine(268, 255, 268, 305);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 199 235 L  230 232 L 199 230  z");
        gc.appendSVGPath("M 322 230 L 293 230 L 322 226z");
        gc.closePath();
        gc.fill();
        gc.stroke();
        gc.setFill(Color.BLACK);
        gc.fillOval(233, 197, 63, 38);
        gc.setFill(Color.DEEPPINK);
        gc.fillOval(237, 199, 56, 34);
        gc.setFill(Color.GRAY);
        double escudo[]={249, 238, 226, 243, 248, 257, 265, 270, 279, 284,299, 291,280, 282,276, 270,274,260,261, 246,247,249};
        double escdo[]= {204, 212, 227, 220, 225, 221, 231, 221, 225, 221,231, 214,204, 211,213, 209,204,204,209, 211,210, 204};
        gc.fillPolygon(escudo, escdo,22);
        gc.strokePolygon(escudo, escdo, 22);
        double cinturon[]={189,200,236,250,282,293,320, 330,288, 266, 240,189};
        double cinturon1[]={300,286,288,281,280,287,283,294,303,311,304,300};
        gc.strokePolygon(cinturon, cinturon1, 12);
        gc.fillPolygon(cinturon, cinturon1, 12);
        gc.setFill(Color.BLACK);
        gc.strokeOval(235, 284, 5, 20);
        gc.fillOval(235, 284, 5, 20);
        gc.strokeOval(290, 282, 5, 20);
        gc.fillOval(290, 282, 5, 20);
        gc.setFill(Color.DEEPPINK);
        gc.setStroke(Color.BLACK);
         double escudo1[]={253, 242, 230, 247, 252, 261, 266, 266, 275, 280,295, 287,276, 278,272, 266,270,256,260, 250,251,253};
        double escdo2[]= {284, 292, 307, 300, 305, 301, 311, 301, 305, 301,311, 294,284, 291,293, 289,284,284,289, 291,290, 284};
        gc.fillPolygon(escudo1, escdo2,22);
        gc.strokePolygon(escudo1, escdo2, 22);
        gc.setFill(Color.PERU);
        gc.setStroke(Color.BLACK);
        double brazo[] ={188,166,156,125,136,177,172,190,188};
        double brazoy[]={194,194,201,260,310,303,262,225,194};
        gc.fillPolygon(brazo, brazoy, 9);
        gc.strokePolyline(brazo, brazoy, 9);
        double brazoiz[]={323,334, 368,372, 359,333,359,330,323};
        double brazox[] ={196,262,266,234,225,235,225,195,196};
        gc.fillPolygon(brazoiz, brazox, 9);
        gc.strokePolygon(brazoiz, brazox, 9);      
        double hand[]= {150,129,128,143,159,159,172,175,172,183,191,192,175,192,204,201,186,166,150};
        double handy[]={305,314,331,346,331,313,301,350,301,304,313,341,350,341,331,312,297,294,305};
        gc.strokePolygon(hand, handy, 19);
        gc.fillPolygon(hand, handy, 19);
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.FUCHSIA);//baston
        double baston[]={440, 461, 450, 425, 405,430, 440, 437, 425, 412,406, 401, 425, 401, 407, 402, 394, 389, 387, 389, 373, 365, 367, 370,348,348,369,364,425};
        double baston2[]={86,93, 172, 215,211, 170,98, 115, 140, 148,148, 153, 160, 153, 173,185,198,200,206, 219,266,275,280, 293,325,331,333,404,216};
        gc.fillPolygon(baston, baston2, 29);
        gc.strokePolygon(baston, baston2, 29);
        double bastonde[]={425, 405,428, 450};
        double bastondet[]={215,211, 174,172};
        gc.fillPolygon(bastonde, bastondet,4 );
        gc.strokePolygon(bastonde, bastondet, 4);
         double bastoni[]={387,405, 402, 387, 349, 366 ,402,387, 387};
        double bastoni1[]={281, 281,330,330, 396,405,330,330, 281};
        gc.fillPolygon(bastoni, bastoni1,9);
        gc.strokePolygon(bastoni, bastoni1, 9);
        gc.setFill(Color.PERU);
        double mano[]={378, 398,388, 370,360,378};
        double man[]={218,224,265,276,270,218};
        gc.strokePolygon(mano, man, 6);
        gc.fillPolygon(mano, man, 6);
        double manita[]={417,427,417,402};
        double manit[]={226, 239,276,280};
        gc.fillPolygon(manita, manit,4);
        gc.strokePolygon(manita, manit, 4);
        double cuello[]={210,210, 281,281};
        double cuelloy[]={156, 181,181,156};
        gc.fillPolygon(cuello, cuelloy, 4);
        gc.strokePolygon(cuello, cuelloy, 4);
        double cabeza[]={186,199,284,299,300,186};
        double cabezay[]={142,163,166,156,78,78,};
        gc.fillPolygon(cabeza, cabezay, 6);
        gc.strokePolygon(cabeza, cabezay, 6);
         gc.setLineWidth(3);
        double cotoj []={215,225, 231, 247,252,247,228, 215};
         double cotoj2[]={119,109,109, 121,122,121, 109, 119 };
         gc.strokePolygon(cotoj, cotoj2, 8);
         double cotojx []={260,263,281, 286, 296,283,263};
         double cotojy[]={123,123,110,110,120,110, 123};
         gc.strokePolygon(cotojx, cotojy, 7);
         gc.setFill(Color.WHITE); 
         gc.strokeOval(229, 121, 14, 10);//ojos
         gc.strokeOval(266, 120, 14, 10);
         gc.fillOval(231, 122, 10, 9);
         gc.fillOval(268, 121, 10, 9);
         gc.setFill(Color.RED);
         double boca[]={232, 246, 251,256,270,260,240,232};
         double boc[]={151,147,148,145,149,160,160,151};
         gc.fillPolygon(boca, boc, 8);
         gc.setFill(Color.WHITE);
         double diente[]={236,266,259,243,236};
         double dientes[]={153,149,156,158,153};
         gc.fillPolygon(diente, dientes, 5);
         gc.setLineWidth(8);
           gc.setStroke(Color.PURPLE);
         double anti[]={208,210,224,248,250,208,250,294,294,279,276,250,250,};
         double antifaz[]={96,133,136,133,114,96,114,102,130,139,139,133,114};
        gc.strokePolygon(anti, antifaz, 13);
        gc.setLineWidth(3);
        gc.setFill(Color.MAROON);
         gc.setStroke(Color.BLACK);
        double pelo[]={186, 170,166,158,163,157,165,158,181,185,185,204,208,230,242,277,281,
                       306,320,331,329,335,321,318,307,306,292,285,272,234,215,208,192,186};
        double pelo1[]={171,171,152,138,124,115,105,95,66,51,41,38,17,5,12,18,32,54,
                        59,91,123,138,161,173,173,146,127,89,85,89,102,121,139,171};
        gc.strokePolygon(pelo, pelo1, 34);
        gc.fillPolygon(pelo, pelo1, 34);
        
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
