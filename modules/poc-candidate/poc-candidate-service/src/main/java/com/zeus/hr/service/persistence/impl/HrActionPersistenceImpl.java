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

package com.zeus.hr.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.zeus.hr.exception.NoSuchHrActionException;
import com.zeus.hr.model.HrAction;
import com.zeus.hr.model.impl.HrActionImpl;
import com.zeus.hr.model.impl.HrActionModelImpl;
import com.zeus.hr.service.persistence.HrActionPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the hr action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HrActionPersistence
 * @see com.zeus.hr.service.persistence.HrActionUtil
 * @generated
 */
@ProviderType
public class HrActionPersistenceImpl extends BasePersistenceImpl<HrAction>
	implements HrActionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HrActionUtil} to access the hr action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HrActionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			HrActionModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the hr actions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hr actions
	 */
	@Override
	public List<HrAction> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HrAction> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<HrAction> findByUuid(String uuid, int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<HrAction> findByUuid(String uuid, int start, int end,
		OrderByComparator<HrAction> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<HrAction> list = null;

		if (retrieveFromCache) {
			list = (List<HrAction>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HrAction hrAction : list) {
					if (!Objects.equals(uuid, hrAction.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_HRACTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HrActionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first hr action in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hr action
	 * @throws NoSuchHrActionException if a matching hr action could not be found
	 */
	@Override
	public HrAction findByUuid_First(String uuid,
		OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchByUuid_First(uuid, orderByComparator);

		if (hrAction != null) {
			return hrAction;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHrActionException(msg.toString());
	}

	/**
	 * Returns the first hr action in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	 */
	@Override
	public HrAction fetchByUuid_First(String uuid,
		OrderByComparator<HrAction> orderByComparator) {
		List<HrAction> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hr action in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hr action
	 * @throws NoSuchHrActionException if a matching hr action could not be found
	 */
	@Override
	public HrAction findByUuid_Last(String uuid,
		OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchByUuid_Last(uuid, orderByComparator);

		if (hrAction != null) {
			return hrAction;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHrActionException(msg.toString());
	}

	/**
	 * Returns the last hr action in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	 */
	@Override
	public HrAction fetchByUuid_Last(String uuid,
		OrderByComparator<HrAction> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<HrAction> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HrAction[] findByUuid_PrevAndNext(long feedbackId, String uuid,
		OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			HrAction[] array = new HrActionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, hrAction, uuid,
					orderByComparator, true);

			array[1] = hrAction;

			array[2] = getByUuid_PrevAndNext(session, hrAction, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HrAction getByUuid_PrevAndNext(Session session,
		HrAction hrAction, String uuid,
		OrderByComparator<HrAction> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HRACTION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(HrActionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(hrAction);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HrAction> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hr actions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (HrAction hrAction : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(hrAction);
		}
	}

	/**
	 * Returns the number of hr actions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hr actions
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HRACTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "hrAction.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "hrAction.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(hrAction.uuid IS NULL OR hrAction.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			HrActionModelImpl.UUID_COLUMN_BITMASK |
			HrActionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the hr action where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHrActionException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hr action
	 * @throws NoSuchHrActionException if a matching hr action could not be found
	 */
	@Override
	public HrAction findByUUID_G(String uuid, long groupId)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchByUUID_G(uuid, groupId);

		if (hrAction == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchHrActionException(msg.toString());
		}

		return hrAction;
	}

	/**
	 * Returns the hr action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	 */
	@Override
	public HrAction fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the hr action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching hr action, or <code>null</code> if a matching hr action could not be found
	 */
	@Override
	public HrAction fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof HrAction) {
			HrAction hrAction = (HrAction)result;

			if (!Objects.equals(uuid, hrAction.getUuid()) ||
					(groupId != hrAction.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_HRACTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<HrAction> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					HrAction hrAction = list.get(0);

					result = hrAction;

					cacheResult(hrAction);

					if ((hrAction.getUuid() == null) ||
							!hrAction.getUuid().equals(uuid) ||
							(hrAction.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, hrAction);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (HrAction)result;
		}
	}

	/**
	 * Removes the hr action where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hr action that was removed
	 */
	@Override
	public HrAction removeByUUID_G(String uuid, long groupId)
		throws NoSuchHrActionException {
		HrAction hrAction = findByUUID_G(uuid, groupId);

		return remove(hrAction);
	}

	/**
	 * Returns the number of hr actions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hr actions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_HRACTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "hrAction.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "hrAction.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(hrAction.uuid IS NULL OR hrAction.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "hrAction.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			HrActionModelImpl.UUID_COLUMN_BITMASK |
			HrActionModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the hr actions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hr actions
	 */
	@Override
	public List<HrAction> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<HrAction> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<HrAction> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<HrAction> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<HrAction> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<HrAction> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<HrAction> list = null;

		if (retrieveFromCache) {
			list = (List<HrAction>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HrAction hrAction : list) {
					if (!Objects.equals(uuid, hrAction.getUuid()) ||
							(companyId != hrAction.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_HRACTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HrActionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public HrAction findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (hrAction != null) {
			return hrAction;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHrActionException(msg.toString());
	}

	/**
	 * Returns the first hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hr action, or <code>null</code> if a matching hr action could not be found
	 */
	@Override
	public HrAction fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<HrAction> orderByComparator) {
		List<HrAction> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HrAction findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (hrAction != null) {
			return hrAction;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHrActionException(msg.toString());
	}

	/**
	 * Returns the last hr action in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hr action, or <code>null</code> if a matching hr action could not be found
	 */
	@Override
	public HrAction fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<HrAction> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<HrAction> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HrAction[] findByUuid_C_PrevAndNext(long feedbackId, String uuid,
		long companyId, OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			HrAction[] array = new HrActionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, hrAction, uuid,
					companyId, orderByComparator, true);

			array[1] = hrAction;

			array[2] = getByUuid_C_PrevAndNext(session, hrAction, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HrAction getByUuid_C_PrevAndNext(Session session,
		HrAction hrAction, String uuid, long companyId,
		OrderByComparator<HrAction> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_HRACTION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(HrActionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(hrAction);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HrAction> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hr actions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (HrAction hrAction : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(hrAction);
		}
	}

	/**
	 * Returns the number of hr actions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hr actions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_HRACTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "hrAction.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "hrAction.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(hrAction.uuid IS NULL OR hrAction.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "hrAction.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CANDIDATEID =
		new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycandidateId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CANDIDATEID =
		new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, HrActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycandidateId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			HrActionModelImpl.COMPANYID_COLUMN_BITMASK |
			HrActionModelImpl.GROUPID_COLUMN_BITMASK |
			HrActionModelImpl.CANDIDATEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CANDIDATEID = new FinderPath(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycandidateId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param candidateId the candidate ID
	 * @return the matching hr actions
	 */
	@Override
	public List<HrAction> findBycandidateId(long companyId, long groupId,
		long candidateId) {
		return findBycandidateId(companyId, groupId, candidateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HrAction> findBycandidateId(long companyId, long groupId,
		long candidateId, int start, int end) {
		return findBycandidateId(companyId, groupId, candidateId, start, end,
			null);
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
	@Override
	public List<HrAction> findBycandidateId(long companyId, long groupId,
		long candidateId, int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return findBycandidateId(companyId, groupId, candidateId, start, end,
			orderByComparator, true);
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
	@Override
	public List<HrAction> findBycandidateId(long companyId, long groupId,
		long candidateId, int start, int end,
		OrderByComparator<HrAction> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CANDIDATEID;
			finderArgs = new Object[] { companyId, groupId, candidateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CANDIDATEID;
			finderArgs = new Object[] {
					companyId, groupId, candidateId,
					
					start, end, orderByComparator
				};
		}

		List<HrAction> list = null;

		if (retrieveFromCache) {
			list = (List<HrAction>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HrAction hrAction : list) {
					if ((companyId != hrAction.getCompanyId()) ||
							(groupId != hrAction.getGroupId()) ||
							(candidateId != hrAction.getCandidateId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_HRACTION_WHERE);

			query.append(_FINDER_COLUMN_CANDIDATEID_COMPANYID_2);

			query.append(_FINDER_COLUMN_CANDIDATEID_GROUPID_2);

			query.append(_FINDER_COLUMN_CANDIDATEID_CANDIDATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HrActionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(candidateId);

				if (!pagination) {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public HrAction findBycandidateId_First(long companyId, long groupId,
		long candidateId, OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchBycandidateId_First(companyId, groupId,
				candidateId, orderByComparator);

		if (hrAction != null) {
			return hrAction;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", candidateId=");
		msg.append(candidateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHrActionException(msg.toString());
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
	@Override
	public HrAction fetchBycandidateId_First(long companyId, long groupId,
		long candidateId, OrderByComparator<HrAction> orderByComparator) {
		List<HrAction> list = findBycandidateId(companyId, groupId,
				candidateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HrAction findBycandidateId_Last(long companyId, long groupId,
		long candidateId, OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchBycandidateId_Last(companyId, groupId,
				candidateId, orderByComparator);

		if (hrAction != null) {
			return hrAction;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", candidateId=");
		msg.append(candidateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHrActionException(msg.toString());
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
	@Override
	public HrAction fetchBycandidateId_Last(long companyId, long groupId,
		long candidateId, OrderByComparator<HrAction> orderByComparator) {
		int count = countBycandidateId(companyId, groupId, candidateId);

		if (count == 0) {
			return null;
		}

		List<HrAction> list = findBycandidateId(companyId, groupId,
				candidateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public HrAction[] findBycandidateId_PrevAndNext(long feedbackId,
		long companyId, long groupId, long candidateId,
		OrderByComparator<HrAction> orderByComparator)
		throws NoSuchHrActionException {
		HrAction hrAction = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			HrAction[] array = new HrActionImpl[3];

			array[0] = getBycandidateId_PrevAndNext(session, hrAction,
					companyId, groupId, candidateId, orderByComparator, true);

			array[1] = hrAction;

			array[2] = getBycandidateId_PrevAndNext(session, hrAction,
					companyId, groupId, candidateId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HrAction getBycandidateId_PrevAndNext(Session session,
		HrAction hrAction, long companyId, long groupId, long candidateId,
		OrderByComparator<HrAction> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_HRACTION_WHERE);

		query.append(_FINDER_COLUMN_CANDIDATEID_COMPANYID_2);

		query.append(_FINDER_COLUMN_CANDIDATEID_GROUPID_2);

		query.append(_FINDER_COLUMN_CANDIDATEID_CANDIDATEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(HrActionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(candidateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(hrAction);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HrAction> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param candidateId the candidate ID
	 */
	@Override
	public void removeBycandidateId(long companyId, long groupId,
		long candidateId) {
		for (HrAction hrAction : findBycandidateId(companyId, groupId,
				candidateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(hrAction);
		}
	}

	/**
	 * Returns the number of hr actions where companyId = &#63; and groupId = &#63; and candidateId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param candidateId the candidate ID
	 * @return the number of matching hr actions
	 */
	@Override
	public int countBycandidateId(long companyId, long groupId, long candidateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CANDIDATEID;

		Object[] finderArgs = new Object[] { companyId, groupId, candidateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_HRACTION_WHERE);

			query.append(_FINDER_COLUMN_CANDIDATEID_COMPANYID_2);

			query.append(_FINDER_COLUMN_CANDIDATEID_GROUPID_2);

			query.append(_FINDER_COLUMN_CANDIDATEID_CANDIDATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(candidateId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CANDIDATEID_COMPANYID_2 = "hrAction.companyId = ? AND ";
	private static final String _FINDER_COLUMN_CANDIDATEID_GROUPID_2 = "hrAction.groupId = ? AND ";
	private static final String _FINDER_COLUMN_CANDIDATEID_CANDIDATEID_2 = "hrAction.candidateId = ?";

	public HrActionPersistenceImpl() {
		setModelClass(HrAction.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");
			dbColumnNames.put("type", "type_");
			dbColumnNames.put("date", "date_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the hr action in the entity cache if it is enabled.
	 *
	 * @param hrAction the hr action
	 */
	@Override
	public void cacheResult(HrAction hrAction) {
		entityCache.putResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionImpl.class, hrAction.getPrimaryKey(), hrAction);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { hrAction.getUuid(), hrAction.getGroupId() }, hrAction);

		hrAction.resetOriginalValues();
	}

	/**
	 * Caches the hr actions in the entity cache if it is enabled.
	 *
	 * @param hrActions the hr actions
	 */
	@Override
	public void cacheResult(List<HrAction> hrActions) {
		for (HrAction hrAction : hrActions) {
			if (entityCache.getResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
						HrActionImpl.class, hrAction.getPrimaryKey()) == null) {
				cacheResult(hrAction);
			}
			else {
				hrAction.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all hr actions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HrActionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hr action.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HrAction hrAction) {
		entityCache.removeResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionImpl.class, hrAction.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((HrActionModelImpl)hrAction, true);
	}

	@Override
	public void clearCache(List<HrAction> hrActions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HrAction hrAction : hrActions) {
			entityCache.removeResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
				HrActionImpl.class, hrAction.getPrimaryKey());

			clearUniqueFindersCache((HrActionModelImpl)hrAction, true);
		}
	}

	protected void cacheUniqueFindersCache(HrActionModelImpl hrActionModelImpl) {
		Object[] args = new Object[] {
				hrActionModelImpl.getUuid(), hrActionModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			hrActionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		HrActionModelImpl hrActionModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					hrActionModelImpl.getUuid(), hrActionModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((hrActionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					hrActionModelImpl.getOriginalUuid(),
					hrActionModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new hr action with the primary key. Does not add the hr action to the database.
	 *
	 * @param feedbackId the primary key for the new hr action
	 * @return the new hr action
	 */
	@Override
	public HrAction create(long feedbackId) {
		HrAction hrAction = new HrActionImpl();

		hrAction.setNew(true);
		hrAction.setPrimaryKey(feedbackId);

		String uuid = PortalUUIDUtil.generate();

		hrAction.setUuid(uuid);

		hrAction.setCompanyId(companyProvider.getCompanyId());

		return hrAction;
	}

	/**
	 * Removes the hr action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param feedbackId the primary key of the hr action
	 * @return the hr action that was removed
	 * @throws NoSuchHrActionException if a hr action with the primary key could not be found
	 */
	@Override
	public HrAction remove(long feedbackId) throws NoSuchHrActionException {
		return remove((Serializable)feedbackId);
	}

	/**
	 * Removes the hr action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hr action
	 * @return the hr action that was removed
	 * @throws NoSuchHrActionException if a hr action with the primary key could not be found
	 */
	@Override
	public HrAction remove(Serializable primaryKey)
		throws NoSuchHrActionException {
		Session session = null;

		try {
			session = openSession();

			HrAction hrAction = (HrAction)session.get(HrActionImpl.class,
					primaryKey);

			if (hrAction == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHrActionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(hrAction);
		}
		catch (NoSuchHrActionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected HrAction removeImpl(HrAction hrAction) {
		hrAction = toUnwrappedModel(hrAction);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hrAction)) {
				hrAction = (HrAction)session.get(HrActionImpl.class,
						hrAction.getPrimaryKeyObj());
			}

			if (hrAction != null) {
				session.delete(hrAction);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (hrAction != null) {
			clearCache(hrAction);
		}

		return hrAction;
	}

	@Override
	public HrAction updateImpl(HrAction hrAction) {
		hrAction = toUnwrappedModel(hrAction);

		boolean isNew = hrAction.isNew();

		HrActionModelImpl hrActionModelImpl = (HrActionModelImpl)hrAction;

		if (Validator.isNull(hrAction.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			hrAction.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (hrAction.getCreateDate() == null)) {
			if (serviceContext == null) {
				hrAction.setCreateDate(now);
			}
			else {
				hrAction.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!hrActionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hrAction.setModifiedDate(now);
			}
			else {
				hrAction.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (hrAction.isNew()) {
				session.save(hrAction);

				hrAction.setNew(false);
			}
			else {
				hrAction = (HrAction)session.merge(hrAction);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!HrActionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { hrActionModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					hrActionModelImpl.getUuid(),
					hrActionModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] {
					hrActionModelImpl.getCompanyId(),
					hrActionModelImpl.getGroupId(),
					hrActionModelImpl.getCandidateId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CANDIDATEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CANDIDATEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((hrActionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { hrActionModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { hrActionModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((hrActionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						hrActionModelImpl.getOriginalUuid(),
						hrActionModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						hrActionModelImpl.getUuid(),
						hrActionModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((hrActionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CANDIDATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						hrActionModelImpl.getOriginalCompanyId(),
						hrActionModelImpl.getOriginalGroupId(),
						hrActionModelImpl.getOriginalCandidateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CANDIDATEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CANDIDATEID,
					args);

				args = new Object[] {
						hrActionModelImpl.getCompanyId(),
						hrActionModelImpl.getGroupId(),
						hrActionModelImpl.getCandidateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CANDIDATEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CANDIDATEID,
					args);
			}
		}

		entityCache.putResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
			HrActionImpl.class, hrAction.getPrimaryKey(), hrAction, false);

		clearUniqueFindersCache(hrActionModelImpl, false);
		cacheUniqueFindersCache(hrActionModelImpl);

		hrAction.resetOriginalValues();

		return hrAction;
	}

	protected HrAction toUnwrappedModel(HrAction hrAction) {
		if (hrAction instanceof HrActionImpl) {
			return hrAction;
		}

		HrActionImpl hrActionImpl = new HrActionImpl();

		hrActionImpl.setNew(hrAction.isNew());
		hrActionImpl.setPrimaryKey(hrAction.getPrimaryKey());

		hrActionImpl.setUuid(hrAction.getUuid());
		hrActionImpl.setFeedbackId(hrAction.getFeedbackId());
		hrActionImpl.setCandidateId(hrAction.getCandidateId());
		hrActionImpl.setCompanyId(hrAction.getCompanyId());
		hrActionImpl.setGroupId(hrAction.getGroupId());
		hrActionImpl.setType(hrAction.getType());
		hrActionImpl.setDate(hrAction.getDate());
		hrActionImpl.setNote(hrAction.getNote());
		hrActionImpl.setFeedback(hrAction.getFeedback());
		hrActionImpl.setCreateDate(hrAction.getCreateDate());
		hrActionImpl.setModifiedDate(hrAction.getModifiedDate());
		hrActionImpl.setCreatedUser(hrAction.getCreatedUser());
		hrActionImpl.setModifiedUser(hrAction.getModifiedUser());

		return hrActionImpl;
	}

	/**
	 * Returns the hr action with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hr action
	 * @return the hr action
	 * @throws NoSuchHrActionException if a hr action with the primary key could not be found
	 */
	@Override
	public HrAction findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHrActionException {
		HrAction hrAction = fetchByPrimaryKey(primaryKey);

		if (hrAction == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHrActionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return hrAction;
	}

	/**
	 * Returns the hr action with the primary key or throws a {@link NoSuchHrActionException} if it could not be found.
	 *
	 * @param feedbackId the primary key of the hr action
	 * @return the hr action
	 * @throws NoSuchHrActionException if a hr action with the primary key could not be found
	 */
	@Override
	public HrAction findByPrimaryKey(long feedbackId)
		throws NoSuchHrActionException {
		return findByPrimaryKey((Serializable)feedbackId);
	}

	/**
	 * Returns the hr action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hr action
	 * @return the hr action, or <code>null</code> if a hr action with the primary key could not be found
	 */
	@Override
	public HrAction fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
				HrActionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		HrAction hrAction = (HrAction)serializable;

		if (hrAction == null) {
			Session session = null;

			try {
				session = openSession();

				hrAction = (HrAction)session.get(HrActionImpl.class, primaryKey);

				if (hrAction != null) {
					cacheResult(hrAction);
				}
				else {
					entityCache.putResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
						HrActionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
					HrActionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return hrAction;
	}

	/**
	 * Returns the hr action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param feedbackId the primary key of the hr action
	 * @return the hr action, or <code>null</code> if a hr action with the primary key could not be found
	 */
	@Override
	public HrAction fetchByPrimaryKey(long feedbackId) {
		return fetchByPrimaryKey((Serializable)feedbackId);
	}

	@Override
	public Map<Serializable, HrAction> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, HrAction> map = new HashMap<Serializable, HrAction>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			HrAction hrAction = fetchByPrimaryKey(primaryKey);

			if (hrAction != null) {
				map.put(primaryKey, hrAction);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
					HrActionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (HrAction)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_HRACTION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (HrAction hrAction : (List<HrAction>)q.list()) {
				map.put(hrAction.getPrimaryKeyObj(), hrAction);

				cacheResult(hrAction);

				uncachedPrimaryKeys.remove(hrAction.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(HrActionModelImpl.ENTITY_CACHE_ENABLED,
					HrActionImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the hr actions.
	 *
	 * @return the hr actions
	 */
	@Override
	public List<HrAction> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HrAction> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<HrAction> findAll(int start, int end,
		OrderByComparator<HrAction> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<HrAction> findAll(int start, int end,
		OrderByComparator<HrAction> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<HrAction> list = null;

		if (retrieveFromCache) {
			list = (List<HrAction>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_HRACTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HRACTION;

				if (pagination) {
					sql = sql.concat(HrActionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<HrAction>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the hr actions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HrAction hrAction : findAll()) {
			remove(hrAction);
		}
	}

	/**
	 * Returns the number of hr actions.
	 *
	 * @return the number of hr actions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HRACTION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HrActionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hr action persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(HrActionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_HRACTION = "SELECT hrAction FROM HrAction hrAction";
	private static final String _SQL_SELECT_HRACTION_WHERE_PKS_IN = "SELECT hrAction FROM HrAction hrAction WHERE feedbackId IN (";
	private static final String _SQL_SELECT_HRACTION_WHERE = "SELECT hrAction FROM HrAction hrAction WHERE ";
	private static final String _SQL_COUNT_HRACTION = "SELECT COUNT(hrAction) FROM HrAction hrAction";
	private static final String _SQL_COUNT_HRACTION_WHERE = "SELECT COUNT(hrAction) FROM HrAction hrAction WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "hrAction.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HrAction exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HrAction exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(HrActionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "type", "date"
			});
}