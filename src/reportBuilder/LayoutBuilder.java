package reportBuilder;

public class LayoutBuilder {
private int recordLength;

private String line;


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
public void setLine(String fieldname1, String fieldname2, String fieldname3, String fieldname4, String fieldname5) {
	line = fieldname1+fieldname2+fieldname3+fieldname4+fieldname5;

}
public void setLine(String fieldname1, String fieldname2, String fieldname3, String fieldname4) {
	line = fieldname1+fieldname2+fieldname3+fieldname4;

}




public String getLine() {
	return line;
}




}
