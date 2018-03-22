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
 * Provides a wrapper for {@link HrActionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HrActionLocalService
 * @generated
 */
@ProviderType
public class HrActionLocalServiceWrapper implements HrActionLocalService,
	ServiceWrapper<HrActionLocalService> {
	public HrActionLocalServiceWrapper(
		HrActionLocalService hrActionLocalService) {
		_hrActionLocalService = hrActionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _hrActionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hrActionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _hrActionLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _hrActionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hrActionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hrActionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the hr action to the database. Also notifies the appropriate model listeners.
	*
	* @param hrAction the hr action
	* @return the hr action that was added
	*/
	@Override
	public com.zeus.hr.model.HrAction addHrAction(
		com.zeus.hr.model.HrAction hrAction) {
		return _hrActionLocalService.addHrAction(hrAction);
	}

	/**
	* Creates a new hr action with the primary key. Does not add the hr action to the database.
	*
	* @param feedbackId the primary key for the new hr action
	* @return the new hr action
	*/
	@Override
	public com.zeus.hr.model.HrAction createHrAction(long feedbackId) {
		return _hrActionLocalService.createHrAction(feedbackId);
	}

	/**
	* Deletes the hr action from the database. Also notifies the appropriate model listeners.
	*
	* @param hrAction the hr action
	* @return the hr action that was removed
	*/
	@Override
	public com.zeus.hr.model.HrAction deleteHrAction(
		com.zeus.hr.model.HrAction hrAction) {
		return _hrActionLocalService.deleteHrAction(hrAction);
	}

	/**
	* Deletes the hr action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action that was removed
	* @throws PortalException if a hr action with the primary key could not be found
	*/
	@Override
	public com.zeus.hr.model.HrAction deleteHrAction(long feedbackId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hrActionLocalService.deleteHrAction(feedbackId);
	}

	@Override
	public com.zeus.hr.model.HrAction fetchHrAction(long feedbackId) {
		return _hrActionLocalService.fetchHrAction(feedbackId);
	}

	/**
	* Returns the hr action matching the UUID and group.
	*
	* @param uuid the hr action's UUID
	* @param groupId the primary key of the group
	* @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	@Override
	public com.zeus.hr.model.HrAction fetchHrActionByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _hrActionLocalService.fetchHrActionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the hr action with the primary key.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action
	* @throws PortalException if a hr action with the primary key could not be found
	*/
	@Override
	public com.zeus.hr.model.HrAction getHrAction(long feedbackId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hrActionLocalService.getHrAction(feedbackId);
	}

	/**
	* Returns the hr action matching the UUID and group.
	*
	* @param uuid the hr action's UUID
	* @param groupId the primary key of the group
	* @return the matching hr action
	* @throws PortalException if a matching hr action could not be found
	*/
	@Override
	public com.zeus.hr.model.HrAction getHrActionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hrActionLocalService.getHrActionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the hr action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hrAction the hr action
	* @return the hr action that was updated
	*/
	@Override
	public com.zeus.hr.model.HrAction updateHrAction(
		com.zeus.hr.model.HrAction hrAction) {
		return _hrActionLocalService.updateHrAction(hrAction);
	}

	/**
	* Returns the number of hr actions.
	*
	* @return the number of hr actions
	*/
	@Override
	public int getHrActionsCount() {
		return _hrActionLocalService.getHrActionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _hrActionLocalService.getOSGiServiceIdentifier();
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
		return _hrActionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _hrActionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _hrActionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the hr actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @return the range of hr actions
	*/
	@Override
	public java.util.List<com.zeus.hr.model.HrAction> getHrActions(int start,
		int end) {
		return _hrActionLocalService.getHrActions(start, end);
	}

	@Override
	public java.util.List<com.zeus.hr.model.HrAction> getHrActionsByCandidateId(
		long companyId, long groupId, long candidateId) {
		return _hrActionLocalService.getHrActionsByCandidateId(companyId,
			groupId, candidateId);
	}

	/**
	* Returns all the hr actions matching the UUID and company.
	*
	* @param uuid the UUID of the hr actions
	* @param companyId the primary key of the company
	* @return the matching hr actions, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.zeus.hr.model.HrAction> getHrActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _hrActionLocalService.getHrActionsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of hr actions matching the UUID and company.
	*
	* @param uuid the UUID of the hr actions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching hr actions, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.zeus.hr.model.HrAction> getHrActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.zeus.hr.model.HrAction> orderByComparator) {
		return _hrActionLocalService.getHrActionsByUuidAndCompanyId(uuid,
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
		return _hrActionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _hrActionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public HrActionLocalService getWrappedService() {
		return _hrActionLocalService;
	}

	@Override
	public void setWrappedService(HrActionLocalService hrActionLocalService) {
		_hrActionLocalService = hrActionLocalService;
	}

	private HrActionLocalService _hrActionLocalService;
}