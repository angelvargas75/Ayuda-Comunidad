import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ecuSegundoGrado();
    }

    public static void ecuSegundoGrado(){
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, x1, x2, r, i;

        System.out.println("Ingrese el coeficiente para a");
        a = sc.nextDouble();
        System.out.println("Ingrese el coeficiente para b");
        b = sc.nextDouble();
        System.out.println("Ingrese el coeficiente para c");
        c = sc.nextDouble();

        if (a == 0)
            System.out.println("No es ecuación de segundo grado");
        else{
            d = b * b - 4 * a * c;  //DISCRIMINANTE
            if (d == 0){
                x1 = -b / (2 * a);
                x2 = x1;
                System.out.println("CS = {" + x2 + "}");
                //System.out.println(x1 + "\n" + x2);
            }
            else{
                if (d > 0){
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("CS = {" + x1 + ", " + x2 + "}");
                    //System.out.println(x1 + "\n" + x2);
                }else{
                    r = (-b) / (2 * a);
                    i = Math.sqrt(Math.abs(d)) / (2 * a);
                    System.out.println(r + " + " + i + "i");
                    System.out.println(r + " - " + i + "i");
                    System.out.println("No es solucion");
                }
            }
        }
    }
}
