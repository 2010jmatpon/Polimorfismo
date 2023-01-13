package Polimorfismo_ejercicio;

public class Guitarra extends Instrumento{
    final static String tocar = "rin rin";

    @Override
    String tocar(){
        return tocar;
    }
}
