import java.util.Scanner;

class arm{
    public static int nocnt(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static int mathpow(int last,int count){
        int p=1;
        for(int i=1;i<=count;i++){
            p=p*last;
        }
        return p;
    }
    public static void armno(int x,int y){
        for(int i=x;i<=y;i++){
            int org,last,arm=0,count;
            org=i;
            count=nocnt(org);
            while(org>0){
            last=org%10;
            arm=arm +mathpow(last,count);
            org=org/10;
            }
            if(i==arm){
                System.out.println(arm);;
            }
        }

    }
}
public class Armsnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
       arm.armno(x,y);
    }
}
