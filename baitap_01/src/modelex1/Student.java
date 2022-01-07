package modelex1;

import java.util.Scanner;

public class Student extends Person {
	private String code;
	private float averageScore;
	private String email;

	public Student() {
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("code : " + code + "; averageScore : " + averageScore + "; email : " + email + "");
		System.out.println();

	}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();

		Scanner scan = new Scanner(System.in);
		System.out.println(" input code : ");
		code = scan.nextLine();

		System.out.println("input averageScore : ");
		while (true) {
			float averageScoreInput = Float.parseFloat(scan.nextLine());
			boolean isSatisfy = setAverageScore(averageScoreInput);
			if (isSatisfy) {
				break;
			}
		}

		System.out.println("input email");
		email = scan.nextLine();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getAverageScore() {
		return averageScore;
	}

	public boolean setAverageScore(float averageScore) {
		if (averageScore >= 0 && averageScore <= 10) {
			this.averageScore = averageScore;
			return true;
		} else {
			System.err.println("input averageScore : ");
			return false;
		}
	}

	public boolean checkAverageScore() {
		if (averageScore >= 8) {
			return true;
		}
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
