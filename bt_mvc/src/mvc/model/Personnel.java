package mvc.model;

public class Personnel extends Department {
	private String idPersonnel;
	private String namePersonnel;
	private String skillPersonnel;

	public Personnel(String codeDepartment, String nameDepartment, String idPersonnel, String namePersonnel,
			String skillPersonnel) {
		super(codeDepartment, nameDepartment);
		this.idPersonnel = idPersonnel;
		this.namePersonnel = namePersonnel;
		this.skillPersonnel = skillPersonnel;
	}

	public Personnel() {
		super();
	}

	public String getidPersonnel() {
		return idPersonnel;
	}

	public void setCodePersonnel(String idPersonnel) {
		this.idPersonnel = idPersonnel;
	}

	public String getNamePersonnel() {
		return namePersonnel;
	}

	public void setNamePersonnel(String namePersonnel) {
		this.namePersonnel = namePersonnel;
	}

	public String getSkillPersonnel() {
		return skillPersonnel;
	}

	public void setSkillPersonnel(String skillPersonnel) {
		this.skillPersonnel = skillPersonnel;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.print("Personnel [idPersonnel=" + idPersonnel + ", namePersonnel=" + namePersonnel
				+ ", skillPersonnel=" + skillPersonnel + "]  ");
		return super.toString();

	}
}