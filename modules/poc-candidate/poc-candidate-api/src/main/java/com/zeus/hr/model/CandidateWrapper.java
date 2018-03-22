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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Candidate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Candidate
 * @generated
 */
@ProviderType
public class CandidateWrapper implements Candidate, ModelWrapper<Candidate> {
	public CandidateWrapper(Candidate candidate) {
		_candidate = candidate;
	}

	@Override
	public Class<?> getModelClass() {
		return Candidate.class;
	}

	@Override
	public String getModelClassName() {
		return Candidate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("candidateId", getCandidateId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("mobilePhone", getMobilePhone());
		attributes.put("email", getEmail());
		attributes.put("city", getCity());
		attributes.put("appliedFor", getAppliedFor());
		attributes.put("note", getNote());
		attributes.put("skills", getSkills());
		attributes.put("source", getSource());
		attributes.put("internalId", getInternalId());
		attributes.put("receivedDate", getReceivedDate());
		attributes.put("internalNote", getInternalNote());
		attributes.put("internalDetails", getInternalDetails());
		attributes.put("attachment", getAttachment());
		attributes.put("rating", getRating());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdUser", getCreatedUser());
		attributes.put("modifiedUser", getModifiedUser());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String mobilePhone = (String)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long city = (Long)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String appliedFor = (String)attributes.get("appliedFor");

		if (appliedFor != null) {
			setAppliedFor(appliedFor);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String skills = (String)attributes.get("skills");

		if (skills != null) {
			setSkills(skills);
		}

		String source = (String)attributes.get("source");

		if (source != null) {
			setSource(source);
		}

		String internalId = (String)attributes.get("internalId");

		if (internalId != null) {
			setInternalId(internalId);
		}

		Date receivedDate = (Date)attributes.get("receivedDate");

		if (receivedDate != null) {
			setReceivedDate(receivedDate);
		}

		String internalNote = (String)attributes.get("internalNote");

		if (internalNote != null) {
			setInternalNote(internalNote);
		}

		String internalDetails = (String)attributes.get("internalDetails");

		if (internalDetails != null) {
			setInternalDetails(internalDetails);
		}

		String attachment = (String)attributes.get("attachment");

		if (attachment != null) {
			setAttachment(attachment);
		}

		Integer rating = (Integer)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createdUser = (Long)attributes.get("createdUser");

		if (createdUser != null) {
			setCreatedUser(createdUser);
		}

		Long modifiedUser = (Long)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Candidate toEscapedModel() {
		return new CandidateWrapper(_candidate.toEscapedModel());
	}

	@Override
	public Candidate toUnescapedModel() {
		return new CandidateWrapper(_candidate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _candidate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _candidate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _candidate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _candidate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Candidate> toCacheModel() {
		return _candidate.toCacheModel();
	}

	@Override
	public int compareTo(Candidate candidate) {
		return _candidate.compareTo(candidate);
	}

	/**
	* Returns the rating of this candidate.
	*
	* @return the rating of this candidate
	*/
	@Override
	public int getRating() {
		return _candidate.getRating();
	}

	/**
	* Returns the status of this candidate.
	*
	* @return the status of this candidate
	*/
	@Override
	public int getStatus() {
		return _candidate.getStatus();
	}

	@Override
	public int hashCode() {
		return _candidate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CandidateWrapper((Candidate)_candidate.clone());
	}

	/**
	* Returns the applied for of this candidate.
	*
	* @return the applied for of this candidate
	*/
	@Override
	public java.lang.String getAppliedFor() {
		return _candidate.getAppliedFor();
	}

	/**
	* Returns the attachment of this candidate.
	*
	* @return the attachment of this candidate
	*/
	@Override
	public java.lang.String getAttachment() {
		return _candidate.getAttachment();
	}

	/**
	* Returns the email of this candidate.
	*
	* @return the email of this candidate
	*/
	@Override
	public java.lang.String getEmail() {
		return _candidate.getEmail();
	}

	/**
	* Returns the first name of this candidate.
	*
	* @return the first name of this candidate
	*/
	@Override
	public java.lang.String getFirstName() {
		return _candidate.getFirstName();
	}

	/**
	* Returns the internal details of this candidate.
	*
	* @return the internal details of this candidate
	*/
	@Override
	public java.lang.String getInternalDetails() {
		return _candidate.getInternalDetails();
	}

	/**
	* Returns the internal ID of this candidate.
	*
	* @return the internal ID of this candidate
	*/
	@Override
	public java.lang.String getInternalId() {
		return _candidate.getInternalId();
	}

	/**
	* Returns the internal note of this candidate.
	*
	* @return the internal note of this candidate
	*/
	@Override
	public java.lang.String getInternalNote() {
		return _candidate.getInternalNote();
	}

	/**
	* Returns the last name of this candidate.
	*
	* @return the last name of this candidate
	*/
	@Override
	public java.lang.String getLastName() {
		return _candidate.getLastName();
	}

	/**
	* Returns the mobile phone of this candidate.
	*
	* @return the mobile phone of this candidate
	*/
	@Override
	public java.lang.String getMobilePhone() {
		return _candidate.getMobilePhone();
	}

	/**
	* Returns the note of this candidate.
	*
	* @return the note of this candidate
	*/
	@Override
	public java.lang.String getNote() {
		return _candidate.getNote();
	}

	/**
	* Returns the skills of this candidate.
	*
	* @return the skills of this candidate
	*/
	@Override
	public java.lang.String getSkills() {
		return _candidate.getSkills();
	}

	/**
	* Returns the source of this candidate.
	*
	* @return the source of this candidate
	*/
	@Override
	public java.lang.String getSource() {
		return _candidate.getSource();
	}

	/**
	* Returns the uuid of this candidate.
	*
	* @return the uuid of this candidate
	*/
	@Override
	public java.lang.String getUuid() {
		return _candidate.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _candidate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _candidate.toXmlString();
	}

	/**
	* Returns the create date of this candidate.
	*
	* @return the create date of this candidate
	*/
	@Override
	public Date getCreateDate() {
		return _candidate.getCreateDate();
	}

	/**
	* Returns the date of birth of this candidate.
	*
	* @return the date of birth of this candidate
	*/
	@Override
	public Date getDateOfBirth() {
		return _candidate.getDateOfBirth();
	}

	/**
	* Returns the modified date of this candidate.
	*
	* @return the modified date of this candidate
	*/
	@Override
	public Date getModifiedDate() {
		return _candidate.getModifiedDate();
	}

	/**
	* Returns the received date of this candidate.
	*
	* @return the received date of this candidate
	*/
	@Override
	public Date getReceivedDate() {
		return _candidate.getReceivedDate();
	}

	/**
	* Returns the candidate ID of this candidate.
	*
	* @return the candidate ID of this candidate
	*/
	@Override
	public long getCandidateId() {
		return _candidate.getCandidateId();
	}

	/**
	* Returns the city of this candidate.
	*
	* @return the city of this candidate
	*/
	@Override
	public long getCity() {
		return _candidate.getCity();
	}

	/**
	* Returns the company ID of this candidate.
	*
	* @return the company ID of this candidate
	*/
	@Override
	public long getCompanyId() {
		return _candidate.getCompanyId();
	}

	/**
	* Returns the created user of this candidate.
	*
	* @return the created user of this candidate
	*/
	@Override
	public long getCreatedUser() {
		return _candidate.getCreatedUser();
	}

	/**
	* Returns the group ID of this candidate.
	*
	* @return the group ID of this candidate
	*/
	@Override
	public long getGroupId() {
		return _candidate.getGroupId();
	}

	/**
	* Returns the modified user of this candidate.
	*
	* @return the modified user of this candidate
	*/
	@Override
	public long getModifiedUser() {
		return _candidate.getModifiedUser();
	}

	/**
	* Returns the primary key of this candidate.
	*
	* @return the primary key of this candidate
	*/
	@Override
	public long getPrimaryKey() {
		return _candidate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_candidate.persist();
	}

	/**
	* Sets the applied for of this candidate.
	*
	* @param appliedFor the applied for of this candidate
	*/
	@Override
	public void setAppliedFor(java.lang.String appliedFor) {
		_candidate.setAppliedFor(appliedFor);
	}

	/**
	* Sets the attachment of this candidate.
	*
	* @param attachment the attachment of this candidate
	*/
	@Override
	public void setAttachment(java.lang.String attachment) {
		_candidate.setAttachment(attachment);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_candidate.setCachedModel(cachedModel);
	}

	/**
	* Sets the candidate ID of this candidate.
	*
	* @param candidateId the candidate ID of this candidate
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_candidate.setCandidateId(candidateId);
	}

	/**
	* Sets the city of this candidate.
	*
	* @param city the city of this candidate
	*/
	@Override
	public void setCity(long city) {
		_candidate.setCity(city);
	}

	/**
	* Sets the company ID of this candidate.
	*
	* @param companyId the company ID of this candidate
	*/
	@Override
	public void setCompanyId(long companyId) {
		_candidate.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this candidate.
	*
	* @param createDate the create date of this candidate
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_candidate.setCreateDate(createDate);
	}

	/**
	* Sets the created user of this candidate.
	*
	* @param createdUser the created user of this candidate
	*/
	@Override
	public void setCreatedUser(long createdUser) {
		_candidate.setCreatedUser(createdUser);
	}

	/**
	* Sets the date of birth of this candidate.
	*
	* @param dateOfBirth the date of birth of this candidate
	*/
	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_candidate.setDateOfBirth(dateOfBirth);
	}

	/**
	* Sets the email of this candidate.
	*
	* @param email the email of this candidate
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_candidate.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_candidate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_candidate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_candidate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first name of this candidate.
	*
	* @param firstName the first name of this candidate
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_candidate.setFirstName(firstName);
	}

	/**
	* Sets the group ID of this candidate.
	*
	* @param groupId the group ID of this candidate
	*/
	@Override
	public void setGroupId(long groupId) {
		_candidate.setGroupId(groupId);
	}

	/**
	* Sets the internal details of this candidate.
	*
	* @param internalDetails the internal details of this candidate
	*/
	@Override
	public void setInternalDetails(java.lang.String internalDetails) {
		_candidate.setInternalDetails(internalDetails);
	}

	/**
	* Sets the internal ID of this candidate.
	*
	* @param internalId the internal ID of this candidate
	*/
	@Override
	public void setInternalId(java.lang.String internalId) {
		_candidate.setInternalId(internalId);
	}

	/**
	* Sets the internal note of this candidate.
	*
	* @param internalNote the internal note of this candidate
	*/
	@Override
	public void setInternalNote(java.lang.String internalNote) {
		_candidate.setInternalNote(internalNote);
	}

	/**
	* Sets the last name of this candidate.
	*
	* @param lastName the last name of this candidate
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_candidate.setLastName(lastName);
	}

	/**
	* Sets the mobile phone of this candidate.
	*
	* @param mobilePhone the mobile phone of this candidate
	*/
	@Override
	public void setMobilePhone(java.lang.String mobilePhone) {
		_candidate.setMobilePhone(mobilePhone);
	}

	/**
	* Sets the modified date of this candidate.
	*
	* @param modifiedDate the modified date of this candidate
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_candidate.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the modified user of this candidate.
	*
	* @param modifiedUser the modified user of this candidate
	*/
	@Override
	public void setModifiedUser(long modifiedUser) {
		_candidate.setModifiedUser(modifiedUser);
	}

	@Override
	public void setNew(boolean n) {
		_candidate.setNew(n);
	}

	/**
	* Sets the note of this candidate.
	*
	* @param note the note of this candidate
	*/
	@Override
	public void setNote(java.lang.String note) {
		_candidate.setNote(note);
	}

	/**
	* Sets the primary key of this candidate.
	*
	* @param primaryKey the primary key of this candidate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_candidate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_candidate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rating of this candidate.
	*
	* @param rating the rating of this candidate
	*/
	@Override
	public void setRating(int rating) {
		_candidate.setRating(rating);
	}

	/**
	* Sets the received date of this candidate.
	*
	* @param receivedDate the received date of this candidate
	*/
	@Override
	public void setReceivedDate(Date receivedDate) {
		_candidate.setReceivedDate(receivedDate);
	}

	/**
	* Sets the skills of this candidate.
	*
	* @param skills the skills of this candidate
	*/
	@Override
	public void setSkills(java.lang.String skills) {
		_candidate.setSkills(skills);
	}

	/**
	* Sets the source of this candidate.
	*
	* @param source the source of this candidate
	*/
	@Override
	public void setSource(java.lang.String source) {
		_candidate.setSource(source);
	}

	/**
	* Sets the status of this candidate.
	*
	* @param status the status of this candidate
	*/
	@Override
	public void setStatus(int status) {
		_candidate.setStatus(status);
	}

	/**
	* Sets the uuid of this candidate.
	*
	* @param uuid the uuid of this candidate
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_candidate.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateWrapper)) {
			return false;
		}

		CandidateWrapper candidateWrapper = (CandidateWrapper)obj;

		if (Objects.equals(_candidate, candidateWrapper._candidate)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _candidate.getStagedModelType();
	}

	@Override
	public Candidate getWrappedModel() {
		return _candidate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _candidate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _candidate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_candidate.resetOriginalValues();
	}

	private final Candidate _candidate;
}