public class validetrianglr{

    public static int valide(int a,int b,int c){
        if(a+b <= c || a+c<=b || b+c<=a ){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[]args){
        if((valide(7,10,5))==1){
            System.out.println("Valide");
        }
        else{
            System.out.println("Invalide");
        }
    }
}