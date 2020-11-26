

public class EleMemore<T extends Comparable<T>> implements Comparable<EleMemore<T>> {
	//CAMPI
	private T element;
	private int index = -1;
	
	//COSTRUTTORI
	public EleMemore(T ob, int ind){
		this.element=ob;
		this.index=ind;
	}
	
	//METODI
	
	public T getElement() {
		return this.element;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setElement(T e) {
		this.element = e;
	}
	
	public void setIndex(int i) {
		this.index = i;
	}
	
	//TODO equals
	
	@Override
	public int compareTo(EleMemore<T> o) {
		return (this.element).compareTo(o.element);
	}
	
	public String toString() {
		return this.element.toString();
	}
	
}
