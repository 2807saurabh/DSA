public class trappedwater{
    public static int trapped(int height[]){
        //leftmax
        int leftm[]=new int[height.length];
        leftm[0]=height[0];
        int n=height.length;
        for(int i=1;i<n;i++){
            leftm[i]=Math.max(height[i],leftm[i-1]);
        }

        //rightmax
        int rightm[]=new int[height.length];
        rightm[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightm[i]=Math.max(rightm[i+1],height[i]);
        }

        int trapped=0;
        for(int i=0;i<n;i++){
            int waterlvl=Math.min(leftm[i],rightm[i]);
            trapped+=waterlvl-height[i];
        }
        return trapped;
    }
    public static void main(String[]args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped(height));
    }
}