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
        return Integer.parseInt(this.dni.substring(0, 7));
    }

    public char getLetra(){
        return this.dni.charAt(this.dni.length()-1);
    }

    public String asignarLetra(){

        String dniNumeros = Integer.toString(this.getNumero());
        char letra = edu.estatuas.CodigoControl.calcularLetra(this.getNumero());

        return dniNumeros + letra;

    }

    public boolean verificarLetra(){
        char letraInput = getDni().charAt(8);

        return letraInput == edu.estatuas.CodigoControl.calcularLetra(this.getNumero());
    }
}
