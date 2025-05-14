package chapter8;  

public class TextProcessor {  

    public static void main(String[] args){
        countWords("I love My Integritas Company");
    }

    /**  
     * Splits a String into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string to be split
     */ 
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
}
