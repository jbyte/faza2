package estudent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the exam database table.
 * 
 */
@Entity
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(nullable=true)
	private Timestamp cas;

	@Column(nullable=true)
	private String prostor;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="predmet")
	private Course course;

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

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}