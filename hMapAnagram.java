// Alex Ryse
// simple hashmap anagram game
import java.util.*;

public class hMapAnagram
{
   public static void main(String[] args)
   {
      String word = "anagram";
      System.out.println("Word: " + word);
      
      // asks user to input an anagram to the word
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Anagram: ");
      String userInput = keyboard.nextLine();
      
      // checks if user input is an anagram or not
      if (isAnagram(word, userInput) == true)
      {
         System.out.println("Successfull anagram");
      }
      else
      {
         System.out.println("Unsuccessfull anagram");
      }
   }
   
   // isAnagram method
   public static boolean isAnagram(String w, String a)
   {
      if (w.length() != a.length())
      {
         return false;
      }
      
      // hash map with character as the key and integer as the value
      HashMap<Character, Integer> hMap = new HashMap<>();
      
      // iterates through each char to check if both strings share the same values, if not sets equal to zero
      for (int i = 0; i < w.length(); i++)
      {
         hMap.put(w.charAt(i), hMap.getOrDefault(w.charAt(i), 0) + 1);
         hMap.put(a.charAt(i), hMap.getOrDefault(a.charAt(i), 0) - 1);
      }
      
      for (int i = 0; i < w.length(); i++)
      {
         if (hMap.get(w.charAt(i)) != 0) // checking if any values equals zero
         {
            return false;
         }
      }
      return true;
   }
}