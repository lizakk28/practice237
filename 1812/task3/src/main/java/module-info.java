module ru.gorodetskaya.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.task3 to javafx.fxml;
    exports ru.gorodetskaya.task3;
}