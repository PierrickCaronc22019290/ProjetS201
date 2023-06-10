package seismeApp.View;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AppControl implements Initializable {

    @FXML
    public DatePicker dateP1;
    @FXML
    public DatePicker dateP2;
    @FXML
    public Button btnOpenCSV;
    @FXML
    public Button btnDashboard;
    @FXML
    public Button btnTableview;
    @FXML
    public Label messageFichier;
    @FXML
    public Label iMax;
    @FXML
    public Label iMin;
    @FXML
    public Label iMoy;
    @FXML
    public TextField searchBar;




    @FXML
    public VBox cartoMap;

    @FXML
    public Pane carte;
    @FXML
    public Label textCarte;

    private MapSeismeView mapSeismeView;
    public void AppControl (){

    }
    @FXML
    public void initialize(URL location,ResourceBundle resources){
        System.out.println( carte);
        mapSeismeView = new MapSeismeView(cartoMap,textCarte,carte);
    }

}
