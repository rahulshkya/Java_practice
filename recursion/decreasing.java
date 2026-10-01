public class decreasing{
    public static void main(String[] args){
        int n =10;
        decrease(n);
    }
    static void decrease(int n){
      if(n == 1 ){
        System.out.println(n);
        return;
      }
      else{
      
        decrease(n-1);
          System.out.println(n);
      }
   }
}
