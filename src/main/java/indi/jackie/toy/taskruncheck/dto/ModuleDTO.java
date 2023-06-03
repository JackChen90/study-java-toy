package indi.jackie.toy.taskruncheck.dto;

import lombok.Data;

/**
 * @author jackie chen
 * @create 2023/6/4
 * @description ModuleDTO
 */
@Data
public class ModuleDTO {
    private Integer moduleId;

    private String moduleType;

    private String moduleName;

    public ModuleDTO(Integer moduleId, String moduleType, String moduleName) {
        this.moduleId = moduleId;
        this.moduleType = moduleType;
        this.moduleName = moduleName;
    }
}
