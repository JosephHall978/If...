//work in progress
class Switching{
  public static int demo(int[] lst){
    int remainder = 0;
    int[] even = new int[1000];
    int pointer = 0;
    for(int element : lst){
      remainder = element % 2;
      switch(remainder){
        case 0:
          even[pointer] = element;
          pointer ++;
          break;
        default:
          System.out.println(element+"\b");
      }
    }
    return even.length;
  }
}