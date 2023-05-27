package crm.settings.service;

import crm.settings.domain.DicValue;

import java.util.List;

public interface DicValueService {
    List<DicValue> queryDicValueByTypeCone(String typeCode);
}
