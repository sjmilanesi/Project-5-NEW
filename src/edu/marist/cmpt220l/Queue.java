package edu.marist.cmpt220l;

import edu.marist.cmpt220l.teams.Team;


public class Queue {
    private Team first;
    private Team last;

    public BracketQueue() {
        this.first = null;
        this.last = null;
    }

    
    public void enqueue(Team team){
        Team newTeam = new Team(team);
        if (last != null) {
            last.next = newTeam;
        }
            last = newTeam;
    }


    public Team dequeue(){
        if (first != null){
            Team currTeam = first;
            first = first.next;
            return currTeam.value;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }
    
    
    public Team[] PeakNextTeams() {
        Team[] team = {first.value, first.next.value};
        return (team);
    }
    
    public Team[] GetNextTeams(){
        Team nextTeam = dequeue();
        Team nextTeam2 = dequeue();
        return PeakNextTeams();
    }
    
    public void ReturnTeams(Team winner, Team loser){
        enqueue(winner);
    }

}
