package estudent.services;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import estudent.model.User;

@Service
public class UserService {
	@PersistenceContext(name="puEstudent")
	private EntityManager em;
	
	@Transactional
	public User getUser(int id){
		Query q = em.createNamedQuery("User.getById");
		q.setParameter(1,id);
		return ((User)q.getSingleResult());
	}
	
	@Transactional
	public User getUser(String email){
		Query q = em.createNamedQuery("User.getByEmail");
		q.setParameter(1,email);
		return ((User)q.getSingleResult());
	}
	
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
	
	@Transactional
	public void deleteUser(int id){
		Query q = em.createNamedQuery("User.getById");
		q.setParameter(1,id);
		User u = ((User)q.getSingleResult());
		em.remove(u);
	}
	
	@Transactional
	public User updateName(User u, String name){
		u.setIme(name);
		return u;
	}
	
	@Transactional
	public User updateLastName(User u, String lastname){
		u.setPriimek(lastname);
		return u;
	}
	
	@Transactional
	public User updatePassword(User u, String pass){
		u.setPassword(pass);
		return u;
	}
	
	@Transactional
	public User updateType(User u, int type){
		u.setTip(type);
		return u;
	}
	
	@Transactional
	public User updateEmso(User u, String emso){
		u.setEmso(emso);
		return u;
	}
	
	@Transactional
	public User updateAddr(User u, String addr){
		u.setNaslov(addr);
		return u;
	}
	
	@Transactional
	public User updatePostnum(User u, int postnum){
		u.setPostnum(postnum);
		return u;
	}
	
	@Transactional
	public User updateState(User u, String state){
		u.setDrzava(state);
		return u;
	}
	
	@Transactional
	public User updateCity(User u, String city){
		u.setMesto(city);
		return u;
	}
	
	@Transactional
	public User updateTmpAddr(User u, String addr){
		u.setZcNaslov(addr);
		return u;
	}
	
	@Transactional
	public User updateTmpPostnum(User u, int postnum){
		u.setZcPostnum(postnum);
		return u;
	}
	
	@Transactional
	public User updateTmpCity(User u, String city){
		u.setZcMesto(city);
		return u;
	}
	
	@Transactional
	public User updateTmpState(User u, String state){
		u.setZcDrzava(state);
		return u;
	}
	
	@Transactional
	public void updateUser(int id, User tmp){
		Query q = em.createNamedQuery("User.getById");
		q.setParameter(1,id);
		User u = ((User)q.getSingleResult());
		if(tmp.getIme()!=null && !tmp.getIme().equals(u.getIme())) u = updateName(u, tmp.getIme());
		if(tmp.getPriimek()!=null && !tmp.getPriimek().equals(u.getPriimek())) u = updateLastName(u, tmp.getPriimek());
		if(tmp.getPassword()!=null && !tmp.getPassword().equals(u.getPassword())) u = updatePassword(u, tmp.getPassword());
		if(tmp.getTip() != u.getTip()) u = updateType(u, tmp.getTip());
		if(tmp.getEmso()!=null && !tmp.getEmso().equals(u.getEmso())) u = updateEmso(u, tmp.getEmso());
		if(tmp.getNaslov()!=null && !tmp.getNaslov().equals(u.getNaslov())) u = updateAddr(u, tmp.getNaslov());
		if(tmp.getPostnum() != u.getPostnum()) u = updatePostnum(u, tmp.getPostnum());
		if(tmp.getMesto()!=null && !tmp.getMesto().equals(u.getMesto())) u = updateCity(u, tmp.getMesto());
		if(tmp.getDrzava()!=null && !tmp.getDrzava().equals(u.getDrzava())) u = updateState(u, tmp.getDrzava());
		if(tmp.getZcNaslov()!=null && !tmp.getZcNaslov().equals(u.getZcNaslov())) u = updateTmpAddr(u, tmp.getZcNaslov());
		if(tmp.getZcPostnum() != u.getZcPostnum()) u = updateTmpPostnum(u, tmp.getZcPostnum());
		if(tmp.getZcMesto()!=null && !tmp.getZcMesto().equals(u.getZcMesto())) u = updateTmpCity(u, tmp.getZcMesto());
		if(tmp.getZcDrzava()!=null && !tmp.getZcDrzava().equals(u.getZcDrzava())) u = updateTmpState(u, tmp.getZcDrzava());
		em.merge(u);
	}
	
	public boolean validate(User u){
		String stringregex = "[A-Za-z- ]*";
		String addrregex = "[A-Za-z- ]*\\d{0,3}[a-c]?";
		String emailregex = "[A-Za-z0-9-_.]+@[A-Za-z-_.]+[a-z]{1,3}";
		String emsoregex = "\\d{13}";
		String postnumregex = "\\d{0,4}";
		
		Pattern p = Pattern.compile(stringregex);
		Matcher m;
		
		if (u.getDrzava()!=null) {
			m = p.matcher(u.getDrzava());
			if (!m.find())
				return false;
		}
		
		if (u.getIme()!=null) {
			m = p.matcher(u.getIme());
			if (!m.find())
				return false;
		}
		
		if (u.getPriimek()!=null) {
			m = p.matcher(u.getPriimek());
			if (!m.find())
				return false;
		}
		
		if (u.getMesto()!=null) {
			m = p.matcher(u.getMesto());
			if (!m.find())
				return false;
		}
		
		if (u.getZcDrzava()!=null) {
			m = p.matcher(u.getZcDrzava());
			if (!m.find())
				return false;
		}
		
		if (u.getZcMesto()!=null) {
			m = p.matcher(u.getZcMesto());
			if (!m.find())
				return false;
		}
		
		p = Pattern.compile(emailregex);
		
		if (u.getEmail()!=null) {
			m = p.matcher(u.getEmail());
			if (!m.find())
				return false;
		}
		
		p = Pattern.compile(emsoregex);
		
		if (u.getEmso()!=null) {
			m = p.matcher(u.getEmso());
			if (!m.find())
				return false;
		}
		
		p = Pattern.compile(postnumregex);
		
		m = p.matcher(Integer.toString(u.getPostnum()));
		if(!m.find())return false;
		
		m = p.matcher(Integer.toString(u.getZcPostnum()));
		if(!m.find())return false;
		
		p = Pattern.compile(addrregex);
		
		if (u.getNaslov()!=null) {
			m = p.matcher(u.getNaslov());
			if (!m.find())
				return false;
		}
		
		if (u.getZcNaslov()!=null) {
			m = p.matcher(u.getZcNaslov());
			if (!m.find())
				return false;
		}
		return true;
	}
}
