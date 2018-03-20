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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CandidateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CandidateLocalService
 * @generated
 */
@ProviderType
public class CandidateLocalServiceWrapper implements CandidateLocalService,
	ServiceWrapper<CandidateLocalService> {
	public CandidateLocalServiceWrapper(
		CandidateLocalService candidateLocalService) {
		_candidateLocalService = candidateLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _candidateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _candidateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _candidateLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _candidateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the candidate to the database. Also notifies the appropriate model listeners.
	*
	* @param candidate the candidate
	* @return the candidate that was added
	*/
	@Override
	public com.zeus.hr.model.Candidate addCandidate(
		com.zeus.hr.model.Candidate candidate) {
		return _candidateLocalService.addCandidate(candidate);
	}

	/**
	* Creates a new candidate with the primary key. Does not add the candidate to the database.
	*
	* @param candidateId the primary key for the new candidate
	* @return the new candidate
	*/
	@Override
	public com.zeus.hr.model.Candidate createCandidate(long candidateId) {
		return _candidateLocalService.createCandidate(candidateId);
	}

	/**
	* Deletes the candidate from the database. Also notifies the appropriate model listeners.
	*
	* @param candidate the candidate
	* @return the candidate that was removed
	*/
	@Override
	public com.zeus.hr.model.Candidate deleteCandidate(
		com.zeus.hr.model.Candidate candidate) {
		return _candidateLocalService.deleteCandidate(candidate);
	}

	/**
	* Deletes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate that was removed
	* @throws PortalException if a candidate with the primary key could not be found
	*/
	@Override
	public com.zeus.hr.model.Candidate deleteCandidate(long candidateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidateLocalService.deleteCandidate(candidateId);
	}

	@Override
	public com.zeus.hr.model.Candidate fetchCandidate(long candidateId) {
		return _candidateLocalService.fetchCandidate(candidateId);
	}

	/**
	* Returns the candidate matching the UUID and group.
	*
	* @param uuid the candidate's UUID
	* @param groupId the primary key of the group
	* @return the matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	@Override
	public com.zeus.hr.model.Candidate fetchCandidateByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _candidateLocalService.fetchCandidateByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the candidate with the primary key.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate
	* @throws PortalException if a candidate with the primary key could not be found
	*/
	@Override
	public com.zeus.hr.model.Candidate getCandidate(long candidateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidateLocalService.getCandidate(candidateId);
	}

	/**
	* Returns the candidate matching the UUID and group.
	*
	* @param uuid the candidate's UUID
	* @param groupId the primary key of the group
	* @return the matching candidate
	* @throws PortalException if a matching candidate could not be found
	*/
	@Override
	public com.zeus.hr.model.Candidate getCandidateByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidateLocalService.getCandidateByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the candidate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param candidate the candidate
	* @return the candidate that was updated
	*/
	@Override
	public com.zeus.hr.model.Candidate updateCandidate(
		com.zeus.hr.model.Candidate candidate) {
		return _candidateLocalService.updateCandidate(candidate);
	}

	/**
	* Returns the number of candidates.
	*
	* @return the number of candidates
	*/
	@Override
	public int getCandidatesCount() {
		return _candidateLocalService.getCandidatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _candidateLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _candidateLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _candidateLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _candidateLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.zeus.hr.model.Candidate> getCandidates(
		int start, int end) {
		return _candidateLocalService.getCandidates(start, end);
	}

	/**
	* Returns all the candidates matching the UUID and company.
	*
	* @param uuid the UUID of the candidates
	* @param companyId the primary key of the company
	* @return the matching candidates, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.zeus.hr.model.Candidate> getCandidatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _candidateLocalService.getCandidatesByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<com.zeus.hr.model.Candidate> getCandidatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.zeus.hr.model.Candidate> orderByComparator) {
		return _candidateLocalService.getCandidatesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _candidateLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _candidateLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CandidateLocalService getWrappedService() {
		return _candidateLocalService;
	}

	@Override
	public void setWrappedService(CandidateLocalService candidateLocalService) {
		_candidateLocalService = candidateLocalService;
	}

	private CandidateLocalService _candidateLocalService;
}