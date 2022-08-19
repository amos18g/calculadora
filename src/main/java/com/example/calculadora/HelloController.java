package com.example.calculadora;

    import com.example.calculadora.modelo.OperacionesMatematicas;
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Alert;
    import javafx.scene.control.TextField;

    import java.net.URL;
    import java.util.ResourceBundle;

    public class HelloController {
        private String operando = "";
        private String operando1;
        private String operando2;
        private String operador;
        @FXML
        private TextField txtResultado;

        public void initializable(URL url, ResourceBundle rb){

        }

        @FXML

        public void btn1(ActionEvent event) {
            operando += "1";
            txtResultado.appendText("1");

        }

        public void btn2(ActionEvent event) {
            operando += "2";
            txtResultado.appendText("2");
        }

        public void btn0(ActionEvent event) {
            operando += "0";
            txtResultado.appendText("0");
        }



        public void suma(ActionEvent event) {
            txtResultado.appendText(" + ");
            System.out.println(operando);
            operando1 = operando;
            operando = "";

            operador = "+";

        }


        public void division(ActionEvent event) {
            txtResultado.appendText(" ÷ ");
            System.out.println(operando);
            operando1 = operando;
            operando = "";

            operador = "÷";
        }

        public void igual(ActionEvent event) {
            operando2 = operando;
            System.out.println(operando2);
            this.txtResultado.setText(OperacionesMatematicas.operar(operando1, operando2,operador));

        }


        public void multiplicacion(ActionEvent event) {
            txtResultado.appendText(" * ");
            System.out.println(operando);
            operando1 = operando;
            operando = "";

            operador = "*";
        }

        public void btn3(ActionEvent event) {
            operando += "3";
            txtResultado.appendText("3");
        }

        public void btn4(ActionEvent event) {
            operando += "4";
            txtResultado.appendText("4");
        }

        public void btn5(ActionEvent event) {
            operando += "5";
            txtResultado.appendText("5");
        }

        public void btn6(ActionEvent event) {
            operando += "6";
            txtResultado.appendText("6");
        }

        public void btn7(ActionEvent event) {
            operando += "7";
            txtResultado.appendText("7");
        }

        public void btn8(ActionEvent event) {
            operando += "8";
            txtResultado.appendText("8");
        }

        public void btn9(ActionEvent event) {
            operando += "9";
            txtResultado.appendText("9");
        }

        public void borrar(ActionEvent event) {
           operando = operando1 =  operando2 =  operador= "";
            this.txtResultado.setText("");

        }





        public void resta(ActionEvent event) {
            txtResultado.appendText(" - ");
            System.out.println(operando);
            operando1 = operando;
            operando = "";

            operador = "-";

        }

        public void creador(ActionEvent event){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Creado por:");
            alert.setContentText("Joseph Onan Ordoñez Alvarez");
            alert.setHeaderText("Creado por:");
            alert.showAndWait();
        }

}