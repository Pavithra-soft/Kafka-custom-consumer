package com.jromanmartin.kafka.streams.model;


import com.jromanmartin.kafka.streams.model.KafkaConsumerResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingEventsResponse extends KafkaConsumerResponse
{
	//~ Instance fields --------------------------
	/**  */
	private String externalService;

	/**  */
	@JsonProperty("body")
	private ResponseBody responseBody;

	/**  */
	@JsonProperty("headers")
	private ResponseHeader responseHeader;

	/**  */
	private String status;

	/**  */
	private String uniqueId;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getExternalService()
	{
		return externalService;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  externalService
	 */
	public void setExternalService(String externalService)
	{
		this.externalService = externalService;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public ResponseBody getResponseBody()
	{
		return responseBody;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  responseBody
	 */
	public void setResponseBody(ResponseBody responseBody)
	{
		this.responseBody = responseBody;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public ResponseHeader getResponseHeader()
	{
		return responseHeader;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  responseHeader
	 */
	public void setResponseHeader(ResponseHeader responseHeader)
	{
		this.responseHeader = responseHeader;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getStatus()
	{
		return status;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  status
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getUniqueId()
	{
		return uniqueId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  uniqueId
	 */
	public void setUniqueId(String uniqueId)
	{
		this.uniqueId = uniqueId;
	}
}
