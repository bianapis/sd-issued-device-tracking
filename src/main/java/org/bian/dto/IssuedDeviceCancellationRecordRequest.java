package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceCancellationRecordRequest
 */
public class IssuedDeviceCancellationRecordRequest   {
  private String cancellationRecordingRecordType = null;

  private Object cancellationRecordingRecord = null;

  private String recordingRecordDateTime = null;

  private String empolyeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return cancellationRecordingRecordType
  **/

  public String getCancellationRecordingRecordType() {
    return cancellationRecordingRecordType;
  }

  public void setCancellationRecordingRecordType(String cancellationRecordingRecordType) {
    this.cancellationRecordingRecordType = cancellationRecordingRecordType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return cancellationRecordingRecord
  **/

  public Object getCancellationRecordingRecord() {
    return cancellationRecordingRecord;
  }

  public void setCancellationRecordingRecord(Object cancellationRecordingRecord) {
    this.cancellationRecordingRecord = cancellationRecordingRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime     
   * @return recordingRecordDateTime
  **/

  public String getRecordingRecordDateTime() {
    return recordingRecordDateTime;
  }

  public void setRecordingRecordDateTime(String recordingRecordDateTime) {
    this.recordingRecordDateTime = recordingRecordDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return empolyeeBusinessUnitReference
  **/

  public String getEmpolyeeBusinessUnitReference() {
    return empolyeeBusinessUnitReference;
  }

  public void setEmpolyeeBusinessUnitReference(String empolyeeBusinessUnitReference) {
    this.empolyeeBusinessUnitReference = empolyeeBusinessUnitReference;
  }


}

