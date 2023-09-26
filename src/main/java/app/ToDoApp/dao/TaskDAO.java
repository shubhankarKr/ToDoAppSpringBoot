package app.ToDoApp.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import app.ToDoApp.modelDTO.ColorCodeDTO;
import app.ToDoApp.modelDTO.ColorUpdateModel;
import app.ToDoApp.modelDTO.ToDoDTO;

public interface TaskDAO {
	public ToDoDTO addTask(ToDoDTO toDoDTO);
	public List<ToDoDTO> getTasks();
	public ToDoDTO update(ToDoDTO toDoDTO);
	public Boolean delete(int id);
	public List<ToDoDTO> searchByString( String inputString );
	public ToDoDTO getUserById(int id);
	public List<ColorCodeDTO> getColors();
	public Boolean updateColor(ColorUpdateModel colorUpdateModel);
}
