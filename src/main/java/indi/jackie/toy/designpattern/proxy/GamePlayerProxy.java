package indi.jackie.toy.designpattern.proxy;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description GamePlayerProxy
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login() {
        System.out.println("proxy login begin...");
        this.gamePlayer.login();
        System.out.println("proxy login end...");
    }

    @Override
    public void killBoss() {
        System.out.println("proxy killBoss begin...");
        this.gamePlayer.killBoss();
        System.out.println("proxy killBoss end...");
    }

    @Override
    public void upgrade() {
        System.out.println("proxy upgrade begin...");
        this.gamePlayer.upgrade();
        System.out.println("proxy upgrade end...");
    }
}
