package net.metaclient.r6api.test;

import net.metaclient.r6api.api.R6Api;
import net.metaclient.r6api.api.R6ApiImpl;
import net.metaclient.r6api.entity.Player;
import net.metaclient.r6api.entity.ProfilePlayer;

public class R6ApiTest {
	
	public static void main(String[] args) {
		R6ApiImpl api = new R6Api();
		ProfilePlayer pp = api.getProfilePlayerByName("Bugisoft2100");
		System.out.println(pp.getpId() + ";" + pp.getpName() + ";" + pp.getpPlatform());
		Player p = api.getPlayerByProfile(pp);
		System.out.println(pp.getpName() + " hat " + p.getStats().getGeneralStats().getGeneralPvPStats().getDeaths() + " Tode");
	}

}
