public class prefixarr{
    public static void prefixsum(int n[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        int prefixarr[]=new int[n.length];

       // calculate prefixarr
       prefixarr[0]=n[0];
       for(int i=1;i<n.length;i++){
        prefixarr[i]=prefixarr[i-1]+n[i];
       }

       for(int i=0;i<n.length;i++){
        for(int j=i;j<n.length;j++){
            curr=i==0?prefixarr[j]:prefixarr[j]-prefixarr[i-1];
            if(maxsum<curr){
                maxsum=curr;
            }
        }
       }
       System.out.println(maxsum);
    }
    public static void main(String[]args){
        int n[]={1,2,6,-1,3};
        prefixsum(n);
    }
}