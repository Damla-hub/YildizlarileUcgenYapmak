import java.util.Scanner;
public class YildizlarileElmasYapma {
    public static void main(String[] args) {
        int number;
        Scanner klavye=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number=klavye.nextInt();
        for(int i=0;i<=number;i++){
            for(int j=0;j<(number-i);j++){
                System.out.print(" ");
            }
            for(int k=0 ; k<(i*2-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=number;k>=0;k--){
            for(int j=0;j<(number-k);j++){
                System.out.print(" ");
            }
            for( int i=0 ;i<(k*2-1);i++){
                System.out.print("*");
            }
            System.out.println();
       }
    }
}
