package S4;

import edu.princeton.cs.algs4.Digraph;

public class WordNet {
	
	private Digraph graph; 

	// constructor takes the name of the two input files
	public WordNet(String synsets , String hypernyms) {
		
	}
	
	// returns all WordNet nouns
	public Iterable<String> nouns() {
		return null;
	}

	// is the word a WordNet noun?
	public boolean isNoun(String word) {
		return false;
	}
	
	// distance between nounA and nounB (defined below)
	public int distance(String nounA, String nounB) {
		return 0;
	}

	// a synset (second field of synsets.txt) that is a shortest common ancestor
	// of nounA and nounB
	public String sap(String nounA, String nounB) {
		return null;
	}

	// do unit testing of this class
	public static void main(String[] args) {
		
	}
}