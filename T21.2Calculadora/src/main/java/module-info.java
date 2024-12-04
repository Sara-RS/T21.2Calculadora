module com.mycompany.t21.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t21.calculadora to javafx.fxml;
    exports com.mycompany.t21.calculadora;
}
