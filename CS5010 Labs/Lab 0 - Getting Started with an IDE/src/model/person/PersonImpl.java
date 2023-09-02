package model.person;

/**
 * This class represents a person The person has a first name, last name and a year of birth.
 */
public class PersonImpl implements Person {
  private String firstName;
  private String lastName;
  private int yearOfBirth;

  /**
   * Constructs a PersonImpl object with the given first name, last name, and year of birth.
   *
   * @param firstName   the first name of the person
   * @param lastName    the last name of the person
   * @param yearOfBirth the year of birth of the person
   */
  public PersonImpl(String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }

  @Override
  public String getFirstName() {
    return firstName;
  }

  @Override
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  @Override
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public int getYearOfBirth() {
    return yearOfBirth;
  }

  @Override
  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }
}