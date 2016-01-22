package estudent.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import estudent.model.Course;

@Service
public class CourseService {
	@PersistenceContext(name="puEstudent")
	private EntityManager em;
	
	@Transactional
	public List<Course> getAll(){
		Query q = em.createNamedQuery("Course.getAll");
		return ((List<Course>)q.getResultList());
	}
	
	@Transactional
	public Course getCourse(int id){
		Query q  = em.createNamedQuery("Course.getById");
		q.setParameter(1,id);
		return ((Course)q.getSingleResult());
	}
	
	@Transactional
	public Course getCourse(String name){
		Query q = em.createNamedQuery("Course.getByName");
		q.setParameter(1,name);
		return ((Course)q.getSingleResult());
	}
	
	@Transactional
	public void addCourse(Course m){
		em.persist(m);
	}
	
	@Transactional
	public void deleteCourse(int id){
		Query q = em.createNamedQuery("Course.getById");
		q.setParameter(1,id);
		Course m = ((Course)q.getSingleResult());
		em.remove(m);
	}
	
	@Transactional
	public void updateCourse(int id, Course tmp){
		Query q = em.createNamedQuery("Course.getById");
		q.setParameter(1,id);
		Course c = ((Course)q.getSingleResult());
		if(!c.getIme().equals(tmp.getIme()))c.setIme(tmp.getIme());
		if(!c.getProf().equals(tmp.getProf()))c.setProf(tmp.getProf());
		em.merge(c);
	}

}
