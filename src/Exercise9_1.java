
public class Exercise9_1 {

	public static void main(String[] args) {
		SutaCard c1 = new SutaCard(3,true);
		SutaCard c2 = new SutaCard(3,true);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c1.equals(c2):" +c1.equals(c2));

	}

}

class SutaCard{
	int num;
	boolean isKwang;
	
	SutaCard(){
		this(1,true);
	}
	
	SutaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {//매개변수가 obj타입이다. 모든 타입의 객체가 들어올 수 있다. 따라서 instanceof로 확인 후에 형변환을 해 주어야 한다.
		if(obj instanceof SutaCard) {
			SutaCard c = (SutaCard)obj;
			return c.num==this.num && c.isKwang==this.isKwang;
		}
		return false;
		
	}
	
	public String toString() {
		return num +(isKwang ? "K" : "");
	}
}
