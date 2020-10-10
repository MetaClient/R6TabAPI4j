package net.metaclient.r6api.entity.stats;

public class GeneralStats {
	
	public GeneralPvPStats generalPvPStats;
	public GeneralPvEStats generalPveStats;

	public GeneralStats(GeneralPvPStats generalPvPStats, GeneralPvEStats generalPveStats) {
		this.generalPvPStats = generalPvPStats;
		this.generalPveStats = generalPveStats;
	}

	public static class GeneralPvPStats {
		int headshot, kills, death, timePlayed, hoursPlayed, matchWon, matchLost, matches, killAssists, meleeKills, revive, penetrationKills;
		String kd, winLooseRate, hsRate;
		
		public GeneralPvPStats(int headshot, int kills, int death, int timePlayed, int hoursPlayed, int matchWon, int matchLost, int matches, int killAssists, int meleeKills, int revive, int penetrationKills, String kd, String winLooseRate, String hsRate) {
			this.headshot = headshot;
			this.kills = kills;
			this.death = death;
			this.timePlayed = timePlayed;
			this.hoursPlayed = hoursPlayed;
			this.matchWon = matchWon;
			this.matchLost = matchLost;
			this.matches = matches;
			this.killAssists = killAssists;
			this.meleeKills = meleeKills;
			this.revive = revive;
			this.penetrationKills = penetrationKills;
			this.kd = kd;
			this.winLooseRate = winLooseRate;
			this.hsRate = hsRate;
		}

		public int getHeadshot() {
			return headshot;
		}

		public int getKills() {
			return kills;
		}

		public int getDeaths() {
			return death;
		}

		public int getTimePlayed() {
			return timePlayed;
		}

		public int getHoursPlayed() {
			return hoursPlayed;
		}

		public int getMatchWon() {
			return matchWon;
		}

		public int getMatchLost() {
			return matchLost;
		}

		public int getMatches() {
			return matches;
		}

		public int getKillAssists() {
			return killAssists;
		}

		public int getMeleeKills() {
			return meleeKills;
		}

		public int getRevive() {
			return revive;
		}

		public int getPenetrationKills() {
			return penetrationKills;
		}

		public String getKd() {
			return kd;
		}

		public String getWinLooseRate() {
			return winLooseRate;
		}

		public String getHsRate() {
			return hsRate;
		}
		
	}
	
	public static class GeneralPvEStats {
		int kills, matchWon, matchLost, headshot, timePlayed, hoursPlayed, matches;
		String kd, winLooseRate, hsRate;
		
		public GeneralPvEStats(int kills, int matchWon, int matchLost, int headshot, int timePlayed, int hoursPlayed, int matches, String kd, String winLooseRate, String hsRate) {
			this.kills = kills;
			this.matchWon = matchWon;
			this.matchLost = matchLost;
			this.headshot = headshot;
			this.timePlayed = timePlayed;
			this.hoursPlayed = hoursPlayed;
			this.matches = matches;
			this.kd = kd;
			this.winLooseRate = winLooseRate;
			this.hsRate = hsRate;
		}

		public int getKills() {
			return kills;
		}

		public int getMatchWon() {
			return matchWon;
		}

		public int getMatchLost() {
			return matchLost;
		}

		public int getHeadshot() {
			return headshot;
		}

		public int getTimePlayed() {
			return timePlayed;
		}

		public int getHoursPlayed() {
			return hoursPlayed;
		}

		public int getMatches() {
			return matches;
		}

		public String getKd() {
			return kd;
		}

		public String getWinLooseRate() {
			return winLooseRate;
		}

		public String getHsRate() {
			return hsRate;
		}
		
	}

	public GeneralPvPStats getGeneralPvPStats() {
		return generalPvPStats;
	}

	public GeneralPvEStats getGeneralPveStats() {
		return generalPveStats;
	}
	
}
