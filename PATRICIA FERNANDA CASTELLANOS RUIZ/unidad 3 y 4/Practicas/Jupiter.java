package unidad.pkg3.y.pkg4;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.transform.*;

import javafx.animation.*;
import javafx.util.*;

public class Jupiter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage hauptFenster) {
        Pane pn = new Pane();
        pn.setTranslateX(0);
        pn.setTranslateY(0);
        pn.setStyle("-fx-background-image: url('https://www.solarsystemscope.com/textures/download/2k_stars.jpg');-fx-background-size: cover; -fx-background-repeat: no-repeat;");
       pn.setMinHeight(1500);
       pn.setPrefWidth(1500);
        PhongMaterial mat1 = new PhongMaterial();
        PhongMaterial mat2 = new PhongMaterial();
        PhongMaterial mat3 = new PhongMaterial();
        mat1.setDiffuseMap(new Image("https://i.blogs.es/4966c5/jupiter-portada/1366_2000.jpg"));
        mat2.setDiffuseMap(new Image("https://previews.123rf.com/images/llepod/llepod1604/llepod160400129/55601938-superficie-de-textura-transparente-de-la-alta-resoluci%C3%B3n-de-la-luna.jpg"));
        mat3.setDiffuseMap(new Image ("https://st3.depositphotos.com/4813335/13052/v/950/depositphotos_130529100-stock-illustration-light-effect-star-burst-with.jpg"));
        int numero = (int) (Math.random() * 1400) + 1;
        
        Sphere p = new Sphere(150, 150);
        p.setTranslateX(300);
        p.setTranslateY(300);
        p.setTranslateZ(10);
        p.setMaterial(mat1);
        p.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.X_AXIS));
        p.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Y_AXIS));
        p.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Z_AXIS));
        pn.getChildren().add(p);

        Sphere luna = new Sphere(20, 20);
        luna.setTranslateX(500);
        luna.setTranslateY(200);
        luna.setTranslateZ(10);
        luna.setMaterial(mat2);
        luna.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.X_AXIS));
        luna.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Y_AXIS));
        luna.getTransforms().add(new Rotate(10, 0, 0, 0, Rotate.Z_AXIS));
        pn.getChildren().add(luna);
        
        
        Sphere est = new Sphere(10, 10);
        est.setTranslateX(120);
        est.setTranslateY(80);
        est.setTranslateZ(10);
        est.setMaterial(mat3);
        pn.getChildren().add(est);
       
        Sphere est1 = new Sphere(10, 10);
        est1.setTranslateX(350);
        est1.setTranslateY(600);
        est1.setTranslateZ(10);
        est1.setMaterial(mat3);
        pn.getChildren().add(est1);
        
        Sphere est2 = new Sphere(10, 10);
        est2.setTranslateX(425);
        est2.setTranslateY(900);
        est2.setTranslateZ(10);
        est2.setMaterial(mat3);
        pn.getChildren().add(est2);
        
        Sphere est3 = new Sphere(10, 10);
        est3.setTranslateX(976);
        est3.setTranslateY(350);
        est3.setTranslateZ(10);
        est3.setMaterial(mat3);
        pn.getChildren().add(est3);
        
        Sphere est4 = new Sphere(10, 10);
        est4.setTranslateX(1300);
        est4.setTranslateY(250);
        est4.setTranslateZ(10);
        est4.setMaterial(mat3);
        pn.getChildren().add(est4);
        
        Sphere est5 = new Sphere(10, 10);
        est5.setTranslateX(420);
        est5.setTranslateY(850);
        est5.setTranslateZ(10);
        est5.setMaterial(mat3);
        pn.getChildren().add(est5);
        
        Sphere est6 = new Sphere(10, 10);
        est6.setTranslateX(777);
        est6.setTranslateY(111);
        est6.setTranslateZ(10);
        est6.setMaterial(mat3);
        pn.getChildren().add(est6);
        
        
        RotateTransition rt3 = new RotateTransition(Duration.millis(2000), p);
        rt3.setAxis(Rotate.Y_AXIS);
        rt3.setToAngle(50);
        rt3.setCycleCount(150);
        rt3.setAutoReverse(true);
        rt3.play();

        RotateTransition rt31 = new RotateTransition(Duration.millis(2000), luna);
        rt31.setAxis(Rotate.Y_AXIS);
        rt31.setToAngle(50);
        rt31.setCycleCount(150);
        rt31.setAutoReverse(true);
        rt31.play();

       
        hauptFenster.setTitle("3D-Object");
        hauptFenster.setScene(new Scene(pn, 1600, 1600));
        hauptFenster.show();
    }
}
