package com.zeus.hr.action;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.zeus.hr.model.Candidate;

public interface ICandidateInteface {

	public List<Candidate> getAllCandidates(long companyId, long groupId) throws PortalException;

	public Candidate getDetailCandidate(long candidateId) throws PortalException;

	public Candidate addCandidate(long groupId, String firstName, String lastName, Date dateOfBirth, String mobilePhone,
			String email, long city, String appliedFor, String note, String skills, String source, String internalId,
			Date receivedDate, String internalNote, String internalDetails, String attachment, int rating, int status,
			ServiceContext serviceContext) throws PortalException;

	public Candidate updateCandidate(long groupId, long candidateId, String firstName, String lastName,
			Date dateOfBirth, String mobilePhone, String email, long city, String appliedFor, String note,
			String skills, String source, String internalId, Date receivedDate, String internalNote,
			String internalDetails, String attachment, int rating, int status, ServiceContext serviceContext)
			throws PortalException;

	public Candidate deleteById(long candidateId) throws PortalException;

	public Candidate addFileByCandidateId(long groupId, long candidateId, String fileName, String sourceFileName,
			int fileSize, InputStream inputStream, String fileType, ServiceContext serviceContext) throws PortalException;
}
