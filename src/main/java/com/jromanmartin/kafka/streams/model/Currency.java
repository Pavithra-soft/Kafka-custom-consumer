package com.jromanmartin.kafka.streams.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@JsonInclude(Include.NON_NULL)
public class Currency extends KafkaConsumerResponse implements Serializable
{
	//~ Static fields/initializers ---------------
	/**  */
	@JsonIgnore
	private static final long serialVersionUID = 1336204238402849667L;
	//~ Instance fields --------------------------
	/**  */
	@JsonProperty("code")
	private String code;

	/**  */
	@JsonProperty("id")
	private String id;

	/**  */
	@JsonProperty("name")
	private String name;
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
	public String getId()
	{
		return id;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  id
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}
