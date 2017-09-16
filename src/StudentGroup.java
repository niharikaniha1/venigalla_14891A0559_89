import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {

		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if (students == null) {
			throw new IllegalArgumentException();
		}
		else this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length) throw new IllegalArgumentException();
		else return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length) throw new IllegalArgumentException();
		else {
			students[index] = student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here

		if (student == null ) throw new IllegalArgumentException();
		else {
			ArrayList <Student>st = new ArrayList<Student>();
			st = (ArrayList<Student>) Arrays.asList(students);
			st.add(0, student);
			students = null;
			students = (Student[]) st.toArray();


		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here

		if (student == null ) throw new IllegalArgumentException();
		else {
			ArrayList <Student>st = new ArrayList<Student>();
			st = (ArrayList<Student>) Arrays.asList(students);
			st.add(students.length, student);
			students = null;
			students = (Student[]) st.toArray();
		}

	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here


	}

	@Override
	public void remove(int index) {
	    if(index<0||index>=this.students.length) {
			throw new IllegalArgumentException();
		}
		else {
			ArrayList <Student> stud = new ArrayList<Student>(Arrays.asList(this.students));
			stud.remove(index);
			this.students = stud.toArray(this.students);
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	    ArrayList <Student>st = new ArrayList<Student>();

		// Add your implementation here
		if(index < 0 || index >= students.length) throw new IllegalArgumentException();
		else{

		st.remove(index);

	}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		ArrayList <Student>st = new ArrayList<Student>();
		if(index < 0 || index >= students.length) throw new IllegalArgumentException();
		else{

		st.remove(index);
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student te;
		for(int i=0;i<students.length-1;i++){
			for(int j=0;j<students.length-i-1;j++){
				if(students[j].getId()>students[j+1].getId()){
					te=students[j];
					students[j]=students[j+1];
					students[j+1]=te;


				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if (date == null) throw new IllegalArgumentException();
		else {
			Student []stud = new Student[students.length];
			int count =0;
			for(int i=0;i<students.length;i++)
			if(students[i].getBirthDate().compareTo(date) == 0) {
				stud[count] = students[i];
				count++;
			}
			Student []stud1 = new Student[count];

			for(int i=0;i<count;i++) {
				stud1[i] = stud[i];
			}
			return stud1;
		}

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {

		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double d = 0;
		for(int i=0;i<students.length;i++) {

			if(students[i].getAvgMark() > d) {
				d = students[i].getAvgMark();
			}
		}
		Student []stud = new Student[students.length];
		int count=0;
		for(int i=0;i<students.length;i++) {
			if(d == students[i].getAvgMark()) {stud[count] = students[i]; count++;}
		}
		Student []stud1 = new Student[count];
		for(int i=0;i<count;i++) {
			stud1[i] = stud[i];
		}
		return stud1;
	}

	@Override
	public Student getNextStudent(Student student) {

		// Add your implementation here
		if (student == null) throw new IllegalArgumentException();
		else
		for(int i=0;i<students.length;i++) {
			if(student.getId() == students[i].getId()) return students[i+1];
		}
		return null;
	}
}
