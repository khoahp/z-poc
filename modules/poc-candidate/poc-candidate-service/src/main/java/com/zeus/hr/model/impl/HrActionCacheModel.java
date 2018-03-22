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

package com.zeus.hr.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.zeus.hr.model.HrAction;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HrAction in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HrAction
 * @generated
 */
@ProviderType
public class HrActionCacheModel implements CacheModel<HrAction>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HrActionCacheModel)) {
			return false;
		}

		HrActionCacheModel hrActionCacheModel = (HrActionCacheModel)obj;

		if (feedbackId == hrActionCacheModel.feedbackId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, feedbackId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", feedbackId=");
		sb.append(feedbackId);
		sb.append(", candidateId=");
		sb.append(candidateId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", date=");
		sb.append(date);
		sb.append(", note=");
		sb.append(note);
		sb.append(", feedback=");
		sb.append(feedback);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createdUser=");
		sb.append(createdUser);
		sb.append(", modifiedUser=");
		sb.append(modifiedUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HrAction toEntityModel() {
		HrActionImpl hrActionImpl = new HrActionImpl();

		if (uuid == null) {
			hrActionImpl.setUuid(StringPool.BLANK);
		}
		else {
			hrActionImpl.setUuid(uuid);
		}

		hrActionImpl.setFeedbackId(feedbackId);
		hrActionImpl.setCandidateId(candidateId);
		hrActionImpl.setCompanyId(companyId);
		hrActionImpl.setGroupId(groupId);

		if (type == null) {
			hrActionImpl.setType(StringPool.BLANK);
		}
		else {
			hrActionImpl.setType(type);
		}

		if (date == Long.MIN_VALUE) {
			hrActionImpl.setDate(null);
		}
		else {
			hrActionImpl.setDate(new Date(date));
		}

		if (note == null) {
			hrActionImpl.setNote(StringPool.BLANK);
		}
		else {
			hrActionImpl.setNote(note);
		}

		if (feedback == null) {
			hrActionImpl.setFeedback(StringPool.BLANK);
		}
		else {
			hrActionImpl.setFeedback(feedback);
		}

		if (createDate == Long.MIN_VALUE) {
			hrActionImpl.setCreateDate(null);
		}
		else {
			hrActionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hrActionImpl.setModifiedDate(null);
		}
		else {
			hrActionImpl.setModifiedDate(new Date(modifiedDate));
		}

		hrActionImpl.setCreatedUser(createdUser);
		hrActionImpl.setModifiedUser(modifiedUser);

		hrActionImpl.resetOriginalValues();

		return hrActionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		feedbackId = objectInput.readLong();

		candidateId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();
		type = objectInput.readUTF();
		date = objectInput.readLong();
		note = objectInput.readUTF();
		feedback = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdUser = objectInput.readLong();

		modifiedUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(feedbackId);

		objectOutput.writeLong(candidateId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(date);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (feedback == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feedback);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdUser);

		objectOutput.writeLong(modifiedUser);
	}

	public String uuid;
	public long feedbackId;
	public long candidateId;
	public long companyId;
	public long groupId;
	public String type;
	public long date;
	public String note;
	public String feedback;
	public long createDate;
	public long modifiedDate;
	public long createdUser;
	public long modifiedUser;
}