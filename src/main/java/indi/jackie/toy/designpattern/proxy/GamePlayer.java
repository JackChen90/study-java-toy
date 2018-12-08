package indi.jackie.toy.designpattern.proxy;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description GamePlayer
 */
public class GamePlayer implements IGamePlayer{
    @Override
    public void login() {
        System.out.println("game player login");
    }

    @Override
    public void killBoss() {
        System.out.println("game player kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println("game player upgrade");
    }
}
