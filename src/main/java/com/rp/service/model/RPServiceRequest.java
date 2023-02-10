/**
 * 
 */
package com.rp.service.model;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * This class is DTO and will be used as request coming from UI
 *
 */

@Setter
@Getter
@ToString
public class RPServiceRequest {
	
	/**
	 * The to Date entered from UI 
	 */
	@NotNull(message="@toDate : must not be null")
	private String toDate;
	
	/**
	 * The from Date entered from UI 
	 */
	@NotNull(message="@fromDate : must not be null")
	private String fromDate;
	
}
