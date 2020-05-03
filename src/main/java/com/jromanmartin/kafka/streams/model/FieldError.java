package com.jromanmartin.kafka.streams.model;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class FieldError
{
	//~ Instance fields --------------------------
	/**  */
	private String code;

	/**  */
	/**  */
	private String fieldName;

	/**  */
	private String rejectedValue;

	/**  */
	private String userMessage;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getCode()
	{
		return code;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getFieldName()
	{
		return fieldName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  fieldName
	 */
	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getRejectedValue()
	{
		return rejectedValue;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  rejectedValue
	 */
	public void setRejectedValue(String rejectedValue)
	{
		this.rejectedValue = rejectedValue;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getUserMessage()
	{
		return userMessage;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  userMessage
	 */
	public void setUserMessage(String userMessage)
	{
		this.userMessage = userMessage;
	}
}
