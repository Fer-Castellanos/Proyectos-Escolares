package unidad.pkg3.y.pkg4;

import javafx.scene.paint.Color;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Espacio extends Application 
{
   // variable integer para almacenar el frame
    private Integer i=0;
    
    @Override public void start(Stage stage) 
    {
        //Sol
        final PhongMaterial esferaMaterial = new PhongMaterial();
        esferaMaterial.setDiffuseColor(Color.YELLOW);
        esferaMaterial.setSpecularColor(Color.YELLOW);
        
        final Sphere esfera = new Sphere(100);
        esfera.setMaterial(esferaMaterial);
        esfera.setTranslateX(580);
        esfera.setTranslateY(220);
        esfera.setTranslateZ(10);
        esfera.setDrawMode(DrawMode.FILL);
        esfera.setCullFace(CullFace.BACK);
        
        PointLight pointLight = new PointLight (Color.ANTIQUEWHITE);
        pointLight.setTranslateX(450);
        pointLight.setTranslateY(300);
        pointLight.setTranslateZ(10);
        
        //Mercurio
        final PhongMaterial esferaMaterial2 = new PhongMaterial();
        esferaMaterial2.setDiffuseColor(Color.rgb(46, 46, 46));
        esferaMaterial2.setSpecularColor(Color.GREY);
        
        final Sphere esfera2 = new Sphere(20);
        esfera2.setMaterial(esferaMaterial2);
        esfera2.setTranslateX(600);
        esfera2.setTranslateY(300);
        esfera2.setTranslateZ(30);
        esfera2.setDrawMode(DrawMode.FILL);
        esfera2.setCullFace(CullFace.BACK);
        
        PointLight pointLight2 = new PointLight (Color.ANTIQUEWHITE);
        pointLight2.setTranslateX(800);
        pointLight2.setTranslateY(-100);
        pointLight2.setTranslateZ(-1000);
        
        
        //Venus
        final PhongMaterial esferaMaterial3 = new PhongMaterial();
        esferaMaterial3.setDiffuseColor(Color.rgb(121, 72, 36));
        esferaMaterial3.setSpecularColor(Color.WHITE);
        
        final Sphere esfera3 = new Sphere(30);
        esfera3.setMaterial(esferaMaterial3);
        esfera3.setTranslateX(700);
        esfera3.setTranslateY(400);
        esfera3.setTranslateZ(40);
        esfera3.setDrawMode(DrawMode.FILL);
        esfera3.setCullFace(CullFace.BACK);
        
        PointLight pointLight3 = new PointLight (Color.ANTIQUEWHITE);
        pointLight3.setTranslateX(800);
        pointLight3.setTranslateY(-100);
        pointLight3.setTranslateZ(-1000);

        //Tierra
        final PhongMaterial esferaMaterial4 = new PhongMaterial();
        esferaMaterial4.setDiffuseColor(Color.rgb(0, 160, 221));
        esferaMaterial4.setSpecularColor(Color.BLUE);

        final Sphere esfera4 = new Sphere(40);
        esfera4.setMaterial(esferaMaterial4);
        esfera4.setTranslateX(800);
        esfera4.setTranslateY(500);
        esfera4.setTranslateZ(50);
        esfera4.setDrawMode(DrawMode.FILL);
        esfera4.setCullFace(CullFace.BACK);

        PointLight pointLight4 = new PointLight(Color.ANTIQUEWHITE);
        pointLight4.setTranslateX(700);
        pointLight4.setTranslateY(500);
        pointLight4.setTranslateZ(50);

        //ESTRELLAS
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.RED);
        material.setSpecularColor(Color.rgb(30, 30, 30));

        Sphere estrella1 = new Sphere(5, 5);
        estrella1.setMaterial(material);
        estrella1.setTranslateX(100);
        estrella1.setTranslateY(20);
        estrella1.setTranslateZ(10);
        estrella1.setDrawMode(DrawMode.FILL);
        estrella1.setCullFace(CullFace.BACK);

        Sphere estrella2 = new Sphere(5, 5);
        estrella2.setMaterial(material);
        estrella2.setTranslateX(250);
        estrella2.setTranslateY(400);
        estrella2.setTranslateZ(-20);
        estrella2.setDrawMode(DrawMode.FILL);
        estrella2.setCullFace(CullFace.BACK);

        Sphere estrella3 = new Sphere(7, 7);
        estrella3.setMaterial(material);
        estrella3.setTranslateX(1200);
        estrella3.setTranslateY(570);
        estrella3.setTranslateZ(20);
        estrella3.setDrawMode(DrawMode.FILL);
        estrella3.setCullFace(CullFace.BACK);

        Sphere estrella4 = new Sphere(3, 3);
        estrella4.setMaterial(material);
        estrella4.setTranslateX(780);
        estrella4.setTranslateY(678);
        estrella4.setTranslateZ(0);
        estrella4.setDrawMode(DrawMode.FILL);
        estrella4.setCullFace(CullFace.BACK);

        Sphere estrella5 = new Sphere(2, 2);
        estrella5.setMaterial(material);
        estrella5.setTranslateX(100);
        estrella5.setTranslateY(700);
        estrella5.setTranslateZ(10);
        estrella5.setDrawMode(DrawMode.FILL);
        estrella5.setCullFace(CullFace.BACK);

        Sphere estrella6 = new Sphere(2, 2);
        estrella6.setMaterial(material);
        estrella6.setTranslateX(568);
        estrella6.setTranslateY(500);
        estrella6.setTranslateZ(-20);
        estrella6.setDrawMode(DrawMode.FILL);
        estrella6.setCullFace(CullFace.BACK);

        Sphere estrella7 = new Sphere(2, 2);
        estrella7.setMaterial(material);
        estrella7.setTranslateX(708);
        estrella7.setTranslateY(600);
        estrella7.setTranslateZ(-20);
        estrella7.setDrawMode(DrawMode.FILL);
        estrella7.setCullFace(CullFace.BACK);

        Sphere estrella8 = new Sphere(2, 2);
        estrella8.setMaterial(material);
        estrella8.setTranslateX(505);
        estrella8.setTranslateY(420);
        estrella8.setTranslateZ(-20);
        estrella8.setDrawMode(DrawMode.FILL);
        estrella8.setCullFace(CullFace.BACK);

Sphere estrella9 = new Sphere(2, 2);
        estrella9.setMaterial(material);
        estrella9.setTranslateX(100);
        estrella9.setTranslateY(70);
        estrella9.setTranslateZ(-20);
        estrella9.setDrawMode(DrawMode.FILL);
        estrella9.setCullFace(CullFace.BACK);

        Sphere estrella10 = new Sphere(2, 2);
        estrella10.setMaterial(material);
        estrella10.setTranslateX(876);
        estrella10.setTranslateY(200);
        estrella10.setTranslateZ(-20);
        estrella10.setDrawMode(DrawMode.FILL);
        estrella10.setCullFace(CullFace.BACK);

        Sphere estrella11 = new Sphere(2, 2);
        estrella11.setMaterial(material);
        estrella11.setTranslateX(890);
        estrella11.setTranslateY(200);
        estrella11.setTranslateZ(-20);
        estrella11.setDrawMode(DrawMode.FILL);
        estrella11.setCullFace(CullFace.BACK);

        Sphere estrella12 = new Sphere(2, 2);
        estrella12.setMaterial(material);
        estrella12.setTranslateX(1000);
        estrella12.setTranslateY(377);
        estrella12.setTranslateZ(-20);
        estrella12.setDrawMode(DrawMode.FILL);
        estrella12.setCullFace(CullFace.BACK);

        Sphere estrella13 = new Sphere(2, 2);
        estrella13.setMaterial(material);
        estrella13.setTranslateX(999);
        estrella13.setTranslateY(600);
        estrella13.setTranslateZ(-20);
        estrella13.setDrawMode(DrawMode.FILL);
        estrella13.setCullFace(CullFace.BACK);

        Sphere estrella14 = new Sphere(2, 2);
        estrella14.setMaterial(material);
        estrella14.setTranslateX(1056);
        estrella14.setTranslateY(398);
        estrella14.setTranslateZ(-20);
        estrella14.setDrawMode(DrawMode.FILL);
        estrella14.setCullFace(CullFace.BACK);

        Sphere estrella15 = new Sphere(2, 2);
        estrella15.setMaterial(material);
        estrella15.setTranslateX(852);
        estrella15.setTranslateY(220);
        estrella15.setTranslateZ(-20);
        estrella15.setDrawMode(DrawMode.FILL);
        estrella15.setCullFace(CullFace.BACK);

        Sphere estrella16 = new Sphere(2, 2);
        estrella16.setMaterial(material);
        estrella16.setTranslateX(431);
        estrella16.setTranslateY(233);
        estrella16.setTranslateZ(-20);
        estrella16.setDrawMode(DrawMode.FILL);
        estrella16.setCullFace(CullFace.BACK);

        Sphere estrella17 = new Sphere(2, 2);
        estrella17.setMaterial(material);
        estrella17.setTranslateX(68);
        estrella17.setTranslateY(500);
        estrella17.setTranslateZ(-20);
        estrella17.setDrawMode(DrawMode.FILL);
        estrella17.setCullFace(CullFace.BACK);

        Sphere estrella18 = new Sphere(2, 2);
        estrella18.setMaterial(material);
        estrella18.setTranslateX(321);
        estrella18.setTranslateY(209);
        estrella18.setTranslateZ(-20);
        estrella18.setDrawMode(DrawMode.FILL);
        estrella18.setCullFace(CullFace.BACK);

        Sphere estrella19 = new Sphere(2, 2);
        estrella19.setMaterial(material);
        estrella19.setTranslateX(777);
        estrella19.setTranslateY(185);
        estrella19.setTranslateZ(-20);
        estrella19.setDrawMode(DrawMode.FILL);
        estrella19.setCullFace(CullFace.BACK);

        Sphere estrella20 = new Sphere(2, 2);
        estrella20.setMaterial(material);
        estrella20.setTranslateX(1200);
        estrella20.setTranslateY(89);
        estrella20.setTranslateZ(-20);
        estrella20.setDrawMode(DrawMode.FILL);
        estrella20.setCullFace(CullFace.BACK);

        Sphere estrella21 = new Sphere(2, 2);
        estrella21.setMaterial(material);
        estrella21.setTranslateX(1069);
        estrella21.setTranslateY(890);
        estrella21.setTranslateZ(-20);
        estrella21.setDrawMode(DrawMode.FILL);
        estrella21.setCullFace(CullFace.BACK);

        Sphere estrella22 = new Sphere(2, 2);
        estrella22.setMaterial(material);
        estrella22.setTranslateX(1360);
        estrella22.setTranslateY(200);
        estrella22.setTranslateZ(-20);
        estrella22.setDrawMode(DrawMode.FILL);
        estrella22.setCullFace(CullFace.BACK);

        Sphere estrella23 = new Sphere(2, 2);
        estrella23.setMaterial(material);
        estrella23.setTranslateX(1256);
        estrella23.setTranslateY(400);
        estrella23.setTranslateZ(-20);
        estrella23.setDrawMode(DrawMode.FILL);
        estrella23.setCullFace(CullFace.BACK);

        Sphere estrella24 = new Sphere(2, 2);
        estrella24.setMaterial(material);
        estrella24.setTranslateX(1267);
        estrella24.setTranslateY(549);
        estrella24.setTranslateZ(-20);
        estrella24.setDrawMode(DrawMode.FILL);
        estrella24.setCullFace(CullFace.BACK);

        Sphere estrella25 = new Sphere(2, 2);
        estrella25.setMaterial(material);
        estrella25.setTranslateX(1099);
        estrella25.setTranslateY(56);
        estrella25.setTranslateZ(-20);
        estrella25.setDrawMode(DrawMode.FILL);
        estrella25.setCullFace(CullFace.BACK);

        Sphere estrella26 = new Sphere(2, 2);
        estrella26.setMaterial(material);
        estrella26.setTranslateX(1243);
        estrella26.setTranslateY(777);
        estrella26.setTranslateZ(-20);
        estrella26.setDrawMode(DrawMode.FILL);
        estrella26.setCullFace(CullFace.BACK);

        Sphere estrella27 = new Sphere(2, 2);
        estrella27.setMaterial(material);
        estrella27.setTranslateX(1077);
        estrella27.setTranslateY(156);
        estrella27.setTranslateZ(-20);
        estrella27.setDrawMode(DrawMode.FILL);
        estrella27.setCullFace(CullFace.BACK);

        Sphere estrella28 = new Sphere(2, 2);
        estrella28.setMaterial(material);
        estrella28.setTranslateX(1306);
        estrella28.setTranslateY(100);
        estrella28.setTranslateZ(-20);
        estrella28.setDrawMode(DrawMode.FILL);
        estrella28.setCullFace(CullFace.BACK);

        Sphere estrella29 = new Sphere(2, 2);
        estrella29.setMaterial(material);
        estrella29.setTranslateX(1287);
        estrella29.setTranslateY(207);
        estrella29.setTranslateZ(-20);
        estrella29.setDrawMode(DrawMode.FILL);
        estrella29.setCullFace(CullFace.BACK);

        Sphere estrella30 = new Sphere(2, 2);
        estrella30.setMaterial(material);
        estrella30.setTranslateX(1300);
        estrella30.setTranslateY(239);
        estrella30.setTranslateZ(-20);
        estrella30.setDrawMode(DrawMode.FILL);
        estrella30.setCullFace(CullFace.BACK);

        Sphere estrella31 = new Sphere(2, 2);
        estrella31.setMaterial(material);
        estrella31.setTranslateX(100);
        estrella31.setTranslateY(200);
        estrella31.setTranslateZ(-20);
        estrella31.setDrawMode(DrawMode.FILL);
        estrella31.setCullFace(CullFace.BACK);

        Sphere estrella32 = new Sphere(2, 2);
        estrella32.setMaterial(material);
        estrella32.setTranslateX(240);
        estrella32.setTranslateY(789);
        estrella32.setTranslateZ(-20);
        estrella32.setDrawMode(DrawMode.FILL);
        estrella32.setCullFace(CullFace.BACK);

        Sphere estrella33 = new Sphere(2, 2);
        estrella33.setMaterial(material);
        estrella33.setTranslateX(156);
        estrella33.setTranslateY(350);
        estrella33.setTranslateZ(-20);
        estrella33.setDrawMode(DrawMode.FILL);
        estrella33.setCullFace(CullFace.BACK);

        Sphere estrella34 = new Sphere(2, 2);
        estrella34.setMaterial(material);
        estrella34.setTranslateX(250);
        estrella34.setTranslateY(299);
        estrella34.setTranslateZ(-20);
        estrella34.setDrawMode(DrawMode.FILL);
        estrella34.setCullFace(CullFace.BACK);

        Sphere estrella35 = new Sphere(2, 2);
        estrella35.setMaterial(material);
        estrella35.setTranslateX(198);
        estrella35.setTranslateY(213);
        estrella35.setTranslateZ(-20);
        estrella35.setDrawMode(DrawMode.FILL);
        estrella35.setCullFace(CullFace.BACK);

        Sphere estrella36 = new Sphere(2, 2);
        estrella36.setMaterial(material);
        estrella36.setTranslateX(190);
        estrella36.setTranslateY(467);
        estrella36.setTranslateZ(-20);
        estrella36.setDrawMode(DrawMode.FILL);
        estrella36.setCullFace(CullFace.BACK);

        Sphere estrella37 = new Sphere(2, 2);
        estrella37.setMaterial(material);
        estrella37.setTranslateX(120);
        estrella37.setTranslateY(600);
        estrella37.setTranslateZ(-20);
        estrella37.setDrawMode(DrawMode.FILL);
        estrella37.setCullFace(CullFace.BACK);

        Sphere estrella38 = new Sphere(2, 2);
        estrella38.setMaterial(material);
        estrella38.setTranslateX(66);
        estrella38.setTranslateY(572);
        estrella38.setTranslateZ(-20);
        estrella38.setDrawMode(DrawMode.FILL);
        estrella38.setCullFace(CullFace.BACK);

        Sphere estrella39 = new Sphere(2, 2);
        estrella39.setMaterial(material);
        estrella39.setTranslateX(193);
        estrella39.setTranslateY(382);
        estrella39.setTranslateZ(-20);
        estrella39.setDrawMode(DrawMode.FILL);
        estrella39.setCullFace(CullFace.BACK);

        Sphere estrella40 = new Sphere(2, 2);
        estrella40.setMaterial(material);
        estrella40.setTranslateX(99);
        estrella40.setTranslateY(99);
        estrella40.setTranslateZ(-20);
        estrella40.setDrawMode(DrawMode.FILL);
        estrella40.setCullFace(CullFace.BACK);

        //SATELITE
        final PhongMaterial cilindroMaterial = new PhongMaterial();
        cilindroMaterial.setDiffuseColor(Color.DARKGREY);
        cilindroMaterial.setSpecularColor(Color.GREY);

        final Cylinder cilindro = new Cylinder(10, 50);
        cilindro.setMaterial(cilindroMaterial);

        cilindro.setTranslateX(1000);
        cilindro.setTranslateY(300);
        cilindro.setTranslateZ(10);
        cilindro.setDrawMode(DrawMode.FILL);
        cilindro.setCullFace(CullFace.BACK);

        Group root = new Group(esfera2, esfera3, esfera4);
        root.getChildren().add(pointLight);
        root.getChildren().add(pointLight2);

        root.getChildren().add(esfera);
        root.getChildren().add(estrella1);
        root.getChildren().add(estrella2);
        root.getChildren().add(estrella3);
        root.getChildren().add(estrella4);
        root.getChildren().add(estrella5);
        root.getChildren().add(estrella6);
        root.getChildren().add(estrella7);
        root.getChildren().add(estrella8);
        root.getChildren().add(estrella9);
        root.getChildren().add(estrella10);
        root.getChildren().add(estrella11);
        root.getChildren().add(estrella12);
        root.getChildren().add(estrella13);
        root.getChildren().add(estrella14);
        root.getChildren().add(estrella15);
        root.getChildren().add(estrella16);
        root.getChildren().add(estrella17);
        root.getChildren().add(estrella18);
        root.getChildren().add(estrella19);
        root.getChildren().add(estrella20);
        root.getChildren().add(estrella21);
        root.getChildren().add(estrella22);
        root.getChildren().add(estrella23);
        root.getChildren().add(estrella24);
        root.getChildren().add(estrella25);
        root.getChildren().add(estrella26);
        root.getChildren().add(estrella27);
        root.getChildren().add(estrella28);
        root.getChildren().add(estrella29);
        root.getChildren().add(estrella30);
        root.getChildren().add(estrella31);
        root.getChildren().add(estrella32);
        root.getChildren().add(estrella33);
        root.getChildren().add(estrella34);
        root.getChildren().add(estrella35);
        root.getChildren().add(estrella36);
        root.getChildren().add(estrella37);
        root.getChildren().add(estrella38);
        root.getChildren().add(estrella39);
        root.getChildren().add(estrella40);
        root.getChildren().add(cilindro);

        Scene escena = new Scene(root, 1366, 740, Color.BLACK);
        escena.setCamera(new PerspectiveCamera(false));
        stage.setScene(escena);
        stage.show();

        //   one can add a specific action when the keyframe is reached
        EventHandler onFinished = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                //esfera2.setTranslateX(Math.random()*360);     
                //reset counter;
                i = 0;
            }
        };
          // rotar 
        final RotateTransition rotateTransition = new RotateTransition(
                Duration.millis(2000), cilindro);
        rotateTransition.setByAngle(180f);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
 

        //trasladar fig 2
        Path path = new Path();
        path.getElements().add(new MoveTo(600, 200));
        path.getElements().add(new CubicCurveTo(950, 200, 900, 230, 600, 370));
        path.getElements().add(new CubicCurveTo(190, 380, 100, 330, 600, 200));

        PathTransition pathTrans = new PathTransition();
        pathTrans.setDuration(Duration.seconds(20));
        pathTrans.setPath(path);
        pathTrans.setNode(esfera2);
        pathTrans.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTrans.setCycleCount(Timeline.INDEFINITE);
        pathTrans.setAutoReverse(false);
        pathTrans.play();
        
        
        //escalar 2 esfera
        final ScaleTransition scaleTran = new ScaleTransition(
                Duration.seconds(10), esfera2);
        scaleTran.setFromX(.5);
        scaleTran.setFromY(.5);
        scaleTran.setToX(2);
        scaleTran.setToY(2);

        scaleTran.setCycleCount(Timeline.INDEFINITE);
        scaleTran.setAutoReverse(true);
        scaleTran.play();

        //trasladar fig 3
        final Path pat = new Path();
        pat.getElements().add(new MoveTo(650, 200));
        pat.getElements().add(new CubicCurveTo(1000, 200, 900, 330, 600, 400));
        pat.getElements().add(new CubicCurveTo(190, 380, 100, 330, 600, 200));

        PathTransition pTrans = new PathTransition();
        pTrans.setDuration(Duration.seconds(30));
        pTrans.setPath(pat);
        pTrans.setNode(esfera3);
        pTrans.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pTrans.setCycleCount(Timeline.INDEFINITE);
        pTrans.setAutoReverse(false);
        pTrans.play();
       
        //escalar 3 esfera
        final ScaleTransition sTran = new ScaleTransition(
                Duration.seconds(15), esfera3);
        sTran.setFromX(.5);
        sTran.setFromY(.5);
        sTran.setToX(2);
        sTran.setToY(2);

        sTran.setCycleCount(Timeline.INDEFINITE);
        sTran.setAutoReverse(true);
        sTran.play();
        //trasladar ultimo planeta
        final Path p2 = new Path();
        p2.getElements().add(new MoveTo(650, 200));
        p2.getElements().add(new CubicCurveTo(1050, 200, 1000, 430, 600, 450));
        p2.getElements().add(new CubicCurveTo(190, 450, 100, 330, 600, 200));

        PathTransition pT = new PathTransition();
        pT.setDuration(Duration.seconds(50));
        pT.setPath(pat);
        pT.setNode(esfera4);
        pT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pT.setCycleCount(Timeline.INDEFINITE);
        pT.setAutoReverse(false);
        pT.play();
        //escalar 3 esfera
        final ScaleTransition sT = new ScaleTransition(
                Duration.seconds(25), esfera4);
        sT.setFromX(.5);
        sT.setFromY(.5);
        sT.setToX(2);
        sT.setToY(2);

        sT.setCycleCount(Timeline.INDEFINITE);
        sT.setAutoReverse(true);
        sT.play();
        
      
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}