package crm.workbench.service;

import crm.workbench.domain.Clue;

public interface ClueService {
    int saveCreateClue(Clue clue);

    Clue queryClueForDetailById(String id);
}
