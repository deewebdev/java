import java.util.Scanner; 
  
  
public class RockPaperSissors { 
      
    public static void main(String[]args) 
      
    { 
        String player1 = getEnterWord(); 
        String player2 = getEnterWord(); 
          
      
        if(player1.equals(player2))//if same input ...  
        { 
        System.out.println("Its a draw;"); 
        System.out.println("Both players picked "+player1); 
        } 
          
            else if (player1.equalsIgnoreCase("rock")&&player2.equalsIgnoreCase("paper")){ 
                System.out.println("Paper wins...covers rock"); 
            } 
              
            else if (player1.equalsIgnoreCase("sissors")&&player2.equalsIgnoreCase("paper")){ 
                System.out.println ("Sissors wins...cuts paper"); 
            } 
              
            else if (player1.equalsIgnoreCase("rock")&&player2.equalsIgnoreCase("sissors")){ 
                System.out.println ("Rock wins...blunts sissors"); 
            } 
                  
            else if (player1.equalsIgnoreCase("paper")&&player2.equalsIgnoreCase("rock")){ 
                System.out.println ("Rock wins...paper covers paper"); 
            } 
            else if (player1.equalsIgnoreCase("paper")&& player2.equalsIgnoreCase("sissors")){ 
                System.out.println("Sissors wins...cuts paper"); 
            } 
            else if (player1.equalsIgnoreCase("sissors")&& player2.equalsIgnoreCase("rock")){ 
                System.out.println ("Rock wins...blunts sissors"); 
            } 
    } 
  
        public static String getEnterWord() 
        { 
                  
        boolean validInput = false; 
        String input = ""; 
        do
        { 
            System.out.println("Please enter Rock, Paper or Sissors: "); 
              
            Scanner myScanner = new Scanner(System.in); 
              
            input = myScanner.nextLine(); 
              
            input = input.toLowerCase(); 
              
            if (input.equals("rock") ||  input.equals("paper") || input.equals("sissors"))   
            { 
            validInput = true; 
            System.out.println("Please continue!"); 
            } 
            else
            { 
            System.out.println("Please enter valid input"); 
            } 
          
         }  while (!validInput); 
          
            return input; 
          
        } 
          
} 