package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IssuedDeviceUpdateRecordRequest
 */
public class IssuedDeviceUpdateRecordRequest   {
  private String updateRecordingRecordType = null;

  private Object updateRecordingRecord = null;

  private String recordingRecordDateTime = null;

  private String empolyeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return updateRecordingRecordType
  **/

  public String getUpdateRecordingRecordType() {
    return updateRecordingRecordType;
  }

  public void setUpdateRecordingRecordType(String updateRecordingRecordType) {
    this.updateRecordingRecordType = updateRecordingRecordType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return updateRecordingRecord
  **/

  public Object getUpdateRecordingRecord() {
    return updateRecordingRecord;
  }

  public void setUpdateRecordingRecord(Object updateRecordingRecord) {
    this.updateRecordingRecord = updateRecordingRecord;
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

