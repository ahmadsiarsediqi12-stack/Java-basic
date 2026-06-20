
package excerciseofsection10;

import com.sun.org.apache.bcel.internal.generic.AALOAD;




public class ExcerciseOfSection10 {

    public static void main(String[] args) {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(10, 30.5);
        
        System.out.println("the distance between two point m and m1 is :"+m1.distance(m));
 }
    
}


// quastiong 10 - 1
/*

//       Time t = new Time();
//               System.out.println(t.getH()+"/"+t.getM()+"/"+t.getS());
//       Time t1 = new Time(555550000);
//       Time t2 = new Time(5,23,55);
//       
//
//        System.out.println(t1.getH()+"/"+t1.getM()+"/"+t1.getS());
//        System.out.println(t2.getH()+"/"+t2.getM()+"/"+t2.getS());
//   

class Time{

    private int h;
    private int m;
    private int s;
    
    public Time() {
       setTime(System.currentTimeMillis());
    }
    
    public Time(long getElapsedTime){
      setTime(getElapsedTime);
    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }
    
    public void setTime(long elapsedTime){
         
     long totalSec = elapsedTime / 1000;
      s = (int) (totalSec % 60);
     
     long totalmenut = totalSec / 60;
      m = (int)(totalmenut % 60);
     
     long totalHour = totalmenut / 60;
     h = (int)(totalHour % 24);
    }
    
}
*/


//  Quastion 10 - 3

/*

//        MyInteger m = new MyInteger(17);
//        System.out.println(m.isPrime());
//        System.out.println(m.isOdd());
//        System.out.println(m.isEven());
//        System.out.println(m.equals(17));
//        System.out.println(MyInteger.parseInt("123"));
//        char[] a = {'3','2','5','9'};
//        System.out.println(MyInteger.parseInt(a));

class MyInteger{
 
    private int value;

    public MyInteger(int value) {
    this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public boolean isEven(){
        return value % 2 == 0 ;

    }
    public boolean isOdd(){
       return value % 2 != 0 ;

    }
    public boolean isPrime(){
       
        for(int i = 2;i < value;i++){
            if(value % i == 0 )
                return false;
           }
        return true;
    }
    
   public static boolean isEven(int n){
       return n %  2 == 0;
   }
  
      public static boolean isOdd(int n){
       return n %  2 != 0;
   }
      
          public static boolean isPrime(int n){
       
        for(int i = 2;i < n;i++){
            if(n % i == 0 )
                return false;
           }
        return true;
    }
          
             public static boolean isEven(MyInteger num){
                return num.isEven();
   }
             public static boolean isOdd(MyInteger num){
                 return num.isOdd();
             }
             public static boolean isPrime(MyInteger num){
                 return num.isPrime();
             }
             
   public boolean equals(int n ){
     return value == n;
   }
      public boolean equals(MyInteger n ){
     return value == n.value;
   }
      
      public static int parseInt(char[] a){
          return Integer.parseInt(new String(a));
      }
      
            public static int parseInt(String s){
          return Integer.parseInt(s);
      }
}

*/

class MyPoint{
 
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    
    public MyPoint() {
        this.x=0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(MyPoint p){
        return Math.sqrt(Math.pow(this.x - p.x,2 )+Math.pow(this.y - p.y, 2));
    }
    
    public double distance(double x ,double y){
        return Math.sqrt(Math.pow(this.x - x, 2)+Math.pow(this.y - y, 2));
    }
    
    public static double distance(MyPoint p1 ,MyPoint p2){
        return p1.distance(p2);
    }
}