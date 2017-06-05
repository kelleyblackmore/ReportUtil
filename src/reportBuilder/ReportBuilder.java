package reportBuilder;

public class ReportBuilder {
private	String DDFileName;
private String FileName;
private String LocalPath;

public ReportBuilder(String dDFileName) {
	super();
	DDFileName = dDFileName;
}

public ReportBuilder(String fileName, String localPath) {
	super();
	FileName = fileName;
	LocalPath = localPath;
}

public String getLocalPath() {
	return LocalPath;
}

public void setLocalPath(String localPath) {
	LocalPath = localPath;
}

public ReportBuilder() {
	super();
}

public String getDDFileName() {
	return DDFileName;
}
public void setDDFileName(String dDFileName) {
	DDFileName = dDFileName;
}
public String getFileName() {
	return FileName;
}
public void setFileName(String fileName) {
	FileName = fileName;
}


	
	
}
