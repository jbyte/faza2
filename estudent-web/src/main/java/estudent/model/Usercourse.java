package estudent.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usercourses database table.
 * 
 */
@Entity
@Table(name="usercourses")
@NamedQuery(name="Usercourse.findAll", query="SELECT u FROM Usercourse u")
@IdClass(UserCourseId.class)
public class Usercourse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_user")
	private int idUser;
	@Id
	@Column(name="id_course")
	private int idCourse;

	private int kolokviji;

	private int izpit;

	private int ocena;

	@Column(name="sprotne_obveznosti")
	private int sprotneObveznosti;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="id_course",insertable=false,updatable=false)
	private Course course;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="id_user",insertable=false,updatable=false)
	private User user;

	public Usercourse() {
	}

	public int getKolokviji() {
		return this.kolokviji;
	}

	public void setKolokviji(int kolokviji) {
		this.kolokviji = kolokviji;
	}
	
	public int getIzpit() {
		return izpit;
	}

	public void setIzpit(int izpit) {
		this.izpit = izpit;
	}

	public int getOcena() {
		return this.ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public int getSprotneObveznosti() {
		return this.sprotneObveznosti;
	}

	public void setSprotneObveznosti(int sprotneObveznosti) {
		this.sprotneObveznosti = sprotneObveznosti;
	}

	public Course getCours() {
		return this.course;
	}

	public void setCours(Course cours) {
		this.course = cours;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}