package in.sterling.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * Parent class of all Beans in application .It contain generic attributes.
 * 
 * @author Proxy
 * @version 1.0 Copyright (c) Proxy
 * 
 **/
public abstract class BaseBean implements Serializable, DropdownListBean, Comparable<BaseBean> {

	/**
	 * 
	 * Non business Primary key
	 * 
	 */
	protected long id;

	/**
	 * Contain user_id who created this database recored
	 * 
	 */
	private String createdBy = null;

	/**
	 * 
	 * Contain user id who modified this database record
	 * 
	 */
	private String modifiedBy = null;
	/**
	 * 
	 * Contain created Timestamp of database record
	 * 
	 */
	private Timestamp createdDateTime = null;
	/**
	 * 
	 * Contain modified Timestamp of database record
	 * 
	 */
	private Timestamp modifiedDateTime = null;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp timestamp) {
		this.createdDateTime = timestamp;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public abstract String getKey();

	public abstract String getValue();

	public int compareTo(BaseBean o) {

		return getValue().compareTo(o.getValue());
	}

}
