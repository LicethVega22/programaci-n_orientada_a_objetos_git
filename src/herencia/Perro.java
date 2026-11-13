package herencia;

public class Perro extends Animal{
    public Perro(String nombreMascota, int edadMascota){
        super(nombreMascota, edadMascota);

    }

    @Override
    public void comer() {
        System.out.println(nombreMascota + "dice: Esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println(nombreMascota + " Esta durmiendo");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombreMascota + " dice: Guau guau");
    }

    public void perseguirCola(){
        System.out.println(nombreMascota + " persigue su cola");
    }

}