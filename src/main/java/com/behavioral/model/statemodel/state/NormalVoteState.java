package com.behavioral.model.statemodel.state;

import com.behavioral.model.statemodel.VoteManager;
/*具体状态(ConcreteState)角色：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。*/
public class NormalVoteState implements VoteState {
	@Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}
