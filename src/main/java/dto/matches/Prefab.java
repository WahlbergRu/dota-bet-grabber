package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum Prefab {
    COURIER, TAUNT, TOOL, WARD, WEARABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
        case COURIER: return "courier";
        case TAUNT: return "taunt";
        case TOOL: return "tool";
        case WARD: return "ward";
        case WEARABLE: return "wearable";
        }
        return null;
    }

    @JsonCreator
    public static Prefab forValue(String value) throws IOException {
        if (value.equals("courier")) return COURIER;
        if (value.equals("taunt")) return TAUNT;
        if (value.equals("tool")) return TOOL;
        if (value.equals("ward")) return WARD;
        if (value.equals("wearable")) return WEARABLE;
        throw new IOException("Cannot deserialize Prefab");
    }
}
