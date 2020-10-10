package net.metaclient.r6api.api;

import net.metaclient.r6api.entity.Player;
import net.metaclient.r6api.entity.ProfilePlayer;

public interface R6ApiImpl {
	
	ProfilePlayer getProfilePlayerByName(String name);
	ProfilePlayer getProfilePlayerById();
	
	Player getPlayerByProfile(ProfilePlayer pp);

}
