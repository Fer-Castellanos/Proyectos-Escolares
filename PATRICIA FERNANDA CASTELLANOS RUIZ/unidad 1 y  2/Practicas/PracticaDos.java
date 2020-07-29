package proyecto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class PracticaDos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root= new Group();
        Canvas canvas= new Canvas (500, 500);
        GraphicsContext gc= canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene= new Scene (root, 500, 500, Color.ORANGE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dibujo de Harley");
        primaryStage.show();
        gc.setFill(Color.WHITE);
        //cabeza
        gc.strokeRoundRect(196, 136, 75, 60, 15, 15);
        gc.fillRoundRect(196, 136, 75, 60, 15, 15);
        //cuello
        gc.strokeRoundRect(210, 136+60, 256-210, 207-(136+60), 5, 5);
        gc.fillRoundRect(210, 136+60, 256-210, 207-(136+60), 5, 5);
        //rostro
        gc.setFill(Color.BLACK);
        double antifazX[]={203, 204, 209, 223, 230, 234, 239, 250, 246+14, 246+19, 266, 247, 236, 229, 221, 203};
        double antifazY[]={150, 167, 174, 173, 166, 166, 173, 174, 167,    150,    146, 151, 158, 158, 154, 150};
        System.out.println(antifazX.length + "<X Y>"+antifazY.length);
        gc.fillPolygon(antifazX, antifazY, antifazX.length);
        gc.setFill(Color.WHITE);
        double antifaInterX[]={207, 227, 219, 209, 207};
        double antifaInterY[]={156, 162, 169, 165, 156};
        gc.fillPolygon(antifaInterX, antifaInterY, 5);
        double antifaInterDerX[]={237, 258, 254, 242, 237};
        double antifaInterDerY[]={162, 155, 166, 169, 162};
        gc.fillPolygon(antifaInterDerX, antifaInterDerY, 5);
        //Ojos
        gc.setFill(Color.BLACK);
        gc.fillOval(215, 158, 8, 8);
        gc.fillOval(244, 158, 8, 8);
        //labios
        gc.setFill(Color.RED);
        double labiosX[]={212, 226, 233, 240, 253, 240, 233, 226, 212 };
        double labiosY[]={176, 174, 176, 174, 176, 188, 189, 188, 176};
        gc.fillPolygon(labiosX, labiosY, labiosX.length);
        //Dientes
        gc.setFill(Color.WHITE);
        double bocaX[]={220, 245, 245, 233, 220, 220};
        double bocaY[]={179, 179, 182, 185, 182, 179};
        gc.fillPolygon(bocaX, bocaY, bocaY.length);
        //lunar
        gc.setFill(Color.RED);
        gc.fillOval(259, 177, 5, 5);
        //Cabello
        double cabIzqX[]={235, 205, 197, 175, 158, 138, 132, 138, 136, 133, 142, 140, 149, 150, 159, 174, 172, 178, 176, 170, 179, 192, 193, 210, 234, 245, 253, 235 };
        double cabIzqY[]={103, 105, 97,  87,   84, 101, 120, 142, 153, 172, 181, 204, 210, 222, 229, 212, 194, 186, 176, 170, 164, 179, 160, 154, 150, 152, 142, 103};
        gc.strokePolygon(cabIzqX, cabIzqY, cabIzqX.length);
        gc.setFill(Color.RED);
        gc.fillPolygon(cabIzqX, cabIzqY, cabIzqX.length);
        gc.setFill(Color.BLACK);
        double cabDerX[]={235, 265, 275, 288, 323, 337, 341, 335, 335, 331, 332, 325, 323, 310, 297, 294, 283, 273, 274, 264, 254, 235};
        double cabDerY[]={103, 97 ,  90,  75,  77,  93, 120, 142, 159, 167, 183, 202, 204, 204, 192, 175, 173, 182, 160, 156, 141, 103};                                 
        gc.strokePolygon(cabDerX, cabDerY, cabDerY.length);
        gc.fillPolygon(cabDerX, cabDerY, cabDerY.length);
        
       //tronco
        double troncox[]={188, 176, 294, 278, 188};
        double troncoy[] ={207, 306, 306, 207, 207};
        gc.strokePolygon(troncox, troncoy, 4);
        gc.setFill(Color.BLACK);
        gc.fillPolygon(troncox, troncoy, 4);
        //Brazo izq
        double brIzqX[]={186, 174, 145, 152, 153, 169, 186};
        double brIzqY[]={224, 295, 295, 285, 259, 229, 224};
        gc.strokePolygon(brIzqX, brIzqY, 6);
        gc.fillPolygon(brIzqX, brIzqY, 6);
        //Brazo der
        double brDerX[]={280, 297, 312, 312, 319, 292, 280};
        double brDerY[]={224, 230, 259, 285, 295, 295, 224};
        gc.setFill(Color.RED);
        gc.strokePolygon(brDerX, brDerY, 6);
        gc.fillPolygon(brDerX, brDerY, 6);
        //cadera
        gc.setFill(Color.BLACK);
        gc.fillRoundRect(176, 306, 294-176, 323-306, 5, 5);
        //piesna izq
        gc.setFill(Color.RED);
        gc.strokeRoundRect(176, 323, 227-176, 406-323, 5, 5);
        gc.fillRoundRect(176, 323, 227-176, 406-323, 5, 5);
        //bota izq
        gc.setFill(Color.BLACK);
        double botaIzqX[]={176, 182, 202, 220, 227, 232, 171};
        double botaIzqY[]={401, 401, 391, 401, 401, 427, 427};
        gc.strokePolygon(botaIzqX, botaIzqY, botaIzqY.length);
        gc.fillPolygon(botaIzqX, botaIzqY, botaIzqY.length);
        //union
        gc.strokeRoundRect(227, 323, 239-222, 363-323, 5, 5);
        gc.fillRoundRect(227, 323, 239-222, 363-323, 5, 5);
        
        //pierna der
        gc.strokeRoundRect(245, 322, 292-245, 407-325, 5, 5);
        gc.fillRoundRect(245, 322, 292-245, 407-325, 5, 5);
        gc.setFill(Color.RED);
        // double botaIzqX{176, 182, 202, 220, 227, 232, 171};
        double botaDerX[]={232+10-4, 242+10-4, 262+10-4, 280+10-4, 287+10-4, 297+10-4, 232-5+10-4};
        gc.fillPolygon(botaDerX, botaIzqY, botaDerX.length);
        //Mano izq
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(15);
        gc.strokeArc(150, 300, 161-138, 334-309, 0, 180, ArcType.OPEN);
        gc.strokeArc(290, 300, 161-138, 334-309, 0, 180, ArcType.OPEN);
        gc.setLineWidth(5);
        gc.strokeLine(201, 210, 206, 225);
        gc.strokeLine(206, 225, 200, 245);
        gc.strokeLine(200, 245, 202, 261);
        gc.strokeLine(202, 261, 223, 285);
        gc.strokeLine(223, 285, 226, 291);
        
        gc.strokeLine(181, 300, 219, 300);
        gc.strokeLine(181, 306, 219, 306);
        
        gc.strokeLine (245, 300, 283, 300);
        gc.strokeLine(245, 306, 283, 306);
        
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        
        double sacoX[]={271, 278, 271, 282, 284, 234, 233, 257, 254, 271};
        double sacoY[]={212, 248, 276, 289, 303, 303, 293, 256, 226, 212};
        
        gc.strokePolygon(sacoX, sacoY, sacoX.length);
        gc.fillPolygon(sacoX, sacoY, sacoX.length);
        gc.strokeLine(254, 234, 229, 235);
        gc.strokeLine(229, 235, 206, 231);
        
        gc.setFill(Color.WHITE);
        double camisaX[]={208, 232, 253, 251, 236, 231, 229, 211, 208};
        double camisaY[]={228-10, 232-10, 228-10, 223-10, 223-10, 228-10, 223-10, 223-10, 228-10};
        gc.fillPolygon(camisaX, camisaY, camisaX.length);
        
        gc.setStroke(Color.GRAY);
        gc.strokeRoundRect(224+3, 309, 237-224, 11, 5, 5);
        gc.strokeLine(221, 320, 181, 313);
        gc.strokeLine(241, 320, 281, 313);
        
        //camisa roja
        gc.setFill(Color.RED);
        double camRX[]={206, 231, 254, 254, 231,203, 206};
        double camRY[]={234, 237, 234, 258, 291, 258, 234};
        gc.fillPolygon(camRX, camRY, camRY.length);
        
        gc.setFill(Color.WHITE);
        double rodIzqX[]={176, 209, 225, 176, 176};
        double rodIzqY[]={355, 355, 364, 364, 355};
        gc.fillPolygon(rodIzqX, rodIzqY, 5);
        gc.strokePolygon(rodIzqX, rodIzqY, 5);
        
        double rodilleraIzqX[]={175, 198, 223, 223, 198, 175, 175};
        double rodilleraIzqY[]={368, 365, 368, 386, 389, 386, 368};
        gc.strokePolygon(rodilleraIzqX, rodilleraIzqY, rodilleraIzqY.length);
        gc.setFill(Color.BLACK);
        gc.fillPolygon(rodilleraIzqX, rodilleraIzqY, rodilleraIzqY.length);
        
        gc.setFill(Color.RED);
        double rodilleraDerX[]={238, 249, 289, 289, 266, 238, 238};
        double rodilleraDerY[]={368, 365, 368, 386, 389, 386, 368};
        gc.fillPolygon(rodilleraDerX, rodilleraDerY, rodilleraDerX.length);
        gc.strokePolygon(rodilleraDerX, rodilleraDerY, rodilleraDerX.length);
        
        
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
        gc.strokeLine(274, 287, 257, 276);
        gc.strokeLine(275, 244, 269, 223);
        
        gc.setStroke(Color.GRAY);
        gc.strokeLine(206, 274, 191, 284);
        gc.strokeLine(190, 243, 195, 223);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

