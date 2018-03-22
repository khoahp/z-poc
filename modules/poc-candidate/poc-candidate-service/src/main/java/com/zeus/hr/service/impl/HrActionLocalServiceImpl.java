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

package com.zeus.hr.service.impl;

import java.util.List;

import com.zeus.hr.model.HrAction;
import com.zeus.hr.service.base.HrActionLocalServiceBaseImpl;

/**
 * The implementation of the hr action local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.zeus.hr.service.HrActionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HrActionLocalServiceBaseImpl
 * @see com.zeus.hr.service.HrActionLocalServiceUtil
 */
public class HrActionLocalServiceImpl extends HrActionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.zeus.hr.service.HrActionLocalServiceUtil} to access the hr action local service.
	 */

	public List<HrAction> getHrActionsByCandidateId(long companyId, long groupId, long candidateId) {
		return hrActionPersistence.findBycandidateId(companyId, groupId, candidateId);
	}
}