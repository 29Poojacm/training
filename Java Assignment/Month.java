public class Month{
    public static void main(String[] args){
        int months = 12;
        String[] monthName = {"January","February","March","April","May","June","July",
                                "August","September","October","November","December"};
        int[] days =  {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i =0; i<months; i++){
            System.out.println(monthName[i] + " has " + days[i] +" days ");
        }                    

    }
}