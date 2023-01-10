//work in progress
class Decision{
  public static int demo(int[] lst){
    int remainder = 0;
    int[] even = new int[1000];
    int pointer = 0;
    for(int element : lst){
      if(element%2 == 0){
        even[pointer] = element;
        pointer ++;
      }
      else{
        System.out.println(element+"\b");
      }
    }
    return even.length;
  }
}