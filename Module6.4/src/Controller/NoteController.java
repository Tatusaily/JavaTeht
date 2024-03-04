package Controller;

import Model.Note;
import Model.Notebook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class NoteController {
    @FXML
    private TextField TitleBox;
    @FXML
    private TextArea BodyBox;
    @FXML
    private ListView<Note> noteBox;

    private final Notebook book;

    public NoteController(){
        book  = new Notebook(this);
    }
    @FXML
    private void addNote() {
        String title = TitleBox.getText();
        String body = BodyBox.getText();
        Note note = new Note(title, body);
        // See if book contains a note with the same title
        boolean found = false;
        Note foundNote = null;
        for (Note n : book.getNotes()) {
            if (n.getTitle().equals(note.getTitle())) {
                // Update the body of the note
                found = true;
                foundNote = n;
                break;
            }
        }
        if (found) {
            foundNote.updateBody(note.getBody());
        } else {
            book.addNote(note);
        }
        // clear the text fields
        TitleBox.clear();
        BodyBox.clear();
    }


    public void addGUINote(Note note){
        noteBox.getItems().add(note);
    }

    public void readNote() {
        Note note = noteBox.getSelectionModel().getSelectedItem();
        TitleBox.setText(note.getTitle());
        BodyBox.setText(note.getBody());
    }

    public void deleteNote() {
        Note note = noteBox.getSelectionModel().getSelectedItem();
        noteBox.getItems().remove(note);
    }
}
