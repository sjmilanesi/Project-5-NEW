package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.TeamManager;

/**
 * The event manager manages the events in the application
 */
public class EventManager {
    private Event[] events;
    private Team[] t;

    /**
     * Construct a new EventManager
     */
    public EventManager() {
        events = new Event[] {
                new WashoosEvent(),
                new HorseshoesEvent(),
                new CornHoleEvent(),
                new CanJamEvent(),
                new LadderBallEvent(),
                new StickGameEvent()
        };
    }
    
     public EventManager(TeamManager team) {
        t = team.getTeams();
        
        events = new Event[] {
                new WashoosEvent(),
                new HorseshoesEvent(),
                new CornHoleEvent(),
                new CanJamEvent(),
                new LadderBallEvent(),
                new StickGameEvent()
        };
    }

    /**
     * Retrieve the events
     *
     * @return the events
     */
    public Event[] getEvents() {
        return events;
    }
    
    public Event[] getTeams(){
        return t;
    }
    
}
