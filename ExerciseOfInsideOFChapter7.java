
package exerciseofinsideofchapter7;

import java.util.Scanner;

public class ExerciseOfInsideOFChapter7 {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       
       // 1
       /*
       int[] a = new int[100];
       int sum = 0;
       for(int i = 0 ;i < a.length;i++){
           a[i] = input.nextInt();
           sum += a[i] ;
       }
       int avg = sum / a.length;
       int high = 0, low = 0 ;
       for(int i = 0 ;i  <  a.length;i++){
          if(a[i] >= avg )
              high++;
          else
              low++;
       }
       System.out.print(" the number of high is"+high+"the number of low is "+low);*/
  
  
       //   2
       /*
    int[] a = new int[52];
    
    String[] suit = {"spades ","hearts","diamonds","club"};
    String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
    
        for(int i = 0 ;i < a.length;i++)
        a[i] = i;
    
        for(int i = 0 ;i < a.length;i++){
            int index  = (int)(Math.random() * rank.length);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        for(int i =0 ;i < 4;i++){
            String suits = suit[a[i] / 13];
            String ranks = rank[a[i] % 13];
            
            System.out.println("Card number "+a[i]+":"+ranks+"of"+suits);
        }*/
    //  3
    /*
     int[] a = {1,2};
        System.out.println("before invoking array");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
       
       swap(a[0],a[1]);
        System.out.println("after ivolking array ");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        
        System.out.println("before involking swapFirstTOAnArray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        
        swapFirstToAnArray(a);
        System.out.println("after involking swapfristtoanarray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        
        
    }
  public static void swap(int n1,int n2){
      int temp = n1;
      n1 = n2;
      n2 = temp;
  }  
  
  public static void swapFirstToAnArray(int[] array){
      int temp = array[0];
      array[0] = array[1];
      array[1] = temp;
      
     */
    
    
    // 4
    /*
    char[] a = creatArray();
        System.out.println("the lowercase etters are : ");
        displayArray(a);
        int[] counts = countLetters(a);
        System.out.println("the occurrence of each letter are :");
        displayCounts(counts);
    }

    private static char[] creatArray() {
       char[] a = new char[100];
       for(int i = 0 ;i < a.length;i++){
           a[i] = RandomCharacter.getRandomLowerCaseLitter();
       }
        return a;
    }

    private static void displayArray(char[] a) {
        for(int i = 0 ;i < a.length;i++){
            if((i + 1) % 20 == 0 )
                System.out.println(a[i]);
            else
                System.out.print(a[i]+" ");
        }
    }

    private static int[] countLetters(char[] a) {
  int[] counts = new int[26];
  for(int i = 0 ;i < a.length ;i++){
      counts[a[i] - 'a']++;
      
  }
        return counts;
    }

    private static void displayCounts(int[] counts) {
for(int i = 0 ;i < counts.length ;i++){
    if((i + 1 )% 10 == 0)
        System.out.println(counts[i]+" "+(char)(i+ 'a'));
    else
        System.out.print(counts[i]+" "+(char)(i + 'a')+" ");
}
    }
}*/
    //  5
    /*
    printMax(34,3,3,56,5);
    printMax(new double[]{1,2,3});
    
}
    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No Argument Passed");
        return;}
   
    double result = numbers[0];
    
    
     
   for(int i = 0 ;i < numbers.length;i++)
       if(numbers[i] > result)
           result = numbers[i];
        System.out.println("the max value is"+result);
       }*/
    
    
    // 6
    /*
    int[] list = {1,4,4,2,5,-3,6,2};
    int  i = linerSearch(list,-4);
    int  j = linerSearch(list,4);
    int  k = linerSearch(list,-3);
        System.out.println(j+" "+i+" "+k);
    }
    public static int linerSearch(int[] list,int key){
        for(int i = 0 ;i < list.length ;i++){
            if(list[i] == key)
                return i;
        }  
        return -1;
 }
*/
    
    
       // 7
       /*
       int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
       int i = BinarySearch.binarySearch(list,2);
       int j = BinarySearch.binarySearch(list,11);
       int k = BinarySearch.binarySearch(list,12);
       int l = BinarySearch.binarySearch(list,1);
       int m = BinarySearch.binarySearch(list,3);
        System.out.println(i+" "+ j+" "+k+" "+l+" "+m);
        
    }
       public static int binarySearch(int[] list,int key){
           int low = 0 ;
           int high = list.length - 1;
           
           while(high >= low){
               int mid = (low + high ) / 2;
               if(key == list[mid])
                   return mid;
              else
                   low = mid + 1;
            
           }
        return -low - 1;
    }
*/
       double[] list = { 1.3, 3.0, 4.0, 5.5,1,1};
       selectionSort(list);
    }
    public static void selectionSort(double[] list){
        for(int i = 0 ;i < list.length-1;i++){
            double currentMin = list[i];
            int currentIndex = i;
            for(int j = i+1 ; j< list.length;j++){
                if(currentMin < list[j]){
                    
                    currentMin= list[j];
                    currentIndex = j;
                }
            }
            if(currentIndex != i){
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
       // 9
       /*
     for(int i = 0 ;i< args.length;i++)
            System.out.println(args[i]);
     if(args.length != 3){
         System.out.println("usage : java clculator operand1 operator operand2");
         System.exit(1);
     }
     int result = 0 ;
     
     switch(args[1].charAt(0)){
         case '+': result = Integer.parseInt(args[0])+Integer.parseInt(args[1]);break;
         case '-': result = Integer.parseInt(args[0])-Integer.parseInt(args[1]);break;
         case '*': result = Integer.parseInt(args[0])*Integer.parseInt(args[1]);break;
         case '/': result = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
     }
        System.out.println(args[0] +' '+args[1]+' '+args[2]+" = "+result);
    
*/
    
    }
}