package com.jromanmartin.kafka.streams.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingEventsResponses extends KafkaConsumerResponse
{
	//~ Instance fields --------------------------
	/**  */
	@JsonProperty("responseList")
	private List<BookingEventsResponse> bookingEventsResponse;

	/**  */
	
	public List<BookingEventsResponse> getBookingEventsResponse()
	{
		return bookingEventsResponse;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  bookingEventsResponse
	 */
	public void setBookingEventsResponse(List<BookingEventsResponse> bookingEventsResponse)
	{
		this.bookingEventsResponse = bookingEventsResponse;
	}
}
