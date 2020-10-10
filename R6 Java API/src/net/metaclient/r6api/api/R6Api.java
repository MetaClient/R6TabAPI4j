package net.metaclient.r6api.api;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.metaclient.r6api.entity.Player;
import net.metaclient.r6api.entity.ProfilePlayer;
import net.metaclient.r6api.entity.Stats;
import net.metaclient.r6api.entity.stats.CasualStats;
import net.metaclient.r6api.entity.stats.GeneralStats;
import net.metaclient.r6api.entity.stats.GeneralStats.GeneralPvEStats;
import net.metaclient.r6api.entity.stats.GeneralStats.GeneralPvPStats;
import net.metaclient.r6api.entity.stats.RankedStats;
import net.metaclient.r6api.entity.stats.UnrankedStats;

public class R6Api implements R6ApiImpl {

	@Override
	public ProfilePlayer getProfilePlayerByName(String name) {
		try {
			HttpGet request = null;

	        try {

	            HttpClient client = HttpClientBuilder.create().build();
	            request = new HttpGet("https://r6.apitab.com/search/uplay/" + name);

	            request.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.206");
	            HttpResponse response = client.execute(request);
	            
	            HttpEntity entity = response.getEntity();
	            String content = EntityUtils.toString(entity);
	            JsonObject playersObj = new JsonParser().parse(content).getAsJsonObject().get("players").getAsJsonObject();
	            JsonObject profileObj = (JsonObject) playersObj.entrySet().stream().findFirst().get().getValue().getAsJsonObject().get("profile");
	            return new ProfilePlayer(profileObj.get("p_id").getAsString(), name, profileObj.get("p_platform").getAsString(), profileObj.get("verified").getAsBoolean());

	        } finally {

	            if (request != null) {

	                request.releaseConnection();
	            }
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProfilePlayer getProfilePlayerById() {
		return null;
	}

	@Override
	public Player getPlayerByProfile(ProfilePlayer pp) {
		try {
			HttpGet request = null;

	        try {

	            HttpClient client = HttpClientBuilder.create().build();
	            request = new HttpGet("https://r6.apitab.com/player/" + pp.getpId());

	            request.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.206");
	            HttpResponse response = client.execute(request);
	            
	            HttpEntity entity = response.getEntity();
	            JsonObject obj = new JsonParser().parse(EntityUtils.toString(entity)).getAsJsonObject();
	            JsonObject stats = obj.get("stats").getAsJsonObject();
	            CasualStats casualStats = new CasualStats(stats.get("casualpvp_kills").getAsInt(), stats.get("casualpvp_death").getAsInt(), stats.get("casualpvp_matchwon").getAsInt(), stats.get("casualpvp_matchlost").getAsInt(), stats.get("casualpvp_timeplayed").getAsInt(), stats.get("casualpvp_hoursplayed").getAsInt(), stats.get("casualpvp_matches").getAsInt(), stats.get("casualpvp_kd").getAsString(), stats.get("casualpvp_wl").getAsString());
	            UnrankedStats unrankedStats = new UnrankedStats(stats.get("unrankedpvp_kills").getAsInt(), stats.get("unrankedpvp_death").getAsInt(), stats.get("unrankedpvp_matchwon").getAsInt(), stats.get("unrankedpvp_matchlost").getAsInt(), stats.get("unrankedpvp_timeplayed").getAsInt(), stats.get("unrankedpvp_hoursplayed").getAsInt(), stats.get("unrankedpvp_matches").getAsInt(), stats.get("unrankedpvp_kd").getAsString(), stats.get("unrankedpvp_wl").getAsString());
	            RankedStats rankedStats = new RankedStats(stats.get("rankedpvp_kills").getAsInt(), stats.get("rankedpvp_death").getAsInt(), stats.get("rankedpvp_matchwon").getAsInt(), stats.get("rankedpvp_matchlost").getAsInt(), stats.get("rankedpvp_timeplayed").getAsInt(), stats.get("rankedpvp_hoursplayed").getAsInt(), stats.get("rankedpvp_matches").getAsInt(), stats.get("rankedpvp_kd").getAsString(), stats.get("rankedpvp_wl").getAsString());
	            // General Stats
	            GeneralPvPStats generalPvPStats = new GeneralPvPStats(stats.get("generalpvp_headshot").getAsInt(), stats.get("generalpvp_kills").getAsInt(), stats.get("generalpvp_death").getAsInt(), stats.get("generalpvp_timeplayed").getAsInt(), stats.get("generalpvp_hoursplayed").getAsInt(), stats.get("generalpvp_matchwon").getAsInt(), stats.get("generalpvp_matchlost").getAsInt(), stats.get("generalpvp_matches").getAsInt(), stats.get("generalpvp_killassists").getAsInt(), stats.get("generalpvp_meleekills").getAsInt(), stats.get("generalpvp_revive").getAsInt(), stats.get("generalpvp_penetrationkills").getAsInt(), stats.get("generalpvp_kd").getAsString(), stats.get("generalpvp_wl").getAsString(), stats.get("generalpvp_hsrate").getAsString());
	            GeneralPvEStats generalPvEStats = new GeneralPvEStats(stats.get("generalpve_kills").getAsInt(), stats.get("generalpve_matchwon").getAsInt(), stats.get("generalpve_matchlost").getAsInt(), stats.get("generalpve_headshot").getAsInt(), stats.get("generalpve_timeplayed").getAsInt(), stats.get("generalpve_hoursplayed").getAsInt(), stats.get("generalpve_matches").getAsInt(), stats.get("generalpve_kd").getAsString(), stats.get("generalpve_wl").getAsString(), stats.get("generalpve_hsrate").getAsString());
	            return new Player(new Stats(stats.get("level").getAsInt(), casualStats, unrankedStats, rankedStats, new GeneralStats(generalPvPStats, generalPvEStats)));
	      
	        } finally {

	            if (request != null) {

	                request.releaseConnection();
	            }
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
