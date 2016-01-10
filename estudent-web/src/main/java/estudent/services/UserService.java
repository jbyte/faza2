package estudent.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import estudent.entities.User;

@Service
@NamedQueries(
	@NamedQuery(name="User.getAll",query="SELECT u FROM User u")
)
public class UserService {
	@PersistenceContext(name="puEstudent")
	private EntityManager em;
	
	@Transactional
	public List<User> getUsers(){
		//Query q = em.createNamedQuery("User.getAll");
		Query q = em.createQuery("SELECT u FROM User u",User.class);
		return ((List<User>)q.getResultList());
	}
	
	@Transactional
	public void addUser(User u){
		em.persist(u);
	}
}
