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

package com.zeus.hr.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.zeus.hr.model.HrAction;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the hr action service. This utility wraps {@link com.zeus.hr.service.persistence.impl.HrActionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HrActionPersistence
 * @see com.zeus.hr.service.persistence.impl.HrActionPersistenceImpl
 * @generated
 */
@ProviderType
public class HrActionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(HrAction hrAction) {
		getPersistence().clearCache(hrAction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HrAction> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HrAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HrAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HrAction update(HrAction hrAction) {
		return getPersistence().update(hrAction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HrAction update(HrAction hrAction,
		ServiceContext serviceContext) {
		return getPersistence().update(hrAction, serviceContext);
	}

	/**
	* Returns all the hr actions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching hr actions
	*/
	public static List<HrAction> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the hr actions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @return the range of matching hr actions
	*/
	public static List<HrAction> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the hr actions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hr actions
	*/
	public static List<HrAction> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<HrAction> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hr actions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hr actions
	*/
	public static List<HrAction> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<HrAction> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findByUuid_First(java.lang.String uuid,
		OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findByUuid_Last(java.lang.String uuid,
		OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the hr actions before and after the current hr action in the ordered set where uuid = &#63;.
	*
	* @param feedbackId the primary key of the current hr action
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hr action
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public static HrAction[] findByUuid_PrevAndNext(long feedbackId,
		java.lang.String uuid, OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(feedbackId, uuid, orderByComparator);
	}

	/**
	* Removes all the hr actions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of hr actions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching hr actions
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the hr action where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHrActionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findByUUID_G(java.lang.String uuid, long groupId)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the hr action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the hr action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the hr action where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the hr action that was removed
	*/
	public static HrAction removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of hr actions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching hr actions
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the hr actions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching hr actions
	*/
	public static List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the hr actions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @return the range of matching hr actions
	*/
	public static List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the hr actions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hr actions
	*/
	public static List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hr actions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hr actions
	*/
	public static List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<HrAction> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the hr actions before and after the current hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param feedbackId the primary key of the current hr action
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hr action
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public static HrAction[] findByUuid_C_PrevAndNext(long feedbackId,
		java.lang.String uuid, long companyId,
		OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(feedbackId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the hr actions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of hr actions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching hr actions
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @return the matching hr actions
	*/
	public static List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId) {
		return getPersistence()
				   .findBycandidateId(companyId, groupId, candidateId);
	}

	/**
	* Returns a range of all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @return the range of matching hr actions
	*/
	public static List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId, int start, int end) {
		return getPersistence()
				   .findBycandidateId(companyId, groupId, candidateId, start,
			end);
	}

	/**
	* Returns an ordered range of all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hr actions
	*/
	public static List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId, int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .findBycandidateId(companyId, groupId, candidateId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hr actions
	*/
	public static List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId, int start, int end,
		OrderByComparator<HrAction> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBycandidateId(companyId, groupId, candidateId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findBycandidateId_First(long companyId,
		long groupId, long candidateId,
		OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findBycandidateId_First(companyId, groupId, candidateId,
			orderByComparator);
	}

	/**
	* Returns the first hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchBycandidateId_First(long companyId,
		long groupId, long candidateId,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .fetchBycandidateId_First(companyId, groupId, candidateId,
			orderByComparator);
	}

	/**
	* Returns the last hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public static HrAction findBycandidateId_Last(long companyId, long groupId,
		long candidateId, OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findBycandidateId_Last(companyId, groupId, candidateId,
			orderByComparator);
	}

	/**
	* Returns the last hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public static HrAction fetchBycandidateId_Last(long companyId,
		long groupId, long candidateId,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence()
				   .fetchBycandidateId_Last(companyId, groupId, candidateId,
			orderByComparator);
	}

	/**
	* Returns the hr actions before and after the current hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param feedbackId the primary key of the current hr action
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hr action
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public static HrAction[] findBycandidateId_PrevAndNext(long feedbackId,
		long companyId, long groupId, long candidateId,
		OrderByComparator<HrAction> orderByComparator)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence()
				   .findBycandidateId_PrevAndNext(feedbackId, companyId,
			groupId, candidateId, orderByComparator);
	}

	/**
	* Removes all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	*/
	public static void removeBycandidateId(long companyId, long groupId,
		long candidateId) {
		getPersistence().removeBycandidateId(companyId, groupId, candidateId);
	}

	/**
	* Returns the number of hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @return the number of matching hr actions
	*/
	public static int countBycandidateId(long companyId, long groupId,
		long candidateId) {
		return getPersistence()
				   .countBycandidateId(companyId, groupId, candidateId);
	}

	/**
	* Caches the hr action in the entity cache if it is enabled.
	*
	* @param hrAction the hr action
	*/
	public static void cacheResult(HrAction hrAction) {
		getPersistence().cacheResult(hrAction);
	}

	/**
	* Caches the hr actions in the entity cache if it is enabled.
	*
	* @param hrActions the hr actions
	*/
	public static void cacheResult(List<HrAction> hrActions) {
		getPersistence().cacheResult(hrActions);
	}

	/**
	* Creates a new hr action with the primary key. Does not add the hr action to the database.
	*
	* @param feedbackId the primary key for the new hr action
	* @return the new hr action
	*/
	public static HrAction create(long feedbackId) {
		return getPersistence().create(feedbackId);
	}

	/**
	* Removes the hr action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action that was removed
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public static HrAction remove(long feedbackId)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence().remove(feedbackId);
	}

	public static HrAction updateImpl(HrAction hrAction) {
		return getPersistence().updateImpl(hrAction);
	}

	/**
	* Returns the hr action with the primary key or throws a {@link NoSuchHrActionException} if it could not be found.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public static HrAction findByPrimaryKey(long feedbackId)
		throws com.zeus.hr.exception.NoSuchHrActionException {
		return getPersistence().findByPrimaryKey(feedbackId);
	}

	/**
	* Returns the hr action with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action, or <code>null</code> if a hr action with the primary key could not be found
	*/
	public static HrAction fetchByPrimaryKey(long feedbackId) {
		return getPersistence().fetchByPrimaryKey(feedbackId);
	}

	public static java.util.Map<java.io.Serializable, HrAction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the hr actions.
	*
	* @return the hr actions
	*/
	public static List<HrAction> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the hr actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @return the range of hr actions
	*/
	public static List<HrAction> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the hr actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hr actions
	*/
	public static List<HrAction> findAll(int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the hr actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HrActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hr actions
	* @param end the upper bound of the range of hr actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of hr actions
	*/
	public static List<HrAction> findAll(int start, int end,
		OrderByComparator<HrAction> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the hr actions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hr actions.
	*
	* @return the number of hr actions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static HrActionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HrActionPersistence, HrActionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(HrActionPersistence.class);
}