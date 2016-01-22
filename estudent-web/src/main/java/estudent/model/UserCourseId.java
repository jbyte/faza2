package estudent.model;

import java.io.Serializable;

public class UserCourseId implements Serializable {
	private int idUser;
	private int idCourse;
	
	@Override
	public int hashCode(){
		return (int)(idUser+idCourse);
	}
	
	@Override
	public boolean equals(Object object){
		if(object instanceof UserCourseId){
			UserCourseId other = (UserCourseId)object;
			return (other.idUser==this.idUser) && (other.idCourse==this.idCourse);
		}
		return false;
	}
}
