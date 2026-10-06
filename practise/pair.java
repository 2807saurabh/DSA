public class pair{
    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            int crr=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+crr+","+n[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int n[]={2,4,6,8,10};
        print(n);
    }
}