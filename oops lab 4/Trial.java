
interface function{
     public  abstract int evaluate(int x);
     
}

 class  Half implements function{
     public int evaluate(int x)
     {
        return x/2;
     }

}
public class Trial{
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};
        Half flo=new Half();
        int x;
        for ( x  = 0; x < 5; x++) {
            arr[x]=flo.evaluate(arr[x]);
        }
        for ( x = 0; x < 5; x++){
        

         System.out.print(arr[x]+ "\t");
    }
    
}}
