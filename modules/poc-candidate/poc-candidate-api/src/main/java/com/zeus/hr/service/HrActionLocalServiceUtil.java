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
 * Provides the local service utility for HrAction. This utility wraps
 * {@link com.zeus.hr.service.impl.HrActionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HrActionLocalService
 * @see com.zeus.hr.service.base.HrActionLocalServiceBaseImpl
 * @see com.zeus.hr.service.impl.HrActionLocalServiceImpl
 * @generated
 */
@ProviderType
public class HrActionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.zeus.hr.service.impl.HrActionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the hr action to the database. Also notifies the appropriate model listeners.
	*
	* @param hrAction the hr action
	* @return the hr action that was added
	*/
	public static com.zeus.hr.model.HrAction addHrAction(
		com.zeus.hr.model.HrAction hrAction) {
		return getService().addHrAction(hrAction);
	}

	/**
	* Creates a new hr action with the primary key. Does not add the hr action to the database.
	*
	* @param feedbackId the primary key for the new hr action
	* @return the new hr action
	*/
	public static com.zeus.hr.model.HrAction createHrAction(long feedbackId) {
		return getService().createHrAction(feedbackId);
	}

	/**
	* Deletes the hr action from the database. Also notifies the appropriate model listeners.
	*
	* @param hrAction the hr action
	* @return the hr action that was removed
	*/
	public static com.zeus.hr.model.HrAction deleteHrAction(
		com.zeus.hr.model.HrAction hrAction) {
		return getService().deleteHrAction(hrAction);
	}

	/**
	* Deletes the hr action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action that was removed
	* @throws PortalException if a hr action with the primary key could not be found
	*/
	public static com.zeus.hr.model.HrAction deleteHrAction(long feedbackId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHrAction(feedbackId);
	}

	public static com.zeus.hr.model.HrAction fetchHrAction(long feedbackId) {
		return getService().fetchHrAction(feedbackId);
	}

	/**
	* Returns the hr action matching the UUID and group.
	*
	* @param uuid the hr action's UUID
	* @param groupId the primary key of the group
	* @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static com.zeus.hr.model.HrAction fetchHrActionByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchHrActionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the hr action with the primary key.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action
	* @throws PortalException if a hr action with the primary key could not be found
	*/
	public static com.zeus.hr.model.HrAction getHrAction(long feedbackId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHrAction(feedbackId);
	}

	/**
	* Returns the hr action matching the UUID and group.
	*
	* @param uuid the hr action's UUID
	* @param groupId the primary key of the group
	* @return the matching hr action
	* @throws PortalException if a matching hr action could not be found
	*/
	public static com.zeus.hr.model.HrAction getHrActionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHrActionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the hr action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hrAction the hr action
	* @return the hr action that was updated
	*/
	public static com.zeus.hr.model.HrAction updateHrAction(
		com.zeus.hr.model.HrAction hrAction) {
		return getService().updateHrAction(hrAction);
	}

	/**
	* Returns the number of hr actions.
	*
	* @return the number of hr actions
	*/
	public static int getHrActionsCount() {
		return getService().getHrActionsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zeus.hr.model.impl.HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<com.zeus.hr.model.HrAction> getHrActions(
		int start, int end) {
		return getService().getHrActions(start, end);
	}

	public static java.util.List<com.zeus.hr.model.HrAction> getHrActionsByCandidateId(
		long companyId, long groupId, long candidateId) {
		return getService()
				   .getHrActionsByCandidateId(companyId, groupId, candidateId);
	}

	/**
	* Returns all the hr actions matching the UUID and company.
	*
	* @param uuid the UUID of the hr actions
	* @param companyId the primary key of the company
	* @return the matching hr actions, or an empty list if no matches were found
	*/
	public static java.util.List<com.zeus.hr.model.HrAction> getHrActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getHrActionsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.zeus.hr.model.HrAction> getHrActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.zeus.hr.model.HrAction> orderByComparator) {
		return getService()
				   .getHrActionsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
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

	public static HrActionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HrActionLocalService, HrActionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(HrActionLocalService.class);
}