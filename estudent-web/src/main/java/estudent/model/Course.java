package estudent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the courses database table.
 * 
 */
@Entity
@Table(name="courses")
@NamedQueries({
	@NamedQuery(name="Course.getAll", query="SELECT c FROM Course c"),
	@NamedQuery(name="Course.getById", query="SELECT c FROM Course c WHERE c.id=?1"),
	@NamedQuery(name="Course.getByName", query="SELECT c FROM Course c WHERE c.ime=?1")
})
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String ime;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="id_prof")
	private User idProf;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="cours",fetch=FetchType.EAGER)
	private List<Exam> exams;

	//bi-directional many-to-one association to Usercourse
	@OneToMany(mappedBy="course",fetch=FetchType.EAGER)
	private List<Usercourse> usercourses;

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

	public User getProf() {
		return this.idProf;
	}

	public void setProf(User user) {
		this.idProf = user;
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

	public List<Usercourse> getUsercourses() {
		return this.usercourses;
	}

	public void setUsercourses(List<Usercourse> usercourses) {
		this.usercourses = usercourses;
	}

	public Usercourse addUsercours(Usercourse usercours) {
		getUsercourses().add(usercours);
		usercours.setCours(this);

		return usercours;
	}

	public Usercourse removeUsercours(Usercourse usercours) {
		getUsercourses().remove(usercours);
		usercours.setCours(null);

		return usercours;
	}

}