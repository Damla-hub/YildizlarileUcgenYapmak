import java.util.Scanner;
public class YildizlarileElmasWhile_ {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n=input.nextInt();
        int i=0,j=1,k=1;
        while(i<=n){
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(k<=2*i-1){
                System.out.print("*");
                k++;
            }
            k=1;
            System.out.println();
            i++;
        }
        int a=n,l=0,b=n,s=1;
        while(l<n){
            while(b>n-l) {
                System.out.print(" ");
                b--;
            }
            b=n;
            while(s<=2*a-1){
                System.out.print("*");
                s++;
            }
            s=1;
             System.out.println();
             l++;
             a--;
        }
    }
}
