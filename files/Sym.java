import java.util.*;

public class Sym {
	private String type;

	public Sym(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	// for testing
	public String toString() {
		return type;
	}
}

// name, return type, list of parameter types
class FnSym {
	private String returnType;
	private List<String> parameterTypes;

	public FnSym(String retType, List<String> paramTypes) {
		this.returnType = retType;
		this.parameterTypes = paramTypes;
	}

	public String getReturnType() {
		return returnType;
	}

	public List<String> getParameterTypes() {
		return parameterTypes;
	}

	public void addParameters(List<String> paramTypes) {
		this.parameterTypes.addAll(paramTypes);
	}

	// for testing
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(returnType);
		sb.append("(");
		for (String paramType : parameterTypes) {
			sb.append(paramType);
			sb.append(", ");
		}
		sb.append(")");
		return sb.toString();
	}
}

class StructDefSym {

}

class StructSym {

}

