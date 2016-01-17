package estudent.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import estudent.model.Exam;

@Service
public class ExamService {
	@PersistenceContext(name="puEstudent")
	private EntityManager em;

	@Transactional
	public Exam getExam(int id){
		Query q  = em.createNamedQuery("Exam.getById");
		q.setParameter(1,id);
		return ((Exam)q.getSingleResult());
	}
	
	@Transactional
	public void addExam(Exam m){
		em.persist(m);
	}
	
	@Transactional
	public void deleteExam(int id){
		Query q = em.createNamedQuery("Exam.getById");
		q.setParameter(1,id);
		Exam m = ((Exam)q.getSingleResult());
		em.remove(m);
	}
}
