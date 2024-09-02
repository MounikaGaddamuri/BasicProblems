public class Rectangle {

    public double rectangleArea(long length,long width){
        return length*width;
    }

    public double rectanglePerimeter(long length,long width){
        return 2*(length+width);
    }

    public static void main(String[] args) {

        int length=12;
        int width = 6;
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle is: "+rectangle.rectangleArea(length,width));
        System.out.println("Perimeter of rectangle is: "+rectangle.rectanglePerimeter(length,width));
    }
}
