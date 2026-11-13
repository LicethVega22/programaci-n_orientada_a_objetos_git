package herencia;

public class Mainveterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("firulais",4);
        Gato kitty = new Gato("kitty", 1);
        Pajaro roberto = new Pajaro("roberto", 2);

        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();
        System.out.println("----");
        kitty.comer();
        kitty.dormir();
        kitty.hacerSonido();
        kitty.ronronear();

        roberto.hacerSonido();
        roberto.volar();

    }

}