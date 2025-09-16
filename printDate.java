public class printDate{
    public static void printAmerican(String Day, String Month, int Date, int Year) {
        System.out.print(Day + ", " + Month+ " " + Date + ", " + Year + "\n");
        
    }
    
    public static void printEuropean(String Day, String Month, int Date, int Year){
        System.out.print(Day + " "+ Date + " "+Month + " " + Year );
        
    }
    
    public static void main (String[] args){
        printAmerican("Monday", "July", 22, 2019);
        printEuropean("Monday", "July", 22, 2019);
        
    }
}