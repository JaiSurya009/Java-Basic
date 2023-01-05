class pass_arr{
  static void receive(int a[]){
    int min = a[0];
    for(int i:a){
      if (min>i){
        min = i;
      }
    System.out.print(min);
      
    }
  }
public static void main(String args[]){
  int ba[] = {90,95,96,97};
  receive(ba);
}
}