/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.zeus.hr.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CandidateSoap implements Serializable {
	public static CandidateSoap toSoapModel(Candidate model) {
		CandidateSoap soapModel = new CandidateSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCandidateId(model.getCandidateId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setMobilePhone(model.getMobilePhone());
		soapModel.setEmail(model.getEmail());
		soapModel.setCity(model.getCity());
		soapModel.setAppliedFor(model.getAppliedFor());
		soapModel.setNote(model.getNote());
		soapModel.setSkills(model.getSkills());
		soapModel.setSource(model.getSource());
		soapModel.setInternalId(model.getInternalId());
		soapModel.setReceivedDate(model.getReceivedDate());
		soapModel.setInternalNote(model.getInternalNote());
		soapModel.setInternalDetails(model.getInternalDetails());
		soapModel.setAttachment(model.getAttachment());
		soapModel.setRating(model.getRating());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreatedUser(model.getCreatedUser());
		soapModel.setModifiedUser(model.getModifiedUser());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CandidateSoap[] toSoapModels(Candidate[] models) {
		CandidateSoap[] soapModels = new CandidateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CandidateSoap[][] toSoapModels(Candidate[][] models) {
		CandidateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CandidateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CandidateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CandidateSoap[] toSoapModels(List<Candidate> models) {
		List<CandidateSoap> soapModels = new ArrayList<CandidateSoap>(models.size());

		for (Candidate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CandidateSoap[soapModels.size()]);
	}

	public CandidateSoap() {
	}

	public long getPrimaryKey() {
		return _candidateId;
	}

	public void setPrimaryKey(long pk) {
		setCandidateId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCandidateId() {
		return _candidateId;
	}

	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public String getMobilePhone() {
		return _mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		_mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getCity() {
		return _city;
	}

	public void setCity(long city) {
		_city = city;
	}

	public String getAppliedFor() {
		return _appliedFor;
	}

	public void setAppliedFor(String appliedFor) {
		_appliedFor = appliedFor;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getSkills() {
		return _skills;
	}

	public void setSkills(String skills) {
		_skills = skills;
	}

	public String getSource() {
		return _source;
	}

	public void setSource(String source) {
		_source = source;
	}

	public String getInternalId() {
		return _internalId;
	}

	public void setInternalId(String internalId) {
		_internalId = internalId;
	}

	public Date getReceivedDate() {
		return _receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		_receivedDate = receivedDate;
	}

	public String getInternalNote() {
		return _internalNote;
	}

	public void setInternalNote(String internalNote) {
		_internalNote = internalNote;
	}

	public String getInternalDetails() {
		return _internalDetails;
	}

	public void setInternalDetails(String internalDetails) {
		_internalDetails = internalDetails;
	}

	public String getAttachment() {
		return _attachment;
	}

	public void setAttachment(String attachment) {
		_attachment = attachment;
	}

	public int getRating() {
		return _rating;
	}

	public void setRating(int rating) {
		_rating = rating;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCreatedUser() {
		return _createdUser;
	}

	public void setCreatedUser(long createdUser) {
		_createdUser = createdUser;
	}

	public long getModifiedUser() {
		return _modifiedUser;
	}

	public void setModifiedUser(long modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private String _uuid;
	private long _candidateId;
	private long _companyId;
	private long _groupId;
	private String _firstName;
	private String _lastName;
	private Date _dateOfBirth;
	private String _mobilePhone;
	private String _email;
	private long _city;
	private String _appliedFor;
	private String _note;
	private String _skills;
	private String _source;
	private String _internalId;
	private Date _receivedDate;
	private String _internalNote;
	private String _internalDetails;
	private String _attachment;
	private int _rating;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createdUser;
	private long _modifiedUser;
	private int _status;
}