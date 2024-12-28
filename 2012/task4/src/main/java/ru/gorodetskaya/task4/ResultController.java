package ru.gorodetskaya.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField nT;

    @FXML
    private Label rL;

    @FXML
    private TextField xT;

    @FXML
    void ab(ActionEvent event) {
        double X=Double.parseDouble(xT.getText().toString());
        int N=Integer.parseInt(nT.getText().toString());
        if (Math.abs(X) >= 1 && N <= 0) {
            rL.setText("X>1  N > 0");
        }
        double a = 0.0;

        for (int n = 1; n <= N; n++) {
            double d = 1;
            double q = 1;
            int e = 2 * n - 1;


            for (int i = 1; i <= n; i++) {
                d *= (2 * i - 1);
            }


            for (int i = 1; i <= n; i++) {
                q *= (2 * i);
            }
            q *= (2 * n + 1);


            a += (d * Math.pow(X, e)) / q;
        }

        // Результат
       rL.setText(String.format("arcsin=%.2f",a));
    }

}
