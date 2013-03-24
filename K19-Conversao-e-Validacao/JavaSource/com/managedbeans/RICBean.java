package com.managedbeans;

import javax.faces.bean.ManagedBean;

import com.model.RIC;
@ManagedBean
public class RICBean {
	private RIC ric;

	/**
	 * @return the ric
	 */
	public RIC getRic() {
		return ric;
	}

	/**
	 * @param ric the ric to set
	 */
	public void setRic(RIC ric) {
		this.ric = ric;
	}
	
}
