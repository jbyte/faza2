package estudent.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import estudent.model.User;

@Service
public class UserService {
	@PersistenceContext(name="puEstudent")
	private EntityManager em;
	
	@Transactional
	public List<User> getUsers(){
		Query q = em.createNamedQuery("User.getAll");
		//Query q = em.createQuery("SELECT u FROM User u",User.class);
		return ((List<User>)q.getResultList());
	}
	
	@Transactional
	public void addUser(User u){
		em.persist(u);
	}
}
