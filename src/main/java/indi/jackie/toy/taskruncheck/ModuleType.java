package indi.jackie.toy.taskruncheck;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/6/4
 * @description ModelType
 */
public enum ModuleType {
    MT1(1, "1", "MT1"),
    MT2(2, "2", "MT2"),
    MT3(4, "3", "MT3"),
    ;

    /**
     * code
     */
    @Getter
    private Integer code;

    /**
     * db id
     */
    @Getter
    private String type;

    /**
     * name
     */
    private String name;

    ModuleType(Integer code, String type, String name) {
        this.type = type;
        this.code = code;
        this.name = name;
    }

    private static Map<String, ModuleType> typeMap = new HashMap<>();

    private static Map<Integer, ModuleType> codeMap = new HashMap<>();

    static {
        for (ModuleType value : ModuleType.values()) {
            typeMap.put(value.type, value);
            codeMap.put(value.code, value);
        }
    }

    public static ModuleType getByType(String type) {
        return typeMap.get(type);
    }

    public static ModuleType getByCode(Integer code) {
        return codeMap.get(code);
    }
}
