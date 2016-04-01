package string_reversal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Reversal_Methods {
	static String input;
	
	public void UsingStringBuffer(){
		StringBuffer buffer = new StringBuffer(input);
	    buffer.reverse();
	    String buffStr = buffer.toString();
	     
	    if (input.equals(buffStr)) 
	    	 System.out.println("We have a pallindrome!!");
	    else 
	    	 System.out.println("No pallindrome!");
	}
	
	public void reverseStringManually(){
		 char[] inputArr= input.toCharArray();
		 char[] inputArrRev = new char[inputArr.length];
		 int j = 0;
	     for (int i=inputArr.length-1;i>=0;i--){
	         System.out.print(inputArr[i]);
	         
	         inputArrRev[j]= inputArr[i];
	         j++;
	     }
	     String ogInput= inputArr.toString();
	     String revInput= inputArrRev.toString();
	     if (ogInput.equals(revInput))
	    	 System.out.println("We have a pallindrome!!");
		    else 
		    	System.out.println("No pallindrome!"); 
	}

	public static void main(String[] args){
		try
        {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			input = input.toLowerCase();
        }
		catch (IOException e) {
            e.printStackTrace();
        }
	}
}
