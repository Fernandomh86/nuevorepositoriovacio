package otronuevoproyecto;

public class Task {
	private String name;
	private String description;
	private String notes;
	private String initialDate;
	private String endDate;
	private String username;
	
	public Task() {
		
	}
	public Task(String name, String description, String notes, String initialDate, String endDate, String username) {
		super();
		this.name = name;
		this.description = description;
		this.notes = notes;
		this.initialDate = initialDate;
		this.endDate = endDate;
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void createTask() {
	}
	
}

