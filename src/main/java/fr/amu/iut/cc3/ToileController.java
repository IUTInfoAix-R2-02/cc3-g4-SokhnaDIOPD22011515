package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    TextField comp1;
    @FXML
    TextField comp2;
    @FXML
    TextField comp3;
    @FXML
    TextField comp4;
    @FXML
    TextField comp5;
    @FXML
    TextField comp6;
    @FXML
    Circle point1;
    @FXML
    Circle point2;
    @FXML
    Circle point3;
    @FXML
    Circle point4;
    @FXML
    Circle point5;
    @FXML
    Circle point6;
    @FXML
    Label erreur1;
    @FXML
    Label erreur2;

    int[] tableauPoints = {};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    @FXML
    private void ajouterPoints(){
        if(Integer.parseInt(comp1.getText()) > 20){
            erreur1.setText("Erreur de saisie :");
            erreur2.setText("Les valeurs doivent être entre 0 et 20");
        }
        else{
            point1.setCenterX(getXRadarChart(Integer.parseInt(comp1.getText()), 1));
            point1.setCenterY(getYRadarChart(Integer.parseInt(comp1.getText()), 1));
            point1.setRadius(5);
        }

        if(Integer.parseInt(comp2.getText()) > 20){
            erreur1.setText("Erreur de saisie :");
            erreur2.setText("Les valeurs doivent être entre 0 et 20");
        }
        else {
            point2.setCenterX(getXRadarChart(Integer.parseInt(comp2.getText()), 2));
            point2.setCenterY(getYRadarChart(Integer.parseInt(comp2.getText()), 2));
            point2.setRadius(5);
        }

        if(Integer.parseInt(comp3.getText()) > 20){
            erreur1.setText("Erreur de saisie :");
            erreur2.setText("Les valeurs doivent être entre 0 et 20");
        }
        else {
            point3.setCenterX(getXRadarChart(Integer.parseInt(comp3.getText()), 3));
            point3.setCenterY(getYRadarChart(Integer.parseInt(comp3.getText()), 3));
            point3.setRadius(5);
        }

        if(Integer.parseInt(comp4.getText()) > 20){
            erreur1.setText("Erreur de saisie :");
            erreur2.setText("Les valeurs doivent être entre 0 et 20");
        }
        else {
            point4.setCenterX(getXRadarChart(Integer.parseInt(comp4.getText()), 4));
            point4.setCenterY(getYRadarChart(Integer.parseInt(comp4.getText()), 4));
            point4.setRadius(5);
        }

        if(Integer.parseInt(comp5.getText()) > 20){
            erreur1.setText("Erreur de saisie :");
            erreur2.setText("Les valeurs doivent être entre 0 et 20");
        }
        else {
            point5.setCenterX(getXRadarChart(Integer.parseInt(comp5.getText()), 5));
            point5.setCenterY(getYRadarChart(Integer.parseInt(comp5.getText()), 5));
            point5.setRadius(5);
        }

        if(Integer.parseInt(comp6.getText()) > 20){
            erreur1.setText("Erreur de saisie :");
            erreur2.setText("Les valeurs doivent être entre 0 et 20");
        }
        else {
            point6.setCenterX(getXRadarChart(Integer.parseInt(comp6.getText()), 6));
            point6.setCenterY(getYRadarChart(Integer.parseInt(comp6.getText()), 6));
            point6.setRadius(5);
        }

    }

    @FXML
    private void viderDiagramme(){
        point1.setRadius(0);
        point2.setRadius(0);
        point3.setRadius(0);
        point4.setRadius(0);
        point5.setRadius(0);
        point6.setRadius(0);
    }

    /*private void tracer(){
        for (int index = 0; index < tableauPoints.length; ++index){

        }
    }*/

}

//onAction="#ajouterPoint1"