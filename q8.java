
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        int n = 0;
        int odd = 1;
        int sumodd = 1;
        int sum = 0;
        
        n = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<n; i++)
        {
            if(i>0)
            {
        	odd+=2;
        	sumodd+=odd;
            }
            System.out.print(odd);

            if(i+1 != n)
            {
                    System.out.print("+");
            } else {
                    System.out.print("-");
            }
        }
        sum = sumodd - n;
        System.out.println(n + "=" + sum);
    }
}
