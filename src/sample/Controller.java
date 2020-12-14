package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public int a;
    public int b;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button getNumBut;

    @FXML
    private Label LabelSum;


    @FXML
    private TextField getNum1;

    @FXML
    private TextField getNum2;

    @FXML
    void onActionGetNum(ActionEvent event) {

    }

    @FXML
    void onActionBtnSum(ActionEvent event) {
        double sum = Double.parseDouble(getNum1.getText()) / Math.pow(Double.parseDouble(getNum2.getText()),2);
        String result = "";
        if (sum < 19) result = "Под нормата";
        if (sum >= 19 && sum <= 24.99) result = "Нормално тегло";
        if (sum >= 25 ) result = "Наднормено";
        if (sum >= 30) result = "Затлъстяване";
        LabelSum.setText("BMI: " + (int)sum + "\n" + result);
    }



    @FXML
    void initialize() {
        assert getNumBut != null : "fx:id=\"getNumBut\" was not injected: check your FXML file 'sample.fxml'.";
        assert LabelSum != null : "fx:id=\"LabelSum\" was not injected: check your FXML file 'sample.fxml'.";
        assert getNum1 != null : "fx:id=\"getNum1\" was not injected: check your FXML file 'sample.fxml'.";
        assert getNum2 != null : "fx:id=\"getNum2\" was not injected: check your FXML file 'sample.fxml'.";

    }
}





