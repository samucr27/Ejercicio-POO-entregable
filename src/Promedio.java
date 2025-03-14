public class Promedio {
    private String nombre;
    private int edad;
    private double promedio;

    public Promedio() {
    }

    public Promedio(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Promedio{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                '}';
    }
    public boolean aprueba (){
        return promedio >= 3.0;
    }

    public void aumprom(double pts){
        if (pts > 0){
            promedio += pts;
            if (promedio > 5.0) promedio=5.0;
            System.out.println("Nuevo promedio: "+ promedio);
        } else {
            System.out.println("Los puntos deben ser positivos.");
        }
    }
    public void saludar(){
        System.out.println("Soy "+ nombre + " y tengo "+edad+" años");
    }
}
