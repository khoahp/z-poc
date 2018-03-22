package poc.rest.api.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import poc.rest.api.context.provider.CompanyContextProvider;
import poc.rest.api.context.provider.LocaleContextProvider;
import poc.rest.api.context.provider.ServiceContextProvider;
import poc.rest.api.context.provider.UserContextProvider;
import poc.rest.api.controller.impl.ICandidateControllerImpl;

/**
 * @author khoavu
 */
@ApplicationPath("/api/v2")
@Component(immediate = true, service = Application.class)
public class POCRestAPIApplication extends Application {

	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		
		// add REST endpoints (resources)
		singletons.add(new ICandidateControllerImpl());
		
		// add serviceProvider
		singletons.add(_serviceContextProvider);
		singletons.add(_companyContextProvider);
		singletons.add(_localeContextProvider);
		singletons.add(_userContextProvider);
		
		return singletons;	
	}


	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}


	@Reference
	private CompanyContextProvider _companyContextProvider;

	@Reference
	private LocaleContextProvider _localeContextProvider;

	@Reference
	private UserContextProvider _userContextProvider;

	@Reference
	private ServiceContextProvider _serviceContextProvider;
}