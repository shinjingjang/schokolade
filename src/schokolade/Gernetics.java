package schokolade;

public class Gernetics<X> {

	private X content;

	<T> Gernetics(T t) {
		System.out.println("Der Type T ist: " + t.getClass().getName());
	}
	public X getContent(){
		return content;
	}
	public void setContent(X x){
		
		content=x;
		System.out.println("Der Type X ist : "+x.getClass().getName());
	}
	public static void man(String[] args){
		Gernetics<Integer> gc1=new Gernetics<Integer>(32.8);
		Gernetics<Integer>gc2=new <String>Gernetics<Integer>("Test");
		//gc2=setContent( new Integer(42));
		System.out.println(gc2.getContent());
	}
}
