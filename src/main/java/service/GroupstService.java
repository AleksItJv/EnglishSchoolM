package service;

import entity.Groupst;

import java.util.List;

public interface GroupstService {

    void addGroupst(Groupst groupst);

    List<Groupst> allGroups();

    void deleteGroupst(long id);
}
