package com.leeup.sms.mapper;

import com.leeup.sms.bean.Score;
import com.leeup.sms.bean.ScoreKey;

public interface ScoreMapper {
    int deleteByPrimaryKey(ScoreKey key);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}