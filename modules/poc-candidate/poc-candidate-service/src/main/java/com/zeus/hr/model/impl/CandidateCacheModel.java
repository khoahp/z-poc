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

import com.zeus.hr.model.Candidate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Candidate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Candidate
 * @generated
 */
@ProviderType
public class CandidateCacheModel implements CacheModel<Candidate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateCacheModel)) {
			return false;
		}

		CandidateCacheModel candidateCacheModel = (CandidateCacheModel)obj;

		if (candidateId == candidateCacheModel.candidateId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, candidateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", candidateId=");
		sb.append(candidateId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", mobilePhone=");
		sb.append(mobilePhone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", city=");
		sb.append(city);
		sb.append(", appliedFor=");
		sb.append(appliedFor);
		sb.append(", note=");
		sb.append(note);
		sb.append(", skills=");
		sb.append(skills);
		sb.append(", source=");
		sb.append(source);
		sb.append(", internalId=");
		sb.append(internalId);
		sb.append(", receivedDate=");
		sb.append(receivedDate);
		sb.append(", internalNote=");
		sb.append(internalNote);
		sb.append(", internalDetails=");
		sb.append(internalDetails);
		sb.append(", attachment=");
		sb.append(attachment);
		sb.append(", rating=");
		sb.append(rating);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createdUser=");
		sb.append(createdUser);
		sb.append(", modifiedUser=");
		sb.append(modifiedUser);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Candidate toEntityModel() {
		CandidateImpl candidateImpl = new CandidateImpl();

		if (uuid == null) {
			candidateImpl.setUuid(StringPool.BLANK);
		}
		else {
			candidateImpl.setUuid(uuid);
		}

		candidateImpl.setCandidateId(candidateId);
		candidateImpl.setCompanyId(companyId);
		candidateImpl.setGroupId(groupId);

		if (firstName == null) {
			candidateImpl.setFirstName(StringPool.BLANK);
		}
		else {
			candidateImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			candidateImpl.setLastName(StringPool.BLANK);
		}
		else {
			candidateImpl.setLastName(lastName);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			candidateImpl.setDateOfBirth(null);
		}
		else {
			candidateImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (mobilePhone == null) {
			candidateImpl.setMobilePhone(StringPool.BLANK);
		}
		else {
			candidateImpl.setMobilePhone(mobilePhone);
		}

		if (email == null) {
			candidateImpl.setEmail(StringPool.BLANK);
		}
		else {
			candidateImpl.setEmail(email);
		}

		candidateImpl.setCity(city);

		if (appliedFor == null) {
			candidateImpl.setAppliedFor(StringPool.BLANK);
		}
		else {
			candidateImpl.setAppliedFor(appliedFor);
		}

		if (note == null) {
			candidateImpl.setNote(StringPool.BLANK);
		}
		else {
			candidateImpl.setNote(note);
		}

		if (skills == null) {
			candidateImpl.setSkills(StringPool.BLANK);
		}
		else {
			candidateImpl.setSkills(skills);
		}

		if (source == null) {
			candidateImpl.setSource(StringPool.BLANK);
		}
		else {
			candidateImpl.setSource(source);
		}

		if (internalId == null) {
			candidateImpl.setInternalId(StringPool.BLANK);
		}
		else {
			candidateImpl.setInternalId(internalId);
		}

		if (receivedDate == Long.MIN_VALUE) {
			candidateImpl.setReceivedDate(null);
		}
		else {
			candidateImpl.setReceivedDate(new Date(receivedDate));
		}

		if (internalNote == null) {
			candidateImpl.setInternalNote(StringPool.BLANK);
		}
		else {
			candidateImpl.setInternalNote(internalNote);
		}

		if (internalDetails == null) {
			candidateImpl.setInternalDetails(StringPool.BLANK);
		}
		else {
			candidateImpl.setInternalDetails(internalDetails);
		}

		if (attachment == null) {
			candidateImpl.setAttachment(StringPool.BLANK);
		}
		else {
			candidateImpl.setAttachment(attachment);
		}

		candidateImpl.setRating(rating);

		if (createDate == Long.MIN_VALUE) {
			candidateImpl.setCreateDate(null);
		}
		else {
			candidateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			candidateImpl.setModifiedDate(null);
		}
		else {
			candidateImpl.setModifiedDate(new Date(modifiedDate));
		}

		candidateImpl.setCreatedUser(createdUser);
		candidateImpl.setModifiedUser(modifiedUser);
		candidateImpl.setStatus(status);

		candidateImpl.resetOriginalValues();

		return candidateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		candidateId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		mobilePhone = objectInput.readUTF();
		email = objectInput.readUTF();

		city = objectInput.readLong();
		appliedFor = objectInput.readUTF();
		note = objectInput.readUTF();
		skills = objectInput.readUTF();
		source = objectInput.readUTF();
		internalId = objectInput.readUTF();
		receivedDate = objectInput.readLong();
		internalNote = objectInput.readUTF();
		internalDetails = objectInput.readUTF();
		attachment = objectInput.readUTF();

		rating = objectInput.readInt();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdUser = objectInput.readLong();

		modifiedUser = objectInput.readLong();

		status = objectInput.readInt();
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

		objectOutput.writeLong(candidateId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeLong(dateOfBirth);

		if (mobilePhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobilePhone);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(city);

		if (appliedFor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appliedFor);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (skills == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(skills);
		}

		if (source == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(source);
		}

		if (internalId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(internalId);
		}

		objectOutput.writeLong(receivedDate);

		if (internalNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(internalNote);
		}

		if (internalDetails == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(internalDetails);
		}

		if (attachment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attachment);
		}

		objectOutput.writeInt(rating);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdUser);

		objectOutput.writeLong(modifiedUser);

		objectOutput.writeInt(status);
	}

	public String uuid;
	public long candidateId;
	public long companyId;
	public long groupId;
	public String firstName;
	public String lastName;
	public long dateOfBirth;
	public String mobilePhone;
	public String email;
	public long city;
	public String appliedFor;
	public String note;
	public String skills;
	public String source;
	public String internalId;
	public long receivedDate;
	public String internalNote;
	public String internalDetails;
	public String attachment;
	public int rating;
	public long createDate;
	public long modifiedDate;
	public long createdUser;
	public long modifiedUser;
	public int status;
}