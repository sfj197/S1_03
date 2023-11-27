package n1ejercicio1;

public class Month {

	private String name;

	public Month(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return  this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Month) {
			//Casting.
			Month month = (Month)obj;
			
			if(this.name.equalsIgnoreCase(month.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
