import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera1;
  Camera camera2;

  @Before
  public void before(){
    photographer = new Photographer("Janis");
    camera1 = new Camera("Analog", "Nikon", "34T", "Noise reduction filter", "Hi-resolution");
    camera2 = new Camera("Digital","Sony", "ILCE5100L", "No noise reduciton", "Lo-resolution");
    // camera1Specs = 
  }

  @Test
  public void initialEmptyArrayCameras() {
    assertEquals(0,photographer.cameras());
  }

  @Test
  public void addCameraToCameras() {
    photographer.addCamera(camera1);
    assertEquals(1,photographer.cameras());
    photographer.addCamera(camera2);
    assertEquals(2,photographer.cameras());
  }

  @Test 
  public void removeCameraFromCameras() {
    photographer.addCamera(camera1);
    photographer.addCamera(camera2);
    photographer.removeCamera(camera1);
    assertEquals(1,photographer.cameras());
    photographer.removeCamera(camera2);
    assertEquals(0,photographer.cameras());
  }

  @Test
  public void printCameraDetails() {
    String result = photographer.printDetails(camera1);
    assertEquals("Analog Nikon 34T Noise reduction filter Hi-resolution", result);
  }
}