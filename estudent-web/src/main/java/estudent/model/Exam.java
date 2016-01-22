package estudent.model;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the exams database table.
 * 
 */
@Entity
@Table(name="exams")
@NamedQueries({
	@NamedQuery(name="Exam.getAll", query="SELECT e FROM Exam e"),
	@NamedQuery(name="Exam.getById", query="SELECT e FROM Exam e WHERE e.id=?1")
})
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="datum_cas")
	private Timestamp datumCas;

	private String prostor;

	private int rok;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="id_course")
	private Course cours;

	public Exam() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDatumCas() {
		return this.datumCas;
	}

	public void setDatumCas(Timestamp datumCas) {
		this.datumCas = datumCas;
	}

	public String getProstor() {
		return this.prostor;
	}

	public void setProstor(String prostor) {
		this.prostor = prostor;
	}

	public int getRok() {
		return this.rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public Course getCours() {
		return this.cours;
	}

	public void setCours(Course cours) {
		this.cours = cours;
	}

}