package app.ToDoApp.modelDTO;

import java.util.Date;

import app.ToDoApp.entity.ToDo;

public class ToDoDTO {
	private int id;
	private Date createdDate;
	private Date lastUpdatedDate;
	private String desciption;
	private String title;
	private String colourCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColourCode() {
		return colourCode;
	}

	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}

	public ToDo createEntity(ToDoDTO toDoDTO) {
		ToDo toDo=new ToDo();
		toDo.setColourCode(toDoDTO.getColourCode());
//		toDo.setCreatedDate(toDoDTO.getCreatedDate());
		toDo.setDesciption(toDoDTO.getDesciption());
//		toDo.setLastUpdatedDate(toDoDTO.getLastUpdatedDate());
		toDo.setTitle(toDoDTO.getTitle());
		return toDo;
	}

}