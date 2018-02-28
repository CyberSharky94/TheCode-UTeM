
import java.util.*;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        for(int i=0; i<n; i++)
        {
            int flag = 0;
            String input = sc.nextLine();

            for(int j=0; j<input.length(); j++)
            {
                for(int k=j+1; k<input.length(); k++)
                {
                    if(input.charAt(j) == input.charAt(k))
                    {
                        flag = 1;
                        break;
                    }
                }               
            }
            if(flag == 1)
            {
                System.out.println(input + " --- not an isogram\n");
            } else {
                System.out.println(input + " --- an isogram\n");
            }
        }
    }
}
