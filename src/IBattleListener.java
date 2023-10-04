public interface IBattleListener {
    public void onNewBattle(BattleEvent event);
    public void onBattleCancel(BattleEvent event);
    public void onBattleConfirm(BattleEvent event);
}
