/*
public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    // Returns the number of times "character" appears in "searchString"
       //This should be NON-case sensitive! 
    public int countCharacters(String character, String searchString) {
      // to be implemented
      String stringLow = searchString.toLowerCase();
      String charLow = character.toLowerCase();
      int count = 0;
      for (int i=0; i<stringLow.length(); i++) {
        String check = stringLow.substring(i, i+1);
        if (check.equals(charLow)) {
          count++;
        }
      }
      return count;

    }
    
    // Returns the original string reversed 
    public String reverseString(String origString) {
      // to be implemented
      char character;
      String newString = "";
      for (int i=0; i<origString.length(); i++)
      {
        character = origString.charAt(i); //extracts each character
        newString = character + newString; //adds each character in front of the existing string
      }
      return newString;
    }

    public String removeA(String str) {
      // implement me
      String newS = "";
      for (int i=0; i<str.length(); i++) {
        String check = str.substring(i,i+1);
        if (!(check.equals("a"))) {
          newS+=check;
        }
      }
      return newS;
   }
   
    public static void main(String[] args) {
      StringLoops loops = new StringLoops();
System.out.println(loops.removeA("are apples tasty and find the area"));

    }
  }
*/
  