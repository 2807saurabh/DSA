//brute force code for maximum sum of subarr
public class maxsumsubarr{
    public static void maxsum(int n[]){
        int crr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                crr=0;
                for(int k=i;k<=j;k++){
                    crr+=n[k];
                }
                System.out.println(crr);
                if(max<crr){
                    max=crr;
                }
            }
        }
        System.out.println("Max sum:"+max);
    }
    public static void main(String[]args){
        int n[]={1,2,6,-1,3};
        maxsum(n);
    }
}