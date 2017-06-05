package reportBuilder;

public class FormatFields {

private String affix;
//This method enforces max length on a field
public String formatField(String fieldName, int length, String type) {
	 affix = "";
	 type = type.toUpperCase();
	if("AN".equals(type)){
		affix="-";
	}
	else if ("ZA".equals(type)){
		affix = "";
	}
	
	return String.format("%1$"+affix+length+"s",fieldName).substring(0,Math.min(String.format("%1$"+length+"s", fieldName).length(),length));
}

}
