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

package com.zeus.hr.service.impl;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.zeus.hr.action.util.FileUploadUtils;
import com.zeus.hr.model.Candidate;
import com.zeus.hr.service.base.CandidateLocalServiceBaseImpl;

/**
 * The implementation of the candidate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.zeus.hr.service.CandidateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CandidateLocalServiceBaseImpl
 * @see com.zeus.hr.service.CandidateLocalServiceUtil
 */
public class CandidateLocalServiceImpl extends CandidateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.zeus.hr.service.CandidateLocalServiceUtil} to access the candidate local service.
	 */
private static final Log _log = LogFactoryUtil.getLog(CandidateLocalServiceImpl.class);

	// Get all List Candidate
	public List<Candidate> getAllCandidates(long companyId, long groupId) {
		return candidatePersistence.findByFCOMPANY_GROUP_ID(companyId, groupId);
	}
	// Create new candidate
	public Candidate insertCandidate(long groupId, String firstName, String lastName, Date dateOfBirth, String mobilePhone,
			String email, long city, String appliedFor, String note, String skills, String source, String internalId,
			Date receivedDate, String internalNote, String internalDetails, String attachment, int rating,
			int status, ServiceContext serviceContext) {

		long companyId = serviceContext.getCompanyId();
		Date now = new Date();

		long candidateId = counterLocalService.increment(Candidate.class.getName());
		Candidate candidate = candidatePersistence.create(candidateId);
		// Add audit fields
		candidate.setGroupId(groupId);
		candidate.setCompanyId(companyId);
		candidate.setCreateDate(now);
		candidate.setModifiedDate(now);
		// Add other fields
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		candidate.setMobilePhone(mobilePhone);
		candidate.setEmail(email);
		candidate.setDateOfBirth(dateOfBirth);
		candidate.setCity(city);
		candidate.setAppliedFor(appliedFor);
		candidate.setNote(note);
		candidate.setSkills(skills);
		candidate.setSource(source);
		candidate.setInternalId(internalId);
		candidate.setReceivedDate(receivedDate);
		candidate.setInternalNote(internalNote);
		candidate.setInternalDetails(internalDetails);
		candidate.setAttachment(attachment);
//		candidate.setCreatedUser(userName);
//		candidate.setModifiedUser(object.getModifiedUser());
		candidate.setStatus(status);
		candidate.setRating(rating);
		
		return candidatePersistence.update(candidate);

	}

	// Update info a candidate
	public Candidate updateCandidateInfo(long groupId, long id, String firstName, String lastName, Date dateOfBirth, String mobilePhone,
			String email, long city, String appliedFor, String note, String skills, String source, String internalId,
			Date receivedDate, String internalNote, String internalDetails, String attachment, int rating,
			int status, ServiceContext serviceContext) {

		Candidate candidate = null;
		try {
			candidate = candidateLocalService.getCandidate(id);
		} catch (PortalException e) {
			_log.info("No Candidate found by Id: " + id);
		}
		
		if(Validator.isNull(candidate)){
			candidate = candidateLocalService.createCandidate(counterLocalService.increment(Candidate.class.toString()));
		}

		long companyId = serviceContext.getCompanyId();
		Date now = new Date();

		// Add audit fields
		candidate.setGroupId(groupId);
		candidate.setCompanyId(companyId);
		candidate.setCreateDate(now);
		candidate.setModifiedDate(now);
		// Add other fields
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		candidate.setMobilePhone(mobilePhone);
		candidate.setEmail(email);
		candidate.setDateOfBirth(dateOfBirth);
		candidate.setCity(city);
		candidate.setAppliedFor(appliedFor);
		candidate.setNote(note);
		candidate.setSkills(skills);
		candidate.setSource(source);
		candidate.setInternalId(internalId);
		candidate.setReceivedDate(receivedDate);
		candidate.setInternalNote(internalNote);
		candidate.setInternalDetails(internalDetails);
		candidate.setAttachment(attachment);
//		candidate.setCreatedUser(object.getCreatedUser());
//		candidate.setModifiedUser(userName);
		candidate.setStatus(status);
		candidate.setRating(rating);
		
		return candidatePersistence.update(candidate);

	}

	public Candidate addEditCandidate(Candidate object) throws SystemException {
		Candidate candidate = null;
		try {
			candidate = candidateLocalService.getCandidate(object.getPrimaryKey());
		} catch (PortalException e) {
			_log.info("No Candidate found by Id " + object.getPrimaryKey());
		}
		
		if(Validator.isNull(candidate)){
			candidate = candidateLocalService.createCandidate(counterLocalService.increment(Candidate.class.toString()));
		}
		candidate.setCompanyId(object.getCompanyId());
		candidate.setGroupId(object.getGroupId());
		candidate.setFirstName(object.getFirstName());
		candidate.setLastName(object.getLastName());
		candidate.setMobilePhone(object.getMobilePhone());
		candidate.setEmail(object.getEmail());
		candidate.setDateOfBirth(object.getDateOfBirth());
		candidate.setCity(object.getCity());
		candidate.setAppliedFor(object.getAppliedFor());
		candidate.setNote(object.getNote());
		candidate.setSkills(object.getSkills());
		candidate.setSource(object.getSource());
		candidate.setInternalId(object.getInternalId());
		candidate.setReceivedDate(object.getReceivedDate());
		candidate.setInternalNote(object.getInternalNote());
		candidate.setInternalDetails(object.getInternalDetails());
		candidate.setAttachment(object.getAttachment());
		candidate.setCreateDate(object.getCreateDate());
		candidate.setModifiedDate(object.getModifiedDate());
		candidate.setCreatedUser(object.getCreatedUser());
		candidate.setModifiedUser(object.getModifiedUser());
		candidate.setStatus(object.getStatus());
		candidate.setRating(object.getRating());
		return candidateLocalService.updateCandidate(candidate);
		
	}
	
	public List<Candidate> fetchCandidate(long companyId, long groupId, int status) throws SystemException {
		return candidatePersistence.findBystatus(companyId, groupId, status);
	}

	// Upload file Entry
	public Candidate addFile(long groupId, long candidateId, String fileName, String sourceFileName, int fileSize,
			InputStream inputStream, String fileType, ServiceContext serviceContext)
			throws PortalException, SystemException {

		long userId = serviceContext.getUserId();
		long fileEntryId = 0;
		Candidate candidate = null;

		try {
			FileEntry fileEntry = FileUploadUtils.uploadCandidateFile(userId, groupId, inputStream, sourceFileName,
					fileType, fileSize, serviceContext);

			if (fileEntry != null) {
				fileEntryId = fileEntry.getFileEntryId();
				if (fileEntryId > 0) {
					Date now = new Date();
					try {
						candidate = candidateLocalService.getCandidate(candidateId);
					} catch (PortalException e) {
						_log.info("No Candidate found by Id: " + candidateId);
					}
					
					if(Validator.isNotNull(candidate)){
						String attachment = candidate.getAttachment();
						if (Validator.isNotNull(attachment)) {
							StringBuilder sb = new StringBuilder();
							sb.append(attachment);
							sb.append(StringPool.COMMA);
							sb.append(fileEntryId);
							// Set field in object Candidate
							candidate.setAttachment(sb.toString());
							candidate.setModifiedDate(now);
						} else {
							candidate.setAttachment(String.valueOf(fileEntryId));
							candidate.setModifiedDate(now);
						}
						candidatePersistence.update(candidate);
					}
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}
		return candidate;
	}
	
}