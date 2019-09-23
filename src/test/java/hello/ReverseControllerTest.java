package hello;

import com.minorjavaweb.startspringboot.controller.ReverseController;
import com.minorjavaweb.startspringboot.model.Reverse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReverseControllerTest {
    @InjectMocks
    private ReverseController rc;

    @Mock
    private Reverse reverseName;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReverseGet() {
        reverseName = new Reverse();
        reverseName.create("Piet");
        String result = rc.get(6L);
        Assert.assertEquals(result, "teiP");
    }
}
