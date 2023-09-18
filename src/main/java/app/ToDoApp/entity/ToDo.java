package app.ToDoApp.entity;

import java.util.Date;

import app.ToDoApp.modelDTO.ToDoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "to_do_list")
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "created_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name = "last_Updated_Date")
	@Temporal(TemporalType.TIMESTAMP)

	private Date lastUpdatedDate;
	
	private String desciption;
	
	private String title;
	
	@Column(name = "colour_code")
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

	public ToDoDTO createDTO(ToDo toDo) {
		ToDoDTO toDoDto=new ToDoDTO();
		toDoDto.setColourCode(toDo.getColourCode());
		toDoDto.setCreatedDate(toDo.getCreatedDate());
		toDoDto.setDesciption(toDo.getDesciption());
		toDoDto.setLastUpdatedDate(toDo.getLastUpdatedDate());
		toDoDto.setTitle(toDo.getTitle());
		toDoDto.setId(toDo.getId());
		return toDoDto;
	}
}
