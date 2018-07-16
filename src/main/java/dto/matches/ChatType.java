package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ChatType {
    CHAT, CHATWHEEL;

    @JsonValue
    public String toValue() {
        switch (this) {
        case CHAT: return "chat";
        case CHATWHEEL: return "chatwheel";
        }
        return null;
    }

    @JsonCreator
    public static ChatType forValue(String value) throws IOException {
        if (value.equals("chat")) return CHAT;
        if (value.equals("chatwheel")) return CHATWHEEL;
        throw new IOException("Cannot deserialize ChatType");
    }
}
