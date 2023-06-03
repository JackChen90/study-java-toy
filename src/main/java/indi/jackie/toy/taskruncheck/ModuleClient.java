package indi.jackie.toy.taskruncheck;

import indi.jackie.toy.taskruncheck.dto.ModuleDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/6/4
 * @description ModuleClient
 */
public class ModuleClient {

    public void func1() {
        List<ModuleDTO> moduleDTOList = new ArrayList<>();
        moduleDTOList.add(new ModuleDTO(1, "1", "MT1"));
        moduleDTOList.add(new ModuleDTO(2, "2", "MT2"));

        List<ModuleType> task1ModuleTypeList = new ArrayList<>();
        task1ModuleTypeList.add(ModuleType.MT1);
        task1ModuleTypeList.add(ModuleType.MT2);


        List<ModuleType> task2ModuleTypeList = new ArrayList<>();
        task2ModuleTypeList.add(ModuleType.MT1);
        task2ModuleTypeList.add(ModuleType.MT3);


        List<ModuleType> moduleTypes = moduleDTOList.stream()
                .map(moduleDTO -> ModuleType.getByType(moduleDTO.getModuleType())).collect(java.util.stream.Collectors.toList());

        boolean task1CanStart = ModuleTypeUtil.allExist(moduleTypes, ModuleTypeUtil.sumModuleType(task1ModuleTypeList));
        boolean task2CanStart = ModuleTypeUtil.allExist(moduleTypes, ModuleTypeUtil.sumModuleType(task2ModuleTypeList));

        System.out.println("task1CanStart: " + task1CanStart);
        System.out.println("task2CanStart: " + task2CanStart);
    }
}
