module ru.gorodetskaya.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.task4 to javafx.fxml;
    exports ru.gorodetskaya.task4;
}