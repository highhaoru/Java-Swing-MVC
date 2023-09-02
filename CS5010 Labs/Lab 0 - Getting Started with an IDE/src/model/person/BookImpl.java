package model.person;

/**
 * This class represents a book. A book has a title, an author and a price.
 */
public class BookImpl implements Book {
  private String title;
  private PersonImpl author;
  private float price;

  /**
   * Constructs a BookImpl object with the given title, author, and price.
   *
   * @param title  the title of the book
   * @param author the author of the book as a Person object
   * @param price  the price of the book as a float
   */
  public BookImpl(String title, PersonImpl author, float price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public PersonImpl getAuthor() {
    return author;
  }

  @Override
  public void setAuthor(PersonImpl author) {
    this.author = author;
  }

  @Override
  public float getPrice() {
    return price;
  }

  @Override
  public void setPrice(float price) {
    this.price = price;
  }
}