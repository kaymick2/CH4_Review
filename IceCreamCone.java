public class IceCreamCone {
  private double radius;
  private double height;
  double pi = 3.14159265358979;

  public IceCreamCone(double amount1, double amount2) {
  this.height = amount1;
  this.radius = amount2;
    System.out.println("The surface area of the cone is:" + surfacearea());
    System.out.println("The volume of the cone is: " + volume());
  }

  public double surfacearea() {
  double coneArea = pi * radius *(radius + Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
    return coneArea;
  }

  public double volume() {
    double coneVol = pi * (Math.pow(radius, 2)) * (height / 3);
    return coneVol;
  }
}