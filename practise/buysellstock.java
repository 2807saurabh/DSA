public class buysellstock{
    public static int buyorsell(int price[]){
        int buy=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<price.length;i++){
            if(buy<price[i]){
                int profit=price[i]-buy;
                maxpro=Math.max(maxpro,profit);
            }
            else{
                buy=price[i];
            }
        }
        return maxpro;
    }
    public static void main(String[]args){
        int price[]={7,1,5,3,6,4};
        System.out.println(buyorsell(price));
    }
}