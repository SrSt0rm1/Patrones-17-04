package co.uniquindio.edu;

public class AdaptadorCalculadora implements CalculadoraEnteros {
    private CalculadoraDecimales decimales;
    public AdaptadorCalculadora (CalculadoraDecimales decimales){
        this.decimales = decimales;
        
    }

    @Override
    public int sumar(int entero, int entero2){
        double resultado = decimales.sumar( entero, entero2);
        return (int) resultado; 
    }
}
