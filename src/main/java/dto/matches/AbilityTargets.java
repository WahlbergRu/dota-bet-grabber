package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityTargets {
    private JakiroDualBreath linaDragonSlave;
    private JakiroDualBreath linaLagunaBlade;
    private JakiroDualBreath nagaSirenEnsnare;
    private JakiroDualBreath phantomLancerSpiritLance;
    private JakiroDualBreath nightStalkerVoid;
    private JakiroDualBreath nightStalkerCripplingFear;
    private JakiroDualBreath jakiroDualBreath;
    private DragonKnightBreatheFire windrunnerShackleshot;
    private DragonKnightBreatheFire windrunnerFocusfire;
    private DragonKnightBreatheFire dragonKnightBreatheFire;
    private DragonKnightBreatheFire dragonKnightDragonTail;

    @JsonProperty("lina_dragon_slave")
    public JakiroDualBreath getLinaDragonSlave() { return linaDragonSlave; }
    @JsonProperty("lina_dragon_slave")
    public void setLinaDragonSlave(JakiroDualBreath value) { this.linaDragonSlave = value; }

    @JsonProperty("lina_laguna_blade")
    public JakiroDualBreath getLinaLagunaBlade() { return linaLagunaBlade; }
    @JsonProperty("lina_laguna_blade")
    public void setLinaLagunaBlade(JakiroDualBreath value) { this.linaLagunaBlade = value; }

    @JsonProperty("naga_siren_ensnare")
    public JakiroDualBreath getNagaSirenEnsnare() { return nagaSirenEnsnare; }
    @JsonProperty("naga_siren_ensnare")
    public void setNagaSirenEnsnare(JakiroDualBreath value) { this.nagaSirenEnsnare = value; }

    @JsonProperty("phantom_lancer_spirit_lance")
    public JakiroDualBreath getPhantomLancerSpiritLance() { return phantomLancerSpiritLance; }
    @JsonProperty("phantom_lancer_spirit_lance")
    public void setPhantomLancerSpiritLance(JakiroDualBreath value) { this.phantomLancerSpiritLance = value; }

    @JsonProperty("night_stalker_void")
    public JakiroDualBreath getNightStalkerVoid() { return nightStalkerVoid; }
    @JsonProperty("night_stalker_void")
    public void setNightStalkerVoid(JakiroDualBreath value) { this.nightStalkerVoid = value; }

    @JsonProperty("night_stalker_crippling_fear")
    public JakiroDualBreath getNightStalkerCripplingFear() { return nightStalkerCripplingFear; }
    @JsonProperty("night_stalker_crippling_fear")
    public void setNightStalkerCripplingFear(JakiroDualBreath value) { this.nightStalkerCripplingFear = value; }

    @JsonProperty("jakiro_dual_breath")
    public JakiroDualBreath getJakiroDualBreath() { return jakiroDualBreath; }
    @JsonProperty("jakiro_dual_breath")
    public void setJakiroDualBreath(JakiroDualBreath value) { this.jakiroDualBreath = value; }

    @JsonProperty("windrunner_shackleshot")
    public DragonKnightBreatheFire getWindrunnerShackleshot() { return windrunnerShackleshot; }
    @JsonProperty("windrunner_shackleshot")
    public void setWindrunnerShackleshot(DragonKnightBreatheFire value) { this.windrunnerShackleshot = value; }

    @JsonProperty("windrunner_focusfire")
    public DragonKnightBreatheFire getWindrunnerFocusfire() { return windrunnerFocusfire; }
    @JsonProperty("windrunner_focusfire")
    public void setWindrunnerFocusfire(DragonKnightBreatheFire value) { this.windrunnerFocusfire = value; }

    @JsonProperty("dragon_knight_breathe_fire")
    public DragonKnightBreatheFire getDragonKnightBreatheFire() { return dragonKnightBreatheFire; }
    @JsonProperty("dragon_knight_breathe_fire")
    public void setDragonKnightBreatheFire(DragonKnightBreatheFire value) { this.dragonKnightBreatheFire = value; }

    @JsonProperty("dragon_knight_dragon_tail")
    public DragonKnightBreatheFire getDragonKnightDragonTail() { return dragonKnightDragonTail; }
    @JsonProperty("dragon_knight_dragon_tail")
    public void setDragonKnightDragonTail(DragonKnightBreatheFire value) { this.dragonKnightDragonTail = value; }
}
