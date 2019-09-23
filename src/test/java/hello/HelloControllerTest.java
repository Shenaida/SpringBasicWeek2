package hello;

import com.minorjavaweb.startspringboot.controller.HelloController;
import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest{

    @Test
    public void getHello(){
        HelloController HC = new HelloController();
        String result = HC.reverse("Shenaida");
        Assert.assertEquals(result, "Hello: adianehS");
    }

}

