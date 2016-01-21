package estudent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQueries({
	@NamedQuery(name="User.getAll", query="SELECT u FROM User u"),
	@NamedQuery(name="User.getById", query="SELECT u FROM User u WHERE u.id=?1"),
	@NamedQuery(name="User.getByEmail", query="SELECT u FROM User u WHERE u.email=?1")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private int id;

	private String drzava;

	private String email;

	private String emso;

	private String ime;

	private String mesto;

	private String naslov;

	private String password;

	private int postnum;

	private String priimek;

	private int tip;

	@Column(name="zc_drzava")
	private String zcDrzava;

	@Column(name="zc_mesto")
	private String zcMesto;

	@Column(name="zc_naslov")
	private String zcNaslov;

	@Column(name="zc_postnum")
	private int zcPostnum;

	//bi-directional many-to-one association to Cours
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER)
	private List<Course> courses;

	//bi-directional many-to-one association to Mark
	@OneToMany(mappedBy="user")
	private List<Mark> marks;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrzava() {
		return this.drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmso() {
		return this.emso;
	}

	public void setEmso(String emso) {
		this.emso = emso;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getMesto() {
		return this.mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPostnum() {
		return this.postnum;
	}

	public void setPostnum(int postnum) {
		this.postnum = postnum;
	}

	public String getPriimek() {
		return this.priimek;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public int getTip() {
		return this.tip;
	}

	public void setTip(int tip) {
		this.tip = tip;
	}

	public String getZcDrzava() {
		return this.zcDrzava;
	}

	public void setZcDrzava(String zcDrzava) {
		this.zcDrzava = zcDrzava;
	}

	public String getZcMesto() {
		return this.zcMesto;
	}

	public void setZcMesto(String zcMesto) {
		this.zcMesto = zcMesto;
	}

	public String getZcNaslov() {
		return this.zcNaslov;
	}

	public void setZcNaslov(String zcNaslov) {
		this.zcNaslov = zcNaslov;
	}

	public int getZcPostnum() {
		return this.zcPostnum;
	}

	public void setZcPostnum(int zcPostnum) {
		this.zcPostnum = zcPostnum;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Course addCours(Course course) {
		getCourses().add(course);
		course.setUser(this);

		return course;
	}

	public Course removeCours(Course course) {
		getCourses().remove(course);
		course.setUser(null);

		return course;
	}

	public List<Mark> getMarks() {
		return this.marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	public Mark addMark(Mark mark) {
		getMarks().add(mark);
		mark.setUser(this);

		return mark;
	}

	public Mark removeMark(Mark mark) {
		getMarks().remove(mark);
		mark.setUser(null);

		return mark;
	}

}