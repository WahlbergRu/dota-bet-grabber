package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cyclone {
    private Long npcDotaHeroRattletrap;
    private Long npcDotaHeroDragonKnight;
    private Long npcDotaHeroPhoenix;
    private Long npcDotaHeroNightStalker;
    private Long npcDotaHeroNagaSiren;
    private Long npcDotaHeroLina;

    @JsonProperty("npc_dota_hero_rattletrap")
    public Long getNpcDotaHeroRattletrap() { return npcDotaHeroRattletrap; }
    @JsonProperty("npc_dota_hero_rattletrap")
    public void setNpcDotaHeroRattletrap(Long value) { this.npcDotaHeroRattletrap = value; }

    @JsonProperty("npc_dota_hero_dragon_knight")
    public Long getNpcDotaHeroDragonKnight() { return npcDotaHeroDragonKnight; }
    @JsonProperty("npc_dota_hero_dragon_knight")
    public void setNpcDotaHeroDragonKnight(Long value) { this.npcDotaHeroDragonKnight = value; }

    @JsonProperty("npc_dota_hero_phoenix")
    public Long getNpcDotaHeroPhoenix() { return npcDotaHeroPhoenix; }
    @JsonProperty("npc_dota_hero_phoenix")
    public void setNpcDotaHeroPhoenix(Long value) { this.npcDotaHeroPhoenix = value; }

    @JsonProperty("npc_dota_hero_night_stalker")
    public Long getNpcDotaHeroNightStalker() { return npcDotaHeroNightStalker; }
    @JsonProperty("npc_dota_hero_night_stalker")
    public void setNpcDotaHeroNightStalker(Long value) { this.npcDotaHeroNightStalker = value; }

    @JsonProperty("npc_dota_hero_naga_siren")
    public Long getNpcDotaHeroNagaSiren() { return npcDotaHeroNagaSiren; }
    @JsonProperty("npc_dota_hero_naga_siren")
    public void setNpcDotaHeroNagaSiren(Long value) { this.npcDotaHeroNagaSiren = value; }

    @JsonProperty("npc_dota_hero_lina")
    public Long getNpcDotaHeroLina() { return npcDotaHeroLina; }
    @JsonProperty("npc_dota_hero_lina")
    public void setNpcDotaHeroLina(Long value) { this.npcDotaHeroLina = value; }
}
