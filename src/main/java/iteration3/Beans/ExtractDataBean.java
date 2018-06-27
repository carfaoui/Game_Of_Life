package iteration3.Beans;

/**
 * 
 * @author chaima_arfaoui
 *
 */

import iteration3.Services.Imp.ExtractDataServicesImpl;

public class ExtractDataBean extends ExtractDataServicesImpl {

	/**
	 * @param sourceFileName
	 */

	private String sourceFileName;
	
	

	public ExtractDataBean() {
		super();
	
	}

	public ExtractDataBean(String sourceFileName) {
		super();
		this.setSourceFileName(sourceFileName);
	}

	public String getSourceFileName() {
		return sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

}
