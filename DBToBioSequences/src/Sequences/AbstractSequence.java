package Sequences;

import java.util.Set;

public abstract class AbstractSequence {

	protected String sequence;
	protected String header;

	public String getHeader(){
		return header;	
	}

	public void setHeader(String header){
		this.header = header;
	}

	public String getSequence(){
		return sequence;
	}

	public void setSequence(String sequence){
		this.sequence = sequence;
	}

	public abstract Set<Character> getAlphabet();

	public float getRatioValid(){
		Set<Character> set = getAlphabet();
		float numValid = 0;
		for(Character c : sequence.toCharArray()){
			if(set.contains(c)){
				numValid++;
			}
		}
		return numValid/sequence.length();
	}
	
	public void printFasta(int tokensLength){
		System.out.println(">"+header);
		// spezza stringa in sottostringhe di tokenslength caratteri e le salva in String array
		String[] seqlines = this.sequence.split(String.format("(?<=\\G.{%1$d})", tokensLength));
		for(String s: seqlines) {
			System.out.println(s);        // stampa fullsequence in righe di tokenslength caratteri
		}
	}
	
	public void printFasta(){
		this.printFasta(60); //standard FASTA lenght
	}

	public AbstractSequence(String header, String sequence){
		this.header = header;
		this.sequence = sequence;
	}

}
