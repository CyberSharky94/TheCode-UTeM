
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<n; i++)
        {
            String cPrefix = "";
            String nLetter = "";   
            
            String input = sc.nextLine();
            input = input.toUpperCase();

            int flagspace = 0;
            int flagIO = 0;
            int flagZero = 0;
            int countNum = 0;

            for(int j=0; j<input.length(); j++)
            {
                if(input.charAt(j) == ' ')
                {
                    flagspace = 1;
                }
                if(input.charAt(j) == 'I' || input.charAt(j) == 'O')
                {
                    flagIO = 1;
                }
                        
                
                if(j==0)
                {
                    if(input.charAt(j) ==  'A') {cPrefix = "Perak";}
                    else if(input.charAt(j) ==  'B') {cPrefix = "Selangor";}
                    else if(input.charAt(j) ==  'C') {cPrefix = "Pahang";}
                    else if(input.charAt(j) ==  'D') {cPrefix = "Kelantan";}
                    else if(input.charAt(j) ==  'J') {cPrefix = "Johor";}
                    else if(input.charAt(j) ==  'K') {cPrefix = "Kedah";}
                    else if(input.charAt(j) ==  'M') {cPrefix = "Melaka";}
                    else if(input.charAt(j) ==  'N') {cPrefix = "Negeri Sembilan";}
                    else if(input.charAt(j) ==  'P') {cPrefix = "Pulau pinang";}
                    else if(input.charAt(j) ==  'R') {cPrefix = "Perlis";}
                    else if(input.charAt(j) ==  'T') {cPrefix = "Terengganu";}
                    else if(input.charAt(j) ==  'W') {cPrefix = "Kuala Lumpur";}
                }
                
                if(input.charAt(j) == 'A') {nLetter += " Alpha";}
                else if(input.charAt(j) == 'B') {nLetter += " Bravo";}
                else if(input.charAt(j) == 'C') {nLetter += " Charlie";}
                else if(input.charAt(j) == 'D') {nLetter += " Delta";}
                else if(input.charAt(j) == 'E') {nLetter += " Echo";}
                else if(input.charAt(j) == 'F') {nLetter += " Foxtrot";}
                else if(input.charAt(j) == 'G') {nLetter += " Golf";}
                else if(input.charAt(j) == 'H') {nLetter += " Hotel";}
                else if(input.charAt(j) == 'I') {nLetter += " India";}
                else if(input.charAt(j) == 'J') {nLetter += " Juliet";}
                else if(input.charAt(j) == 'K') {nLetter += " Kilo";}
                else if(input.charAt(j) == 'L') {nLetter += " Lima";}
                else if(input.charAt(j) == 'M') {nLetter += " Mike";}
                else if(input.charAt(j) == 'N') {nLetter += " November";}
                else if(input.charAt(j) == 'O') {nLetter += " Oscar";}
                else if(input.charAt(j) == 'P') {nLetter += " Papa";}
                else if(input.charAt(j) == 'Q') {nLetter += " Quebec";}
                else if(input.charAt(j) == 'R') {nLetter += " Romeo";}
                else if(input.charAt(j) == 'S') {nLetter += " Sierra";}
                else if(input.charAt(j) == 'T') {nLetter += " Tango";}
                else if(input.charAt(j) == 'U') {nLetter += " Uniform";}
                else if(input.charAt(j) == 'V') {nLetter += " Victor";}
                else if(input.charAt(j) == 'W') {nLetter += " Whiskey";}
                else if(input.charAt(j) == 'X') {nLetter += " X-ray";}
                else if(input.charAt(j) == 'Y') {nLetter += " Yankee";}
                else if(input.charAt(j) == 'Z') {nLetter += " Zulu";}
                
                else if(input.charAt(j) == '1') {
                    countNum++;
                    nLetter += " One";
                }
                else if(input.charAt(j) == '2') {
                    countNum++;
                    nLetter += " Two";
                }
                else if(input.charAt(j) == '3') {
                    countNum++;
                    nLetter += " Three";
                }
                else if(input.charAt(j) == '4') {
                    countNum++;
                    nLetter += " Four";
                }
                else if(input.charAt(j) == '5') {
                    countNum++;
                    nLetter += " Five";
                }
                else if(input.charAt(j) == '6') {
                    countNum++;
                    nLetter += " Six";
                }
                else if(input.charAt(j) == '7') {
                    countNum++;
                    nLetter += " Seven";
                }
                else if(input.charAt(j) == '8') {
                    countNum++;
                    nLetter += " Eight";
                }
                else if(input.charAt(j) == '9') {
                    countNum++;
                    nLetter += " Nine";
                }
                else if(input.charAt(j) == '0') {
                    countNum++;
                    if(countNum == 1) {flagZero = 1;}
                    nLetter += " Zero";
                }
            }

            if(flagspace==0 && flagIO == 0 && flagZero == 0)
            {
                System.out.println(input + " is a valid Malaysian vehicle plate number");
                System.out.println("NATO -" + nLetter);
                System.out.println("W - State of " + cPrefix);
            } else {
                System.out.println(input + " is NOT a valid Malaysian vehicle plate number");
            }
            System.out.println();
        }
    }
}
