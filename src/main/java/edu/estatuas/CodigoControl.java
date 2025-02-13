package edu.estatuas;

public class CodigoControl {
    private static final char[] CodigoDeControl = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private static char[] getCodigoDeControl() {
        return CodigoDeControl;
    }

    private static int calcularPosicion(int numero){
        return numero % getCodigoDeControl().length;
    }

    public static char calcularLetra(int numero){
        return getCodigoDeControl()[calcularPosicion(numero)];
    }

}
