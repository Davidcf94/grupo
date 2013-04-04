package top_mall;

import java.util.Scanner;

public class Top_mall {

    public static void main(String[] args) {
        boolean salir=false;
        Scanner sc=new Scanner(System.in);
        while (salir==false){
            int numero=sc.nextInt();
            if (numero==-1){
                salir=true;
            }
            else{
                double total=0;
                for (int i=numero-1;i>=0;i--){
                    total=i+total;
                }
                System.out.println((int)total);
            }
        }
    }
}
