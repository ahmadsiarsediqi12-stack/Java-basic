
package javasingledimantionarray;

import static java.lang.Character.isUpperCase;
import java.util.Random;
import java.util.Scanner;


public class JavaSingleDimantionArray {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
       
        
        // quastion 1
          /*
        int[] array1 = new int[4];
        
        for(int i = 0 ;i < array1.length;i++){
            array1[i] = input.nextInt();
        }
        int best = array1[0];
        for(int i = 0 ;i < array1.length;i++){
            
            if(array1[i] > best)
                best = array1[i];
        
                
        }
        for(int i = 0 ; i< array1.length ;i++){
char grade;
        if(array1[i] >= best - 10)
            grade = 'A';
 
        else if(array1[i] >= best - 20)
            grade = 'B';
        else if(array1[i] >= best - 30)
            grade = 'C';
        else if(array1[i] >= best - 40)
            grade = 'D';
        else
            grade = 'f';
        
            System.out.println("Student"+i+"score is"+array1[i]+"and grade"+grade);
        }
       */

        // quastion 2
        /*
        int[] array2 = new int[10];

        for(int i = 0 ; i < array2.length;i++){
            array2[i] = input.nextInt();
        }
        for(int i = array2.length ;i >=0 ;i--){
            System.out.print(i+" ");
        }
*/
        
        // quastion 3
        /*
        int num ;
        int[] array3 = new int[101];
        
        do{
            num = input.nextInt();
            if(num != 0 )
                array3[num]++;
        }while( num != 0);
        
        for(int i = 0 ;i < array3.length;i++){
            if(array3[i] > 0){
                if(array3[i] == 1)
                    System.out.println(i+"occur one time ");
                else
                    System.out.println(i+"occur"+array3[i]+"time");
            }
        }
*/
        // quastion 4
        /*
        int[] a = new int[100];
        System.out.print("enter a score:");
        int num ;
        
        int count = 0 ;
        int sum = 0 ;
        
        while(true){

            System.out.print("enter a score:");
            num =  input.nextInt();
            if(num < 0)
                break;
            sum += num;
            a[count] = num;
            if(num <= 100)
                count++;
        }
        int avg ;
        avg = sum / count;
        
        int high = 0 ;
        int low = 0 ;
        for(int i = 0 ;i < count;i++){
            if(a[i] >= avg)
                high++;
            else
                low++;
        }
        System.out.println();
        System.out.println("high is number"+high);
        System.out.println("the low number is "+low);
        
        */
        
                
        // quastion 5
                /*
        int[] a = new int[10];
        int[] b = new int[10];
        for(int i = 0 ;i < 10;i++){
           a[i] = input.nextInt();
        }
        int c = 0 ;
        for(int i = 0 ;i < a.length;i++){
            boolean f = true;
            for(int j = i-1 ;j >= 0;j--){
                 if(a[i] == a[j])
                     f = false;
            }
            
            if(f){
                b[c] = a[i];
            c++;}
     
        }
        
        System.out.println("the number of distinct is "+ count); 

        for(int i = 0 ;i < c ;i++)
            System.out.print(b[i]+" ");
        */
        
        // quastion 6
        /*
        int[] c = new int[50];
        int k = 2;
       
        int n = 0 ;
while(n != 50){
            boolean  f = true;
for(int i = 2 ;i < k ;i++){
    if(k % i == 0){
        f = false;
    }
}

    if(f){
        
            c[n] = k;
            n++;
            k++;
    }
    else
        k++;
}
       
for(int a : c)
    System.out.println(a);

*/

        
        // quastion 7
        /*
        int[] a = new int[10];
        int num ;
        for(int i = 0 ;i < 100;i++){
            num = (int)(Math.random()*10);
            a[num]++;
            
        }
        for(int i = 0  ;i < 10;i++){
            System.out.println(i+"ocur"+a[i]);
        }
        */
        
        
        // quastion 8
        /*
        double[] a = {2.5,2.0,8.7,9.0,2.0,4.5};
        int[] b = {4,5,3,8,2,2};
        System.out.println(avg(a));
        System.out.println(avg(b));
        
    }
        
     public static double avg(double[] a){
        double sum = 0;
        double avg;
         for(int i = 0 ;i < a.length;i++)
         sum += a[i];
         avg = sum / a.length;
        return avg;
         
     }   
     
     public static int avg(int[] b){
         int sum = 0 ;
         int avg ;
         for(int i = 0 ;i < b.length;i++)
             sum += b[i];
         avg = sum / b.length;
        return avg;
         
     }
        */
        
        // quastion 9
        /*
double[] i = {1.9,2.5,3.7,2,1.5,6,3,4,5,2};
     double x = min(i);
        System.out.println(x);
}
    public static double min(double[] a){
                Scanner in = new Scanner(System.in);
        
       
        double min = a[0]; 
        for(int i = 0 ; i < a.length;i++){
            if(a[i] < min)
                min = a[i];
            
        }
        
        return min;
        
        */
        // quastion 10 
        /*
        double[] a = {0.5,1.7,8.7,9.0,2.9,4.5};
        System.out.println(indexOfSmalestElement(a));
                     }
    
    public static double indexOfSmalestElement(double[] a){
        
               
        double min = a[0]; 
        int sMI = 0;
        for(int i = 0 ; i < a.length;i++){
            if(a[i] < min){
                min = a[i];
                sMI =  (i);
            }
         } 
       return sMI;
}
    */
        
        // quastion 11
        /*
        double[] a = new double[10];
        
        for(int i = 0 ;i < a.length;i++){
            a[i] = input.nextDouble();
        }
        
        System.out.print("the mean is"+mean(a)+"\n the standard deviation is "+deviation(a));
        
    }
    
    public static double mean(double[] a){
        double sum = 0 ,mean1;
            for(int i = 0 ;i < a.length;i++){
            sum += a [i];
        }
            mean1 = sum / a.length;
        return mean1 ;
    }
    
    public static double deviation(double[] a){
        double sum = 0 ,deviation1,mean1;
        
        for(int i = 0 ;i < a.length;i++){
            sum += a [i];
        }
            mean1 = sum / a.length;
        for(int i = 0 ;i < a.length;i++){
            sum += Math.pow(a[i] - mean1,2);
        }
        deviation1 =Math.sqrt( sum /( a.length -1));
        return deviation1;
    }
    */
        
        // quastion 12
        
    /*
    int[] a= new int [10];
    
        for(int i =0 ;i < a.length;i++){
            a[i]= input.nextInt();
        }
     
        System.out.println(reverse(a));
    }
    public static int[] reverse(int[] a){
        int[] b = new int[10];
        int c = 0 ;
      for(int j = 10 -1 ; j >= 0 ;j-- ){
          b[c] = a[j];
          c++;
        }
      for(int d : b)
                 System.out.print(d+"  ");
        return null;
        
    }
    */
        // quastion 13
        /*
        for(int i = 0 ;i < 45;i++){
           int r = getRandom(1,100,4,8,95,93);
            System.out.printf("%4d",r);
            if((i+1) % 15 == 00)
                System.out.println();
                
        }
    }
      public static int getRandom(int start,int end ,int...number){  
          while(true){
              int num = start+(int)(Math.random()*(end - start+1));
              
              boolean flag = false;
              for(int n : number){
                  if(num == n )
                      flag = true;
              break;
              }
              if(!flag)
                  return num;
          }*/
        
        // quastion 14
        /*
        int result = GCD(24,36,60);
        System.out.println("GCD :"+result);
    }

    public static int GCD(int...number){
     int result = number[0];
     for(int i =  1 ;i < number.length;i++){
         result = gcdTwo(result,number[i]);
     }
        return result;
    }
    public static int gcdTwo(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
}
*/
     
        // quastion 15
        /*
        int[] a = new int[10];
for(int i  = 0;i < a.length;i++)
    a[i] = input.nextInt();
    
        System.out.println(eliminateDuplicates(a));
    }
        public static int[] eliminateDuplicates(int[] a){
            int[] b = new int[10];
            int n = 0 ;
            for(int i = 0 ;i < a.length;i++){
                boolean f = true;
                for(int j = 0 ;j < i;j++){
                    if(a[i] == a[j])
                    f = false;
                }
                if(f){
                    b[n] = a[i];
                n++;}
            }
for(int i = 0 ;i < n;i++)
                System.out.print(b[i]+" ");
        return b;
        }
        */
        
        
      // quastion 17
      /*
int n = input.nextInt();
String[] name = new String[n];
int[] score = new int[n];

for(int i = 0 ;i <n;i++){
    score[i] = input.nextInt();
    name[i] = input.next();
}

for(int i = 0 ;i < n ;i++){
    for(int j = 0 ;j < n;j++){
        if(score[i] > score[j]){
            int temp = score[i];
            score[i] = score[j];
            score[j] = temp;
       
            String temp1 = name[i];
            name[i] = name[j] ;
            name[j] = temp1;
         }
    }
}
        for(int i= 0 ;i < n;i++)
        System.out.println(name[i]+""+score[i]);
*/
      
      // qaustion 18
      /*
      int[] a = new int[10];
      for(int i = 0 ; i < a.length;i++){
          a[i] = input.nextInt();
      }
      
      
      
      // 3 9 4 1 0 7 5 2 6 8
      for(int i = 0 ;i < a.length ;i++){
          for(int j = 0 ; j < a.length - 1;j++){
              if(a[j] > a[j+1]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
              }
          }
      }
        System.out.println();
      for(int n : a)
        System.out.print(n+" ");

*/
      // qaustion 19
      /*
      int[] n = new int[10];
      for(int i = 0 ;i < n.length;i++){
          n[i] = input.nextInt();
      }
        System.out.println(isStored(n));
}
      public static boolean isStored(int[] n){
      for(int i = 0 ;i < n.length;i++){
         
          for(int j = 0 ;j < n.length-1;j++){
              if(n[j] > n[j+1] ){
                 return false;
          }
      
      }
        
      }
        return true;

    }
}
*/
      
// qaustion 20
// 1 5 3 2 9 8 4 6 0 7
  // 1 5 3 2 8 4 6 0 7 9
  
  /*
      int[] n = new int[10];
      for(int i = 0 ;i < n.length;i++){
          n[i] = input.nextInt();
      }
      }
      public static int slectionSort(int[] n) {
     
          for(int i =0 ;i < n.length;i++){
              int largIndex;
              for(int j = 0 ;j < n.length;j++){
                  if(n[i] > n[j])
                      largIndex = n[i];
              }
          }
        return largIndex;
          
      }*/
  
  // 21
  /*
  int[] a = new int[10];
  int sum = 0 ;
  for(int i = 0 ;i < a.length ;i++){
      a[i] = input.nextInt();
  sum += a[i];}
  
        System.out.println(sum);
  */
  
  
   // qustion 22
   /*
     String a = input.next();
  char[] c = a.toCharArray();
  int count = 0;
  for(int i = 0 ;i < c.length;i++){
      if(isUpperCase(c[i]))
          count++;      
  }
        System.out.println(count);
   */

   // 23
   /*
   boolean[] locker = new boolean[100];
   for(int student =   1 ;student <= 100;student++){
       for(int i = student - 1;i < 100;i += student){
           locker[i] = !locker[i];
       }
   }
   for(int i = 0 ;i < 100;i++)
       if(locker[i])
           System.out.println(i + 1);
   */
   // 24
   /*
   boolean[] suit = new boolean[4];
   int count =0 ;
   while(!(suit[0]&& suit[1] && suit[2] && suit[3])){
       int card = (int) (Math.random() * 4);
       suit[card]=true;
       count++;
   }
        System.out.println(count);
   */
   
   

  
  // 25
  /*
  double[] eqn = new double[3];
  double[] roots = new double[2];
  double a = input.nextDouble();
  double b = input.nextDouble();
  double c = input.nextDouble();
     eqn[0] = a;
     eqn[1] = b;
     eqn[2] = c;
        System.out.println(solveQuadratic(eqn,roots));
     for(double j : roots)
            System.out.println(j);
    }
    
    public static int solveQuadratic(double[]eqn,double roots[]){
        double d = Math.pow(eqn[1], 2) - (4*eqn[0]*eqn[2]);
        
        if(d > 0){
            roots[0] = (-eqn[1] + Math.sqrt(d)) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt(d)) / (2 * eqn[0]);
            return 2;}
        else if(d == 0 ){
            roots[0] = -eqn[1] / (2*eqn[0]);
            return 1;}
        else return 0;
    }
}
  
  
  
*/
  // quastion 26
  
  /*
    int[] a = {5,1,3,6,1};
  int[] b = {5,1,3,6,1};
        System.out.println(equals(a,b));
            if(equals(a,b) == false)
            System.out.println("the array is not strictly identical");
        else
            System.out.println("the array is strictly identical");
    }
public static boolean equals(int[] a, int[] b){

   for(int i = 0 ; i < a.length;i++){

           if(a[i] != b[i] )
               return false;  
   }
        return true;
    }
  */
  

// 27
  /*
    int[] a = {5,1,3,6,1};
  int[] b = {1,5,6,7,1};
       System.out.println(equals(a,b));
            if(equals(a,b))
            System.out.println("two list are identical");
        else
            System.out.println("two list are not identical");
    }
public static boolean equals(int[] a, int[] b){
   
    for(int i = 0 ;i  < a.length;i++){
        for(int j = 0 ;j < b.length;j++){
        if(a[i] > a[j]){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
            if(b[i] > b[j]){
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }
        }
    }
    for(int i = 0 ;i < a.length ;i++){
        
            if(a[i]!= b[i])
                return false;
        
    }
        return true;

}
}
  */
  
  
    // 28 
  /*
int[] a = new int[10];
for(int i = 0 ;i < a.length;i++){
    a[i] = input.nextInt();
}    

for(int  i = 0 ;i < a.length;i++){
    int k = 0 ;
    for(int j = 0 ; j <a.length ;j++){
        System.out.println(i+"  "+j +"   "+k);
        k++;
    }
}
*/ 
  
  //  29
  /*
  String[] a = {"1","2","3","4","5","6","7","8","9","10","jack","queen","king"};
  Random r = new Random();
          
  while(true){
     int i1 = r.nextInt(13);
     int i2 = r.nextInt(13);
     int i3 = r.nextInt(13);
     int i4 = r.nextInt(13);
     
     int sum = (i1 +1) + (i2 + 1)+(i3+1)+(i4 +1);
     if(sum == 24){
         System.out.println(a[i1]+" "+a[i2]+" "+a[i3]+" "+a[i4]);
          break;
     }
        
  }
  */
  
  //  qaustion 30
  
  
  
  /*
    int[] a = new int[8];
  for(int i = 0 ;i < a.length;i++)
  a[i] = input.nextInt();
        System.out.print(isConsectiveFour(a));
    }
    public static boolean isConsectiveFour(int[] a){
        
        for(int i = 0 ;i < a.length ;i++){
            if(a[i] == a[i+1] && a[i] == a[i+2]&& a[i] == a[i+3])
                return true;
        }
        return false;
    
    
  */
  
  // 31
  /*
      int[] a = new int[5];
    int[] b = new int[5];
    for(int i = 0 ;i < a.length;i++){
        a[i] = input.nextInt();
        b[i] = input.nextInt();
        System.out.println();
    }
    int[] d = merge(a,b);
        System.out.print(d+" ");
        
    }
    public static int[] merge(int[] a,int[] b){
         
        int[] c = new int[a.length+b.length];
        
        for(int i = 0 ;i < c.length;i++){
            if(i < a.length)
            c[i] = a[i];
            else
             c[i] = b[i-a.length];
        
        }
        for(int i = 0 ; i < c.length;i++){
            for(int j = 0 ;j < c.length; j++){
                if(c[i] < c[j]){
                int temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                
            }
            }
        }
        for(int i  = 0 ;i < c.length;i++)
            System.out.print(c[i]+" ");
        return c;
    }
    
}
  */
  
  
  // quastion 33
   /*
          String[] animals = {"monkey","roster","dog","pig","rat","ox","tiger"
                ,"rabit","dragon","snake","horse","sheep"};
       
        int year = 2025;
        System.out.println(animals[year % 12]);
  */
 
 // quastion 34
 
 /*
     String a = input.next();
        System.out.print(sort(a));
    }
public static String sort(String a){
     char[] c = a.toCharArray();
   for(int i = 0 ;  i < a.length()  ;i++){
       for(int j = i+1 ;j < a.length() ;j++){
           //hamed
         
           if(c[i] > c[j]){
               char temp = c[i];
               c[i] = c[j];
               c[j] = temp;
              }
 }
   }
       
        return new String (c);

}
 
 */
        
// quastion 35
    /*    
    String[] words = {"java","program","computer","code"};
    Random r = new Random();
    
    String word = words[r.nextInt(words.length)];
    char[] guess = new char[word.length()];
    
    for(int i =0 ;i < guess.length ;i++){
        guess[i] = '*';
    }
    int misses = 0 ;
    
    while(true){
        System.out.print("word:");
        System.out.println(guess);
        System.out.print("enter a letter: ");
        char ch = input.next().charAt(0);
        
        boolean f = false;
        
        for(int i = 0 ; i< word.length();i++){
            if(word.charAt(i)== ch){
            guess[i] = ch;
            f = true;
        }
    }
        if(!f){
            misses++;
            System.out.println("worng");}
        
        if(String.valueOf(guess).equals(word)){
            System.out.println("correct ! word is "+word);
            System.out.println("misses is "+misses);
            break;
        }
    }
    */
 
  // qaustion 37
  /*
  int balls = 10 ;
  int slotscont = 7;
  int[] slots = new int[slotscont];
        Random r = new Random();
        for(int i = 0 ;i < balls ;i++){
            int position = 0 ;
            for(int j = 0 ;j < slotscont -1;j++){
                if(r.nextBoolean())
                    System.out.print("R");
                else
                    System.out.print("L");
                
            }    
                System.out.println();
                position++;
            
        }
        for(int i = 0 ;i < slots.length;i++)
            System.out.println("slot"+i+":"+slots[i]);
        */
  
  // quastion 32
  /*
  
  int[] a = {10 ,1,5,16,61,9,11,1};
        System.out.print(partition(a));
        partition(a);
             }
        public static int partition(int[] a){

     int povit = a[0];
     int low = 1;
     int high = a.length -1;
     while(high > low){
         while(low <= high && a[low] <= povit) low++;
         while(low <= high && a[high] > povit) high--;
         if(high > low)
         {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
         }
     }
     while(high > 0 && a[high] >= povit)high--;
     a[0] = a[high];
     a[high] = povit;
     
     

            for(int n : a)   
                System.out.print(n+"  ");
            System.out.println();
            
            
        return high;
      
            
        }
        }*/
  //  quastion 31
  /*
  int[] a = {1,5,16,61,111};
  int[] b = {2,4,5,6};
        System.out.print(merge(a,b));
    }
    public static int[] merge(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
           int i = 0 ,j = 0 ,k = 0;
          while(i<a.length && j < b.length){
              if(a[i] < b[j]){
                  c[k++] = a[i++];
              }
              else
                  c[k++] = b[j++];

          }
          while(i < a.length) c[k++] = a[i++];
          while(j < b.length) c[k++] = a[j++];
        return c;
          
        
        
    }
}*/
  //
  

//   int[] sourceArray = {2,3,1,5,10};
//   int[] targetArray = new int[sourceArray.length];
//   
//  System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length); 
//   //targetArray = sourceArray ;
//   
//   for(int i = 0 ;i < sourceArray.length;i++){
//       System.out.println(targetArray[i]);
//   }

int[] a = new int[10];
for(int i = 0 ;i < a.length;i++)
    a[i] = input.nextInt();

        System.out.print(partition(a));
    }
public static int partition(int[] a){
    int pivot = a[0];
    int low = 1 ;
    int high = a.length - 1;
    
    while(high > low){
        while(low <= high && a[low] <= pivot){
            low++;
        }
        while(low <= high && a[high] > pivot){
            high--;
        }
    if(high > low){
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }
    }
    while( high > 0 && a[high] >= pivot){
        high--;
    }
    a[0] = a[high];
    a[high] = a[pivot];
    for(int d :a)
        System.out.print(d+" ");
        return high;
}
}