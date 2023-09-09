import java.util.Scanner;
public class noe {
    public static void main(String[] args) {
        ColaSimple C1 = new ColaSimple();
        C1.llenar(5);
        C1.mostrar();
        C1.eliminar();
        C1.mostrar();
    }
}

class Vector {
    protected int max = 50;
    protected int v[] = new int[max];

}
class Cola extends Vector {
    protected int fr, fi;

    public Cola() {
        fr = fi = -1;
    }
}
class ColaSimple extends Cola {
    public ColaSimple() {
        super();
    }
    public Boolean esVacia() {
        if(fr == fi) 
            return true;
        return false;
    }
    public Boolean esLlena() {
        if(fi == max-1)
            return true;
        return false;
    }
    public int nroElem() {
        return fi - fr;
    }
    public void adicionar(int elem) {
        if(esLlena()) {
            System.out.println("Cola Llena");
        } else {
            fi ++;
            v[fi] = elem;
        }
    }
    public void llenar(int n) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=n; i++) {
            int nro = sc.nextInt();
            adicionar(nro);
        }
    }
    public int eliminar() {
        int elem = 0;
        if(esVacia()) {
            System.out.println("Cola Vacia");
        } else {
            fr++;
            elem = v[fr];
        }
        return elem;
    }
    public void vaciar(ColaSimple z) {
        while(!z.esVacia())
            adicionar(z.eliminar());
    }
    public void mostrar() {
        if(esVacia()) {
            System.out.println("Vacia");
        } else {
            ColaSimple aux = new ColaSimple();
            int x;
            while(!esVacia()) {
                x = eliminar();
                System.out.println(x);
                aux.adicionar(x);
            }
            vaciar(aux);
        }
    }
}
