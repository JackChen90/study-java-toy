package indi.jackie.toy.designpattern.proxy;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description IGamePlayer
 */
public interface IGamePlayer {

    /**
     * 登录
     */
    void login();

    /**
     * 打怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
