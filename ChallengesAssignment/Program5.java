package ChallengesAssignment;

public class Program5 {
	
	public static String printNumberInWord(int number){
		public static void main(String[] args) {
	        int number1 = 3;
	        useNestedIf(number1);
	        useSwitchCase(number1);
	    }
	    
	    private static void useNestedIf(int number1)
	    {
	        String numberStr = null;
	        if (0 == number1) {
	            numberStr = "ZERO";
	        } else if (1 == number1) {
	            numberStr = "ONE";
	        } else if (2 == number1) {
	            numberStr = "TWO";
	        } else if (3 == number1) {
	            numberStr = "THREE";
	        } else if (4 == number1) {
	            numberStr = "FOUR";
	        } else if (5 == number1) {
	            numberStr = "FIVE";
	        } else if (6 == number1) {
	            numberStr = "SIX";
	        } else if (7 == number1) {
	            numberStr = "SEVEN";
	        } else if (8 == number1) {
	            numberStr = "EIGHT";
	        } else if (9 == number1) {
	            numberStr = "NINE";
	        } else {
	            numberStr = "OTHER";
	        }
	        System.out.println("** \"nested-if\" statement: " + numberStr);
	    }
	    
	    private static void useSwitchCase(int number)
	    {
	        String numberStr = null;
	        switch (number) {
	            case 0:  numberStr = "ZERO";  break;
	            case 1:  numberStr = "ONE";   break;
	            case 2:  numberStr = "TWO";   break;
	            case 3:  numberStr = "THREE"; break;
	            case 4:  numberStr = "FOUR";  break;
	            case 5:  numberStr = "FIVE";  break;
	            case 6:  numberStr = "SIX";   break;
	            case 7:  numberStr = "SEVEN"; break;
	            case 8:  numberStr = "EIGHT"; break;
	            case 9:  numberStr = "NINE";  break;
	            default: numberStr = "OTHER"; break;
	        }
	        System.out.println("~~ \"switch-case\" statement: " + numberStr);
	    }
	}

	

}
