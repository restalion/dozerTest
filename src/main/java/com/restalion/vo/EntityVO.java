package com.restalion.vo;

import java.util.List;

import com.restalion.entities.SubEntity;

public class EntityVO {

	private String uno;
	private String dos;
	private String tres;
	private SubEntityVO subEntity;
	private List<SubEntityVO> subEntities;

	public SubEntityVO getSubEntity() {
		return subEntity;
	}
	public void setSubEntity(SubEntityVO subEntity) {
		this.subEntity = subEntity;
	}
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
	public List<SubEntityVO> getSubEntities() {
		return subEntities;
	}
	public void setSubEntities(List<SubEntityVO> subEntities) {
		this.subEntities = subEntities;
	}
	@Override
	public String toString() {
		return "EntityVO [uno=" + uno + ", dos=" + dos + ", tres=" + tres
				+ ", subEntity=" + subEntity + ", subEntities=" + subEntities
				+ "]";
	}
	


}
