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
 * This class is a wrapper for {@link HrAction}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HrAction
 * @generated
 */
@ProviderType
public class HrActionWrapper implements HrAction, ModelWrapper<HrAction> {
	public HrActionWrapper(HrAction hrAction) {
		_hrAction = hrAction;
	}

	@Override
	public Class<?> getModelClass() {
		return HrAction.class;
	}

	@Override
	public String getModelClassName() {
		return HrAction.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("feedbackId", getFeedbackId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("type", getType());
		attributes.put("date", getDate());
		attributes.put("note", getNote());
		attributes.put("feedback", getFeedback());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdUser", getCreatedUser());
		attributes.put("modifiedUser", getModifiedUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long feedbackId = (Long)attributes.get("feedbackId");

		if (feedbackId != null) {
			setFeedbackId(feedbackId);
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

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String feedback = (String)attributes.get("feedback");

		if (feedback != null) {
			setFeedback(feedback);
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
	}

	@Override
	public HrAction toEscapedModel() {
		return new HrActionWrapper(_hrAction.toEscapedModel());
	}

	@Override
	public HrAction toUnescapedModel() {
		return new HrActionWrapper(_hrAction.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _hrAction.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _hrAction.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _hrAction.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _hrAction.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<HrAction> toCacheModel() {
		return _hrAction.toCacheModel();
	}

	@Override
	public int compareTo(HrAction hrAction) {
		return _hrAction.compareTo(hrAction);
	}

	@Override
	public int hashCode() {
		return _hrAction.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hrAction.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HrActionWrapper((HrAction)_hrAction.clone());
	}

	/**
	* Returns the feedback of this hr action.
	*
	* @return the feedback of this hr action
	*/
	@Override
	public java.lang.String getFeedback() {
		return _hrAction.getFeedback();
	}

	/**
	* Returns the note of this hr action.
	*
	* @return the note of this hr action
	*/
	@Override
	public java.lang.String getNote() {
		return _hrAction.getNote();
	}

	/**
	* Returns the type of this hr action.
	*
	* @return the type of this hr action
	*/
	@Override
	public java.lang.String getType() {
		return _hrAction.getType();
	}

	/**
	* Returns the uuid of this hr action.
	*
	* @return the uuid of this hr action
	*/
	@Override
	public java.lang.String getUuid() {
		return _hrAction.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _hrAction.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hrAction.toXmlString();
	}

	/**
	* Returns the create date of this hr action.
	*
	* @return the create date of this hr action
	*/
	@Override
	public Date getCreateDate() {
		return _hrAction.getCreateDate();
	}

	/**
	* Returns the date of this hr action.
	*
	* @return the date of this hr action
	*/
	@Override
	public Date getDate() {
		return _hrAction.getDate();
	}

	/**
	* Returns the modified date of this hr action.
	*
	* @return the modified date of this hr action
	*/
	@Override
	public Date getModifiedDate() {
		return _hrAction.getModifiedDate();
	}

	/**
	* Returns the candidate ID of this hr action.
	*
	* @return the candidate ID of this hr action
	*/
	@Override
	public long getCandidateId() {
		return _hrAction.getCandidateId();
	}

	/**
	* Returns the company ID of this hr action.
	*
	* @return the company ID of this hr action
	*/
	@Override
	public long getCompanyId() {
		return _hrAction.getCompanyId();
	}

	/**
	* Returns the created user of this hr action.
	*
	* @return the created user of this hr action
	*/
	@Override
	public long getCreatedUser() {
		return _hrAction.getCreatedUser();
	}

	/**
	* Returns the feedback ID of this hr action.
	*
	* @return the feedback ID of this hr action
	*/
	@Override
	public long getFeedbackId() {
		return _hrAction.getFeedbackId();
	}

	/**
	* Returns the group ID of this hr action.
	*
	* @return the group ID of this hr action
	*/
	@Override
	public long getGroupId() {
		return _hrAction.getGroupId();
	}

	/**
	* Returns the modified user of this hr action.
	*
	* @return the modified user of this hr action
	*/
	@Override
	public long getModifiedUser() {
		return _hrAction.getModifiedUser();
	}

	/**
	* Returns the primary key of this hr action.
	*
	* @return the primary key of this hr action
	*/
	@Override
	public long getPrimaryKey() {
		return _hrAction.getPrimaryKey();
	}

	@Override
	public void persist() {
		_hrAction.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hrAction.setCachedModel(cachedModel);
	}

	/**
	* Sets the candidate ID of this hr action.
	*
	* @param candidateId the candidate ID of this hr action
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_hrAction.setCandidateId(candidateId);
	}

	/**
	* Sets the company ID of this hr action.
	*
	* @param companyId the company ID of this hr action
	*/
	@Override
	public void setCompanyId(long companyId) {
		_hrAction.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this hr action.
	*
	* @param createDate the create date of this hr action
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_hrAction.setCreateDate(createDate);
	}

	/**
	* Sets the created user of this hr action.
	*
	* @param createdUser the created user of this hr action
	*/
	@Override
	public void setCreatedUser(long createdUser) {
		_hrAction.setCreatedUser(createdUser);
	}

	/**
	* Sets the date of this hr action.
	*
	* @param date the date of this hr action
	*/
	@Override
	public void setDate(Date date) {
		_hrAction.setDate(date);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_hrAction.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_hrAction.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_hrAction.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the feedback of this hr action.
	*
	* @param feedback the feedback of this hr action
	*/
	@Override
	public void setFeedback(java.lang.String feedback) {
		_hrAction.setFeedback(feedback);
	}

	/**
	* Sets the feedback ID of this hr action.
	*
	* @param feedbackId the feedback ID of this hr action
	*/
	@Override
	public void setFeedbackId(long feedbackId) {
		_hrAction.setFeedbackId(feedbackId);
	}

	/**
	* Sets the group ID of this hr action.
	*
	* @param groupId the group ID of this hr action
	*/
	@Override
	public void setGroupId(long groupId) {
		_hrAction.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this hr action.
	*
	* @param modifiedDate the modified date of this hr action
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_hrAction.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the modified user of this hr action.
	*
	* @param modifiedUser the modified user of this hr action
	*/
	@Override
	public void setModifiedUser(long modifiedUser) {
		_hrAction.setModifiedUser(modifiedUser);
	}

	@Override
	public void setNew(boolean n) {
		_hrAction.setNew(n);
	}

	/**
	* Sets the note of this hr action.
	*
	* @param note the note of this hr action
	*/
	@Override
	public void setNote(java.lang.String note) {
		_hrAction.setNote(note);
	}

	/**
	* Sets the primary key of this hr action.
	*
	* @param primaryKey the primary key of this hr action
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_hrAction.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_hrAction.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type of this hr action.
	*
	* @param type the type of this hr action
	*/
	@Override
	public void setType(java.lang.String type) {
		_hrAction.setType(type);
	}

	/**
	* Sets the uuid of this hr action.
	*
	* @param uuid the uuid of this hr action
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_hrAction.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HrActionWrapper)) {
			return false;
		}

		HrActionWrapper hrActionWrapper = (HrActionWrapper)obj;

		if (Objects.equals(_hrAction, hrActionWrapper._hrAction)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _hrAction.getStagedModelType();
	}

	@Override
	public HrAction getWrappedModel() {
		return _hrAction;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _hrAction.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _hrAction.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_hrAction.resetOriginalValues();
	}

	private final HrAction _hrAction;
}