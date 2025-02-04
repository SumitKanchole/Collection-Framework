// assignment 1 solution (04-02-25) :-

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList <Integer>();
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        
        System.out.println("Enter number to check their existence : ");
        int exist = sc.nextInt();
        
        if(arr.contains(exist)){
        System.out.println("This word is present in index no. of "+arr.indexOf(exist));
          }
        System.out.println("Enter index no. which you want remove from here : ");
        int index=sc.nextInt();
      System.out.println("After removing index no. data : ");
         arr.remove(index);
        System.out.println(arr);
       System.out.println("ArrayList elements using normal for loop : ");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.print("\nArrayList elements using for-each loop : ");
        for(Integer each : arr){
            System.out.print(each+" ");
        }
        System.out.println("\nArraylist elements using Iterator interface : ");
       Iterator itr = arr.iterator();
      // for(Integer itr1 : itr) {
      while(itr.hasNext()){
        int updatlist = (int)itr.next();
           System.out.print(updatlist+" ");
       }
       System.out.println("\nArrayList elements in descending order :");
       for(int i=arr.size()-1; i>=0; i--){
           System.out.print(arr.get(i)+" ");
       }
     
        System.out.println("\nthere are "+arr.size()+" elements available!");
        
}
}
