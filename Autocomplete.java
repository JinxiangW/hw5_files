import java.util.List;

public class Autocomplete implements IAutocomplete {
    @Override
    public void addWord(String word, long weight) {

    }

    @Override
    public Node buildTrie(String filename, int k) {
        return null;
    }

    @Override
    public Node getSubTrie(String prefix) {
        return null;
    }

    @Override
    public int countPrefixes(String prefix) {
        return 0;
    }

    @Override
    public List<ITerm> getSuggestions(String prefix) {
        return null;
    }
}
