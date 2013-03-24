package com.ibm.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ErroBean {
	public String erro() {
		throw new NullPointerException();
	}

}
