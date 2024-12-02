package chapter8; 

public class TextProcessorReverse {

	public static void main(String[] args){
        reverseString("Hello Integritas!");
    }

    /** 
     * Prints a String in reverse order 
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
        
    }
    
}
