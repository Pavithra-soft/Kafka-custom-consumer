package com.jromanmartin.kafka.streams.model;


import java.io.Serializable;


/**
 * Scheduler Task MQ Advanced Configuration IData.
 *
 * @version  CSP 14.8
 */
public class KafkaConsumerParam implements Serializable
{
	//~ Instance fields --------------------------
	/** //~ Static fields/initializers --------------- */
	/*  */
	/** The Consumer Event Name */
	private String consumerEventName;

	/**  */
	private Class cosumerPojo;

	/**  */
	private String customerName;

	/** The group id. */
	private String groupId;

	/** The server Url */
	private String kafkaUrl;

	/** The record count */
	private int recordCount;

	/** The scheduler Kafka config seq. */
	private int schedulerKafkaConfigSeq;

	/** The Topic */
	private String topic;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getCustomerName()
	{
		return customerName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  customerName
	 */
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public Class getCosumerPojo()
	{
		return cosumerPojo;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  cosumerPojo
	 */
	public void setCosumerPojo(Class cosumerPojo)
	{
		this.cosumerPojo = cosumerPojo;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getConsumerEventName()
	{
		return consumerEventName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  consumerEventName
	 */
	public void setConsumerEventName(String consumerEventName)
	{
		this.consumerEventName = consumerEventName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getGroupId()
	{
		return groupId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  groupId
	 */
	public void setGroupId(String groupId)
	{
		this.groupId = groupId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getKafkaUrl()
	{
		return kafkaUrl;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  kafkaUrl
	 */
	public void setKafkaUrl(String kafkaUrl)
	{
		this.kafkaUrl = kafkaUrl;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public int getRecordCount()
	{
		return recordCount;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  recordCount
	 */
	public void setRecordCount(int recordCount)
	{
		this.recordCount = recordCount;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public int getSchedulerKafkaConfigSeq()
	{
		return schedulerKafkaConfigSeq;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  schedulerKafkaConfigSeq
	 */
	public void setSchedulerKafkaConfigSeq(int schedulerKafkaConfigSeq)
	{
		this.schedulerKafkaConfigSeq = schedulerKafkaConfigSeq;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getTopic()
	{
		return topic;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  topic
	 */
	public void setTopic(String topic)
	{
		this.topic = topic;
	}
}
