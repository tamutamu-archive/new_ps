package com.mf.web.domain;

public class MenuItem {
	private String description;
	private String type;
	private String icon;
	private String link;

	public MenuItem(String description, String type, String icon, String link) {
		this.description = description;
		this.type = type;
		this.icon = icon;
		this.link = link;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
