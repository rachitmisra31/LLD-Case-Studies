package casestudies.spotify.observers;

import musicstreamingservice.entities.Album;
import musicstreamingservice.entities.Artist;

public interface ArtistObserver {
    void update(Artist artist, Album newAlbum);
}