package com.zeus.hr.action.impl;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.zeus.hr.action.ICandidateInteface;
import com.zeus.hr.model.Candidate;
import com.zeus.hr.service.CandidateLocalServiceUtil;

public class ICandidateActionsImpl implements ICandidateInteface {

	@Override
	public List<Candidate> getAllCandidates(long companyId, long groupId) throws PortalException {
		return CandidateLocalServiceUtil.getAllCandidates(companyId, groupId);
	}

	@Override
	public Candidate getDetailCandidate(long candidateId) throws PortalException {
		return CandidateLocalServiceUtil.getCandidate(candidateId);
	}

	@Override
	public Candidate addCandidate(long groupId, String firstName, String lastName, Date dateOfBirth, String mobilePhone,
			String email, long city, String appliedFor, String note, String skills, String source, String internalId,
			Date receivedDate, String internalNote, String internalDetails, String attachment, int rating, int status,
			ServiceContext serviceContext) throws PortalException {

		return CandidateLocalServiceUtil.insertCandidate(groupId, firstName, lastName, dateOfBirth, mobilePhone, email,
				city, appliedFor, note, skills, source, internalId, receivedDate, internalNote, internalDetails,
				attachment, rating, status, serviceContext);
	}

	@Override
	public Candidate updateCandidate(long groupId, long candidateId, String firstName, String lastName,
			Date dateOfBirth, String mobilePhone, String email, long city, String appliedFor, String note,
			String skills, String source, String internalId, Date receivedDate, String internalNote,
			String internalDetails, String attachment, int rating, int status, ServiceContext serviceContext)
			throws PortalException {
		// TODO Auto-generated method stub
		return CandidateLocalServiceUtil.updateCandidateInfo(groupId, candidateId, firstName, lastName, dateOfBirth,
				mobilePhone, email, city, appliedFor, note, skills, source, internalId, receivedDate, internalNote,
				internalDetails, attachment, rating, status, serviceContext);
	}

	@Override
	public Candidate deleteById(long candidateId) throws PortalException {
		return CandidateLocalServiceUtil.deleteCandidate(candidateId);
	}

	@Override
	public Candidate addFileByCandidateId(long groupId, long candidateId, String fileName, String sourceFileName,
			int fileSize, InputStream inputStream, String fileType, ServiceContext serviceContext)
			throws PortalException {
		return CandidateLocalServiceUtil.addFile(groupId, candidateId, fileName, sourceFileName, fileSize, inputStream,
				fileType, serviceContext);
	}
}
