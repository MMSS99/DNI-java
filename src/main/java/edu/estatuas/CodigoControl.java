package edu.estatuas;

public class CodigoControl {
    private static final char[] CodigoDeControl = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private char[] getCodigoDeControl() {
        return CodigoDeControl;
    }

    private char getLetra(int posicion){
        return this.getCodigoDeControl()[posicion];
    }

    private int calcularLetra(int numero){
        return numero % getCodigoDeControl().length;
    }

    public String asignarLetra(int numero){

        String dni = Integer.toString(numero);
        char letra = getLetra(numero);

        return dni + letra;

    }

    public boolean verificarLetra(String dni){
        char letraInput = dni.charAt(8);

        return letraInput == getLetra(8);
    }
}
