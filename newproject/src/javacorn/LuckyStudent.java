package javacorn;

public class LuckyStudent {
	private String name;
	private String dateOfBirth;
	private String birthPlace;
	private String grade;
	//khơi tạo hàm
	public LuckyStudent(String name,String dateOfBirth,String birthPlace,String grade) {
		this.name= name;
		this.dateOfBirth = dateOfBirth;
		this.birthPlace = birthPlace;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getBirthPlace() {
		return birthPlace;
	}


	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public void Exercise(){
		
	}
}
