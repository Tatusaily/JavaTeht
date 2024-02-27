package controller;

import view.DictionaryView;
import model.Dictionary;

public class DictionaryController {

    private DictionaryView gui;
    private Dictionary dict = new Dictionary();

    public DictionaryController(DictionaryView gui) {
        this.gui = gui;
        gui.setController(this);
    }

    public String search(String word) {
        // search for word in dictionary
        return dict.search(word);
    }
    public void add(String word, String meaning) {
        // add word to dictionary
        dict.add(word, meaning);
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}

