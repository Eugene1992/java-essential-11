package com.cbs.edu.cw08.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public Button button;

    @FXML
    public Label label;

    @FXML
    public TextField input;

    @FXML
    public void enterValue(ActionEvent actionEvent) {
        String inputValue = input.getText();
        label.setText(label.getText() + inputValue);
    }
}
