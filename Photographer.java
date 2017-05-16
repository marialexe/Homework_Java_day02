import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<Printable> cameras;
  private HashMap<String,String> cameraSpecs;

  public Photographer(String name) {
    this.name = name;
    this.cameras = new ArrayList<Printable>();
    this.cameraSpecs = new HashMap<>();
  }

  public int cameras() {
    return cameras.size();
  }

  public void addCamera(Printable camera) {
    this.cameras.add(camera);
  }

  public void removeCamera(Printable camera) {
    this.cameras.remove(camera);

  }

  public String printDetails(Printable camera){
    return camera.printDetails();
  }

}