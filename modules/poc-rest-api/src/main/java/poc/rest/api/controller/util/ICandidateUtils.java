
package poc.rest.api.controller.util;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.zeus.hr.model.Candidate;
import com.zeus.hr.model.HrAction;
import com.zeus.hr.service.HrActionLocalServiceUtil;

import poc.rest.api.dto.CandidateDataModel;
import poc.rest.api.dto.CandidateInputModel;
import poc.rest.api.dto.FeedbackModel;

public class ICandidateUtils {

	public static List<CandidateDataModel> mappingToCandidateResultModel(List<Candidate> candidateList) {

		List<CandidateDataModel> data = new ArrayList<CandidateDataModel>();

		for (Candidate object : candidateList) {
			CandidateDataModel candidate = new CandidateDataModel();

			candidate.setFirstName(object.getFirstName());
			candidate.setLastName(object.getLastName());
			candidate.setMobilePhone(object.getMobilePhone());
			candidate.setEmail(object.getEmail());
			candidate.setDateOfBirth(DateTimeUtils.convertDateToString(object.getDateOfBirth()));
			candidate.setCity(object.getCity());
			candidate.setAppliedFor(object.getAppliedFor());
			candidate.setNote(object.getNote());
			candidate.setSkills(object.getSkills());
			candidate.setSource(object.getSource());
			candidate.setInternalId(object.getInternalId());
			candidate.setReceivedDate(DateTimeUtils.convertDateToString(object.getReceivedDate()));
			candidate.setInternalNote(object.getInternalNote());
			candidate.setInternalDetails(object.getInternalDetails());
//			candidate.setAttachment(object.getAttachment());
			// Get info file Attachment
			String strAttachment = object.getAttachment();
			if (Validator.isNotNull(strAttachment)) {
				String[] splitAttachmentId = strAttachment.split(StringPool.COMMA);
				if (splitAttachmentId != null && splitAttachmentId.length > 0) {
					for (String strId : splitAttachmentId) {
						long fileEntryId = GetterUtil.getLong(strId);
						//TODO
					}
				}
			}
			// Set info Feedback
			long companyId = object.getCompanyId();
			long groupId = object.getGroupId();
			long candidateId = object.getCandidateId();
			List<HrAction> hrActionList = HrActionLocalServiceUtil.getHrActionsByCandidateId(companyId, groupId, candidateId);
			List<FeedbackModel> feedBackList = null;
			if (hrActionList != null && hrActionList.size() > 0) {
				feedBackList = new ArrayList<FeedbackModel>();
				for (HrAction hrAction : hrActionList) {
					FeedbackModel feedBack = new FeedbackModel();

					feedBack.setFeedbackId(hrAction.getFeedbackId());
					feedBack.setType(hrAction.getType());
					feedBack.setDate(DateTimeUtils.convertDateToString(hrAction.getDate()));
					feedBack.setNote(hrAction.getNote());
					feedBack.setFeedback(hrAction.getFeedback());

					feedBackList.add(feedBack);
				}
				candidate.getFeedback().addAll(feedBackList);
			}
			candidate.setStatus(object.getStatus());
			candidate.setRating(object.getRating());

			data.add(candidate);
		}
		return data;
		
	}

	public static CandidateInputModel mappingToCandidateModel(Candidate object) {

		CandidateInputModel model = new CandidateInputModel();

		model.setFirstName(object.getFirstName());
		model.setLastName(object.getLastName());
		model.setMobilePhone(object.getMobilePhone());
		model.setEmail(object.getEmail());
		model.setDateOfBirth(DateTimeUtils.convertDateToString(object.getDateOfBirth()));
		model.setCity(object.getCity());
		model.setAppliedFor(object.getAppliedFor());
		model.setNote(object.getNote());
		model.setSkills(object.getSkills());
		model.setSource(object.getSource());
		model.setInternalId(object.getInternalId());
		model.setReceivedDate(DateTimeUtils.convertDateToString(object.getReceivedDate()));
		model.setInternalNote(object.getInternalNote());
		model.setInternalDetails(object.getInternalDetails());
		model.setAttachment(object.getAttachment());
		model.setStatus(object.getStatus());
		model.setRating(object.getRating());

		return model;
	}

}
