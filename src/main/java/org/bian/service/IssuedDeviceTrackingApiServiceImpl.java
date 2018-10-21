/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class IssuedDeviceTrackingApiServiceImpl implements IssuedDeviceTrackingApiService {

	public IssuedDeviceCancellationRecordResponse recordCancellations(String crReferenceId, String bqReferenceId, IssuedDeviceCancellationRecordRequest request){
		return JsonReader.read("record-IssuedDeviceCancellationRecordResponse.json",new TypeReference<IssuedDeviceCancellationRecordResponse>(){});
	}
	
	public IssuedDeviceUpdateRecordResponse recordUpdates(String crReferenceId, String bqReferenceId, IssuedDeviceUpdateRecordRequest request){
		return JsonReader.read("record-IssuedDeviceUpdateRecordResponse.json",new TypeReference<IssuedDeviceUpdateRecordResponse>(){});
	}
	
	public IssuedDeviceTrackingServiceWithId requestPost(IssuedDeviceTrackingServiceWithOutId request){
		return JsonReader.read("requestPost-IssuedDeviceTrackingServiceWithId.json",new TypeReference<IssuedDeviceTrackingServiceWithId>(){});
	}
	
	public IssuedDeviceTrackingServiceWithId requestPut(String crReferenceId, IssuedDeviceTrackingServiceWithOutId request){
		return JsonReader.read("requestPut-IssuedDeviceTrackingServiceWithId.json",new TypeReference<IssuedDeviceTrackingServiceWithId>(){});
	}
	
	public IssuedDeviceCancellationWithId retrieveCancellations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceCancellationWithId.json",new TypeReference<IssuedDeviceCancellationWithId>(){});
	}
	
	public RetrieveIssuedDeviceTrackingResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveIssuedDeviceTrackingResponse.json",new TypeReference<RetrieveIssuedDeviceTrackingResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public IssuedDeviceUpdateWithId retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssuedDeviceUpdateWithId.json",new TypeReference<IssuedDeviceUpdateWithId>(){});
	}
	
}
