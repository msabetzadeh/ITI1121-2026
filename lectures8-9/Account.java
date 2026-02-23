public class Account {
	private int id;
	private String name;
	
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object o) {

		boolean result = true;
		
		if (o == null) {
			result = false;
		} else if (this.getClass() != o.getClass()) {
			result = false;
		} else {
			Account other = (Account) o;
			
			if (this.id != other.id) {
				result = false;
			} else if (this.name == null && other.name != null) {
				result = false;
			} else if (this.name != null && !this.name.equals(other.name)) {
				result = false;
			}
		}

		return result;
	}
}