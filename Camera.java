public class Camera implements Printable {
  private String type;
  private String brand;
  private String model;
  private String filter;
  private String resolution;

  public Camera(String type,String brand, String model, String filter, String resolution) {
    this.type = type;
    this.brand = brand;
    this.model = model;
    this.filter = filter;
    this.resolution = resolution;
  }

  public String printDetails(){
    String string = this.type + " " + this.brand + " " + this.model + " " + this.filter + " " + this.resolution;
    return string;
  }
}