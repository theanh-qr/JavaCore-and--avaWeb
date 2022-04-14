package javacorn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentClass {
	final int MALE = 1;
	final int FEMALE = 0;
	final int PASS = 1;
	final int FAIL = 0;
	String name;
	int age;
	String classes;
	String email;
	int gender;
	double finalGrade;
	int status;

	public void Student() throws Exception {
		this.gender = MALE;
		this.finalGrade = 0.0;
		this.status = FAIL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (isValidName(name)) {
			this.name = name;
		} else {
			throw new Exception("Invalid name");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (isValidAge(age)) {
			this.age = age;
		} else {
			throw new Exception("Invalid age");
		}
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) throws Exception {
		if (isValidClasses(classes)) {
			this.classes = classes;
		} else {
			throw new Exception("Invalid class");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		if (isValidEmail(email)) {
			this.email = email;
		} else {
			throw new Exception("Invalid mail");
		}
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) throws Exception {
		if (isValidGender(gender)) {
			this.gender = gender;
		} else {
			throw new Exception("Invalid gender");
		}
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double finalGrade) throws Exception {
		if (isValidFinalGrade(finalGrade)) {
			this.finalGrade = finalGrade;
			if (getFinalGrade() >= 5) {
				setStatus(PASS);
			} else {
				setStatus(FAIL);
			}
		} else {
			throw new Exception("Invalid finalGrade");
		}
	}

	public int getStatus() {
		return status;
	}

	private void setStatus(int status) throws Exception {
		if (isValidStatus(status)) {
			this.status = status;
		} else {
			throw new Exception("Invalid status");
		}
	}

	public boolean isValidName(String name) {
		return name.length() >= 1;
	}

	public boolean isValidClasses(String classes) {
		return classes.length() >= 2;
	}

	public boolean isValidEmail(String email) {
		// khai bao regex
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		// object pattern
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean isValidFinalGrade(double finalGrade) {
		return finalGrade >= 0 && finalGrade <= 10;
	}

	public boolean isValidGender(int gender) {
		return gender == FEMALE || gender == MALE;
	}

	public boolean isValidAge(int age) {
		return age >= 0 && age <= 150;
	}

	public boolean isValidStatus(int status) {
		return status == FAIL || status == PASS;
	}

	public boolean isPass() {
		return getFinalGrade() >= 5;
	}

	public String toString() {
		return "[Name: " + getName() + ", age: " + getAge() + ", class: " + getClasses() + ", email: " + getEmail()
				+ ", gender: " + (getGender() == 1 ? "Male" : "Female") + ", finalGrade: " + getFinalGrade()
				+ ", status: " + (getStatus() == 1 ? "Passed" : "Failed") + "]";
	}

	public static void selectionSort(StudentClass[] student) {
		for (int i = 0; i < student.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = student[i].getFinalGrade();
			int currentMinIndex = i;

			for (int j = i + 1; j < student.length; j++) {
				if (currentMin > student[j].getFinalGrade()) {
					currentMin = student[j].getFinalGrade();
					// swap object index
					StudentClass studentTemp = student[i];
					student[i] = student[j];
					student[j] = studentTemp;
					// set current min index
					currentMinIndex = j;
				}
			}
		}
	}
}
