package p7;

import lombok.Getter;

@Getter
public enum Type {
    INT(true) {
        @Override
        Object parse(String value) {
            return Integer.valueOf(value);
        }
    },
    INTEGER(false) {
        @Override
        Object parse(String value) {
            return Integer.valueOf(value);
        }
    },
    STRING(false) {
        @Override
        Object parse(String value) {
            return value;
        }
    };
    boolean primitive;

    Type(boolean primitive) {
        this.primitive = primitive;
    }

    abstract Object parse(String value);
}
