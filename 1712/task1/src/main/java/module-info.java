module ru.gorodetskaya.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.task1 to javafx.fxml;
    exports ru.gorodetskaya.task1;
}