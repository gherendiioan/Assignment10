package com.whatifitsdifferent.Assignment10.dto;

public class Meal {
	
	private Integer id;
	private String title;
	private String imageType;
	private Integer readyInMinutes;
	private Integer serving;
	private String sourceUrl;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServing() {
		return serving;
	}
	public void setServing(Integer serving) {
		this.serving = serving;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	
	@Override
	public String toString() {
		return "Meal [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes=" + readyInMinutes
				+ ", serving=" + serving + ", sourceUrl=" + sourceUrl + "]";
	}
	
	

}
