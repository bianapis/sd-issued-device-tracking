/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class IssuedDeviceTrackingApiController {

	@Autowired
	IssuedDeviceTrackingApiService service;
	
	@BQ("cancellations")
	@Monitor.Record
	public BianResponse<IssuedDeviceCancellationRecordResponse> recordCancellations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<IssuedDeviceCancellationRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordCancellations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Monitor.Record
	public BianResponse<IssuedDeviceUpdateRecordResponse> recordUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<IssuedDeviceUpdateRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.RequestPost
	public BianResponse<IssuedDeviceTrackingServiceWithId> requestPost(@RequestBody BianRequest<IssuedDeviceTrackingServiceWithOutId> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Monitor.RequestPut
	public BianResponse<IssuedDeviceTrackingServiceWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<IssuedDeviceTrackingServiceWithOutId> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cancellations")
	@Monitor.Retrieve
	public BianResponse<IssuedDeviceCancellationWithId> retrieveCancellations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCancellations(crReferenceId, bqReferenceId));
	}
	
	@Monitor.Retrieve
	public BianResponse<RetrieveIssuedDeviceTrackingResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("updates")
	@Monitor.Retrieve
	public BianResponse<IssuedDeviceUpdateWithId> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
}
