
package inheritanceandpolymorphism;
import java.util.Date;


public class InheritanceAndPolymorphism {


    public static void main(String[] args) {
      
        Circle c = new Circle(1);
        System.out.println(c.toString());
        System.out.println(c.getCollor());
        System.out.println(c.getRadus());
        System.out.println(c.getArea());
       
    }
    
}

class GeometricObject{
    private String collor;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
    dateCreated = new Date();
    }

    public GeometricObject(String collor, boolean filled) {
        dateCreated = new Date();
        this.collor = collor;
        this.filled = filled;
    }
    
    public String getCollor(){
        return collor;
    }
    public void setCollor(String collor){
        this.collor = collor;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean Filled){
        this.filled = Filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public String toString(){
        return "created on "+dateCreated + "\ncollor :"+collor+ " an filled :"+filled;
    }
    
}
    class Circle extends GeometricObject{
        
        private double radus;
         
        public Circle(){
             
         }
        
        public Circle(double radus){
            this.radus = radus;
        }
        
        public Circle(double radus,String collor,boolean filled){
            this.radus = radus;
            setCollor(collor);
            setFilled(filled);
        }

        public double getRadus(){
           return radus;
        }
        public void setRadus(double radus){
            this.radus = radus;
        }
        
        public double getArea(){
        return Math.PI * radus * radus;
        }
        public double getPerimter(){
            return 2 * Math.PI * radus;
        }

        public void printCircle(){
            System.out.println("the circle created "+getDateCreated()+ " and radus "+ radus);            
        }
       
   }



class Rectangle extends GeometricObject{

    private double width;
    private double hight;

    public Rectangle() {
    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public Rectangle(double width, double hight, String collor, boolean filled) {
        super(collor, filled);
        this.width = width;
        this.hight = hight;
    }
    
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width= width;
    }
    
    public double getHight(){
        return hight;
    }
    public void setHight(double hight){
        this.hight = hight;
    }
    
    public double getArea(){
        return hight * width;
    }
    
    public double gerPerimeter(){
        return 2 * ( hight + width);
    }
}