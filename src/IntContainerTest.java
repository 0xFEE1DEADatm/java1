import org.junit.Test;
import static org.junit.Assert.*;

public class IntContainerTest {

    @Test
    public void testAddAndGet() {
        IntContainer container = new IntContainer();
        container.add(5);
        container.add(10);

        assertEquals(5, container.get(0));
        assertEquals(10, container.get(1));
    }

    @Test
    public void testRemove() {
        IntContainer container = new IntContainer();
        container.add(5);
        container.add(10);
        container.add(15);

        container.remove(1);

        assertEquals(5, container.get(0));
        assertEquals(15, container.get(1));
    }
}