package in.sterling.bean;

/**
 * 
 * DropdownListBean interface is implemented by Beans those are used to create
 * Drop down list on html page
 * 
 * @author proxy
 * @version 1.0
 * 
 */

public interface DropdownListBean {

	/**
	 * 
	 * return key of list element
	 * 
	 * @return key
	 * 
	 */
	public String getKey();

	/**
	 * 
	 * return display text of list element
	 * 
	 * @return value
	 * 
	 */
	public String getValue();
}
