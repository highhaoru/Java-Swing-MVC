package controller;

import javax.swing.JOptionPane;
import model.person.PersonImpl;
import view.PersonView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class acts as the controller for the Person model and Person view.
 *
 * @author Hao Jin
 */
public class PersonControllerImpl implements PersonController {
  private final PersonImpl personImpl;
  private final PersonView personView;

  public PersonControllerImpl(PersonImpl personImpl, PersonView personView) {
    this.personImpl = personImpl;
    this.personView = personView;
  }

  /**
   * Initialize the controller.
   */
  @Override
  public void init() {
    this.personView.addUpdateButtonListener(new UpdateButtonListener());
  }

  class UpdateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      try {
        personImpl.setFirstName(personView.getFirstName());
        personImpl.setLastName(personView.getLastName());
        personImpl.setYearOfBirth(personView.getYearOfBirth());
        // Update the view to reflect changes in the model
        personView.setFirstName(personImpl.getFirstName());
        personView.setLastName(personImpl.getLastName());
        personView.setYearOfBirth(personImpl.getYearOfBirth());

        JOptionPane.showMessageDialog(null, "Update successful!");
      } catch (Exception ex) {
        personView.displayErrorMessage("Error updating person details");
        personView.getUpdatedInfoLabel().setText("Updated Person: " + personImpl.getFirstName()
            + " " + personImpl.getLastName() + ", Year of Birth: " + personImpl.getYearOfBirth());
      }
    }
  }
}
