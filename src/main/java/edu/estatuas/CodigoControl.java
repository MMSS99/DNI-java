package edu.estatuas;

public class CodigoControl {
    private static final char[] CodigoDeControl = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private static char[] getCodigoDeControl() {
        return CodigoDeControl;
    }

    private static char getLetra(int posicion){
        return getCodigoDeControl()[posicion];
    }

    private static int calcularLetra(int numero){
        return numero % getCodigoDeControl().length;
    }

    public static String asignarLetra(int numero){

        String dni = Integer.toString(numero);
        char letra = getLetra(numero);

        return dni + letra;

    }

    public static boolean verificarLetra(String dni){
        char letraInput = dni.charAt(8);

        return letraInput == getLetra(8);
    }
}
