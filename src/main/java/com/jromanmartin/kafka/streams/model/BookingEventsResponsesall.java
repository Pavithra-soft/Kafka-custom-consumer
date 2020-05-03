package com.jromanmartin.kafka.streams.model;


import com.jromanmartin.kafka.streams.model.KafkaConsumerResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingEventsResponsesall extends KafkaConsumerResponse
{
	//~ Instance fields --------------------------
	/**  */
	@JsonProperty("payload")
	private BookingEventsResponses bookingEventsResponses;

	/**  */
	@JsonProperty("header")
	private RecordHeaders recordHeaders;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public BookingEventsResponses getBookingEventsResponses()
	{
		return bookingEventsResponses;
	}
	
	public RecordHeaders getRecordHeaders() {
		return recordHeaders;
	}

	public void setRecordHeaders(RecordHeaders recordHeaders) {
		this.recordHeaders = recordHeaders;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param  bookingEventsResponse
	 */
	public void setBookingEventsResponse(BookingEventsResponses bookingEventsResponses)
	{
		this.bookingEventsResponses = bookingEventsResponses;
	}
}
