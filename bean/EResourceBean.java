package in.sterling.bean;

public class EResourceBean extends BaseBean {
	private String tableContains = null;
	private String name = null;
	private String detail = null;

	public String getTableContains() {
		return tableContains;
	}

	public void setTableContains(String tableContains) {
		this.tableContains = tableContains;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getKey() {
		// TODO Auto-generated method stub
		return id+"";
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
