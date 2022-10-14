
import java.util.Scanner;


public class PatikaDevFaktoriyel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz :");
        int fak=scan.nextInt();
        int total=1;
        for(int i=1;i<=fak;i++)
        {
            total=total*i;
            
        }
        System.out.println("Girdiğiniz sayının Faktöriyeli :"+total);
    }
}
