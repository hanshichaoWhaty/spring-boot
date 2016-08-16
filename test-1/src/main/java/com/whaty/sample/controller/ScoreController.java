package com.whaty.sample.controller;

import com.whaty.sample.dao.IScoreDao;
import com.whaty.sample.entity.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hsc on 16/8/16.
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private IScoreDao scoreService;

    @RequestMapping("scoreList")
    public List<Score> getScoreList() {
//        logger.info("从数据库读取Score集合");
//        // 测试更新数据库
//        logger.info("更新的行数:" + scoreService.updateScoreById(88.8d, 2));
//        scoreService.delete(3);
//
//        return scoreService.getList();
        return null;
    }

}
