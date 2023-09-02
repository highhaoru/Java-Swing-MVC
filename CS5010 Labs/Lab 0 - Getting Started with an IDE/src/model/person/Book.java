package model.person;

/**
 * This interface represents a book. A book has a title, an author, and a price.
 *
 * @author Hao Jin
 */
public interface Book {

  /**
   * Gets the title of the book.
   *
   * @return the title of the book as a String
   */
  String getTitle();

  /**
   * Sets the title of the book.
   *
   * @param title the new title of the book
   */
  void setTitle(String title);

  /**
   * Gets the author of the book.
   *
   * @return the author of the book as a Person object
   */
  PersonImpl getAuthor();

  /**
   * Sets the author of the book.
   *
   * @param author the new author of the book
   */
  void setAuthor(PersonImpl author);

  /**
   * Gets the price of the book.
   *
   * @return the price of the book as a float
   */
  float getPrice();

  /**
   * Sets the price of the book.
   *
   * @param price the new price of the book
   */
  void setPrice(float price);
}