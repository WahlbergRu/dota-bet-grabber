package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class MatchPlayer {
    private long matchID;
    private long playerSlot;
    private AbilityTargets abilityTargets;
    private long[] abilityUpgradesArr;
    private Map<String, Long> abilityUses;
    private long accountID;
    private Map<String, Long> actions;
    private Object additionalUnits;
    private long assists;
    private long backpack0;
    private long backpack1;
    private long backpack2;
    private BuybackLog[] buybackLog;
    private long campsStacked;
    private long creepsStacked;
    private Map<String, Long> damage;
    private Map<String, Long> damageInflictor;
    private Map<String, Long> damageInflictorReceived;
    private Map<String, Long> damageTaken;
    private DamageTargets damageTargets;
    private long deaths;
    private long denies;
    private long[] dnT;
    private long firstbloodClaimed;
    private long gold;
    private long goldPerMin;
    private Map<String, Long> goldReasons;
    private long goldSpent;
    private long[] goldT;
    private long heroDamage;
    private long heroHealing;
    private Map<String, Long> heroHits;
    private long heroID;
    private long item0;
    private long item1;
    private long item2;
    private long item3;
    private long item4;
    private long item5;
    private Map<String, Long> itemUses;
    private Map<String, Long> killStreaks;
    private Map<String, Long> killed;
    private Map<String, Long> killedBy;
    private long kills;
    private KillsLogElement[] killsLog;
    private Map<String, Map<String, Long>> lanePos;
    private long lastHits;
    private long leaverStatus;
    private long level;
    private long[] lhT;
    private Map<String, Long> lifeState;
    private MaxHeroHit maxHeroHit;
    private Map<String, Long> multiKills;
    private Map<String, Map<String, Long>> obs;
    private ObsLeftLogElement[] obsLeftLog;
    private ObsLeftLogElement[] obsLog;
    private long obsPlaced;
    private long partyID;
    private long partySize;
    private Object performanceOthers;
    private PermanentBuff[] permanentBuffs;
    private long pings;
    private boolean predVict;
    private Map<String, Long> purchase;
    private KillsLogElement[] purchaseLog;
    private boolean randomed;
    private Object repicked;
    private long roshansKilled;
    private long runePickups;
    private Map<String, Long> runes;
    private RunesLog[] runesLog;
    private Map<String, Map<String, Long>> sen;
    private ObsLeftLogElement[] senLeftLog;
    private ObsLeftLogElement[] senLog;
    private long senPlaced;
    private double stuns;
    private double teamfightParticipation;
    private long[] times;
    private long towerDamage;
    private long towersKilled;
    private long xpPerMin;
    private Map<String, Long> xpReasons;
    private long[] xpT;
    private String personaname;
    private String name;
    private String lastLogin;
    private boolean radiantWin;
    private long startTime;
    private long duration;
    private long cluster;
    private long lobbyType;
    private long gameMode;
    private long patch;
    private long region;
    private boolean isRadiant;
    private long win;
    private long lose;
    private long totalGold;
    private long totalXP;
    private double killsPerMin;
    private long kda;
    private long abandons;
    private long neutralKills;
    private long towerKills;
    private long courierKills;
    private long laneKills;
    private long heroKills;
    private long observerKills;
    private long sentryKills;
    private long roshanKills;
    private long necronomiconKills;
    private long ancientKills;
    private long buybackCount;
    private long observerUses;
    private long sentryUses;
    private double laneEfficiency;
    private long laneEfficiencyPct;
    private long lane;
    private long laneRole;
    private boolean isRoaming;
    private Map<String, Long> purchaseTime;
    private Map<String, Long> firstPurchaseTime;
    private Map<String, Long> itemWin;
    private Map<String, Long> itemUsage;
    private long purchaseTpscroll;
    private long actionsPerMin;
    private long lifeStateDead;
    private Long rankTier;
    private Cosmetic[] cosmetics;
    private Benchmarks benchmarks;
    private Long purchaseWardObserver;
    private Long purchaseWardSentry;
    private Long purchaseGem;

    @JsonProperty("match_id")
    public long getMatchID() { return matchID; }
    @JsonProperty("match_id")
    public void setMatchID(long value) { this.matchID = value; }

    @JsonProperty("player_slot")
    public long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(long value) { this.playerSlot = value; }

    @JsonProperty("ability_targets")
    public AbilityTargets getAbilityTargets() { return abilityTargets; }
    @JsonProperty("ability_targets")
    public void setAbilityTargets(AbilityTargets value) { this.abilityTargets = value; }

    @JsonProperty("ability_upgrades_arr")
    public long[] getAbilityUpgradesArr() { return abilityUpgradesArr; }
    @JsonProperty("ability_upgrades_arr")
    public void setAbilityUpgradesArr(long[] value) { this.abilityUpgradesArr = value; }

    @JsonProperty("ability_uses")
    public Map<String, Long> getAbilityUses() { return abilityUses; }
    @JsonProperty("ability_uses")
    public void setAbilityUses(Map<String, Long> value) { this.abilityUses = value; }

    @JsonProperty("account_id")
    public long getAccountID() { return accountID; }
    @JsonProperty("account_id")
    public void setAccountID(long value) { this.accountID = value; }

    @JsonProperty("actions")
    public Map<String, Long> getActions() { return actions; }
    @JsonProperty("actions")
    public void setActions(Map<String, Long> value) { this.actions = value; }

    @JsonProperty("additional_units")
    public Object getAdditionalUnits() { return additionalUnits; }
    @JsonProperty("additional_units")
    public void setAdditionalUnits(Object value) { this.additionalUnits = value; }

    @JsonProperty("assists")
    public long getAssists() { return assists; }
    @JsonProperty("assists")
    public void setAssists(long value) { this.assists = value; }

    @JsonProperty("backpack_0")
    public long getBackpack0() { return backpack0; }
    @JsonProperty("backpack_0")
    public void setBackpack0(long value) { this.backpack0 = value; }

    @JsonProperty("backpack_1")
    public long getBackpack1() { return backpack1; }
    @JsonProperty("backpack_1")
    public void setBackpack1(long value) { this.backpack1 = value; }

    @JsonProperty("backpack_2")
    public long getBackpack2() { return backpack2; }
    @JsonProperty("backpack_2")
    public void setBackpack2(long value) { this.backpack2 = value; }

    @JsonProperty("buyback_log")
    public BuybackLog[] getBuybackLog() { return buybackLog; }
    @JsonProperty("buyback_log")
    public void setBuybackLog(BuybackLog[] value) { this.buybackLog = value; }

    @JsonProperty("camps_stacked")
    public long getCampsStacked() { return campsStacked; }
    @JsonProperty("camps_stacked")
    public void setCampsStacked(long value) { this.campsStacked = value; }

    @JsonProperty("creeps_stacked")
    public long getCreepsStacked() { return creepsStacked; }
    @JsonProperty("creeps_stacked")
    public void setCreepsStacked(long value) { this.creepsStacked = value; }

    @JsonProperty("damage")
    public Map<String, Long> getDamage() { return damage; }
    @JsonProperty("damage")
    public void setDamage(Map<String, Long> value) { this.damage = value; }

    @JsonProperty("damage_inflictor")
    public Map<String, Long> getDamageInflictor() { return damageInflictor; }
    @JsonProperty("damage_inflictor")
    public void setDamageInflictor(Map<String, Long> value) { this.damageInflictor = value; }

    @JsonProperty("damage_inflictor_received")
    public Map<String, Long> getDamageInflictorReceived() { return damageInflictorReceived; }
    @JsonProperty("damage_inflictor_received")
    public void setDamageInflictorReceived(Map<String, Long> value) { this.damageInflictorReceived = value; }

    @JsonProperty("damage_taken")
    public Map<String, Long> getDamageTaken() { return damageTaken; }
    @JsonProperty("damage_taken")
    public void setDamageTaken(Map<String, Long> value) { this.damageTaken = value; }

    @JsonProperty("damage_targets")
    public DamageTargets getDamageTargets() { return damageTargets; }
    @JsonProperty("damage_targets")
    public void setDamageTargets(DamageTargets value) { this.damageTargets = value; }

    @JsonProperty("deaths")
    public long getDeaths() { return deaths; }
    @JsonProperty("deaths")
    public void setDeaths(long value) { this.deaths = value; }

    @JsonProperty("denies")
    public long getDenies() { return denies; }
    @JsonProperty("denies")
    public void setDenies(long value) { this.denies = value; }

    @JsonProperty("dn_t")
    public long[] getDNT() { return dnT; }
    @JsonProperty("dn_t")
    public void setDNT(long[] value) { this.dnT = value; }

    @JsonProperty("firstblood_claimed")
    public long getFirstbloodClaimed() { return firstbloodClaimed; }
    @JsonProperty("firstblood_claimed")
    public void setFirstbloodClaimed(long value) { this.firstbloodClaimed = value; }

    @JsonProperty("gold")
    public long getGold() { return gold; }
    @JsonProperty("gold")
    public void setGold(long value) { this.gold = value; }

    @JsonProperty("gold_per_min")
    public long getGoldPerMin() { return goldPerMin; }
    @JsonProperty("gold_per_min")
    public void setGoldPerMin(long value) { this.goldPerMin = value; }

    @JsonProperty("gold_reasons")
    public Map<String, Long> getGoldReasons() { return goldReasons; }
    @JsonProperty("gold_reasons")
    public void setGoldReasons(Map<String, Long> value) { this.goldReasons = value; }

    @JsonProperty("gold_spent")
    public long getGoldSpent() { return goldSpent; }
    @JsonProperty("gold_spent")
    public void setGoldSpent(long value) { this.goldSpent = value; }

    @JsonProperty("gold_t")
    public long[] getGoldT() { return goldT; }
    @JsonProperty("gold_t")
    public void setGoldT(long[] value) { this.goldT = value; }

    @JsonProperty("hero_damage")
    public long getHeroDamage() { return heroDamage; }
    @JsonProperty("hero_damage")
    public void setHeroDamage(long value) { this.heroDamage = value; }

    @JsonProperty("hero_healing")
    public long getHeroHealing() { return heroHealing; }
    @JsonProperty("hero_healing")
    public void setHeroHealing(long value) { this.heroHealing = value; }

    @JsonProperty("hero_hits")
    public Map<String, Long> getHeroHits() { return heroHits; }
    @JsonProperty("hero_hits")
    public void setHeroHits(Map<String, Long> value) { this.heroHits = value; }

    @JsonProperty("hero_id")
    public long getHeroID() { return heroID; }
    @JsonProperty("hero_id")
    public void setHeroID(long value) { this.heroID = value; }

    @JsonProperty("item_0")
    public long getItem0() { return item0; }
    @JsonProperty("item_0")
    public void setItem0(long value) { this.item0 = value; }

    @JsonProperty("item_1")
    public long getItem1() { return item1; }
    @JsonProperty("item_1")
    public void setItem1(long value) { this.item1 = value; }

    @JsonProperty("item_2")
    public long getItem2() { return item2; }
    @JsonProperty("item_2")
    public void setItem2(long value) { this.item2 = value; }

    @JsonProperty("item_3")
    public long getItem3() { return item3; }
    @JsonProperty("item_3")
    public void setItem3(long value) { this.item3 = value; }

    @JsonProperty("item_4")
    public long getItem4() { return item4; }
    @JsonProperty("item_4")
    public void setItem4(long value) { this.item4 = value; }

    @JsonProperty("item_5")
    public long getItem5() { return item5; }
    @JsonProperty("item_5")
    public void setItem5(long value) { this.item5 = value; }

    @JsonProperty("item_uses")
    public Map<String, Long> getItemUses() { return itemUses; }
    @JsonProperty("item_uses")
    public void setItemUses(Map<String, Long> value) { this.itemUses = value; }

    @JsonProperty("kill_streaks")
    public Map<String, Long> getKillStreaks() { return killStreaks; }
    @JsonProperty("kill_streaks")
    public void setKillStreaks(Map<String, Long> value) { this.killStreaks = value; }

    @JsonProperty("killed")
    public Map<String, Long> getKilled() { return killed; }
    @JsonProperty("killed")
    public void setKilled(Map<String, Long> value) { this.killed = value; }

    @JsonProperty("killed_by")
    public Map<String, Long> getKilledBy() { return killedBy; }
    @JsonProperty("killed_by")
    public void setKilledBy(Map<String, Long> value) { this.killedBy = value; }

    @JsonProperty("kills")
    public long getKills() { return kills; }
    @JsonProperty("kills")
    public void setKills(long value) { this.kills = value; }

    @JsonProperty("kills_log")
    public KillsLogElement[] getKillsLog() { return killsLog; }
    @JsonProperty("kills_log")
    public void setKillsLog(KillsLogElement[] value) { this.killsLog = value; }

    @JsonProperty("lane_pos")
    public Map<String, Map<String, Long>> getLanePos() { return lanePos; }
    @JsonProperty("lane_pos")
    public void setLanePos(Map<String, Map<String, Long>> value) { this.lanePos = value; }

    @JsonProperty("last_hits")
    public long getLastHits() { return lastHits; }
    @JsonProperty("last_hits")
    public void setLastHits(long value) { this.lastHits = value; }

    @JsonProperty("leaver_status")
    public long getLeaverStatus() { return leaverStatus; }
    @JsonProperty("leaver_status")
    public void setLeaverStatus(long value) { this.leaverStatus = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("lh_t")
    public long[] getLhT() { return lhT; }
    @JsonProperty("lh_t")
    public void setLhT(long[] value) { this.lhT = value; }

    @JsonProperty("life_state")
    public Map<String, Long> getLifeState() { return lifeState; }
    @JsonProperty("life_state")
    public void setLifeState(Map<String, Long> value) { this.lifeState = value; }

    @JsonProperty("max_hero_hit")
    public MaxHeroHit getMaxHeroHit() { return maxHeroHit; }
    @JsonProperty("max_hero_hit")
    public void setMaxHeroHit(MaxHeroHit value) { this.maxHeroHit = value; }

    @JsonProperty("multi_kills")
    public Map<String, Long> getMultiKills() { return multiKills; }
    @JsonProperty("multi_kills")
    public void setMultiKills(Map<String, Long> value) { this.multiKills = value; }

    @JsonProperty("obs")
    public Map<String, Map<String, Long>> getObs() { return obs; }
    @JsonProperty("obs")
    public void setObs(Map<String, Map<String, Long>> value) { this.obs = value; }

    @JsonProperty("obs_left_log")
    public ObsLeftLogElement[] getObsLeftLog() { return obsLeftLog; }
    @JsonProperty("obs_left_log")
    public void setObsLeftLog(ObsLeftLogElement[] value) { this.obsLeftLog = value; }

    @JsonProperty("obs_log")
    public ObsLeftLogElement[] getObsLog() { return obsLog; }
    @JsonProperty("obs_log")
    public void setObsLog(ObsLeftLogElement[] value) { this.obsLog = value; }

    @JsonProperty("obs_placed")
    public long getObsPlaced() { return obsPlaced; }
    @JsonProperty("obs_placed")
    public void setObsPlaced(long value) { this.obsPlaced = value; }

    @JsonProperty("party_id")
    public long getPartyID() { return partyID; }
    @JsonProperty("party_id")
    public void setPartyID(long value) { this.partyID = value; }

    @JsonProperty("party_size")
    public long getPartySize() { return partySize; }
    @JsonProperty("party_size")
    public void setPartySize(long value) { this.partySize = value; }

    @JsonProperty("performance_others")
    public Object getPerformanceOthers() { return performanceOthers; }
    @JsonProperty("performance_others")
    public void setPerformanceOthers(Object value) { this.performanceOthers = value; }

    @JsonProperty("permanent_buffs")
    public PermanentBuff[] getPermanentBuffs() { return permanentBuffs; }
    @JsonProperty("permanent_buffs")
    public void setPermanentBuffs(PermanentBuff[] value) { this.permanentBuffs = value; }

    @JsonProperty("pings")
    public long getPings() { return pings; }
    @JsonProperty("pings")
    public void setPings(long value) { this.pings = value; }

    @JsonProperty("pred_vict")
    public boolean getPredVict() { return predVict; }
    @JsonProperty("pred_vict")
    public void setPredVict(boolean value) { this.predVict = value; }

    @JsonProperty("purchase")
    public Map<String, Long> getPurchase() { return purchase; }
    @JsonProperty("purchase")
    public void setPurchase(Map<String, Long> value) { this.purchase = value; }

    @JsonProperty("purchase_log")
    public KillsLogElement[] getPurchaseLog() { return purchaseLog; }
    @JsonProperty("purchase_log")
    public void setPurchaseLog(KillsLogElement[] value) { this.purchaseLog = value; }

    @JsonProperty("randomed")
    public boolean getRandomed() { return randomed; }
    @JsonProperty("randomed")
    public void setRandomed(boolean value) { this.randomed = value; }

    @JsonProperty("repicked")
    public Object getRepicked() { return repicked; }
    @JsonProperty("repicked")
    public void setRepicked(Object value) { this.repicked = value; }

    @JsonProperty("roshans_killed")
    public long getRoshansKilled() { return roshansKilled; }
    @JsonProperty("roshans_killed")
    public void setRoshansKilled(long value) { this.roshansKilled = value; }

    @JsonProperty("rune_pickups")
    public long getRunePickups() { return runePickups; }
    @JsonProperty("rune_pickups")
    public void setRunePickups(long value) { this.runePickups = value; }

    @JsonProperty("runes")
    public Map<String, Long> getRunes() { return runes; }
    @JsonProperty("runes")
    public void setRunes(Map<String, Long> value) { this.runes = value; }

    @JsonProperty("runes_log")
    public RunesLog[] getRunesLog() { return runesLog; }
    @JsonProperty("runes_log")
    public void setRunesLog(RunesLog[] value) { this.runesLog = value; }

    @JsonProperty("sen")
    public Map<String, Map<String, Long>> getSen() { return sen; }
    @JsonProperty("sen")
    public void setSen(Map<String, Map<String, Long>> value) { this.sen = value; }

    @JsonProperty("sen_left_log")
    public ObsLeftLogElement[] getSenLeftLog() { return senLeftLog; }
    @JsonProperty("sen_left_log")
    public void setSenLeftLog(ObsLeftLogElement[] value) { this.senLeftLog = value; }

    @JsonProperty("sen_log")
    public ObsLeftLogElement[] getSenLog() { return senLog; }
    @JsonProperty("sen_log")
    public void setSenLog(ObsLeftLogElement[] value) { this.senLog = value; }

    @JsonProperty("sen_placed")
    public long getSenPlaced() { return senPlaced; }
    @JsonProperty("sen_placed")
    public void setSenPlaced(long value) { this.senPlaced = value; }

    @JsonProperty("stuns")
    public double getStuns() { return stuns; }
    @JsonProperty("stuns")
    public void setStuns(double value) { this.stuns = value; }

    @JsonProperty("teamfight_participation")
    public double getTeamfightParticipation() { return teamfightParticipation; }
    @JsonProperty("teamfight_participation")
    public void setTeamfightParticipation(double value) { this.teamfightParticipation = value; }

    @JsonProperty("times")
    public long[] getTimes() { return times; }
    @JsonProperty("times")
    public void setTimes(long[] value) { this.times = value; }

    @JsonProperty("tower_damage")
    public long getTowerDamage() { return towerDamage; }
    @JsonProperty("tower_damage")
    public void setTowerDamage(long value) { this.towerDamage = value; }

    @JsonProperty("towers_killed")
    public long getTowersKilled() { return towersKilled; }
    @JsonProperty("towers_killed")
    public void setTowersKilled(long value) { this.towersKilled = value; }

    @JsonProperty("xp_per_min")
    public long getXPPerMin() { return xpPerMin; }
    @JsonProperty("xp_per_min")
    public void setXPPerMin(long value) { this.xpPerMin = value; }

    @JsonProperty("xp_reasons")
    public Map<String, Long> getXPReasons() { return xpReasons; }
    @JsonProperty("xp_reasons")
    public void setXPReasons(Map<String, Long> value) { this.xpReasons = value; }

    @JsonProperty("xp_t")
    public long[] getXPT() { return xpT; }
    @JsonProperty("xp_t")
    public void setXPT(long[] value) { this.xpT = value; }

    @JsonProperty("personaname")
    public String getPersonaname() { return personaname; }
    @JsonProperty("personaname")
    public void setPersonaname(String value) { this.personaname = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("last_login")
    public String getLastLogin() { return lastLogin; }
    @JsonProperty("last_login")
    public void setLastLogin(String value) { this.lastLogin = value; }

    @JsonProperty("radiant_win")
    public boolean getRadiantWin() { return radiantWin; }
    @JsonProperty("radiant_win")
    public void setRadiantWin(boolean value) { this.radiantWin = value; }

    @JsonProperty("start_time")
    public long getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(long value) { this.startTime = value; }

    @JsonProperty("duration")
    public long getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(long value) { this.duration = value; }

    @JsonProperty("cluster")
    public long getCluster() { return cluster; }
    @JsonProperty("cluster")
    public void setCluster(long value) { this.cluster = value; }

    @JsonProperty("lobby_type")
    public long getLobbyType() { return lobbyType; }
    @JsonProperty("lobby_type")
    public void setLobbyType(long value) { this.lobbyType = value; }

    @JsonProperty("game_mode")
    public long getGameMode() { return gameMode; }
    @JsonProperty("game_mode")
    public void setGameMode(long value) { this.gameMode = value; }

    @JsonProperty("patch")
    public long getPatch() { return patch; }
    @JsonProperty("patch")
    public void setPatch(long value) { this.patch = value; }

    @JsonProperty("region")
    public long getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(long value) { this.region = value; }

    @JsonProperty("isRadiant")
    public boolean getIsRadiant() { return isRadiant; }
    @JsonProperty("isRadiant")
    public void setIsRadiant(boolean value) { this.isRadiant = value; }

    @JsonProperty("win")
    public long getWin() { return win; }
    @JsonProperty("win")
    public void setWin(long value) { this.win = value; }

    @JsonProperty("lose")
    public long getLose() { return lose; }
    @JsonProperty("lose")
    public void setLose(long value) { this.lose = value; }

    @JsonProperty("total_gold")
    public long getTotalGold() { return totalGold; }
    @JsonProperty("total_gold")
    public void setTotalGold(long value) { this.totalGold = value; }

    @JsonProperty("total_xp")
    public long getTotalXP() { return totalXP; }
    @JsonProperty("total_xp")
    public void setTotalXP(long value) { this.totalXP = value; }

    @JsonProperty("kills_per_min")
    public double getKillsPerMin() { return killsPerMin; }
    @JsonProperty("kills_per_min")
    public void setKillsPerMin(double value) { this.killsPerMin = value; }

    @JsonProperty("kda")
    public long getKda() { return kda; }
    @JsonProperty("kda")
    public void setKda(long value) { this.kda = value; }

    @JsonProperty("abandons")
    public long getAbandons() { return abandons; }
    @JsonProperty("abandons")
    public void setAbandons(long value) { this.abandons = value; }

    @JsonProperty("neutral_kills")
    public long getNeutralKills() { return neutralKills; }
    @JsonProperty("neutral_kills")
    public void setNeutralKills(long value) { this.neutralKills = value; }

    @JsonProperty("tower_kills")
    public long getTowerKills() { return towerKills; }
    @JsonProperty("tower_kills")
    public void setTowerKills(long value) { this.towerKills = value; }

    @JsonProperty("courier_kills")
    public long getCourierKills() { return courierKills; }
    @JsonProperty("courier_kills")
    public void setCourierKills(long value) { this.courierKills = value; }

    @JsonProperty("lane_kills")
    public long getLaneKills() { return laneKills; }
    @JsonProperty("lane_kills")
    public void setLaneKills(long value) { this.laneKills = value; }

    @JsonProperty("hero_kills")
    public long getHeroKills() { return heroKills; }
    @JsonProperty("hero_kills")
    public void setHeroKills(long value) { this.heroKills = value; }

    @JsonProperty("observer_kills")
    public long getObserverKills() { return observerKills; }
    @JsonProperty("observer_kills")
    public void setObserverKills(long value) { this.observerKills = value; }

    @JsonProperty("sentry_kills")
    public long getSentryKills() { return sentryKills; }
    @JsonProperty("sentry_kills")
    public void setSentryKills(long value) { this.sentryKills = value; }

    @JsonProperty("roshan_kills")
    public long getRoshanKills() { return roshanKills; }
    @JsonProperty("roshan_kills")
    public void setRoshanKills(long value) { this.roshanKills = value; }

    @JsonProperty("necronomicon_kills")
    public long getNecronomiconKills() { return necronomiconKills; }
    @JsonProperty("necronomicon_kills")
    public void setNecronomiconKills(long value) { this.necronomiconKills = value; }

    @JsonProperty("ancient_kills")
    public long getAncientKills() { return ancientKills; }
    @JsonProperty("ancient_kills")
    public void setAncientKills(long value) { this.ancientKills = value; }

    @JsonProperty("buyback_count")
    public long getBuybackCount() { return buybackCount; }
    @JsonProperty("buyback_count")
    public void setBuybackCount(long value) { this.buybackCount = value; }

    @JsonProperty("observer_uses")
    public long getObserverUses() { return observerUses; }
    @JsonProperty("observer_uses")
    public void setObserverUses(long value) { this.observerUses = value; }

    @JsonProperty("sentry_uses")
    public long getSentryUses() { return sentryUses; }
    @JsonProperty("sentry_uses")
    public void setSentryUses(long value) { this.sentryUses = value; }

    @JsonProperty("lane_efficiency")
    public double getLaneEfficiency() { return laneEfficiency; }
    @JsonProperty("lane_efficiency")
    public void setLaneEfficiency(double value) { this.laneEfficiency = value; }

    @JsonProperty("lane_efficiency_pct")
    public long getLaneEfficiencyPct() { return laneEfficiencyPct; }
    @JsonProperty("lane_efficiency_pct")
    public void setLaneEfficiencyPct(long value) { this.laneEfficiencyPct = value; }

    @JsonProperty("lane")
    public long getLane() { return lane; }
    @JsonProperty("lane")
    public void setLane(long value) { this.lane = value; }

    @JsonProperty("lane_role")
    public long getLaneRole() { return laneRole; }
    @JsonProperty("lane_role")
    public void setLaneRole(long value) { this.laneRole = value; }

    @JsonProperty("is_roaming")
    public boolean getIsRoaming() { return isRoaming; }
    @JsonProperty("is_roaming")
    public void setIsRoaming(boolean value) { this.isRoaming = value; }

    @JsonProperty("purchase_time")
    public Map<String, Long> getPurchaseTime() { return purchaseTime; }
    @JsonProperty("purchase_time")
    public void setPurchaseTime(Map<String, Long> value) { this.purchaseTime = value; }

    @JsonProperty("first_purchase_time")
    public Map<String, Long> getFirstPurchaseTime() { return firstPurchaseTime; }
    @JsonProperty("first_purchase_time")
    public void setFirstPurchaseTime(Map<String, Long> value) { this.firstPurchaseTime = value; }

    @JsonProperty("item_win")
    public Map<String, Long> getItemWin() { return itemWin; }
    @JsonProperty("item_win")
    public void setItemWin(Map<String, Long> value) { this.itemWin = value; }

    @JsonProperty("item_usage")
    public Map<String, Long> getItemUsage() { return itemUsage; }
    @JsonProperty("item_usage")
    public void setItemUsage(Map<String, Long> value) { this.itemUsage = value; }

    @JsonProperty("purchase_tpscroll")
    public long getPurchaseTpscroll() { return purchaseTpscroll; }
    @JsonProperty("purchase_tpscroll")
    public void setPurchaseTpscroll(long value) { this.purchaseTpscroll = value; }

    @JsonProperty("actions_per_min")
    public long getActionsPerMin() { return actionsPerMin; }
    @JsonProperty("actions_per_min")
    public void setActionsPerMin(long value) { this.actionsPerMin = value; }

    @JsonProperty("life_state_dead")
    public long getLifeStateDead() { return lifeStateDead; }
    @JsonProperty("life_state_dead")
    public void setLifeStateDead(long value) { this.lifeStateDead = value; }

    @JsonProperty("rank_tier")
    public Long getRankTier() { return rankTier; }
    @JsonProperty("rank_tier")
    public void setRankTier(Long value) { this.rankTier = value; }

    @JsonProperty("cosmetics")
    public Cosmetic[] getCosmetics() { return cosmetics; }
    @JsonProperty("cosmetics")
    public void setCosmetics(Cosmetic[] value) { this.cosmetics = value; }

    @JsonProperty("benchmarks")
    public Benchmarks getBenchmarks() { return benchmarks; }
    @JsonProperty("benchmarks")
    public void setBenchmarks(Benchmarks value) { this.benchmarks = value; }

    @JsonProperty("purchase_ward_observer")
    public Long getPurchaseWardObserver() { return purchaseWardObserver; }
    @JsonProperty("purchase_ward_observer")
    public void setPurchaseWardObserver(Long value) { this.purchaseWardObserver = value; }

    @JsonProperty("purchase_ward_sentry")
    public Long getPurchaseWardSentry() { return purchaseWardSentry; }
    @JsonProperty("purchase_ward_sentry")
    public void setPurchaseWardSentry(Long value) { this.purchaseWardSentry = value; }

    @JsonProperty("purchase_gem")
    public Long getPurchaseGem() { return purchaseGem; }
    @JsonProperty("purchase_gem")
    public void setPurchaseGem(Long value) { this.purchaseGem = value; }
}
