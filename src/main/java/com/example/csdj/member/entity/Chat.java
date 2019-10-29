package com.example.csdj.member.entity;

import com.example.csdj.branch.entity.Member;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 孙杰
 * @create 2019/10/29
 */
public class Chat {
    //参与聊天的用户列表
    private List<Member> members;
    //当前用户
    private Member member;
    //聊天列表
    private LinkedList<String> chats = new LinkedList<>();

    public Chat() {
    }

    public Chat(List<Member> members, Member member, LinkedList<String> chats) {
        this.members = members;
        this.member = member;
        this.chats = chats;
    }

    public Chat(List<Member> members, LinkedList<String> chats) {
        this.members = members;
        this.chats = chats;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LinkedList<String> getChats() {
        return chats;
    }

    public void setChats(LinkedList<String> chats) {
        this.chats = chats;
    }
}
