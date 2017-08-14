package com.hitisoft.orm.jpa;

import com.hitisoft.orm.util.RowAction;

import javax.persistence.*;

@MappedSuperclass
public abstract class IdDomain implements java.io.Serializable {
	private static final long serialVersionUID = -4695194062552942944L;
	protected RowAction rowAction;
	protected Long id;

	@Transient
	public RowAction getRowAction() {
		return rowAction;
	}

	public void setRowAction(RowAction rowAction) {
		this.rowAction = rowAction;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable = false, updatable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
