import java.util.Scanner;
import java.util.ArrayList;

public class numeros_positivos_y_media {
    
    public static void main(String[] args){
        boolean variable = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;
        int media = 0;

        while (variable){
            System.out.print("Inserta un numero positivo o un 0 para terminar: ");
            int num = sc.nextInt();
            
            if (num == 0){
                for(int n : numeros){
                    suma = suma + n;
                    media = suma / numeros.size();
                }
                System.out.println("La media de todos los numeros positivos introducidos es: " + media);
                variable = false;
            }else if(num > 0){
                numeros.add(num);
            }else{
                continue;
            }
        }
        sc.close();
    }
    }
    