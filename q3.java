
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        while(sc.hasNextLine())
        {
            int flagNo = 0;
            String input = sc.nextLine();
            String inc = input;

            input = input.toUpperCase();

            String mCode = "";

            for(int i=0; i<input.length(); i++)
            {   
                    if(input.charAt(i) == '1') {flagNo=1;}
                    else if(input.charAt(i) == '2') {flagNo=1;}
                    else if(input.charAt(i) == '3') {flagNo=1;}
                    else if(input.charAt(i) == '4') {flagNo=1;}
                    else if(input.charAt(i) == '5') {flagNo=1;}
                    else if(input.charAt(i) == '6') {flagNo=1;}
                    else if(input.charAt(i) == '7') {flagNo=1;}
                    else if(input.charAt(i) == '8') {flagNo=1;}
                    else if(input.charAt(i) == '9') {flagNo=1;}
                    else if(input.charAt(i) == '0') {flagNo=1;}

                    if(input.charAt(i) == 'A') {mCode += " *-";}
                    else if(input.charAt(i) == 'B') {mCode += " -***";}
                    else if(input.charAt(i) == 'C') {mCode += " -*-*";}
                    else if(input.charAt(i) == 'D') {mCode += " -**";}
                    else if(input.charAt(i) == 'E') {mCode += " *";}
                    else if(input.charAt(i) == 'F') {mCode += " **-*";}
                    else if(input.charAt(i) == 'G') {mCode += " --*";}
                    else if(input.charAt(i) == 'H') {mCode += " ****";}
                    else if(input.charAt(i) == 'I') {mCode += " **";}
                    else if(input.charAt(i) == 'J') {mCode += " *---";}
                    else if(input.charAt(i) == 'K') {mCode += " -*-";}
                    else if(input.charAt(i) == 'L') {mCode += " *-**";}
                    else if(input.charAt(i) == 'M') {mCode += " --";}
                    else if(input.charAt(i) == 'N') {mCode += " -*";}
                    else if(input.charAt(i) == 'O') {mCode += " ---";}
                    else if(input.charAt(i) == 'P') {mCode += " *--*";}
                    else if(input.charAt(i) == 'Q') {mCode += " --*-";}
                    else if(input.charAt(i) == 'R') {mCode += " *-*";}
                    else if(input.charAt(i) == 'S') {mCode += " ***";}
                    else if(input.charAt(i) == 'T') {mCode += " -";}
                    else if(input.charAt(i) == 'U') {mCode += " **-";}
                    else if(input.charAt(i) == 'V') {mCode += " ***-";}
                    else if(input.charAt(i) == 'W') {mCode += " *--";}
                    else if(input.charAt(i) == 'X') {mCode += " -**-";}
                    else if(input.charAt(i) == 'Y') {mCode += " -*--";}
                    else if(input.charAt(i) == 'Z') {mCode += " --**";}
                    else if(input.charAt(i) == ' ') {mCode += " /";}
            }

            if(flagNo == 0)
            {
                System.out.println(inc + " is a valid message");
                System.out.println("Morse:" + mCode);
            } else {
                System.out.println(inc + " is NOT a valid message");
            }
            System.out.println();
        }
    }
    
}
