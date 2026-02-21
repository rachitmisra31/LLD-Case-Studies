package casestudies.musicstreamingservice.observers;

import casestudies.musicstreamingservice.entities.Album;
import casestudies.musicstreamingservice.entities.Artist;

public interface ArtistObserver {
    void update(Artist artist, Album newAlbum);
}