package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceCancellationRecordResponse
 */
public class IssuedDeviceCancellationRecordResponse   {
  private Object cancellationRecordingRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return cancellationRecordingRecordReference
  **/

  public Object getCancellationRecordingRecordReference() {
    return cancellationRecordingRecordReference;
  }

  public void setCancellationRecordingRecordReference(Object cancellationRecordingRecordReference) {
    this.cancellationRecordingRecordReference = cancellationRecordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

