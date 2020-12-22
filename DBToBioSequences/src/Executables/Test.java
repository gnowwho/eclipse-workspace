package Executables;

import Sequences.*;
import SQLSantaCruz.*;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		UCSCInterrogation interrogator = new UCSCInterrogation();
		String tmpSqlStatement = "select * from knownGeneMrna limit 5";
		List<DnaSequence> trascritti = interrogator.AskMRNA(tmpSqlStatement);
		
		for (DnaSequence seq:trascritti) {
			seq.printFasta();
		}

	}

}
