package indi.jackie.toy.taskruncheck;

import java.util.List;

/**
 * @author jackie chen
 * @create 2023/6/4
 * @description TaskCanRunUtil
 */
public class TaskCanRunUtil {

    private static Integer sumModuleType(List<ModuleType> moduleTypeList) {
        Integer moduleType = 0;
        for (ModuleType modelType : moduleTypeList) {
            moduleType += modelType.getCode();
        }
        return moduleType;
    }

    public static boolean canRun(List<ModuleType> currentModuleTypeList, List<ModuleType> taskNeedModuleTypeList) {
        int sumModuleType = sumModuleType(taskNeedModuleTypeList);
        for (ModuleType moduleType : currentModuleTypeList) {
            if ((sumModuleType & moduleType.getCode()) != moduleType.getCode()) {
                return false;
            }
        }
        return true;
    }
}
