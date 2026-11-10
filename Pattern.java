//Wyatt Ward
//2026/9/26
//this generates several different kinds of patterns all using either for loops or while loops
public class Pattern {
    //the precondition is that you need to have an amount of rows bigger than 0
    //the postcondition will be that an amount of stars based on the amount of rows will be printed in a half triangle
    	public static void stars(int rows) {
		int i = 0;
		String star = "*";
		while(i < rows) {
            System.out.println(star);
			i++;
			star += "**";
			
		}
	}
    public static void main(String[] args){
        stars(7);
        triangle(9);
        odds(9);
        eo(6);
        pryamid(5);
    }
    //precondition is that you need an amount of rows bigger than 0 but less than 9
    //postcondition is that it will print out an amount of numbers getting bigger until it reaches the amount of rows and adds more numbers each line based on the number in that line 
        public static void triangle(int rows){
            int numbers = 0;
            String letters = "";
            String lastLetter = "";
            int i = 1;
            while(numbers < rows){
                numbers++;
                letters += numbers;
                lastLetter = letters.substring(letters.length() -1);
                i = 0;
                do{
                    i++;
                    lastLetter += lastLetter;
                    
                } while(i < numbers);
                System.out.println(lastLetter.substring(0,numbers));
            }
        }
        //preconditon start must be a number bigger than zero and cant be a even number
        //postcondition prints out odd numbers in the same style a last time but decreasing in number
        public static void odds(int start){
            String letters = "";
            String lastLetter = "";
            for(int i = start; i > 0; i--){
                letters += i;
                lastLetter = letters.substring(letters.length() -1);
                for(int l = start; l > 0; l--){
                    lastLetter += lastLetter + lastLetter;
                }
                if(i%2 != 0){
                    System.out.println(lastLetter.substring(0,i));
                }
            }
        }
        //precondition maxE must be a number bigger than 0
        //postcondition prints out E and O getting bigger until reaching the maxE than getting smaller until reaching 1 and the position of E and O switch based of if maxE is odd or even
        public static void eo(int maxE){
            // String o = "O";
            // String e = "E";
            String letter = "E";
            if (maxE%2 == 0){
                letter = "O";
            }
            for(int i = 1; i <= maxE; i++){
                for(int j =0; j<i; j++){
                    System.out.print(letter);
                }
                System.out.println();
               
                if(letter.equals("E")){
                    letter ="O";
                }
                else{
                    letter = "E";
                }
        }
        if(maxE%2 == 0){
            letter = "O";
        }
        for(int l = maxE; l >= 1; l--){
            for(int j = 1; j<l; j++){
                System.out.print(letter);
            }
            System.out.println();
        
            if(letter.equals("E")){
                letter = "O";
            }
            else{
                letter = "E";
        }
        }
    }
    //precondition need an amount of rows that is bigger than 0
    //postcondition will be that it prints out an amount of numbers that start out with the first line being the smallest number but having an amount of that number based on double the amount of rows - 1 and decreasing in amount with each line
    public static void pryamid(int rows){
        int numbers = 0;
        String space = "";
        String letters = "";
        String lastLetters = "";
        for(int i = rows*2 - 1; i >= 1 ; i--){
            if(i%2 != 0){
                numbers++;   
            }
            space += " ";
            letters += numbers;
            lastLetters = letters.substring(letters.length() - 1);
            for(int l = rows*2 - 1; l > 1; l--){
                lastLetters = lastLetters + lastLetters;
                    
                    }
            if(i%2 != 0){
                System.out.println(space.substring(0,numbers) + lastLetters.substring(0,i) + space.substring(0,numbers));
            }
        }
    }
}
