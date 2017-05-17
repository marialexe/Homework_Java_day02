// public class AnalogCamera extends Camera implements Printable {
public class AnalogCamera implements Printable {
  private String type;
  private String brand;
  private String model;
  private String filter;
  private String resolution;
  private double weight;

  public AnalogCamera(String type, String brand, String model, String filter, String resolution,double weight) {
    // super(brand, model, filter, resolution);
    this.type = type;
    this.brand = brand;
    this.model = model;
    this.filter = filter;
    this.resolution = resolution;
    this.weight = weight;
  }

  public double weight() {
    return this.weight;
  }

 // @Override
  public String printDetails() {
    String analogdetails = this.type + " " + this.brand + " " + this.model + ", " + this.filter + ", " + this.resolution;
    return analogdetails;
  }
}