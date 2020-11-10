import java.util.*;

class Main {
  public static void main(String[] args) {
    double height;
    double radius;

   
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the height of the cone:");
    height = userInput.nextDouble();
    System.out.println("Enter the radius of the cone: ");
    radius = userInput.nextDouble();
    IceCreamCone coner = new IceCreamCone(height, radius);
}
}

