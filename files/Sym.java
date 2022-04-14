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
class FnSym extends Sym{
	private String returnType;
	private List<String> parameterTypes;

	public FnSym(String retType, List<String> paramTypes) {
		super(retType);
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

class StructDefSym extends Sym{
	private SymTable symTable;

	public StructDefSym(SymTable symTable) {
		// TODO is this .toString() correct?
		super(symTable.toString());
		this.symTable = symTable;
	}

	public SymTable getSymTable() {
		return symTable;
	}
}

class StructSym extends Sym{
	private String structType;

	public StructSym(String structType) {
		super(structType);
		this.structType = structType;
	}

	public String getStructType() {
		return this.structType;
	}
}

