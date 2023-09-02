package model.person;

/**
 * This interface represents a person. A person has a first name, a last name, and a year of birth.
 *
 * @author Hao Jin
 */
public interface Person {

  /**
   * Gets the first name of the person.
   *
   * @return the first name of the person as a String
   */
  String getFirstName();

  /**
   * Sets the first name of the person.
   *
   * @param firstName the new first name of the person
   */
  void setFirstName(String firstName);

  /**
   * Gets the last name of the person.
   *
   * @return the last name of the person as a String
   */
  String getLastName();

  /**
   * Sets the last name of the person.
   *
   * @param lastName the new last name of the person
   */
  void setLastName(String lastName);

  /**
   * Gets the year of birth of the person.
   *
   * @return the year of birth of the person as an int
   */
  int getYearOfBirth();

  /**
   * Sets the year of birth of the person.
   *
   * @param yearOfBirth the new year of birth of the person
   */
  void setYearOfBirth(int yearOfBirth);
}
