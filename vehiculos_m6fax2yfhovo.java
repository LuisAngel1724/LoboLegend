class Vehiculo {
    protected String marca;
    protected int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public void hacerSonido() {
        System.out.println("El vehículo hace un sonido genérico.");
    }
}
class Auto extends Vehiculo {
    public Auto(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡run run!");
    }
}
class Moto extends Vehiculo {
    public Moto(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡torororo!");
    }
}
class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Rin rin!");
    }
}
class vehiculos  {
    public static void main(String[] args) {
        // Arreglo de tipo Vehiculo (sin ArrayList)
        Vehiculo[] vehiculos = new Vehiculo[3];

        vehiculos[0] = new Auto("Toyota", 2020);
        vehiculos[1] = new Moto("Yamaha", 2022);
        vehiculos[2] = new Bicicleta("Trek", 2021);

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.print(vehiculos[i].marca + " del año " + vehiculos[i].año + " hace: ");
            vehiculos[i].hacerSonido();
        }
    }
}