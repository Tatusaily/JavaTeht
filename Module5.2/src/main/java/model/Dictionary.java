package model;


import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dict = new HashMap<>();

    public Dictionary() {
    }

    public void add(String word, String meaning) {
        dict.put(word, meaning);
    }

    public String search(String word) {
        return dict.get(word);
    }

}
