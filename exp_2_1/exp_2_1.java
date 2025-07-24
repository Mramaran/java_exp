abstract class Shape{
    public Shape(){
        
    }
    public abstract int getArea();
}
class Rectangle extends Shape{
    private int height;
    private int width;
    public Rectangle(int width,int height){
        this.height=height;
        this.width=width;
    }
    public int getArea(){
        return (this.height*this.width);
    }
}

public class exp_2_1 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(5, 2);
        System.out.println("The area of Rectangle : "+rec.getArea());
    }
    
}
