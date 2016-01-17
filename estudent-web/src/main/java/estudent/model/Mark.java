package estudent.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the mark database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Mark.getAll", query="SELECT m FROM Mark m"),
	@NamedQuery(name="Mark.getById", query="SELECT m FROM Mark m WHERE m.id=?1"),
	@NamedQuery(name="Mark.getByUser", query="SELECT m FROM Mark m WHERE m.user=?1")
})
public class Mark implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private int id;

	private int ocena;

	private int zakluceno;

	//bi-directional many-to-one association to Cours
	@ManyToOne
	@JoinColumn(name="idpredmet")
	private Course course;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="idrok")
	private Exam exam;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="iduser")
	private User user;

	public Mark() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOcena() {
		return this.ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public int getZakluceno() {
		return this.zakluceno;
	}

	public void setZakluceno(int zakluceno) {
		this.zakluceno = zakluceno;
	}

	public Course getCours() {
		return this.course;
	}

	public void setCours(Course course) {
		this.course = course;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}