public class WhileLoopFun {
 
  public WhileLoopFun() { }

//Prints the individual digits in number separately, starting with the rightmost digit first, on separate lines.
  public void printDigits(int number) {
    String num = Integer.toString(number);
    int length = num.length();
    String output = num.substring(length-1, length);
    int i = 1;
    while (i<length) {
      i++;
      output+= "\n" + num.substring(length-i, length - i + 1);
    }
    System.out.println(output);
  }

//Returns the number of times letter occurs in word
  public int countLetter(String word, String letter) {
    int i = 0;
    while (word.contains(letter)) {
      i++;
      int num = word.indexOf(letter);
      String str1 = word.substring(0,num);
      String str2 = word.substring(num+1);
      word = str1 + str2;
    }
    return i;
  }

//Returns the maximum number of times that number can be doubled before it exceeds threshold
  public int maxDoubles(int number, int threshold) {
    int i = 0;
    while (number*2<=threshold) {
      i++;
      number=number*2;
    }
    return i;
  }

//Returns true if number is prime (i.e. it has exactly two divisors: 1 and itself) and false
  public boolean isPrime(int number) {
    if (number<=1) {
      return false;
    }
    int i = 2;
    while (i<number) {
      if (number%i==0) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static void main(String[] args) {
    WhileLoopFun fun = new WhileLoopFun();

System.out.println("-- test printDigits --");
fun.printDigits(5);
System.out.println("---");
fun.printDigits(361);
System.out.println("---");
fun.printDigits(98000);
System.out.println("---");
fun.printDigits(150856);

System.out.println("-- test countLetter --");
System.out.println(fun.countLetter("apple", "a"));
System.out.println(fun.countLetter("apple", "z"));
System.out.println(fun.countLetter("babababa", "a"));
System.out.println(fun.countLetter("babababa", "b"));
System.out.println(fun.countLetter("excellente", "e"));
System.out.println(fun.countLetter("rawrrrrrr", "r"));

System.out.println("-- test maxDoubles --");
System.out.println(fun.maxDoubles(4, 20));
System.out.println(fun.maxDoubles(2, 65));
System.out.println(fun.maxDoubles(5, 500));
System.out.println(fun.maxDoubles(2, 64));
System.out.println(fun.maxDoubles(2, 63));
System.out.println(fun.maxDoubles(8, 10));
System.out.println(fun.maxDoubles(8, 5));
System.out.println(fun.maxDoubles(10, 456000));

System.out.println("-- test isPrime --");
System.out.println(fun.isPrime(2));
System.out.println(fun.isPrime(13));
System.out.println(fun.isPrime(773));
System.out.println(fun.isPrime(9857));
System.out.println(fun.isPrime(101879));
System.out.println(fun.isPrime(1));
System.out.println(fun.isPrime(14));
System.out.println(fun.isPrime(30));
System.out.println(fun.isPrime(771));
System.out.println(fun.isPrime(93243));

  }
}
