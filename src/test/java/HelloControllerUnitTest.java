import com.flatiron.spring.FlatironSpring.controller.HelloController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    @Test
    void hello() {
        HelloController helloController = new HelloController();
        String name = "Jamie";
        assertEquals("Hello " + name, helloController.hello(name));
    }

    @Test
    void reverseUppercase() {
        HelloController helloController = new HelloController();
        String str = "Jay";
        assertEquals("yaJ", helloController.reverse(str));
    }

    @Test
    void reverseLowercase() {
        HelloController helloController = new HelloController();
        String str = "jay";
        assertEquals("yaj", helloController.reverse(str));
    }

    @Test
    void reverseSpace() {
        HelloController helloController = new HelloController();
        String str = "jay ";
        assertEquals(" yaj", helloController.reverse(str));
    }

    @Test
    void reverseNumbers() {
        HelloController helloController = new HelloController();
        String str = "ja2y";
        assertEquals("y2aj", helloController.reverse(str));
    }


}