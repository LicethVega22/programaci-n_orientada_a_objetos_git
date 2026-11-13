package herencia;

public class Pajaro extends Animal {
    public Pajaro (String nombreMascota, int edadMascota){
        super(nombreMascota, edadMascota);

    }



    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println(nombreMascota + " dice: pio pio");
    }

    public void volar(){
        System.out.println(nombreMascota + " vuela");
    }



}
