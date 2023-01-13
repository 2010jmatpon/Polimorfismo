package Polimorfismo_ejercicio;

public class Main {
    public static void main(String[] args) {
        Animal a;
        Instrumento b;

        a = new Lion();
        a.speak();
        a = new Bird();
        a.speak();
        ((Bird)a).fly();

        b = new Guitarra();
        System.out.println(b.tocar());
        b = new Tambor();
        System.out.println(b.tocar());

    }
}
