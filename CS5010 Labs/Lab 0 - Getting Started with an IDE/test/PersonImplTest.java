import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import model.person.PersonImpl;
import org.junit.Before;
import org.junit.Test;


/**
 * A JUnit test class for the Person class.
 */
public class PersonImplTest {

  private PersonImpl john;

  /**
   * Sets up a new Person object before each test case is run.
   */
  @Before
  public void setUp() {
    john = new PersonImpl("john", "doe", 1989);
  }

  /**
   * Tests that the first name of the person is returned correctly.
   */
  @Test
  public void testFirst() {
    assertEquals("john", john.getFirstName());
  }

  /**
   * Tests that the last name of the person is returned correctly.
   */
  @Test
  public void testSecond() {
    assertEquals("doe", john.getLastName());
  }

  /**
   * Tests that the last name of the person is returned correctly.
   */
  @Test
  public void testYearOfBirth() {
    assertEquals(1989, john.getYearOfBirth());
  }

  /**
   * Tests that the first name of the person is not equal to "John".
   */
  @Test
  public void testFirstNameW() {
    assertNotEquals("John", john.getFirstName());
  }

  /**
   * Tests that the last name of the person is not equal to "Doe".
   */
  @Test
  public void testLastNameW() {
    assertNotEquals("Doe", john.getLastName());
  }

  /**
   * Tests that the year of birth of the person is not equal to 1949.
   */
  @Test
  public void testYearOfBirthW() {
    assertNotEquals(1949, john.getYearOfBirth());
  }
}
