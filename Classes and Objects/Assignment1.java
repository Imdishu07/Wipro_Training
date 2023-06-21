// Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. 
// The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.

class Assignment1{
    double width,depth,height;

    Assignment1(double w, double d, double h){
        this.width = w;
        this.depth = d;
        this.height = h;
    }

    double getVolume(){
        return (width*depth*height);
    }

    public static void main(String[] args) {
        Assignment1 B = new Assignment1(5,10,15);
        System.out.println("Volume Is : " +B.getVolume());
    }
}
