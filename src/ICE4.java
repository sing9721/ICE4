
import java.util.Scanner;

public class ICE4 {
    
    static final int MAX_CHAR = 256; 
  
    static void getOccuringChar(String str) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR]; 
  
        int len = str.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
    } 
        
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); 
        getOccuringChar(str);
        System.out.println(second());
        System.out.println(True('a', "a"));
        
    } 
    public static boolean True(char a , String str) {
    
    return(str.contains(Character.toString(a)));
    }
        public static int second() {
        String name = "Just for Testing";
        int greatestVal = 0;
        for (int i = 0; i < name.length(); i++) {
            int curVal = (int) name.charAt(i);
            if (curVal > greatestVal) {
                greatestVal = curVal;
            }
        }
        return 0;
    }
}
