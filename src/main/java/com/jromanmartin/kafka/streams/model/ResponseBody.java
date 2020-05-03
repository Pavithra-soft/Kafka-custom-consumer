package com.jromanmartin.kafka.streams.model;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class ResponseBody
{
	//~ Instance fields --------------------------
	/**  */
	@JsonProperty("errors")
	private ErrorResponse errorResponse;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public ErrorResponse getErrorResponse()
	{
		return errorResponse;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  errorResponse
	 */
	public void setErrorResponse(ErrorResponse errorResponse)
	{
		this.errorResponse = errorResponse;
	}
}
