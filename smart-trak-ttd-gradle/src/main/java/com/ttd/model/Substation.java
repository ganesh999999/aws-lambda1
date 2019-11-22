package com.ttd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "substation")
public class Substation {
	@Id
private String substationId;
private String substationName;
private int noOfMeters;
private String meterName;
private String generator;
private String transformer;
private String status;
private String sim;
public String getSubstationId() {
	return substationId;
}
public void setSubstationId(String substationId) {
	this.substationId = substationId;
}
public String getSubstationName() {
	return substationName;
}
public void setSubstationName(String substationName) {
	this.substationName = substationName;
}
public int getNoOfMeters() {
	return noOfMeters;
}
public void setNoOfMeters(int noOfMeters) {
	this.noOfMeters = noOfMeters;
}
public String getMeterName() {
	return meterName;
}
public void setMeterName(String meterName) {
	this.meterName = meterName;
}
public String getGenerator() {
	return generator;
}
public void setGenerator(String generator) {
	this.generator = generator;
}
public String getTransformer() {
	return transformer;
}
public void setTransformer(String transformer) {
	this.transformer = transformer;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getSim() {
	return sim;
}
public void setSim(String sim) {
	this.sim = sim;
}
@Override
public String toString() {
	return "Substation [substationId=" + substationId + ", substationName=" + substationName + ", noOfMeters="
			+ noOfMeters + ", meterName=" + meterName + ", generator=" + generator + ", transformer=" + transformer
			+ ", status=" + status + ", sim=" + sim + "]";
}


}
