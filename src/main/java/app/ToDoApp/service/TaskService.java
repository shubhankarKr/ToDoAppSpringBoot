package app.ToDoApp.service;

import java.util.List;

import app.ToDoApp.modelDTO.ColorCodeDTO;
import app.ToDoApp.modelDTO.ColorUpdateModel;
import app.ToDoApp.modelDTO.ToDoDTO;

public interface TaskService {
	public ToDoDTO addTask(ToDoDTO toDoDTO);
	public List<ToDoDTO> getTasks();
	public ToDoDTO update(ToDoDTO toDoDTO);
	public Boolean delete(int id);
	public List<ToDoDTO> searchByString( String inputString );
	public ToDoDTO getUserById(int id);
	public List<ColorCodeDTO> getColors();
	public Boolean updateColor(ColorUpdateModel colorUpdateModel);
}
