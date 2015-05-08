package com.proxym.service;

import org.exoplatform.container.PortalContainer;
import org.exoplatform.portal.application.PortalRequestContext;
//import org.exoplatform.service.SocialService;
//import org.exoplatform.services.security.ConversationState;
//import org.exoplatform.social.core.identity.model.Identity;
//import org.exoplatform.social.core.identity.provider.OrganizationIdentityProvider;
//import org.exoplatform.social.core.manager.ActivityManager;
//import org.exoplatform.social.core.manager.IdentityManager;
import org.exoplatform.services.organization.OrganizationService;
import org.exoplatform.services.organization.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	public User getUserCurrent() throws Exception {
		
		User portletUser = null;
		PortalRequestContext portalRequestContext = PortalRequestContext.getCurrentInstance();
		
		// Get the id of the current user logged in
		
		String remoteUserName = portalRequestContext.getRemoteUser();
		OrganizationService organizationService = (OrganizationService)PortalContainer.getInstance().getComponentInstanceOfType(
		OrganizationService.class);
		 
		if (remoteUserName != null) {
		portletUser = organizationService.getUserHandler().findUserByName(remoteUserName);
		}
		return portletUser;
		
		
		 
//		String activityText = null;
//		// Gets the current container.
//				PortalContainer container = PortalContainer.getInstance();
//				// Gets the current user id
//				ConversationState conversationState = ConversationState.getCurrent();
//				org.exoplatform.services.security.Identity identity = conversationState.getIdentity();
//				String userId = identity.getUserId();
//				// Gets identityManager to handle an identity operation.
//				IdentityManager identityManager = (IdentityManager) container.getComponentInstanceOfType(IdentityManager.class);
//
//				// Gets an existing social identity or creates a new one.
//				Identity userIdentity = identityManager.getOrCreateIdentity(OrganizationIdentityProvider.NAME, userId, false);
//
//				// Gets activityManager to handle an activity operation.
//				ActivityManager activityManager = (ActivityManager) container.getComponentInstanceOfType(ActivityManager.class);
//
//				// Saves an activity by using ActivityManager.
//				activityManager.saveActivity(userIdentity, null, activityText);
//		
		
		
		
	}

}
