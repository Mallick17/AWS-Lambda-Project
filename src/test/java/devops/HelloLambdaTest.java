package devops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelloLambdaTest {
    @Test
    void testHandleRequest() {
        var sut = new HelloLambda();
        assertEquals("hello  !", sut.handleRequest(""));
    }
}
