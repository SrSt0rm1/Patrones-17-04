package co.uniquindio.edu;

public  class Main {

    public static void main(String[] args) {
        CalculadoraDecimal decimal = new CalculadoraDecimal();
        AdaptadorCalculadora adaptadorCalculadora =  new AdaptadorCalculadora(decimal);
        System.out.println(adaptadorCalculadora.sumar(1,2));
        System.out.println();

        
    }
    
}