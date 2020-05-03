package com.jromanmartin.kafka.streams.model;


import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class ErrorResponse
{
	//~ Instance fields --------------------------
	/**  */
	/**  */
	private List<FieldError> fieldsErrors;

	/**  */
	private List<GlobalError> globalErrors;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public List<FieldError> getFieldsErrors()
	{
		return fieldsErrors;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  fieldsErrors
	 */
	public void setFieldsErrors(List<FieldError> fieldsErrors)
	{
		this.fieldsErrors = fieldsErrors;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public List<GlobalError> getGlobalErrors()
	{
		return globalErrors;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  globalErrors
	 */
	public void setGlobalErrors(List<GlobalError> globalErrors)
	{
		this.globalErrors = globalErrors;
	}
}
