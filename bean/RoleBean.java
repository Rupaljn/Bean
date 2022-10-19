package in.sterling.bean;

public class RoleBean extends BaseBean {

	private String name = null;
	private String description = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getKey() {
		return ""+id;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return name;
	}



}
