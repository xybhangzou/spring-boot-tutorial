package com.example.framework.algorithmleetcode;

/**
 * @author xnf
 * @DESCRIPTION  其它类型算法
 * @date 2020-07-24 11:00
 */
public class OtherType {

    /**
     * 1、除数博弈1025（黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
     * 选出任一 x，满足 0 < x < N 且 N % x == 0 。
     * 用 N - x 替换黑板上的数字 N 。
     * 如果玩家无法执行这些操作，就会输掉游戏。
     * 只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 false。
     * @param N
     * @return
     */
    public boolean divisorGame(int N) {
        return N%2==0;
    }
}
