package member.model.vo;

public class Vvip {
	private String name;		// �̸�
	private String grade;		// ���
	private int point;			// ����Ʈ
	private double plus_point;	//���� ����Ʈ
	
	//������
	public Vvip() {
		
	}
	
	public Vvip(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
		this.plus_point = point * 0.15;
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