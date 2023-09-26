package app.ToDoApp.modelDTO;

import java.util.Date;

import app.ToDoApp.entity.ToDo;

public class ToDoDTO {
	private int id;
	private Date createdDate;
	private Date lastUpdatedDate;
	private String description;
	private String title;
	private String colourCode;
	private ColorCodeDTO colour;

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
		return description;
	}

	public void setDesciption(String desciption) {
		this.description = desciption;
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
	
	public ColorCodeDTO getColour() {
		return colour;
	}

	public void setColour(ColorCodeDTO colour) {
		this.colour = colour;
	}

	public ToDo createEntity(ToDoDTO toDoDTO) {
		ToDo toDo=new ToDo();
//		toDo.setCreatedDate(toDoDTO.getCreatedDate());
		toDo.setDesciption(toDoDTO.getDesciption());
//		toDo.setLastUpdatedDate(toDoDTO.getLastUpdatedDate());
		toDo.setTitle(toDoDTO.getTitle());
		return toDo;
	}

}
