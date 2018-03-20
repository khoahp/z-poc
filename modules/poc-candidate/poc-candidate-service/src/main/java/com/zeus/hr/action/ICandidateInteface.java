package com.zeus.hr.action;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.zeus.hr.model.Candidate;

public interface ICandidateInteface {
	public Candidate updateCandidate() throws PortalException;
	
	public List<Candidate> getAllCandidates() throws PortalException;

}
