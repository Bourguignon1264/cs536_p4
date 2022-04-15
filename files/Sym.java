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
	private int parameters;

	public FnSym(String returnType, int parameters) {
		super(returnType);
		this.returnType = returnType;
		this.parameters = parameters;
	}

	public String getReturnType() {
		return returnType;
	}

	public int getParameters() {
		return parameters;
	}

	// public String toString() {
	// 	return "FnSym(" + returnType + ", " + parameters + ")";
	// }
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

