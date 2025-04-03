package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJenkinsTest {
    
    @Test
    public void testJenkinsBuild() {
        System.out.println("Jenkins Test Running!");
        assertTrue(true, "Jenkins is working!");
    }
}
