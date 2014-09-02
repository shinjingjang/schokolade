package schokolade;

public class Genertics<X> {

	private X content;

	<T> Genertics(T t) {
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
		Genertics<Integer> gc1=new Genertics<Integer>(32.8);
		Genertics<Integer>gc2=new <String>Genertics<Integer>("Test");
		//gc2=setContent( new Integer(42));
		System.out.println(gc2.getContent());
	}
}
