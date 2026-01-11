import java.util.Scanner;

public class suma_numeros{

public static void main(String[] args){

    boolean valor = true;
    int suma = 0;
    Scanner sc = new Scanner(System.in);

    while (valor){
        
        System.out.print("Escribe un numero a sumar: ");
        int num = sc.nextInt();

        if (num == 0){
            valor = false;
            System.out.println("El programa ha finalizado ");
        }else{
            suma = suma + num;
            System.out.println("El resutado es: " + suma);
        }
    }
    sc.close();
}
}