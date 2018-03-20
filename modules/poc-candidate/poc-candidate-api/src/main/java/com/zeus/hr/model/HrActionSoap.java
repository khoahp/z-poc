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
public class HrActionSoap implements Serializable {
	public static HrActionSoap toSoapModel(HrAction model) {
		HrActionSoap soapModel = new HrActionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFeedbackId(model.getFeedbackId());
		soapModel.setCandidateId(model.getCandidateId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setType(model.getType());
		soapModel.setDate(model.getDate());
		soapModel.setNote(model.getNote());
		soapModel.setFeedback(model.getFeedback());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreatedUser(model.getCreatedUser());
		soapModel.setModifiedUser(model.getModifiedUser());

		return soapModel;
	}

	public static HrActionSoap[] toSoapModels(HrAction[] models) {
		HrActionSoap[] soapModels = new HrActionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HrActionSoap[][] toSoapModels(HrAction[][] models) {
		HrActionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HrActionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HrActionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HrActionSoap[] toSoapModels(List<HrAction> models) {
		List<HrActionSoap> soapModels = new ArrayList<HrActionSoap>(models.size());

		for (HrAction model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HrActionSoap[soapModels.size()]);
	}

	public HrActionSoap() {
	}

	public long getPrimaryKey() {
		return _feedbackId;
	}

	public void setPrimaryKey(long pk) {
		setFeedbackId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFeedbackId() {
		return _feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		_feedbackId = feedbackId;
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

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getFeedback() {
		return _feedback;
	}

	public void setFeedback(String feedback) {
		_feedback = feedback;
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

	private String _uuid;
	private long _feedbackId;
	private long _candidateId;
	private long _companyId;
	private long _groupId;
	private String _type;
	private Date _date;
	private String _note;
	private String _feedback;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createdUser;
	private long _modifiedUser;
}