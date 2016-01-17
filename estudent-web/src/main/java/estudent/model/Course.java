package estudent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * The persistent class for the courses database table.
 * 
 */
@Entity
@Table(name="courses")
@NamedQueries({
	@NamedQuery(name="Course.getAll", query="SELECT c FROM Course c"),
	@NamedQuery(name="Course.getById", query="SELECT c FROM Course c WHERE c.id=?1")
})
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private int id;

	private String ime;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="nosilec")
	private User user;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="course")
	private List<Exam> exams;

	//bi-directional many-to-one association to Mark
	@OneToMany(mappedBy="course")
	private List<Mark> marks;

	public Course() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Exam> getExams() {
		return this.exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Exam addExam(Exam exam) {
		getExams().add(exam);
		exam.setCours(this);

		return exam;
	}

	public Exam removeExam(Exam exam) {
		getExams().remove(exam);
		exam.setCours(null);

		return exam;
	}

	public List<Mark> getMarks() {
		return this.marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	public Mark addMark(Mark mark) {
		getMarks().add(mark);
		mark.setCours(this);

		return mark;
	}

	public Mark removeMark(Mark mark) {
		getMarks().remove(mark);
		mark.setCours(null);

		return mark;
	}

}