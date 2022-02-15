package member.model.vo;

public class VVip extends Member{
	
	//»ý¼ºÀÚ
	public VVip() {
		super();
	}
	
	public VVip(String name, String grade, int point) {
		super(name, grade, point, point * 0.15);

	}
	
}
