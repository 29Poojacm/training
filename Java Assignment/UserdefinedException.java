 class NumberValidator{
 public NumberValidator(int value){
     if(value <=0){
         throw new ArithmeticException("Number is not valid");
     }else{
         System.out.println("Number is valid");
     }
 }
}
public class UserdefinedException{
    public static void main(String[] args){
        try{
            new NumberValidator(2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}