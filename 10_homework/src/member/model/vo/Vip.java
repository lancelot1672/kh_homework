package member.model.vo;

public class Vip extends Member{
	
	//»ý¼ºÀÚ
	public Vip() {
		super();
	}
	
	public Vip(String name, String grade, int point) {
		super(name, grade, point, point * 0.1);

	}
	
}
