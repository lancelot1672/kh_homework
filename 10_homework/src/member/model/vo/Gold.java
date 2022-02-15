package member.model.vo;

public class Gold extends Member{
	
	//»ı¼ºÀÚ
	public Gold() {
		super();
	}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point, point * 0.05);

	}
	
}
