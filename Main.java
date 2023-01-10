import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random rand  = new Random();
    
    int[] numbers = new int[1000];
    for(int x = 0; x < 1000; x++){
      numbers[x] = x;
    }
    long start = System.nanoTime();
    Switching.demo(numbers);//code thing
    long end = System.nanoTime();
    long elapsed = end - start;
    System.out.println(elapsed);
    //Decision
    long start1 = System.nanoTime();
    Decision.demo(numbers);//code thing
    long end1 = System.nanoTime();
    long elapsed1 = end1 - start1;
    System.out.println(elapsed1);
  }
}