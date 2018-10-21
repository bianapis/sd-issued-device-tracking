package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceTrackingServiceWithId
 */
public class IssuedDeviceTrackingServiceWithId   {
  private String trackingServiceSessionReference = null;

  private String trackingServiceSchedule = null;

  private String trackingServiceReportReference = null;

  private Object trackingServiceReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return trackingServiceSessionReference
  **/

  public String getTrackingServiceSessionReference() {
    return trackingServiceSessionReference;
  }

  public void setTrackingServiceSessionReference(String trackingServiceSessionReference) {
    this.trackingServiceSessionReference = trackingServiceSessionReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return trackingServiceReportReference
  **/

  public String getTrackingServiceReportReference() {
    return trackingServiceReportReference;
  }

  public void setTrackingServiceReportReference(String trackingServiceReportReference) {
    this.trackingServiceReportReference = trackingServiceReportReference;
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

