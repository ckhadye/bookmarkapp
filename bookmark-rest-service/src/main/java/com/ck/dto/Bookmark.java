package com.ck.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bookmark {

	private long id;
	private String url = "";
	private Date date = new Date();
	private List<String> tags = new ArrayList<String>();
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("id:").append(id).append(",url:").append(url).append(",date:").append(date).append(",tags:").append(tags.toString());
		return builder.toString();
	}
}
