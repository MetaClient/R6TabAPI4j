package net.metaclient.r6api.entity;

import net.metaclient.r6api.entity.stats.CasualStats;
import net.metaclient.r6api.entity.stats.GeneralStats;
import net.metaclient.r6api.entity.stats.RankedStats;
import net.metaclient.r6api.entity.stats.UnrankedStats;

public class Stats {
	
	int level;
	CasualStats casualStats;
	UnrankedStats unrankedStats;
	RankedStats rankedStats;
	GeneralStats generalStats;

	public Stats(int level, CasualStats casualStats, UnrankedStats unrankedStats, RankedStats rankedStats, GeneralStats generalStats) {
		this.level = level;
		this.casualStats = casualStats;
		this.unrankedStats = unrankedStats;
		this.rankedStats = rankedStats;
		this.generalStats = generalStats;
	}
	
	public int getLevel() {
		return level;
	}
	
	public CasualStats getCasualStats() {
		return casualStats;
	}
	
	public UnrankedStats getUnrankedStats() {
		return unrankedStats;
	}

	public RankedStats getRankedStats() {
		return rankedStats;
	}
	
	public GeneralStats getGeneralStats() {
		return generalStats;
	}
	
}
