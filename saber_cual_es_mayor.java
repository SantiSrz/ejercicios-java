import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class saber_cual_es_mayor {
    
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int mayor = 0;
    List<Integer> listaNumeros = new ArrayList<>();

    for (int i = 0; i < 5; i++){
        System.out.print("Ingrese 5 numeros:");
        int num = sc.nextInt();
        listaNumeros.add(num);
    }

    for(int nums:listaNumeros){
        if (nums > mayor){
            mayor = nums;                
        }
    }
    System.out.println("El numero mas grande es: " + mayor);
    sc.close();
}   
}
