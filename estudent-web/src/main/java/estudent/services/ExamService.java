package estudent.services;

import java.util.List;

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
	public List<Exam> getAll(){
		Query q = em.createNamedQuery("Exam.getAll");
		return ((List<Exam>)q.getResultList());
	}
	
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
	
	@Transactional
	public void updateExam(int id, Exam tmp){
		Query q = em.createNamedQuery("Exam.getById");
		q.setParameter(1,id);
		Exam e = ((Exam)q.getSingleResult());
		if(!e.getDatumCas().equals(tmp.getDatumCas()))e.setDatumCas(tmp.getDatumCas());
		if(!e.getProstor().equals(tmp.getProstor()))e.setProstor(tmp.getProstor());
		em.merge(e);
	}
}
