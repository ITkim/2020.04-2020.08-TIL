package self;

public class Programmer {
	private String name;
	private int salary;
	private String tech;
	public MyDate birthDate;
	
	public Programmer(String name, int salary, String tech, MyDate birthDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.tech = tech;
		this.birthDate = birthDate;
	}
	
	public String getProgrammer() {
		return "이름 : "+ name + " 월급 : " + salary + " 생일 : "+birthDate.getBirthDay()+" 기술 : "+tech;
	}
	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getTech() {
		return tech;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public NoteBook noteBook;

	public NoteBook getNoteBook() {
		return noteBook;
	}

	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}

}