package casestudies.musicstreamingservice.state;

import casestudies.musicstreamingservice.entities.Player;

public interface PlayerState {
    void play(Player player);
    void pause(Player player);
    void stop(Player player);
}