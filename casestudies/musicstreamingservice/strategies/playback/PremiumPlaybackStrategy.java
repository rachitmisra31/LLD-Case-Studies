package casestudies.musicstreamingservice.strategies.playback;

import casestudies.musicstreamingservice.entities.Player;
import casestudies.musicstreamingservice.entities.Song;

public class PremiumPlaybackStrategy implements PlaybackStrategy {
    @Override
    public void play(Song song, Player player) {
        player.setCurrentSong(song);
        System.out.printf("Premium User is now playing: %s%n", song);
    }
}