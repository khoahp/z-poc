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

package com.zeus.hr.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Candidate. This utility wraps
 * {@link com.zeus.hr.service.impl.CandidateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CandidateLocalService
 * @see com.zeus.hr.service.base.CandidateLocalServiceBaseImpl
 * @see com.zeus.hr.service.impl.CandidateLocalServiceImpl
 * @generated
 */
@ProviderType
public class CandidateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.zeus.hr.service.impl.CandidateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the candidate to the database. Also notifies the appropriate model listeners.
	*
	* @param candidate the candidate
	* @return the candidate that was added
	*/
	public static com.zeus.hr.model.Candidate addCandidate(
		com.zeus.hr.model.Candidate candidate) {
		return getService().addCandidate(candidate);
	}

	public static com.zeus.hr.model.Candidate addEditCandidate(
		com.zeus.hr.model.Candidate object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEditCandidate(object);
	}

	public static com.zeus.hr.model.Candidate addFile(long groupId,
		long candidateId, java.lang.String fileName,
		java.lang.String sourceFileName, int fileSize,
		java.io.InputStream inputStream, java.lang.String fileType,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addFile(groupId, candidateId, fileName, sourceFileName,
			fileSize, inputStream, fileType, serviceContext);
	}

	/**
	* Creates a new candidate with the primary key. Does not add the candidate to the database.
	*
	* @param candidateId the primary key for the new candidate
	* @return the new candidate
	*/
	public static com.zeus.hr.model.Candidate createCandidate(long candidateId) {
		return getService().createCandidate(candidateId);
	}

	/**
	* Deletes the candidate from the database. Also notifies the appropriate model listeners.
	*
	* @param candidate the candidate
	* @return the candidate that was removed
	*/
	public static com.zeus.hr.model.Candidate deleteCandidate(
		com.zeus.hr.model.Candidate candidate) {
		return getService().deleteCandidate(candidate);
	}

	/**
	* Deletes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate that was removed
	* @throws PortalException if a candidate with the primary key could not be found
	*/
	public static com.zeus.hr.model.Candidate deleteCandidate(long candidateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCandidate(candidateId);
	}

	public static com.zeus.hr.model.Candidate fetchCandidate(long candidateId) {
		return getService().fetchCandidate(candidateId);
	}

	/**
	* Returns the candidate matching the UUID and group.
	*
	* @param uuid the candidate's UUID
	* @param groupId the primary key of the group
	* @return the matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static com.zeus.hr.model.Candidate fetchCandidateByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCandidateByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the candidate with the primary key.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate
	* @throws PortalException if a candidate with the primary key could not be found
	*/
	public static com.zeus.hr.model.Candidate getCandidate(long candidateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCandidate(candidateId);
	}

	/**
	* Returns the candidate matching the UUID and group.
	*
	* @param uuid the candidate's UUID
	* @param groupId the primary key of the group
	* @return the matching candidate
	* @throws PortalException if a matching candidate could not be found
	*/
	public static com.zeus.hr.model.Candidate getCandidateByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCandidateByUuidAndGroupId(uuid, groupId);
	}

	public static com.zeus.hr.model.Candidate insertCandidate(long groupId,
		java.lang.String firstName, java.lang.String lastName,
		java.util.Date dateOfBirth, java.lang.String mobilePhone,
		java.lang.String email, long city, java.lang.String appliedFor,
		java.lang.String note, java.lang.String skills,
		java.lang.String source, java.lang.String internalId,
		java.util.Date receivedDate, java.lang.String internalNote,
		java.lang.String internalDetails, java.lang.String attachment,
		int rating, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .insertCandidate(groupId, firstName, lastName, dateOfBirth,
			mobilePhone, email, city, appliedFor, note, skills, source,
			internalId, receivedDate, internalNote, internalDetails,
			attachment, rating, status, serviceContext);
	}

	/**
	* Updates the candidate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param candidate the candidate
	* @return the candidate that was updated
	*/
	public static com.zeus.hr.model.Candidate updateCandidate(
		com.zeus.hr.model.Candidate candidate) {
		return getService().updateCandidate(candidate);
	}

	public static com.zeus.hr.model.Candidate updateCandidateInfo(
		long groupId, long id, java.lang.String firstName,
		java.lang.String lastName, java.util.Date dateOfBirth,
		java.lang.String mobilePhone, java.lang.String email, long city,
		java.lang.String appliedFor, java.lang.String note,
		java.lang.String skills, java.lang.String source,
		java.lang.String internalId, java.util.Date receivedDate,
		java.lang.String internalNote, java.lang.String internalDetails,
		java.lang.String attachment, int rating, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .updateCandidateInfo(groupId, id, firstName, lastName,
			dateOfBirth, mobilePhone, email, city, appliedFor, note, skills,
			source, internalId, receivedDate, internalNote, internalDetails,
			attachment, rating, status, serviceContext);
	}

	/**
	* Returns the number of candidates.
	*
	* @return the number of candidates
	*/
	public static int getCandidatesCount() {
		return getService().getCandidatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.zeus.hr.model.Candidate> fetchCandidate(
		long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCandidate(companyId, groupId, status);
	}

	public static java.util.List<com.zeus.hr.model.Candidate> getAllCandidates(
		long companyId, long groupId) {
		return getService().getAllCandidates(companyId, groupId);
	}

	/**
	* Returns a range of all the candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of candidates
	*/
	public static java.util.List<com.zeus.hr.model.Candidate> getCandidates(
		int start, int end) {
		return getService().getCandidates(start, end);
	}

	/**
	* Returns all the candidates matching the UUID and company.
	*
	* @param uuid the UUID of the candidates
	* @param companyId the primary key of the company
	* @return the matching candidates, or an empty list if no matches were found
	*/
	public static java.util.List<com.zeus.hr.model.Candidate> getCandidatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCandidatesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of candidates matching the UUID and company.
	*
	* @param uuid the UUID of the candidates
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching candidates, or an empty list if no matches were found
	*/
	public static java.util.List<com.zeus.hr.model.Candidate> getCandidatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.zeus.hr.model.Candidate> orderByComparator) {
		return getService()
				   .getCandidatesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static CandidateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CandidateLocalService, CandidateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CandidateLocalService.class);
}