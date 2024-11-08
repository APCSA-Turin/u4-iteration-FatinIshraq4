
public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    // Returns the number of times "character" appears in "searchString"
       //This should be NON-case sensitive! 
    public int countCharacters(String character, String searchString) {
      /* to be implemented */
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
      /* to be implemented */
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

   public String replaceCharacterV1(String change, String orig, String replacement) {
    for (int i=0; i<orig.length(); i++) {
      String check = orig.substring(i,i+1);
      if (check.equals(change)) {
        String temp = orig.substring(0,i);
        String temp2 = orig.substring(i+1);
        orig = temp + replacement + temp2;
      }
      }
      return orig;
      }

    public String replaceCharacterV2(String change, String orig, String replacement) {
        int i = 0;
        while (i<orig.length()) {
          String check = orig.substring(i,i+1);
          if (check.equals(change)) {
            String temp = orig.substring(0,i);
            String temp2 = orig.substring(i+1);
            orig = temp + replacement + temp2;
          }
          i++;
          }
          return orig;
          }


          
          
    public int countString(String searchString, String origString) {
        int count = 0;
        int max = origString.length() - searchString.length() + 1;
            for (int i = 0; i < max; i++) {
                String substring = origString.substring(i, i + searchString.length());
                if (substring.equals(searchString)) {
                    count++;
                }
            }
            return count;
        }


        public String removeString(String searchString, String origString) {
          while (origString.indexOf(searchString) >= 0) {
            int index = origString.indexOf(searchString);
            origString = origString.substring(0, index) + origString.substring(index + searchString.length());
          }
          return origString;
         }
       


         public void commaSeparated(int fromNum, int toNum) {
          if (fromNum==toNum) {
            System.out.println(fromNum);
          }
          if (fromNum>toNum) {
            String print = "";
            int i = 0;
            int num = Math.abs(fromNum-toNum);
            while (i<=num) {
              print += fromNum + ", ";
              i++;
              fromNum--;
            }
            print = print.substring(0,print.length()-2);
            System.out.println(print);
          } else if (toNum>fromNum) {
            String print = "";
            int i = 0;
            int num = Math.abs(fromNum-toNum);
            while (i<=num) {
              print += fromNum + ", ";
              i++;
              fromNum++;
            }
            print = print.substring(0,print.length()-2);
            System.out.println(print);
          }
        }

        public boolean isPalindrome(String myString) {
          String check = removeString(" ", myString);
          String c = reverseString(check);
          return check.equals(c);
        }
      

        public void multiPrint(String toPrint, int num) {
          if (num<=0) {
            System.out.println("[]");
          } else {
            String print = "[";
            int i = 0;
            while (i<num) {
              print += toPrint + " ";
              i++;
            }
            print = print.substring(0,print.length()-1);
            print+="]";
            System.out.println(print);
          }
        }
      
      
     
         
       
    
   

   
    public static void main(String[] args) {
      StringLoops loops = new StringLoops();
      loops.multiPrint("hello", 4);
      loops.multiPrint("beetlejuice", 3);
      loops.multiPrint("hi there", 2);
      loops.multiPrint("boop!", 1);
      loops.multiPrint("dance party", 0);
      loops.multiPrint("anything", -4);
    
    
    
    }
  }
  