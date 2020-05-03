package com.jromanmartin.kafka.streams.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class RecordHeaders
{
	//~ Instance fields --------------------------
	/**  */
	/**  */
	
	private String awbMessageId;

	/**  */
	private String customer;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	
	public String getAwbMessageId()
	{
		return awbMessageId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  awbMessageId
	 */
	public void setAwbMessageId(String awbMessageId)
	{
		this.awbMessageId = awbMessageId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getCustomer()
	{
		return customer;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  customer
	 */
	public void setCustomer(String customer)
	{
		this.customer = customer;
	}
}
