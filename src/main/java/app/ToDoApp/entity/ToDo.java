package app.ToDoApp.entity;

import java.util.Date;

import app.ToDoApp.modelDTO.ColorCodeDTO;
import app.ToDoApp.modelDTO.ToDoDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "color_id")
	private ColorCode color;

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
	
	public ColorCode getColor() {
		return color;
	}

	public void setColor(ColorCode color) {
		this.color = color;
	}

	public ToDoDTO createDTO(ToDo toDo) {
		ToDoDTO toDoDto=new ToDoDTO();
		toDoDto.setCreatedDate(toDo.getCreatedDate());
		toDoDto.setDesciption(toDo.getDesciption());
		toDoDto.setLastUpdatedDate(toDo.getLastUpdatedDate());
		toDoDto.setTitle(toDo.getTitle());
		toDoDto.setId(toDo.getId());
		ColorCode color=toDo.getColor();
		if(color!=null) {
			ColorCodeDTO colorDto=new ColorCodeDTO();
			colorDto.setColorCode(color.getColorCode());
			colorDto.setColorId(color.getColorId());
			toDoDto.setColour(colorDto);
		}
		return toDoDto;
	}
}
