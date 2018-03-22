package poc.rest.api.controller.impl;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.zeus.hr.action.ICandidateInteface;
import com.zeus.hr.action.impl.ICandidateActionsImpl;
import com.zeus.hr.model.Candidate;

import poc.rest.api.controller.ICandidateController;
import poc.rest.api.controller.util.DateTimeUtils;
import poc.rest.api.controller.util.ICandidateUtils;
import poc.rest.api.dto.CandidateInputModel;
import poc.rest.api.dto.CandidateListModel;
import poc.rest.api.dto.exceptions.ErrorMsg;
import poc.rest.auth.BackendAuth;
import poc.rest.auth.BackendAuthImpl;
import poc.rest.auth.exception.UnauthenticationException;
import poc.rest.auth.exception.UnauthorizationException;

public class ICandidateControllerImpl implements ICandidateController {

	private static final Log _log = LogFactoryUtil.getLog(ICandidateControllerImpl.class);
	@Override
	public Response getAllCandidates(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		long companyId = serviceContext.getCompanyId();

		try {

			ICandidateInteface actions = new ICandidateActionsImpl();
			CandidateListModel results = new CandidateListModel();
			//
			List<Candidate> candidateList = actions.getAllCandidates(companyId, groupId);
			if (candidateList != null && candidateList.size() > 0) {
				results.setTotal(candidateList.size());
				results.getData().addAll(ICandidateUtils.mappingToCandidateResultModel(candidateList));
			}

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response getCandidateById(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response addCandidate(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, CandidateInputModel input) {
		
		BackendAuth auth = new BackendAuthImpl();
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, Candidate.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			ICandidateInteface actions = new ICandidateActionsImpl();
			CandidateInputModel results = null;

			String firstName = input.getFirstName();
			String lastName = input.getLastName();
			Date dateOfBirth = DateTimeUtils.convertStringToDate(input.getDateOfBirth(),DateTimeUtils._NORMAL_PARTTERN);
			String mobilePhone = input.getMobilePhone();
			String email = input.getEmail();
			long city = GetterUtil.getLong(input.getCity());
			String appliedFor = input.getAppliedFor();
			String note = input.getNote();
			String skills = input.getSkills();
			String source = input.getSource();
			String internalId = input.getInternalId();
			Date receivedDate = DateTimeUtils.convertStringToDate(input.getReceivedDate(),DateTimeUtils._NORMAL_PARTTERN);
			String internalNote = input.getInternalNote();
			String internalDetails = input.getInternalDetails();
			String attachment = input.getAttachment();
			int rating = GetterUtil.getInteger(input.getRating());
			int status = GetterUtil.getInteger(input.getStatus());

			Candidate candidate = actions.addCandidate(groupId, firstName, lastName, dateOfBirth, mobilePhone,
					email, city, appliedFor, note, skills, source, internalId,
					receivedDate, internalNote, internalDetails, attachment, rating,
					status, serviceContext);

			if (candidate != null) {
				results = ICandidateUtils.mappingToCandidateModel(candidate);
			}

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response updateCandidate(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, CandidateInputModel input,
			String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response removeCandidate(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, String id) {

		BackendAuth auth = new BackendAuthImpl();
		long candidateId = GetterUtil.getLong(id);

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, Candidate.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			ICandidateInteface actions = new ICandidateActionsImpl();
			CandidateInputModel results = null;

			Candidate candidate = actions.deleteById(candidateId);
			if (Validator.isNotNull(candidate)) {
				results = ICandidateUtils.mappingToCandidateModel(candidate);
			} else {
				throw new Exception();
			}

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response addFeedback(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, CandidateInputModel input,
			String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response addAttachment(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, Attachment file, String fileType,
			int fileSize, String fileName, String id) {

		BackendAuth auth = new BackendAuthImpl();
//		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		long groupId = user.getGroupId();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, Candidate.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			ICandidateInteface actions = new ICandidateActionsImpl();
			long candidateId = GetterUtil.getLong(id);
			CandidateInputModel results = null;

			DataHandler dataHandler = file.getDataHandler();

			Candidate candidate = actions.addFileByCandidateId(groupId, candidateId, fileName, dataHandler.getName(),
					fileSize, dataHandler.getInputStream(), fileType, serviceContext);
			if (candidate != null) {
				results = ICandidateUtils.mappingToCandidateModel(candidate);
			}

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response exportCandidate(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	private Response processException(Exception e) {
		ErrorMsg error = new ErrorMsg();

		if (e instanceof UnauthenticationException) {
			error.setMessage("Non-Authoritative Information.");
			error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
			error.setDescription("Non-Authoritative Information.");

			return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
		} else {
			if (e instanceof UnauthorizationException) {
				error.setMessage("Unauthorized.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Unauthorized.");

				return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

			} else {

				error.setMessage("Internal Server Error");
				error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
				error.setDescription(e.getMessage());

				return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

			}
		}
	}
}
