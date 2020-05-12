/** Represents an shape.
 * Felipe Arreola, Rian Kilgore
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? Is it public or private?
 */
public abstract class Shape  {

    protected Point position;
    private static int numShapes = 0;
    private static int id;


    public Shape () {
        numShapes ++;
    }

    //TODO: Create a getter and setter for member fields
    public Point getPosition () {
        return position;
    }
    public static Integer getNumShape(){
        return numShapes;
    }

    public void setPosition(Point position){
        this.position = position;
    }

    /**
     * This method computes the area
     * @return double. Returns the area of the shape.
     */
    public abstract double computeArea();

    /**
     * getPerimeter Abstract method
     * @return String for the object called.
     */
    public abstract double getPerimeter();

    /**
     * getType Abstract method
     * @return String for the object called.
     */
    public abstract String getType();

    @Override
    public String toString() {
        return "Type of Shape: " + getType() + "Area: " + computeArea() + "Perimeter: " + getPerimeter();
    }
}