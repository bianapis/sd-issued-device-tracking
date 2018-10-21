package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.IssuedDeviceCancellationWithId;
import org.bian.dto.IssuedDeviceTrackingServiceWithId;
import org.bian.dto.IssuedDeviceUpdateWithId;

import javax.validation.Valid;
  
/**
 * RetrieveIssuedDeviceTrackingResponse
 */
public class RetrieveIssuedDeviceTrackingResponse   {
  private IssuedDeviceTrackingServiceWithId trackingService = null;

  private IssuedDeviceCancellationWithId cancellation = null;

  private IssuedDeviceUpdateWithId update = null;


  /**
   * Get trackingService
   * @return trackingService
  **/

  public IssuedDeviceTrackingServiceWithId getTrackingService() {
    return trackingService;
  }

  public void setTrackingService(IssuedDeviceTrackingServiceWithId trackingService) {
    this.trackingService = trackingService;
  }


  /**
   * Get cancellation
   * @return cancellation
  **/

  public IssuedDeviceCancellationWithId getCancellation() {
    return cancellation;
  }

  public void setCancellation(IssuedDeviceCancellationWithId cancellation) {
    this.cancellation = cancellation;
  }


  /**
   * Get update
   * @return update
  **/

  public IssuedDeviceUpdateWithId getUpdate() {
    return update;
  }

  public void setUpdate(IssuedDeviceUpdateWithId update) {
    this.update = update;
  }


}

