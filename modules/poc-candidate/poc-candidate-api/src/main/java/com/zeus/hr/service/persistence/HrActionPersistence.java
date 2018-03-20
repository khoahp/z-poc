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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.zeus.hr.exception.NoSuchHrActionException;
import com.zeus.hr.model.HrAction;

/**
 * The persistence interface for the hr action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.zeus.hr.service.persistence.impl.HrActionPersistenceImpl
 * @see HrActionUtil
 * @generated
 */
@ProviderType
public interface HrActionPersistence extends BasePersistence<HrAction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HrActionUtil} to access the hr action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hr actions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching hr actions
	*/
	public java.util.List<HrAction> findByUuid(java.lang.String uuid);

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
	public java.util.List<HrAction> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<HrAction> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public java.util.List<HrAction> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public HrAction findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Returns the first hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

	/**
	* Returns the last hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public HrAction findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Returns the last hr action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

	/**
	* Returns the hr actions before and after the current hr action in the ordered set where uuid = &#63;.
	*
	* @param feedbackId the primary key of the current hr action
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hr action
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public HrAction[] findByUuid_PrevAndNext(long feedbackId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Removes all the hr actions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of hr actions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching hr actions
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the hr action where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHrActionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public HrAction findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHrActionException;

	/**
	* Returns the hr action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the hr action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the hr action where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the hr action that was removed
	*/
	public HrAction removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHrActionException;

	/**
	* Returns the number of hr actions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching hr actions
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the hr actions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching hr actions
	*/
	public java.util.List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public java.util.List<HrAction> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public HrAction findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Returns the first hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

	/**
	* Returns the last hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action
	* @throws NoSuchHrActionException if a matching hr action could not be found
	*/
	public HrAction findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Returns the last hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public HrAction[] findByUuid_C_PrevAndNext(long feedbackId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Removes all the hr actions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of hr actions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching hr actions
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @return the matching hr actions
	*/
	public java.util.List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId);

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
	public java.util.List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId, int start, int end);

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
	public java.util.List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public java.util.List<HrAction> findBycandidateId(long companyId,
		long groupId, long candidateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator,
		boolean retrieveFromCache);

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
	public HrAction findBycandidateId_First(long companyId, long groupId,
		long candidateId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Returns the first hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchBycandidateId_First(long companyId, long groupId,
		long candidateId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public HrAction findBycandidateId_Last(long companyId, long groupId,
		long candidateId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Returns the last hr action in the ordered set where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	*/
	public HrAction fetchBycandidateId_Last(long companyId, long groupId,
		long candidateId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public HrAction[] findBycandidateId_PrevAndNext(long feedbackId,
		long companyId, long groupId, long candidateId,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException;

	/**
	* Removes all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	*/
	public void removeBycandidateId(long companyId, long groupId,
		long candidateId);

	/**
	* Returns the number of hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param candidateId the candidate ID
	* @return the number of matching hr actions
	*/
	public int countBycandidateId(long companyId, long groupId, long candidateId);

	/**
	* Caches the hr action in the entity cache if it is enabled.
	*
	* @param hrAction the hr action
	*/
	public void cacheResult(HrAction hrAction);

	/**
	* Caches the hr actions in the entity cache if it is enabled.
	*
	* @param hrActions the hr actions
	*/
	public void cacheResult(java.util.List<HrAction> hrActions);

	/**
	* Creates a new hr action with the primary key. Does not add the hr action to the database.
	*
	* @param feedbackId the primary key for the new hr action
	* @return the new hr action
	*/
	public HrAction create(long feedbackId);

	/**
	* Removes the hr action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action that was removed
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public HrAction remove(long feedbackId) throws NoSuchHrActionException;

	public HrAction updateImpl(HrAction hrAction);

	/**
	* Returns the hr action with the primary key or throws a {@link NoSuchHrActionException} if it could not be found.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action
	* @throws NoSuchHrActionException if a hr action with the primary key could not be found
	*/
	public HrAction findByPrimaryKey(long feedbackId)
		throws NoSuchHrActionException;

	/**
	* Returns the hr action with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param feedbackId the primary key of the hr action
	* @return the hr action, or <code>null</code> if a hr action with the primary key could not be found
	*/
	public HrAction fetchByPrimaryKey(long feedbackId);

	@Override
	public java.util.Map<java.io.Serializable, HrAction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the hr actions.
	*
	* @return the hr actions
	*/
	public java.util.List<HrAction> findAll();

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
	public java.util.List<HrAction> findAll(int start, int end);

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
	public java.util.List<HrAction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator);

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
	public java.util.List<HrAction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HrAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the hr actions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of hr actions.
	*
	* @return the number of hr actions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}