package party;

public class Visitor {
	
	private static final String GENDER_MALE = "M";
	private static final String GENDER_FEMALE = "F";
	
	
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private int age;
		
	public Visitor(int id, String fname, String lname, String gender, int age) {
		this.setId(id);
		this.setFname(fname);
		this.setLname(lname);
		this.setGender(gender);
		this.setAge(age);
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	public int getId() {
		return this.id;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFname() {
		return this.fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLname() {
		return this.lname;
	}
	
	public void setGender(String gender) {		
		if(gender.equals(GENDER_MALE) || gender.equals(GENDER_FEMALE)) {
			this.gender = gender;
		}else {
			this.gender = "Missing gender information";
		}		
	}
	public String getGender() {
		return this.gender;
	}
	
	public void setAge(int age) {		
		if(age >= 6 && age <= 85) {
			this.age = age;
		}else {
			this.age = 0;
		}		
	}
	public int getAge() {
		return this.age;
	}
	
	
	/*Render Visitors*/
	public void render() {
		System.out.printf("%d Name: %s %s /Age: %d /Gender: %s\n",(this.id+1), this.fname, this.lname, this.age, this.gender);	
	}
	

	
	
	
	
}
