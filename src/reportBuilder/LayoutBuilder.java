package reportBuilder;

public class LayoutBuilder {
private int recordLength;

public LayoutBuilder(int recordLength) {
	super();
	this.recordLength = recordLength;
}
public LayoutBuilder(){
	
}
public int getRecordLength() {
	return recordLength;
}
public void setRecordLength(int recordLength) {
	this.recordLength = recordLength;
}



}
