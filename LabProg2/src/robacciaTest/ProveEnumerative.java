package robacciaTest;

enum Anno{
	gen,feb,mar,apr,mag,giu,lug,ago,set,ott,nov,dic;
	
	public String toString() {
		switch (this) {
		case gen: return "Gennaio";
		case feb: return "Febbraio";
		case mar: return "Marzo";
		case apr: return "Aprile";
		case mag: return "Maggio";
		case giu: return "Giugno";
		case lug: return "Luglio";
		case ago: return "Agosto";
		case set: return "Settembre";
		case ott: return "Ottobre";
		case nov: return "Novembre";
		case dic: return "Dicembre";
		default: return ""; //immagino si possano implementare sottoclassi
		}
	}
}

public class ProveEnumerative {

	public static void main(String[] args) {
		Object[] piglia = Anno.values();
		Anno pnt = null;
		
		if (piglia[0].getClass() == Anno.class) {
			pnt = (Anno) piglia[0];
			System.out.println("tipo di " + pnt.name() + " è " + Anno.class );
			System.out.println(pnt.toString());
		}

	}

}
