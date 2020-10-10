package net.metaclient.r6api.entity.stats;

public class RankedStats {
	
	int kills, deaths, matchWins, matchLooses, timePlayed, hoursPlayed, matches;
	String kd, winLooseRate;
	
	public RankedStats(int kills, int deaths, int matchWins, int matchLooses, int timePlayed, int hoursPlayed, int matches, String kd, String winLooseRate) {
		this.kills = kills;
		this.deaths = deaths;
		this.matchWins = matchWins;
		this.matchLooses = matchLooses;
		this.timePlayed = timePlayed;
		this.hoursPlayed = hoursPlayed;
		this.matches = matches;
		this.kd = kd;
		this.winLooseRate = winLooseRate;
	}

	public int getKills() {
		return kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public int getMatchWins() {
		return matchWins;
	}

	public int getMatchLooses() {
		return matchLooses;
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

}
