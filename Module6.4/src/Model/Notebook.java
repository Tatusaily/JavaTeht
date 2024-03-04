package Model;

import Controller.NoteController;

import java.util.ArrayList;

public class Notebook {
    public Notebook(NoteController c) {
        this.c = c;
    }
    private final NoteController c;
    private final ArrayList<Note> notes = new ArrayList<>();
    public void addNote(Note note) {
        notes.add(note);
        c.addGUINote(note);
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }
}
