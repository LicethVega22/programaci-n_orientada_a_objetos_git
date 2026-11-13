package herencia;

public class Gato  extends Animal{
    public Gato(String nombreMascota, int edadMascota) {
        super(nombreMascota, edadMascota);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println(nombreMascota + " dice: Miauu!");
    }

    public void ronronear(){
        System.out.println(nombreMascota + " ronronea felizmente.");
    }

}