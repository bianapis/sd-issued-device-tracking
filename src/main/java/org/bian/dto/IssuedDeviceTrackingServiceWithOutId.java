package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceTrackingServiceWithOutId
 */
public class IssuedDeviceTrackingServiceWithOutId   {
  private String trackingServiceSchedule = null;

  private Object trackingServiceReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime      
   * @return trackingServiceSchedule
  **/

  public String getTrackingServiceSchedule() {
    return trackingServiceSchedule;
  }

  public void setTrackingServiceSchedule(String trackingServiceSchedule) {
    this.trackingServiceSchedule = trackingServiceSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary      
   * @return trackingServiceReport
  **/

  public Object getTrackingServiceReport() {
    return trackingServiceReport;
  }

  public void setTrackingServiceReport(Object trackingServiceReport) {
    this.trackingServiceReport = trackingServiceReport;
  }


}

