package edu.estatuas;

public class Dni {

    private String dni;

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public int getNumero(){
        if (Character.isAlphabetic(getDni().charAt(getDni().length()-1))) {
            return Integer.parseInt(getDni().substring(0, (getDni().length()-1)));
        } else {
            return Integer.parseInt(getDni());
        }

    }

    public char getLetra(){
        return getDni().charAt(getDni().length()-1);
    }

    public String asignarLetra(){

        String dniNumeros = Integer.toString(getNumero());
        char letra = edu.estatuas.CodigoControl.calcularLetra(getNumero());

        return dniNumeros + letra;

    }

    public boolean verificarLetra(){
        char letraInput = getLetra();

        return letraInput == edu.estatuas.CodigoControl.calcularLetra(getNumero());
    }
}
