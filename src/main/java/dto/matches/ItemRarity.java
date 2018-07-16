package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ItemRarity {
    ARCANA, IMMORTAL, LEGENDARY, MYTHICAL, RARE, UNCOMMON;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ARCANA: return "arcana";
        case IMMORTAL: return "immortal";
        case LEGENDARY: return "legendary";
        case MYTHICAL: return "mythical";
        case RARE: return "rare";
        case UNCOMMON: return "uncommon";
        }
        return null;
    }

    @JsonCreator
    public static ItemRarity forValue(String value) throws IOException {
        if (value.equals("arcana")) return ARCANA;
        if (value.equals("immortal")) return IMMORTAL;
        if (value.equals("legendary")) return LEGENDARY;
        if (value.equals("mythical")) return MYTHICAL;
        if (value.equals("rare")) return RARE;
        if (value.equals("uncommon")) return UNCOMMON;
        throw new IOException("Cannot deserialize ItemRarity");
    }
}
