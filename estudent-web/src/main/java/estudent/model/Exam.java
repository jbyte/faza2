package estudent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * The persistent class for the exam database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Exam.getAll", query="SELECT e FROM Exam e"),
	@NamedQuery(name="Exam.getById", query="SELECT e FROM Exam e WHERE e.id=?1")
})
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private int id;

	private Timestamp cas;

	private String prostor;

	//bi-directional many-to-one association to Cours
	@ManyToOne
	@JoinColumn(name="predmet")
	private Course course;

	//bi-directional many-to-one association to Mark
	@OneToMany(mappedBy="exam")
	private List<Mark> marks;

	public Exam() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCas() {
		return this.cas;
	}

	public void setCas(Timestamp cas) {
		this.cas = cas;
	}

	public String getProstor() {
		return this.prostor;
	}

	public void setProstor(String prostor) {
		this.prostor = prostor;
	}

	public Course getCours() {
		return this.course;
	}

	public void setCours(Course course) {
		this.course = course;
	}

	public List<Mark> getMarks() {
		return this.marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	public Mark addMark(Mark mark) {
		getMarks().add(mark);
		mark.setExam(this);

		return mark;
	}

	public Mark removeMark(Mark mark) {
		getMarks().remove(mark);
		mark.setExam(null);

		return mark;
	}

}