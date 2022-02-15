package member.model.vo;

public class Silver extends Member{
	
	//»ı¼ºÀÚ
	public Silver() {
		super();
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point, point * 0.02);

	}
	
}
