package com.hitisoft.orm.util;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class IdDomain implements java.io.Serializable {
	private static final long serialVersionUID = -4695194062552942944L;
	protected RowAction rowAction;

	@Transient
	public RowAction getRowAction() {
		return rowAction;
	}

	public void setRowAction(RowAction rowAction) {
		this.rowAction = rowAction;
	}

}
