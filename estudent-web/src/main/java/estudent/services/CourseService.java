package estudent.services;

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
	public Course getCourse(int id){
		Query q  = em.createNamedQuery("Course.getById");
		q.setParameter(1,id);
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

}
