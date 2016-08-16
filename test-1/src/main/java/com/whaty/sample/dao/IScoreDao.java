package com.whaty.sample.dao;

import com.whaty.sample.entity.Score;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by hsc on 16/8/16.
 */
public interface IScoreDao extends CrudRepository<Score, Integer> {

    @Transactional
    @Modifying
    @Query("update Score t set t.score = :score where t.id = :id")
    int updateScoreById(@Param("score") double score, @Param("id") int id);

    @Query("select t from Score t")
    List<Score> getList();

}
