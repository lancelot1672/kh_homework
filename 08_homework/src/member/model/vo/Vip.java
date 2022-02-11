package member.model.vo;

public class Vip {
	private String name;		// 이름
	private String grade;		// 등급
	private int point;			// 포인트
	private double plus_point;	//이자 포인트
	
	//생성자
	public Vip() {
		
	}
	
	public Vip(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
		this.plus_point = point * 0.1;
	}
	
	// Setter & Getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	public double getPlus_point() {
		return plus_point;
	}
	
}
