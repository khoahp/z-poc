
package poc.rest.auth;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;

public class BackendAuthImpl implements BackendAuth {

	Log _log = LogFactoryUtil.getLog(BackendAuthImpl.class);

	@Override
	public boolean hasResource(ServiceContext context, String name, String actionId) {

		boolean hasPermission = false;

		List<Role> roles = RoleLocalServiceUtil.getUserRoles(context.getUserId());
		try {
			for (Role role : roles) {

				if (role.getName().equals("Administrator")) {

					hasPermission = true;
					break;

				}

				hasPermission = ResourcePermissionLocalServiceUtil.hasResourcePermission(context.getCompanyId(), name,
						ResourceConstants.SCOPE_INDIVIDUAL, Long.toString(role.getRoleId()), role.getRoleId(),
						actionId);

				if (hasPermission) {
					break;
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return hasPermission;
	}

	@Override
	public boolean userHasResource(ServiceContext context, String name, String actionId) {

		boolean hasPermission = false;

		List<Role> roles = RoleLocalServiceUtil.getUserRoles(context.getUserId());

		try {
			for (Role role : roles) {

				hasPermission = ResourcePermissionLocalServiceUtil.hasResourcePermission(context.getCompanyId(), name,
						ResourceConstants.SCOPE_INDIVIDUAL, Long.toString(role.getRoleId()), role.getRoleId(),
						actionId);

				if (hasPermission) {
					break;
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return hasPermission;
	}

	@Override
	public boolean isAdmin(ServiceContext context, String modelName) {

		boolean isAdmin = false;

		List<Role> roles = RoleLocalServiceUtil.getUserRoles(context.getUserId());
		try {
			for (Role role : roles) {

				if (role.getName().equals("Administrator")) {

					isAdmin = true;
					break;

				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return isAdmin;
	}

	@Override
	public boolean isAuth(ServiceContext context, String security, String password) {

		boolean isAuth = false;

		isAuth = context.isSignedIn();

		return isAuth;
	}

}
