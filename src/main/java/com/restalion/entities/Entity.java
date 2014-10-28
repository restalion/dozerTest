package com.restalion.entities;

import java.util.List;

public class Entity {

	private String uno;
	private String dos;
	private String tres;
	private SubEntity subEntity;
	private List<SubEntity> subEntities;
	

	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getTres() {
		return tres;
	}
	public void setTres(String tres) {
		this.tres = tres;
	}
	public SubEntity getSubEntity() {
		return subEntity;
	}
	public void setSubEntity(SubEntity subEntity) {
		this.subEntity = subEntity;
	}
	public List<SubEntity> getSubEntities() {
		return subEntities;
	}
	public void setSubEntities(List<SubEntity> subEntities) {
		this.subEntities = subEntities;
	}

	@Override
	public String toString() {
		return "Entity [uno=" + uno + ", dos=" + dos + ", tres=" + tres
				+ ", subEntity=" + subEntity + ", subEntities=" + subEntities
				+ "]";
	}


}
