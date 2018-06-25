import java.io.IOException;
import java.util.Scanner; 

public class Beginner1002 {
 
    public static void main(String[] args) throws IOException {

    	double n = 3.14159d;
    	
    	Scanner sc = new Scanner(System.in);
    	double R = Double.parseDouble(sc.nextLine());
    	
    	double A = n * (R * R);
    	
    	System.out.printf("A=%.4f" , A);
    	System.out.println();
    	
    }
 
}