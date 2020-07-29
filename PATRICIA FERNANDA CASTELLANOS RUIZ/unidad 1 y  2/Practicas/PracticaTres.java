package proyecto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.ArcType;

public class PracticaTres extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new javafx.scene.Group();
        //Creacion de una zona de dibujo (canvas)de 600 x 600 puntos
        
        Canvas canvas = new javafx.scene.canvas.Canvas(1000,1000);
        //Obtencion del contexto grafico del canvas anterior
       //que permitira realizar posteriormente los dibujos
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        //Se a?ade el canvas al contenedor principal(root)
        root.getChildren().add(canvas);
        //Creacion del area (scene) correspondiente al contenido que tendra
        //la vntana, de 600 x 600 puntos, con color gris claro, indicando que 
        //el elemnto root va a ser el contenedor principal de este espacio
        Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
        //Se asocia la ventana(scene) al parameto primaryStage (escenario prin)
        //El parametro primaryStage se recibe en este metodo start
        
         primaryStage.setScene(scene);
        //Titulo que se aparecera en la ventana
        primaryStage.setTitle("Practica 1");
        //Orden para que se muestre la ventana
        
        primaryStage.show();
        
           
        
        
       
        //CUERPO
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.GREEN);
        gc.appendSVGPath(" M 209 165  L 260 176 L 337 168 L 284 158 ");
        gc.appendSVGPath(" M 209 165  L 260 176 L 242 314 L 187 297 L 209 165");
        gc.appendSVGPath(" M 260 175  L 242 314 L 358 293 L 337 168");
        

         //cuello
        gc.setFill(Color.BISQUE);
        gc.setStroke(Color.BURLYWOOD);
        gc.fillRect(240, 145, 28, 21);
        gc.strokeRect(240, 145, 28, 21);
        gc.fillRect(268, 145, 35, 21);
        gc.strokeRect(268, 145, 35, 21);
        
        
         //cabeza
        gc.strokeRoundRect(211,21,123,126,90,90);
        gc.setFill(Color.BISQUE);
        gc.fillRoundRect(211,21,123,126,90,90);
        gc.fillOval(280,140,30,10);
        
        //pelo 
        gc.setFill(Color.SADDLEBROWN);
        gc.setStroke(Color.SADDLEBROWN);
        gc.fillOval(210,31,20,90);
        gc.fillOval(231,40,35,65);
        gc.fillOval(316,48,26,52);
        gc.fillOval(270,55,70,25);
        gc.fillOval(293,69,23,20);
        gc.fillOval(210,20,120,60);
       
        //sonrisa
        gc.setStroke(Color.BLACK);
	gc.setLineWidth(2);
	gc.strokeLine(285,133,291,138);
        gc.strokeLine(291,138,307,137);
        gc.strokeLine(307,137,310,135);
       
        // megilla
        gc.strokeLine(259,121,262,125);
        gc.strokeLine(262,125,262,135);
        
        //ANTIFAZ
        gc.setFill(Color.DARKGREEN);
        gc.setStroke(Color.DARKGREEN);
        gc.appendSVGPath(" M 281 88 L 259 105  L 271 122 L 292 124 L "
                + "300 128 L 307 124  L 322 122 L 327 106 L 319 88 L  308 100 L 299 100 L   281 88 ");
        //OJOS
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.appendSVGPath(" M 279 101 L 284 101 L 297 107 L 290 114 L 285 114 L279 106");
        gc.appendSVGPath(" M 308 108 L 316 101  L 321 104 L 316 113");
        
        //CINTURA
        gc.setFill(Color.DARKGREEN);
        gc.setStroke(Color.GREEN);
        gc.appendSVGPath("M 190 300 L  188 323 L 240 336 L 240 315");
	gc.appendSVGPath("M 240 315 L 240 336 L 345 316 L 346 294");
        
         // PIE IZQUIERDO
        gc.appendSVGPath("M 135 392 L 168 457 L 190 444 L 177 424 "
                       + "L 210 400 L 239 374 L 210 330");
        
        gc.appendSVGPath("M 177 424 L 190 444 L 235 429 L 225 410");
        gc.appendSVGPath("M 168 457 L 190 444 L 235 429 L 220 445");
        gc.appendSVGPath("M 177 424 L 239 374 L 263 371 L   224 410");  
        
        //PIE DERECHO
        gc.appendSVGPath("M 272 466 L 263 371 L 295 370 L 304 433 "
                              + " L 324 433 L 333 455 ");        
        gc.appendSVGPath("M 324 433 L 333 455 L 372 442 L 367 417");
        gc.appendSVGPath("M 324 433 L 367 417 L 347 417 L 304 433");
        gc.appendSVGPath("M 304 433 L 347 417 L 335 360 L 295 370");
        gc.appendSVGPath("M 295 370 L 335,360 L 342 353 L 341 329 L 335 320 L 290 327");
        gc.appendSVGPath("M 290 327 L 295 370 L 239 374 L 210 330 L 240 336");
        
         //BRAZO derecho
       gc.setFill(Color.DARKGREEN);
       gc.setStroke(Color.DARKGREEN);
       gc.appendSVGPath("M 339 192 L  384 248 L 365 276 L 352 260");
        
        
        //pecho 
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.fillOval(285,220,20,30);
        gc.fillOval(295,215,20,10);
        gc.setStroke(Color.GREEN);
	gc.setLineWidth(2);
        gc.strokeLine(295,206,312,205);
        gc.strokeLine(285,230,312,227);
        
        //MANO
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.appendSVGPath("M 365 274 L 364 270 L 375 255 L 380 255 L 384 258"
                       + "L 390 264 L 374 280");
        gc.appendSVGPath("M 390 264 L 374 280 L 370 287 L 370 300 L 380 310"
                       + "L 388 311 L 397 310 L 410 300 L 412 300 L 415 290"
                       + "L 410 285 L 402 275 L 402 267 L 405 263 L 410 264"
                       + "L 416 270 L 423 277 L 430 285 L 430 280 L 427 270"
                       + "L 415 260 L 410 257 L 400 260 L 394 260");
        
	//brazo izquierdo
        
        gc.appendSVGPath("M 200 300 L 180 260 L 177 252 L 179 244 L 205 190"
                      + " L 211 185 L 224 180 L 237 183 L 246 194 L 250 210 "
                       + "L 242 224 L 230 260 L 240 290 L 218 290 L 207 295");
        
         //MANO
         
        
       
        gc.closePath();
     
        gc.fill();
        gc.stroke();
       
         gc.setFill(Color.GREEN);
         gc.setStroke(Color.BLACK);
        double mano[]= {204,194,188,201,234,227,237,227,240,256,257,237,257,266,261,246,204};
        double manoy[]={292,303,324,342,334,315,344,344,297,307,339,344,339,337,301,288,292};
        gc.strokePolygon(mano, manoy, 17);
        gc.fillPolygon(mano, manoy, 17);

        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}