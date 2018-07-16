package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ObjectiveType {
    BUILDING_KILL, CHAT_MESSAGE_AEGIS, CHAT_MESSAGE_FIRSTBLOOD, CHAT_MESSAGE_ROSHAN_KILL;

    @JsonValue
    public String toValue() {
        switch (this) {
        case BUILDING_KILL: return "building_kill";
        case CHAT_MESSAGE_AEGIS: return "CHAT_MESSAGE_AEGIS";
        case CHAT_MESSAGE_FIRSTBLOOD: return "CHAT_MESSAGE_FIRSTBLOOD";
        case CHAT_MESSAGE_ROSHAN_KILL: return "CHAT_MESSAGE_ROSHAN_KILL";
        }
        return null;
    }

    @JsonCreator
    public static ObjectiveType forValue(String value) throws IOException {
        if (value.equals("building_kill")) return BUILDING_KILL;
        if (value.equals("CHAT_MESSAGE_AEGIS")) return CHAT_MESSAGE_AEGIS;
        if (value.equals("CHAT_MESSAGE_FIRSTBLOOD")) return CHAT_MESSAGE_FIRSTBLOOD;
        if (value.equals("CHAT_MESSAGE_ROSHAN_KILL")) return CHAT_MESSAGE_ROSHAN_KILL;
        throw new IOException("Cannot deserialize ObjectiveType");
    }
}
