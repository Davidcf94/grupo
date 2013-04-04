package top_mall;

import java.util.Scanner;

public class Top_mall {
    /*
     * A ver que tal va el Git
     * en internet
     */
    public static void main(String[] args) {
        boolean salir=false;
        Scanner sc=new Scanner(System.in);
        while (salir==false){
            int n=sc.nextInt();
            if (n==-1){
                salir=true;
            }
            else{
                double total=0;
                for (int i=n-1;i>=0;i--){
                    total=i+total;
                }
                System.out.println((int)total);
            }
        }
    }
}
