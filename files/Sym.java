public class Sym {
	private String type;
	
	public Sym(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return type;
	}
}

// name, return type, list of parameter types
class FnSym {
	private Type returnType;
	private List<Type> parameterTypes;

}

class StructDefSym {

}

class StructSym {

}

