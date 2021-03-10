public class HelloWorld {
  public static void main(String[] args) {
    for (int counter = 1; counter < 101; counter++) {
      String text = fizzbuzz(counter);
      System.out.println(text);
    }


  }

  private static String fizzbuzz(int number) {
    if(number % 15 == 0) {
      return "FizzBuzz";
    }
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }
}
