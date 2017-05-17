public class Camera implements Printable {
  public String brand;
  public String model;
  public String filter;
  public String resolution;

  public Camera(String brand, String model, String filter, String resolution) {
    this.brand = brand;
    this.model = model;
    this.filter = filter;
    this.resolution = resolution;
  }

  // @Override
  public String printDetails(){
    String string = this.brand + " " + this.model + " " + this.filter + " " + this.resolution;
    return string;
  }
}