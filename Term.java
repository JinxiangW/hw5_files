public class Term implements ITerm {

    // TODO: instance variables

    /**
     * Initialize a Term with a given query String and weight
     */
    public Term(String term, long weight) {

    }

    // =================
    // TODO: Overrides!
    // =================
    @Override
    public int compareTo(ITerm that) {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public long getWeight() {
        return 0;
    }

    @Override
    public String getTerm() {
        return null;
    }

    @Override
    public void setWeight(long weight) {

    }

    @Override
    public String setTerm(String term) {
        return null;
    }


}
