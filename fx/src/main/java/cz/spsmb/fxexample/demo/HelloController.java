package cz.spsmb.fxexample.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private ComboBox<String> comboBox2;

    @FXML
    private TextField textInput;

    @FXML
    protected void onHelloButtonClick() {

        String box2 = comboBox.getSelectionModel().getSelectedItem();
        String box1 = comboBox2.getSelectionModel().getSelectedItem();

        double number1 = Double.parseDouble(textInput.getText());
        String vysledek = String.valueOf(number1);

        switch (box1){

            case "cm":
                number1 = number1/100;

                break;
            case "dm":
                number1 = number1/10;
                break;
            default:
        }

        switch (box2){
            case "cm":
                number1*=100;
                vysledek = String.valueOf(number1);
                textInput.setText(vysledek);
                break;
            case "dm":
                number1 *= 10;
                vysledek = String.valueOf(number1);
                textInput.setText(vysledek);
            case "m":
                textInput.setText(vysledek);
                break;
            default:
        }

    }
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.getItems().addAll("cm", "dm", "m");
        comboBox2.getItems().addAll("cm", "dm", "m");
    }
}