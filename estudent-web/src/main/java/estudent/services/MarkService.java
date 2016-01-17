package estudent.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import estudent.model.Mark;

@Service
public class MarkService {
	@PersistenceContext(name="puEstudent")
	private EntityManager em;
	
	@Transactional
	public List<Mark> getAll(){
		Query q = em.createNamedQuery("Mark.getAll");
		return ((List<Mark>)q.getResultList());
	}

	@Transactional
	public Mark getMark(int id){
		Query q  = em.createNamedQuery("Mark.getById");
		q.setParameter(1,id);
		return ((Mark)q.getSingleResult());
	}
	
	@Transactional
	public void addMark(Mark m){
		em.persist(m);
	}
	
	@Transactional
	public void deleteMark(int id){
		Query q = em.createNamedQuery("Mark.getById");
		q.setParameter(1,id);
		Mark m = ((Mark)q.getSingleResult());
		em.remove(m);
	}
	
	@Transactional
	public void updateMark(int id, Mark tmp){
		Query q = em.createNamedQuery("Mark.getById");
		q.setParameter(1,id);
		Mark m = ((Mark)q.getSingleResult());
		if(m.getOcena()!=tmp.getOcena())m.setOcena(tmp.getOcena());
		if(m.getZakluceno()!=tmp.getZakluceno())m.setZakluceno(tmp.getZakluceno());
		em.merge(m);
	}
}
