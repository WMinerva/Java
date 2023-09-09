import java.util.Scanner;
public class PruebaMueble {
    public static void main(String[] args) {
        Mueble M1 = new Mueble();
        Mueble M2 = new Mueble("Ropero", "Cafe");
        Mueble M3 = new Mueble("Ropero", 5);
        Mueble M4 = new Mueble();
        M3.leer();
        M1.mostrar();
        M2.mostrar();
        M3.mostrar();
        System.out.println(M1.getNombre());
        M1.setNombre("Mesa");
        
        M1.mostrar("Rojo");
        M2.mostrar("Rojo");
        M3.mostrar("Rojo");

        M1.mostrar(5);
    }
}

class Mueble {
    private String nombre, color;
    private double precio;

    //Constructores
    //Constructor por defecto 
    public Mueble() {
        nombre = "Silla";
        color = "Rojo";
        precio = 29;
    }
    //Constructor con argumentos
    public Mueble(String nombre, String c) {
        this.nombre = nombre;
        color = c;
        precio = 40;
    }
    public Mueble(String a, int g) {

    }
    public Mueble(String a) {

    }
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String n) {
        nombre = n;
    }
    //METODOS
    public void mostrar() {
        System.out.println(nombre+" "+color+" "+precio);
    }
    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: "); nombre = sc.nextLine();
        System.out.print("Color: "); color = sc.nextLine();
        System.out.print("Precio: "); precio = sc.nextDouble();
    }
    public void mostrar(String X) {
        if(color == X) {
            System.out.println(nombre+" "+color+" "+precio);
        }
    }
    public int mostrar(int n){
        return 5;
    }
    public void mostrar(String S, int num){

    }
    
