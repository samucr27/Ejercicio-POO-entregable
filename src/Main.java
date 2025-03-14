public class Main {
    public static void main(String[] args) {
        Promedio est1 = new Promedio();
        est1.setNombre("Laura");
        est1.setEdad(19);
        est1.setPromedio(2.8);

        Promedio est2 = new Promedio("Samuel", 18, 4.2);

        System.out.println(est1.toString());
        System.out.println(est2.toString());


        est1.saludar();
        System.out.println("Laura aprueba? " + (est1.aprueba() ? "Si" : "No"));
        est1.aumprom(0.5);
        System.out.println("Laura aprueba ahora? " + (est1.aprueba() ? "Si" : "No"));

        est2.saludar();
        est2.aumprom(1.0);



        }
}
