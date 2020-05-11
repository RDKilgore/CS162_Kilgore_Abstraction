class Rectangle extends Shape {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        this.position = upperLeft;
        this.length = length;
        this.height = height;
    }

    public double getLength () {
        return this.length;
    }

    public double getHeight () {
        return this.height;
    }

    //TODO: What methods must be implemented? Implement them.
    public String getType () {
        return this.getClass().getName();
    }

    public double computeArea() {
        return  (getLength() * getHeight());
    }

    public double getPerimeter () {
        return 2 * (getLength() +getHeight());
    }
}