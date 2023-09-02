import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import model.person.BookImpl;
import model.person.PersonImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Book class.
 */
public class BookImplTest {

  private BookImpl textbook;

  private PersonImpl joshua;

  /**
   * Sets up a new Book object and a new Person object before each test case is run.
   */
  @Before
  public void setUp() {
    joshua = new PersonImpl("Joshua", "Bloch", 1961);
    textbook = new BookImpl("Effective Java Third Edition", joshua, 50);
  }

  /**
   * Tests that the title of the book is returned correctly.
   */
  @Test
  public void getTitle() {
    assertEquals("Effective Java Third Edition", textbook.getTitle());
  }

  /**
   * Tests that the price of the book is returned correctly.
   */
  @Test
  public void getPrice() {
    assertEquals(50, textbook.getPrice(), 0.0001);
  }

  /**
   * Tests that the author of the book is returned correctly.
   */
  @Test
  public void getAuthor() {
    assertEquals(textbook.getAuthor(), joshua);
  }

  /**
   * Tests that the title of the book is not equal to "Effective Java".
   */
  @Test
  public void getTitleW() {
    assertNotEquals("Effective Java", textbook.getTitle());
  }

  /**
   * Tests that the price of the book is not equal to 49.
   */
  @Test
  public void getPriceW() {
    assertNotEquals(49, textbook.getPrice(), 0.0001);
  }

  /**
   * Tests that the author of the book is not equal to a different Person object with the same name.
   */
  @Test
  public void getAuthorW() {
    PersonImpl josh;
    josh = new PersonImpl("josh", "Doe", 1949);
    assertNotEquals(textbook.getAuthor(), josh);
  }
}