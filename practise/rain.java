public class rain{
    public static int print(int height[]){
        int lefm[]=new int[height.length];
        lefm[0]=height[0];
        int n=height.length;
        for(int i=1;i<n;i++){
            lefm[i]=Math.max(lefm[i-1],height[i]);
        }
        int rigm[]=new int[height.length];
        rigm[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rigm[i]=Math.max(rigm[i+1],height[i]);
        }

        int wtrlvl=Integer.MIN_VALUE;
        int trp=0;
        for(int i=0;i<n;i++){
            wtrlvl=Math.min(lefm[i],rigm[i]);
            trp+=wtrlvl-height[i];

        }
        return trp;
    }
    public static void main(String[]args){
        int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans=print(height);
        System.out.print(ans);
    }
}