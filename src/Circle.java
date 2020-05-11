
/** Represents an circle.
 * @author YOUR_NAME
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? Is it public or private?
 */
/*TODO*/ class Circle extends Shape{

    private double radius;

    public Circle(Point center, double radius) {
        this.radius = radius;
        this.position = center;
    }


    public String getType(){
        return this.getClass().getName();
    }

    public double getRadius () {
        return this.radius;
    }

    public double computeArea(){
        return Math.PI * (getRadius() * getRadius());
    }

    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

}
