 public class Condition {

        public static void main(String[] args) {

            int n=3;          
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else {
                if (n >= 2 && n <= 5) {
                    ans = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    ans = "Weird";
                } else {
                    ans = "Not Weird";
                }
            
              
                
            }
            System.out.println(ans);
            
        }
 }