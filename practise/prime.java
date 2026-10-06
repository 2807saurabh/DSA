import java.util.Scanner;
public class prime{
    public static boolean isprime(int num){
        if (num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        int sum=0;
        int count=0;
        int n=2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to display addition of prime numbers:");
        int m=sc.nextInt();
        while(count<m){
            if(isprime(n)){
                sum+=n;
                count++;
            }
            n++;
        }
        System.out.println("Addition:"+sum);
    }
}