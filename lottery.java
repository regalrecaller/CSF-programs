package assignment9;

import jpb.*;

public class lottery {

    public static int getInt(String prompt, String error, int lower, int upper){
		int num;
		while (true){
			SimpleIO.prompt(prompt);
			String userinput = SimpleIO.readLine();
			try{
				num = Integer.parseInt(userinput);   
				if (num < lower || num > upper)
					System.out.println(error);
				else 
					break;
			}catch (NumberFormatException e){
				System.out.println("This isn't a number. Try again with a number.");
			}
		}
		return num;
	}
    
    public static int randomInt(){
    	int[] random = new int[5];
    	for(int x=0; x<5; x++){
    		random[x] += 1*Math.random();
    		if(random[x]>35){
    			random[x] -= (35+random[x]);
    		}else if(random[x]<0){
    			random[x] += (35-random[x]);
    		}else
    			System.out.print("error");
    	}
    	return random[];
    }
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Fantasy 5 game.");
		double[] guess = new double[5];
		double[] aiguess = new double[5];	
		for(int x=0; x>5; x++){
			 guess[x] = getInt("Enter a number between 1 and 35: ", 
					 "Your number musn't be negative.", 1, 35);
		}
		for(int y=0; y>5; y++){
			aiguess[y] = randomInt();
		}
		
	}

}
