package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.person.PersonImpl;
import view.PersonViewImpl;

/**
 * This class acts as the controller for the Person model and Person view.
 *
 * @author Hao Jin
 */
public class PersonControllerImpl implements PersonController {
  private final PersonImpl personImpl;
  private final PersonViewImpl personViewImpl;

  public PersonControllerImpl(PersonImpl personImpl, PersonViewImpl personViewImpl) {
    this.personImpl = personImpl;
    this.personViewImpl = personViewImpl;
  }

  /**
   * Initialize the controller.
   */
  @Override
  public void init() {
    this.personViewImpl.addUpdateButtonListener(new UpdateButtonListener());
  }

  class UpdateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      try {
        personImpl.setFirstName(personViewImpl.getFirstName());
        personImpl.setLastName(personViewImpl.getLastName());
        personImpl.setYearOfBirth(personViewImpl.getYearOfBirth());
        // Update the view to reflect changes in the model
        personViewImpl.setFirstName(personImpl.getFirstName());
        personViewImpl.setLastName(personImpl.getLastName());
        personViewImpl.setYearOfBirth(personImpl.getYearOfBirth());

        JOptionPane.showMessageDialog(null, "Update successful!");
      } catch (Exception ex) {
        personViewImpl.displayErrorMessage("Error updating person details");
        personViewImpl.getUpdatedInfoLabel().setText("Updated Person: " + personImpl.getFirstName()
            + " " + personImpl.getLastName() + ", Year of Birth: " + personImpl.getYearOfBirth());
      }
    }
  }
}
