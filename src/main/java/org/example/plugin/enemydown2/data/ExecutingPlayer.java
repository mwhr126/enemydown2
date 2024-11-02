package org.example.plugin.enemydown2.data;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

/**
 * EnemyDownのゲームを実行する際のプレイヤー情報を扱うオブジェクト。
 * プレイヤー名、合計点数、日時などの情報を持つ。
 */

@Getter
@Setter
public class ExecutingPlayer {

  private String playerName;
  private int score;
  private int gameTime;

  public ExecutingPlayer(@NotNull String playerName) {
    this.playerName = playerName;
  }
}
