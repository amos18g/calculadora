package com.example.calculadora.modelo;

public class OperacionesMatematicas {

    private static String suma(String a, String b){
        double operando1 = Double.parseDouble(a);
        double operando2 = Double.parseDouble(b);

        double resultado = operando1 + operando2;

        return String.valueOf(resultado);
    }

    private static String dividir(String a, String b){
        double operando1 = Double.parseDouble(a);
        double operando2 = Double.parseDouble(b);
        double resultado = 0;

        if(operando2 == 0){
            return "indefinido";

        }else{
            resultado = operando1 / operando2;

            return String.valueOf(resultado);

        }



    }

    public static String operar(String a, String b, String operador){
        switch (operador){
            case "+": return OperacionesMatematicas.suma(a,b);

            case "-": return OperacionesMatematicas.restar(a,b);

            case "*": return OperacionesMatematicas.multiplicar(a,b);

            case "÷": return OperacionesMatematicas.dividir(a,b);


            default: return "Desconocido";
        }

    }

    private static String restar(String a, String b) {
        double operando1 = Double.parseDouble(a);
        double operando2 = Double.parseDouble(b);

        double resultado = operando1 - operando2;

        return String.valueOf(resultado);
    }


    private static String multiplicar(String a, String b) {
        double operando1 = Double.parseDouble(a);
        double operando2 = Double.parseDouble(b);

        double resultado = operando1 * operando2;

        return String.valueOf(resultado);
    }




}
