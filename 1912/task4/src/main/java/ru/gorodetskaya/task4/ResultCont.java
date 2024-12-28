package ru.gorodetskaya. task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultCont {

    @FXML
    private Label RL;

    @FXML
    private TextField aT;

    @FXML
    private TextField bT;

    @FXML
    void bt(ActionEvent event) {
        float a=Float.parseFloat(aT.getText().toString());
        float b=Float.parseFloat(bT.getText().toString());
        while(a>b){
            a-=b;
        }
RL.setText("Длина части"+a);
    }

}
