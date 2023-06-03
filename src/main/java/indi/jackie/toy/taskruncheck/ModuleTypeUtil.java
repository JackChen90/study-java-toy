package indi.jackie.toy.taskruncheck;

import java.util.List;

/**
 * @author jackie chen
 * @create 2023/6/4
 * @description ModuleTypeUtil
 */
public class ModuleTypeUtil {

    public static Integer sumModuleType(List<ModuleType> moduleTypeList) {
        Integer moduleType = 0;
        for (ModuleType modelType : moduleTypeList) {
            moduleType += modelType.getCode();
        }
        return moduleType;
    }

    public static boolean allExist(List<ModuleType> moduleTypeList, Integer sumModuleType) {
        for (ModuleType moduleType : moduleTypeList) {
            if ((sumModuleType & moduleType.getCode()) != moduleType.getCode()) {
                return false;
            }
        }
        return true;
    }
}
