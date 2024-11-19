
import static org.junit.Assert.*;

import org.junit.Test;

import animals.*;

public class AnimalsTest {
	
    @Test
    public void test_abstract_crocodile() {
      // Check if Crocodile is inheriting Animal
      assertTrue("Crocodile should inherit from Animal",
        Animal.class.isAssignableFrom(Crocodile.class));

      // Ensure Animal is still abstract
      assertTrue("Animal should be an abstract class",
        java.lang.reflect.Modifier.isAbstract(Animal.class.getModifiers()));

      // Check if about() method is in Crocodile and Animal.
      try {
        Crocodile.class.getMethod("about");
        Animal.class.getMethod("about");
        assertTrue(true);
      }
      catch (Exception e) {
        fail("about() method is missing in Crocodile or Animal.");
      }
    }

    @Test
    public void test_abstract_lion() {
      // Check if Lion is inheriting Animal
      assertTrue("Lion should inherit from Animal",
        Animal.class.isAssignableFrom(Lion.class));

      // Ensure Animal is still abstract
      assertTrue("Animal should be an abstract class",
        java.lang.reflect.Modifier.isAbstract(Animal.class.getModifiers()));

      // Check if about() method is in Lion and Animal.
      try {
        Lion.class.getMethod("about");
        Animal.class.getMethod("about");
        assertTrue(true);
      }
      catch (Exception e) {
        fail("about() method is missing in Lion or Animal.");
      }     
    }

    @Test
    public void test_abstract_ostrich() {
      // Check if Ostrich is inheriting Animal
      assertTrue("Ostrich should inherit from Animal",
        Animal.class.isAssignableFrom(Ostrich.class));

      // Ensure Animal is still abstract
      assertTrue("Animal should be an abstract class",
        java.lang.reflect.Modifier.isAbstract(Animal.class.getModifiers()));

      // Check if about() method is in Ostrich and Animal.
      try {
        Ostrich.class.getMethod("about");
        Animal.class.getMethod("about");
        assertTrue(true);
      }
      catch (Exception e) {
        fail("about() method is missing in Ostrich or Animal.");
      }     
    }

    @Test
    public void test_abstract_zebra() {
      // Check if Zebra is inheriting Animal
      assertTrue("Zebra should inherit from Animal",
        Animal.class.isAssignableFrom(Zebra.class));

      // Ensure Animal is still abstract
      assertTrue("Animal should be an abstract class",
        java.lang.reflect.Modifier.isAbstract(Animal.class.getModifiers()));

      // Check if about() method is in Zebra and Animal.
      try {
        Zebra.class.getMethod("about");
        Animal.class.getMethod("about");
        assertTrue(true);
      }
      catch (Exception e) {
        fail("about() method is missing in Zebra or Animal.");
      }     
    }
}
