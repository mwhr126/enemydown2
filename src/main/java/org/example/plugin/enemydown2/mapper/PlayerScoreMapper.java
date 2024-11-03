package org.example.plugin.enemydown2.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.example.plugin.enemydown2.mapper.data.PlayerScore;

public interface PlayerScoreMapper {

  @Select("select * from player_score")
  List<PlayerScore> selectList();
}
