package forum.models;

import java.io.Serializable;

public class Role implements Serializable {
	
	public int id;
	public String roleName;
	public Role(int id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
