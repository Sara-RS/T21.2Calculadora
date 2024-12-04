package com.mycompany.t21.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtPantalla;
    double numero;
    String operacion;
    double resultado;

    @FXML
    void calcular(ActionEvent event) {
        double numero2 = Double.parseDouble(txtPantalla.getText());
        switch(operacion){
            case"sum":
                //operar
                resultado=numero+numero2;
                break;
            case"res":
                //operar
                resultado=numero-numero2;
                break;
            case"mul":
                //operar
                resultado=numero*numero2;
                break;
            case"div":
                //operar
                resultado=numero/numero2;
                break;
            default:
                break;
        }        
        //Mostrar en txtPantalla
       txtPantalla.setText(resultado+"");
    }

    @FXML
    void clean(ActionEvent event) {
        txtPantalla.setText("");
    }

    @FXML
    void dividir(ActionEvent event) {
        obtenerNumero();
        operacion = "div";
    }

    @FXML
    void multiplicar(ActionEvent event) {
        obtenerNumero();
        operacion = "mul";

    }

    @FXML
    void restar(ActionEvent event) {
        obtenerNumero();
        operacion = "res";

    }

    @FXML
    void sumar(ActionEvent event) {
        obtenerNumero();
        operacion = "sum";

    }

    @FXML
    void write0(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"0");
    }

    @FXML
    void write1(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"1");
    }

    @FXML
    void write2(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"2");
    }

    @FXML
    void write3(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"3");
    }

    @FXML
    void write4(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"4");
    }

    @FXML
    void write5(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"5");
    }

    @FXML
    void write6(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"6");
    }

    @FXML
    void write7(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"7");
    }

    @FXML
    void write8(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"8");
    }

    @FXML
    void write9(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"9");
    }

    @FXML
    void writepunto(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+".");
    }

    private void obtenerNumero() {
    numero = Double.parseDouble(txtPantalla.getText());
    txtPantalla.setText("");
    }

}

