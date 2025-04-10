public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Perro("Firulais", 5);
        animales[1] = new Gato("Misu", 3);
        animales[2] = new Loro("Piolín", 2);

        for (int i = 0; i < animales.length; i++) {
            System.out.print(animales[i].nombre + " dice: ");
            animales[i].hacerSonido();
        }
    }
}