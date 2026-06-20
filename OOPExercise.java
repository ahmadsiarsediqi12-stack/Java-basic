
package oopexercise;
import com.sun.org.apache.bcel.internal.util.ByteSequence;
import java.io.File;
import java.io.*;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.util.calendar.Gregorian;

public class OOPExercise  {

    public static void main(String[] args) throws IOException{
 
        Scanner input = new Scanner(System.in);
       
DataOutputStream f = new DataOutputStream(new FileOutputStream("job.txt"));

f.writeBoolean(true);
f.writeUTF("فارسی");
f.flush();
DataInputStream f2 = new DataInputStream(new FileInputStream("job.txt"));

boolean b = f2.readBoolean();
String s = f2.readUTF();
        System.out.println(b+"  "+s);
        
        
        
//        File f = new File("E:\\");
//        
//        FileFilter ft = new FileFilter(){
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.getName().endsWith(".sql"))
//                return true;
//                return false;
//}
//            
//        };
//        
//        File[] f1 = f.listFiles(ft);
//        
//        for(File t : f1)
//            System.out.println(t.getName());
//        
//        



    }
}
/*

//  9 - 1
        Rectangle r = new Rectangle(4,40);
        Rectangle r1 = new Rectangle(3.5, 35.9);
        System.out.println(r.height+" ,"+r.width +" , "+r.getArea()+" ,"+r.getPerimeter());
        System.out.println(r1.height+" ,"+r1.width +" , "+r1.getArea()+" ,"+r1.getPerimeter());

class Rectangle{
    double width = 1;
    double height = 1;
    
    Rectangle(){
        
    }
    Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
    return 2*(width + height);
    }
}
*/
// 9 - 2 
/*
   stock s = new stock("java", "oracle");
   double x = s.currentPrice;
   double y = s.previouseClosingPrice;
   String n = s.name;
   String c = s.symbol;
   double  z = s.getChangePercent();
        System.out.print(x+" , "+y+" , "+n+" , "+c+" , "+z);

class stock{
    String symbol = "Oracle";
    String name = "Oracle Corporation";
    double previouseClosingPrice = 34.5;
    double currentPrice = 34.35;
    
    stock(String symbol , String name){
        this.symbol = symbol;
        this.name  = name;
    }
  public double  getChangePercent(){
      return ((currentPrice - previouseClosingPrice)/ (previouseClosingPrice))* 100;
  }
}*/

//   9 - 3
/*
Date d = new Date();

d.setTime(10000);
        System.out.println(d.toString());
  d.setTime(100000);
        System.out.println(d.toString());
    
        d.setTime(1000000);
        System.out.println(d.toString());
        
        d.setTime(10000000);
        System.out.println(d.toString());
        
        d.setTime(100000000);
        System.out.println(d.toString());
        
        d.setTime(1000000000);
        System.out.println(d.toString());
        
        d.setTime(10000000000l);
        System.out.println(d.toString());
        
        d.setTime(100000000000l);
        System.out.println(d.toString());
        
    }
}
*/


    //     9 - 4
/*
Random r = new Random(1000);
for(int i = 0 ;i < 50 ;i++){
    int j = r.nextInt(100);
            System.out.print(j+"   ");
            if(i % 10 == 0 )
                System.out.println();
}
   } 
}*/
    
    //    9 - 5
    
    /*
    GregorianCalendar c = new GregorianCalendar();
    
    int y = c.get(GregorianCalendar.YEAR);
    int m =  c.get(GregorianCalendar.MONTH)+1;
    int d =  c.get(GregorianCalendar.DAY_OF_MONTH);
    
        System.out.println("the current time is "+y+"/"+m+'/'+d);
        
        c.setTimeInMillis(1234567898765l);
        
            int y1 = c.get(GregorianCalendar.YEAR);
    int m1 =  c.get(GregorianCalendar.MONTH)+1;
    int d1 =  c.get(GregorianCalendar.DAY_OF_MONTH);
    
        System.out.println("the current time is "+y1+"/"+m1+'/'+d1);
    }
    }
*/    


//   9 - 6
/*

        int[] a = new int[100000];
        for(int i = 0 ;i < a.length;i++){
            a[i]= (int)(Math.random()*100000);}
        
        stopWach s = new stopWach();
        
        s.start();
        
        Arrays.sort(a);
        
        s.stop();
        
       System.out.println("Exucution time:"+s.getelepsedtime()+"milisecound!");
//

class stopWach{
    private double starttime;
    private double endtime;
    
    stopWach(){
        starttime =  System.currentTimeMillis();
}
    public void start(){
        starttime = System.currentTimeMillis();
    }
    public void stop(){
        endtime = System.currentTimeMillis();
    }
    public double getelepsedtime(){
        return starttime - endtime;
    }
}*/


//  Quastion 9 - 7 

/*

//Acount a = new Acount(1122,20000);
//a.setAnualInterestRate(4.5);
//a.withdraw(2500);
//a.deposit(3000);
//
//        System.out.println(a.getBlance());
//        System.out.println(a.getMonthlyInterest());
//        System.out.println(a.getDateCreated());

class Acount{
    private int id = 0 ;
    private double blance = 0 ;
    private double anualInterestRate = 0;
    private Date dateCreated;
    
    Acount(){
        dateCreated = new Date();
    }
    Acount(int id,double blance){
        this.id = id ;
        this.blance = blance;
        dateCreated = new Date();
    }


    public int getId() {
        return id;
    }

    public double getBlance() {
        return blance;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return anualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return blance * getMonthlyInterestRate() / 100;
    }
    public void withdraw(double amount){
    blance = blance - amount;
    }
    public void deposit(double amount){
        blance = blance + amount;
    }
}
*/


// quastion 9 - 8 

/*

//        Fan f  = new Fan();
//        f.setCollor("RED");
//        f.setOn(true);
//        f.setRadius(10);
//        f.setSpeed(Fan.fast);
//        
//        Fan f1 = new Fan();
//        f1.setCollor("GREEN");
//        f1.setOn(false);
//        f1.setRadius(5);
//        f1.setSpeed(Fan.medium);
//        System.out.println("the atribiut of first object"+f.toString()+"\n the attribut of secound object"+f1.toString());
//    


class Fan{
    
    public final int slow = 1 ;
    public final static int medium = 2;
    public static final int fast = 3;
    
    private int speed = slow;
    private boolean on = false;
    private int radius = 5;
    String collor = "blue";

    
    Fan(){
        
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }
    
    public String toString(){
        if(on == true)
            return"fan with"+ collor+" collor has"+speed+"speed and radius"+radius;
        else
        return "fan with collor"+collor+"and radius"+radius+"is off";
        
    }
}
*/

// quastion 9 - 9 
/*

//        RegulerPolygan r = new RegulerPolygan();
//        System.out.println("regulerpolygan with default value it perimetere is:"+r.getPerimeter()+"and it area is"+r.area());
// 
//            RegulerPolygan r1 = new RegulerPolygan(6,4);
//        System.out.println("regulerpolygan with this value it perimetere is:"+r1.getPerimeter()+"and it area is"+r1.area());
// 
//                RegulerPolygan r2 = new RegulerPolygan(10,4,5.6,7.8);
//        System.out.println("regulerpolygan with default value it perimetere is:"+r2.getPerimeter()+"and it area is"+r2.area());
// 

class RegulerPolygan{

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0 ;
    
    RegulerPolygan(){
        
    }
    RegulerPolygan(int n , double side){
        this.n = n ;
        this.side = side;
    }
    RegulerPolygan(int n ,double side ,double x ,double y ){
        this.n = n ;
        this.side = side;
        this.x = x ;
        this.y = y;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter(){
        return n * side;
    }
    public double area(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
*/


//  quastion 9 - 10
/*

//QuadraticEquation q = new QuadraticEquation(1,5,6);
//        System.out.println(q.getDiscriminante()+" |"+q.getRoor1()+" |"+q.getRoor2());
//   

class QuadraticEquation{
 
    private double a ;
    private double b ;
    private double c ;
    
    QuadraticEquation(double aa ,double bb ,double cc){
        this.a = aa ;
        this.b = bb ;
        this.c = cc ;
    }
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminante(){
           return b*b-4*a*c; 
            }
    public double getRoor1(){
     if(getDiscriminante() < 0){
         return 0;}
     return (-b + Math.sqrt(getDiscriminante())) / (2*a);
    }
    public double getRoor2(){
        if(getDiscriminante() < 0){
            return 0;}
            return (-b - Math.sqrt(getDiscriminante())) / (2*a);
    }
}
*/ 

// quastion 9 - 11 

/*


//   LinearEquaion l = new LinearEquaion(1,2,4,5,6,8);
//        System.out.println(l.isSolvable());
//   if(l.isSolvable()){
//       System.out.println("x :"+l.getX());
//       System.out.println("y :"+l.getY());
//   }

class LinearEquaion{
    
    private double a;
    private double b;
    private double c ;
    private double d ;
    private double e;
    private double f;

    public LinearEquaion(double a , double b , double c ,double d , double e ,double f ) {
        this.a = a ;
        this.b = b;
        this.c = c ;
        this.d = d ;
        this.e = e ;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }



    public  boolean isSolvable(){
        return (a*d - b*c) != 0 ;
     
            
    }
    public double getX(){
        return (e*d - b*f) / (a*d - b*c);
    }
    public double getY(){
        return (a * f - e * c)/ (a*d - b*c);
    }
}
*/



// quastion 9 - 13

/*

//        int[][] a = new int[3][3];
//        System.out.println("enter to dimination array elment:");
//    for(int i = 0 ;i < a.length;i++){
//        for(int j = 0 ;j  < a[i].length;j++){
//            a[i][j] = input.nextInt();
//        }
//    }
//    
//    location l = location.locateLargest(a);
//        System.out.println("the location of the largest element is"+ l.maxvalue+"at ("+l.row+","+l.col+")");
//    

class location{
    
    public static int row;
    public static int col;
    public static double maxvalue;
    
    location(int row,int col,double maxvalue){
        this.row = row;
        this.col = col;
        this.maxvalue = maxvalue;
    }
    public static location locateLargest(int[][] a){
        maxvalue = a[0][0];
        row = 0;
        col = 0 ;
        for(int i = 0 ;i < a.length;i++){
            for(int j = 0 ;j < a[i].length;j++){
                if(a[i][j]>  maxvalue){
                    maxvalue = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new location(row,col,maxvalue);
    }
}
*/



