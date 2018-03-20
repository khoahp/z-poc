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

import com.zeus.hr.model.Candidate;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the candidate service. This utility wraps {@link com.zeus.hr.service.persistence.impl.CandidatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CandidatePersistence
 * @see com.zeus.hr.service.persistence.impl.CandidatePersistenceImpl
 * @generated
 */
@ProviderType
public class CandidateUtil {
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
	public static void clearCache(Candidate candidate) {
		getPersistence().clearCache(candidate);
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
	public static List<Candidate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Candidate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Candidate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Candidate update(Candidate candidate) {
		return getPersistence().update(candidate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Candidate update(Candidate candidate,
		ServiceContext serviceContext) {
		return getPersistence().update(candidate, serviceContext);
	}

	/**
	* Returns all the candidates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching candidates
	*/
	public static List<Candidate> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the candidates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of matching candidates
	*/
	public static List<Candidate> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the candidates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidates
	*/
	public static List<Candidate> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Candidate> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the candidates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching candidates
	*/
	public static List<Candidate> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Candidate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first candidate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findByUuid_First(java.lang.String uuid,
		OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first candidate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Candidate> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last candidate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last candidate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Candidate> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the candidates before and after the current candidate in the ordered set where uuid = &#63;.
	*
	* @param candidateId the primary key of the current candidate
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate
	* @throws NoSuchCandidateException if a candidate with the primary key could not be found
	*/
	public static Candidate[] findByUuid_PrevAndNext(long candidateId,
		java.lang.String uuid, OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findByUuid_PrevAndNext(candidateId, uuid, orderByComparator);
	}

	/**
	* Removes all the candidates where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of candidates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching candidates
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the candidate where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCandidateException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findByUUID_G(java.lang.String uuid, long groupId)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the candidate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the candidate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the candidate where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the candidate that was removed
	*/
	public static Candidate removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of candidates where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching candidates
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the candidates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching candidates
	*/
	public static List<Candidate> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the candidates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of matching candidates
	*/
	public static List<Candidate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the candidates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidates
	*/
	public static List<Candidate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the candidates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching candidates
	*/
	public static List<Candidate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Candidate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first candidate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first candidate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last candidate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last candidate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the candidates before and after the current candidate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param candidateId the primary key of the current candidate
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate
	* @throws NoSuchCandidateException if a candidate with the primary key could not be found
	*/
	public static Candidate[] findByUuid_C_PrevAndNext(long candidateId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(candidateId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the candidates where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of candidates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching candidates
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the candidates where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @return the matching candidates
	*/
	public static List<Candidate> findBystatus(long companyId, long groupId,
		int status) {
		return getPersistence().findBystatus(companyId, groupId, status);
	}

	/**
	* Returns a range of all the candidates where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of matching candidates
	*/
	public static List<Candidate> findBystatus(long companyId, long groupId,
		int status, int start, int end) {
		return getPersistence()
				   .findBystatus(companyId, groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the candidates where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidates
	*/
	public static List<Candidate> findBystatus(long companyId, long groupId,
		int status, int start, int end,
		OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .findBystatus(companyId, groupId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the candidates where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching candidates
	*/
	public static List<Candidate> findBystatus(long companyId, long groupId,
		int status, int start, int end,
		OrderByComparator<Candidate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(companyId, groupId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first candidate in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findBystatus_First(long companyId, long groupId,
		int status, OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findBystatus_First(companyId, groupId, status,
			orderByComparator);
	}

	/**
	* Returns the first candidate in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchBystatus_First(long companyId, long groupId,
		int status, OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .fetchBystatus_First(companyId, groupId, status,
			orderByComparator);
	}

	/**
	* Returns the last candidate in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate
	* @throws NoSuchCandidateException if a matching candidate could not be found
	*/
	public static Candidate findBystatus_Last(long companyId, long groupId,
		int status, OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findBystatus_Last(companyId, groupId, status,
			orderByComparator);
	}

	/**
	* Returns the last candidate in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
	*/
	public static Candidate fetchBystatus_Last(long companyId, long groupId,
		int status, OrderByComparator<Candidate> orderByComparator) {
		return getPersistence()
				   .fetchBystatus_Last(companyId, groupId, status,
			orderByComparator);
	}

	/**
	* Returns the candidates before and after the current candidate in the ordered set where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param candidateId the primary key of the current candidate
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate
	* @throws NoSuchCandidateException if a candidate with the primary key could not be found
	*/
	public static Candidate[] findBystatus_PrevAndNext(long candidateId,
		long companyId, long groupId, int status,
		OrderByComparator<Candidate> orderByComparator)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence()
				   .findBystatus_PrevAndNext(candidateId, companyId, groupId,
			status, orderByComparator);
	}

	/**
	* Removes all the candidates where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeBystatus(long companyId, long groupId, int status) {
		getPersistence().removeBystatus(companyId, groupId, status);
	}

	/**
	* Returns the number of candidates where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching candidates
	*/
	public static int countBystatus(long companyId, long groupId, int status) {
		return getPersistence().countBystatus(companyId, groupId, status);
	}

	/**
	* Caches the candidate in the entity cache if it is enabled.
	*
	* @param candidate the candidate
	*/
	public static void cacheResult(Candidate candidate) {
		getPersistence().cacheResult(candidate);
	}

	/**
	* Caches the candidates in the entity cache if it is enabled.
	*
	* @param candidates the candidates
	*/
	public static void cacheResult(List<Candidate> candidates) {
		getPersistence().cacheResult(candidates);
	}

	/**
	* Creates a new candidate with the primary key. Does not add the candidate to the database.
	*
	* @param candidateId the primary key for the new candidate
	* @return the new candidate
	*/
	public static Candidate create(long candidateId) {
		return getPersistence().create(candidateId);
	}

	/**
	* Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate that was removed
	* @throws NoSuchCandidateException if a candidate with the primary key could not be found
	*/
	public static Candidate remove(long candidateId)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence().remove(candidateId);
	}

	public static Candidate updateImpl(Candidate candidate) {
		return getPersistence().updateImpl(candidate);
	}

	/**
	* Returns the candidate with the primary key or throws a {@link NoSuchCandidateException} if it could not be found.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate
	* @throws NoSuchCandidateException if a candidate with the primary key could not be found
	*/
	public static Candidate findByPrimaryKey(long candidateId)
		throws com.zeus.hr.exception.NoSuchCandidateException {
		return getPersistence().findByPrimaryKey(candidateId);
	}

	/**
	* Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
	*/
	public static Candidate fetchByPrimaryKey(long candidateId) {
		return getPersistence().fetchByPrimaryKey(candidateId);
	}

	public static java.util.Map<java.io.Serializable, Candidate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the candidates.
	*
	* @return the candidates
	*/
	public static List<Candidate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of candidates
	*/
	public static List<Candidate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of candidates
	*/
	public static List<Candidate> findAll(int start, int end,
		OrderByComparator<Candidate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of candidates
	*/
	public static List<Candidate> findAll(int start, int end,
		OrderByComparator<Candidate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the candidates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of candidates.
	*
	* @return the number of candidates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CandidatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CandidatePersistence, CandidatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CandidatePersistence.class);
}