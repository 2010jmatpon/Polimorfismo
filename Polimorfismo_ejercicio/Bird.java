package Polimorfismo_ejercicio;

public class Bird extends Animal implements Flyable{

        @Override
        public void speak(){
            System.out.println("Pio, PIO!");
        }
        @Override
        public void fly(){
            System.out.println("A volar!");
        }

}
