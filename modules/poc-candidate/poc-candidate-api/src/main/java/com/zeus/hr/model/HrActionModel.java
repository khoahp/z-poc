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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HrAction service. Represents a row in the &quot;zhr_HrAction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.zeus.hr.model.impl.HrActionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.zeus.hr.model.impl.HrActionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HrAction
 * @see com.zeus.hr.model.impl.HrActionImpl
 * @see com.zeus.hr.model.impl.HrActionModelImpl
 * @generated
 */
@ProviderType
public interface HrActionModel extends BaseModel<HrAction>, ShardedModel,
	StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a hr action model instance should use the {@link HrAction} interface instead.
	 */

	/**
	 * Returns the primary key of this hr action.
	 *
	 * @return the primary key of this hr action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this hr action.
	 *
	 * @param primaryKey the primary key of this hr action
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this hr action.
	 *
	 * @return the uuid of this hr action
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this hr action.
	 *
	 * @param uuid the uuid of this hr action
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the feedback ID of this hr action.
	 *
	 * @return the feedback ID of this hr action
	 */
	public long getFeedbackId();

	/**
	 * Sets the feedback ID of this hr action.
	 *
	 * @param feedbackId the feedback ID of this hr action
	 */
	public void setFeedbackId(long feedbackId);

	/**
	 * Returns the candidate ID of this hr action.
	 *
	 * @return the candidate ID of this hr action
	 */
	public long getCandidateId();

	/**
	 * Sets the candidate ID of this hr action.
	 *
	 * @param candidateId the candidate ID of this hr action
	 */
	public void setCandidateId(long candidateId);

	/**
	 * Returns the company ID of this hr action.
	 *
	 * @return the company ID of this hr action
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this hr action.
	 *
	 * @param companyId the company ID of this hr action
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this hr action.
	 *
	 * @return the group ID of this hr action
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this hr action.
	 *
	 * @param groupId the group ID of this hr action
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the type of this hr action.
	 *
	 * @return the type of this hr action
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this hr action.
	 *
	 * @param type the type of this hr action
	 */
	public void setType(String type);

	/**
	 * Returns the date of this hr action.
	 *
	 * @return the date of this hr action
	 */
	public Date getDate();

	/**
	 * Sets the date of this hr action.
	 *
	 * @param date the date of this hr action
	 */
	public void setDate(Date date);

	/**
	 * Returns the note of this hr action.
	 *
	 * @return the note of this hr action
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this hr action.
	 *
	 * @param note the note of this hr action
	 */
	public void setNote(String note);

	/**
	 * Returns the feedback of this hr action.
	 *
	 * @return the feedback of this hr action
	 */
	@AutoEscape
	public String getFeedback();

	/**
	 * Sets the feedback of this hr action.
	 *
	 * @param feedback the feedback of this hr action
	 */
	public void setFeedback(String feedback);

	/**
	 * Returns the create date of this hr action.
	 *
	 * @return the create date of this hr action
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this hr action.
	 *
	 * @param createDate the create date of this hr action
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this hr action.
	 *
	 * @return the modified date of this hr action
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this hr action.
	 *
	 * @param modifiedDate the modified date of this hr action
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the created user of this hr action.
	 *
	 * @return the created user of this hr action
	 */
	public long getCreatedUser();

	/**
	 * Sets the created user of this hr action.
	 *
	 * @param createdUser the created user of this hr action
	 */
	public void setCreatedUser(long createdUser);

	/**
	 * Returns the modified user of this hr action.
	 *
	 * @return the modified user of this hr action
	 */
	public long getModifiedUser();

	/**
	 * Sets the modified user of this hr action.
	 *
	 * @param modifiedUser the modified user of this hr action
	 */
	public void setModifiedUser(long modifiedUser);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(HrAction hrAction);

	@Override
	public int hashCode();

	@Override
	public CacheModel<HrAction> toCacheModel();

	@Override
	public HrAction toEscapedModel();

	@Override
	public HrAction toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}