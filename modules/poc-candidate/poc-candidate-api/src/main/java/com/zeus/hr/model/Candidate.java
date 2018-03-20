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

package com.zeus.hr.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Candidate service. Represents a row in the &quot;zhr_Candidate&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CandidateModel
 * @see com.zeus.hr.model.impl.CandidateImpl
 * @see com.zeus.hr.model.impl.CandidateModelImpl
 * @generated
 */
@ImplementationClassName("com.zeus.hr.model.impl.CandidateImpl")
@ProviderType
public interface Candidate extends CandidateModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.zeus.hr.model.impl.CandidateImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Candidate, Long> CANDIDATE_ID_ACCESSOR = new Accessor<Candidate, Long>() {
			@Override
			public Long get(Candidate candidate) {
				return candidate.getCandidateId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Candidate> getTypeClass() {
				return Candidate.class;
			}
		};
}