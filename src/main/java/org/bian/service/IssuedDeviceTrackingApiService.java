/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface IssuedDeviceTrackingApiService {

	IssuedDeviceCancellationRecordResponse recordCancellations(String crReferenceId, String bqReferenceId, IssuedDeviceCancellationRecordRequest request);
	
	IssuedDeviceUpdateRecordResponse recordUpdates(String crReferenceId, String bqReferenceId, IssuedDeviceUpdateRecordRequest request);
	
	IssuedDeviceTrackingServiceWithId requestPost(IssuedDeviceTrackingServiceWithOutId request);
	
	IssuedDeviceTrackingServiceWithId requestPut(String crReferenceId, IssuedDeviceTrackingServiceWithOutId request);
	
	IssuedDeviceCancellationWithId retrieveCancellations(String crReferenceId, String bqReferenceId);
	
	RetrieveIssuedDeviceTrackingResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	IssuedDeviceUpdateWithId retrieveUpdates(String crReferenceId, String bqReferenceId);
	
}
