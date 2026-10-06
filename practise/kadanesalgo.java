public class kadanesalgo{
    public static void kadane(int n[]){
        boolean allneg=true;
        int max=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>=0){
                allneg=false;
                break;
            }
            if(n[i]>max){
                max=n[i];
            }
            if(allneg){
                System.out.println(max);
            }
            return;
        }
        
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n.length;i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String[]args){
        int n[]={-1,-2,-3,-1,-5,-3};
        kadane(n);
    }
}