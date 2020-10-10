package net.metaclient.r6api.entity;

public class ProfilePlayer {
	
	String pId, pName, pPlatform;
	boolean verified;
	
	public ProfilePlayer(String pId, String pName, String pPlatform, boolean verified) {
		this.pId = pId;
		this.pName = pName;
		this.pPlatform = pPlatform;
		this.verified = verified;
	}

	public String getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}
	
	public String getpPlatform() {
		return pPlatform;
	}

	public boolean isVerified() {
		return verified;
	}

}
