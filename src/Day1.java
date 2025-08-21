
import java.util.Scanner;
class arr{
    public static void Evenindex(int[] a){
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.println(a[i]);
            }
        }
    }
    public static void Oddindex(int[] a){
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.println(a[i]);
            }
        }
    }
    public static void Oddelements(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
    public static void Evenelement(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }

}
public class Day1 {
    public static void main(String[] args){
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        arr.Oddelements(a);
    }
}
