package oo.heranca.Desafio;
public class Corrida {
    public static void main(String[] args) {

        Carro ferrari = new Ferrari(315);

        ferrari.acelerar();
        System.out.print("Ferrari -> ");
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.print("Ferrari -> ");
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.print("Ferrari -> ");
        System.out.println(ferrari);

        ferrari.frear();
        System.out.print("Ferrari -> ");
        System.out.println(ferrari);

        Carro civic = new Civic(150);

        civic.acelerar();
        System.out.print("Civic -> ");
        System.out.println(civic);

        civic.acelerar();
        System.out.print("Civic -> ");
        System.out.println(civic);

        civic.acelerar();
        System.out.print("Civic -> ");
        System.out.println(civic);

        civic.frear();
        System.out.print("Civic -> ");
        System.out.println(civic);
    }
}
