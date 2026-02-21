package casestudies.musicstreamingservice.strategies.recommendation;

import casestudies.musicstreamingservice.entities.Song;

import java.util.List;

public interface RecommendationStrategy {
    List<Song> recommend(List<Song> allSongs);
}