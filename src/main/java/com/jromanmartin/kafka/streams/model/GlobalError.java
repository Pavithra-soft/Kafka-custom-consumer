package com.jromanmartin.kafka.streams.model;


import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class GlobalError
{
	//~ Instance fields --------------------------
	/**  */
	private String code;

	/**  */
	private List<String> fields;

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
	public List<String> getFields()
	{
		return fields;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  fields
	 */
	public void setFields(List<String> fields)
	{
		this.fields = fields;
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
