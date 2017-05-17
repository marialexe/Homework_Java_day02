// public class DigitalCamera extends Camera implements Printable {
public class DigitalCamera implements Printable {
  private String type;
  private String brand;
  private String model;
  private String filter;
  private String resolution;
  private double megapixels;

  public DigitalCamera(String type, String brand, String model, String filter, String resolution, double megapixels) {
    // super(brand, model, filter, resolution);
    this.type =type;
    this.brand = brand;
    this.model = model;
    this.filter = filter;
    this.resolution = resolution;
    this.megapixels = megapixels;
  }

  public double megapixels() {
    return this.megapixels;
  }

 // @Override
  public String printDetails() {
    String digitaldetails = this.type + " " + this.brand + " " + this.model + ", " + this.filter + ", " + this.resolution;
    return digitaldetails;
  }
}