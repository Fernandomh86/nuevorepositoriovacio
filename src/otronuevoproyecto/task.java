package otronuevoproyecto;

public class task {
	private String name;
	private String description;
	private String notes;
	private int initialDate;
	private int endDate;
	
	public task() {
		
	}
	public task(String name, String description, String notes, int initialDate, int endDate) {
		super();
		this.name = name;
		this.description = description;
		this.notes = notes;
		this.initialDate = initialDate;
		this.endDate = endDate;
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

	public int getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(int initialDate) {
		this.initialDate = initialDate;
	}

	public int getEndDate() {
		return endDate;
	}

	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}


	public void createTask() {
	}
}

