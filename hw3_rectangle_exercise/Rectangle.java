/*
 * Q: Write Rectangle class that implements the following features:
 *
 * 1. Make RectangleRunner.java run with Rectangle class that you design
 *      in Rectangle.java
 *      a. First of all, take a look at output_RectangleRunner.txt and
 *          plan to make RectangleRunner.class generate the desired output
 *      b. No need to modify RectangleRunner.java. Only write code lines
 *          in Rectangle.java
 *      c. Start by modifying the template in this file (Rectangle.java)
 * 2. In particular, design Rectangle class applying the object design technique
 *      of ADT (Abstract Data Type):
 *      a. instance variables declared as private
 *      b. constructors with width and height variables as initial input parameters
 *      c. methods: calculateArea(), print(), resize()
 *      d. setters and getters for the instance variables
 */

public class Rectangle {
    /* instance variables go here (width and height) */
    private double width;
    private double height;

    /* Constructors */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /* Methods: calculateArea(), print(), resize() */
    public double calculateArea() {
        double area;
        area = width * height;
        return area;
    }

    public void print() {
        System.out.println(width + " X " + height);
    }

    public void resize(double widht, double height) {
        this.width = widht;
        this.height = height;
    }

    /* Setters and getters */
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
