package org.mill.csvdatatool.repository;

import org.springframework.data.repository.CrudRepository;

import org.mill.csvdatatool.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

    Team findByTeamName(String teamName);
    
}
