
public class PrimaryStudent extends Student{
	protected int grade;
	
	
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public PrimaryStudent(String name, int age, int score, int grade) {
		super(name, age, score);
		this.grade = grade;
	}
	
}
