import java.util.Scanner;

public class FirstLetterPrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    static String firstLetterPrinter(String str) {
        // write your code here
        //Will store the answer in the string name result
        String result = "";

        //split the string into array of strings separated by spaces in between each word
        String[] strArray = str.split(" ");

        for(String s: strArray){
            //checking if string is not empty and is only letter at the first position in that string
            if(s.length() != 0 && Character.isLetter(s.charAt(0))){
                result += s.charAt(0);
            }
        }
        return result;
    }
}
