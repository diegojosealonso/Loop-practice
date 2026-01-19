import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio5();

    }

    public static void ejercicio1(){
        int i = 1;
        while(i < 11){
            System.out.println(i);
            i++;
        }
    }

    public static void ejercicio2(){
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }

    public static void ejercicio3(){
        int i = 1;
        int suma = 0;
        while (i<=10){
         suma += i;
         i++;
        }
        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }

    public static void ejercicio4(){
        int i = 1;
        while (i<21){
            System.out.println(i);
            i +=2;
        }
    }

    public static void ejercicio5(){
        int i = 8;
        int fact = 1;
        while (i > 0){
            fact *= i;
            i--;
        }
        System.out.println(fact);
    }

    public static void ejercicio6(){
        int aleatorio = new Random().nextInt(10);
        System.out.println("Introduce el valor del número secreto");
        while(true){
            Scanner sc = new Scanner(System.in);
            int entradaUsuario = sc.nextInt();
            if (entradaUsuario==aleatorio){
                System.out.println("Has acertado");
                break;
            }
            System.out.println("Intentalo de nuevo");
        }
    }

    public static void ejercicio7(){
        int i = 1;
        while (i < 51){
            if (i%3==0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void ejercicio8(){
        String usuario = "diego";
        String contraseña = "diego123";
        while(true){
            System.out.println("Introduce el nombre del usuario");
            Scanner sc = new Scanner(System.in);
            String us = sc.next();
            System.out.println("Introduce la contraseña");
            Scanner sc2 = new Scanner(System.in);
            String con = sc2.next();
            if (us.equals(usuario) && con.equals(contraseña)){
                System.out.println("Login correcto");
                break;
            }
            System.out.println("Login incorrecto");
        }
    }

    public static void ejercicio9(){
        String usuario = "diego";
        String contraseña = "diego123";
        int intentos = 3;
        while(intentos > 0){
            System.out.println("Introduce el nombre del usuario");
            Scanner sc = new Scanner(System.in);
            String us = sc.next();
            System.out.println("Introduce la contraseña");
            Scanner sc2 = new Scanner(System.in);
            String con = sc2.next();
            if (us.equals(usuario) && con.equals(contraseña)){
                System.out.println("Login correcto");
                break;
            }
            if (intentos > 1){
                intentos = intentos - 1;
                System.out.println("Login incorrecto. El número de intentos que quedan son: " + intentos);
            }
            else {
                System.out.println("Login incorrecto. No te quedan intentos.");
                break;
            }
        }
    }
}