import java.util.*;
public class Main {
public static void main(String args[]){
    System.out.println(notDivisibleBy235(10));
    System.out.println(camelCaseMe("the-stealth-warrior"));
}
    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
    
public static int numberOfVowels(String message){
    int result = 0;
    for (int i = 0; i<message.length(); i++){
        if (message.charAt(i) == 'a'||message.charAt(i) == 'e'||message.charAt(i) == 'i'||message.charAt(i) == 'o'||message.charAt(i) == 'u'){
            result++;
        }
    }
    return result;
}
    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/
    public static int notDivisibleBy235(int number){
        int numof = 0;
        for(int i=0;i<=number;i++){
            if (i%2!=0 && i%3 != 0 && i % 5 != 0){
                numof++;
            }
        }
        return numof;
    }


    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
    public static String camelCaseMe(String str){
        String[] words = str.split("[_-]"); // Split the input string by dashes or underscores
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) { // Check if the word is not empty
                if (Character.isUpperCase(word.charAt(0))) { // If the first character of the word is uppercase, keep it uppercase
                    result.append(word);
                } else { // Otherwise, convert the first character to uppercase and append the rest of the word
                    result.append(Character.toUpperCase(word.charAt(0)));
                    result.append(word.substring(1));
                }
            }
        }

        return result.toString();
    }}