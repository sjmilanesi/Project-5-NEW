package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.team.Team;


public class Stack {

    private StackItem top;
    private Team head;
    private Team listTeam;

    public void push(Team team){
        Team loser = new Team(team);
        listTeam.next = head;
        head = listTeam;
    }

    public Team pop(){
        if(head == null){
            System.out.println("Unable to pop");
            return null;
        }
    }
}
