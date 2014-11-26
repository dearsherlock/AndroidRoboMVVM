package org.robobinding.albumsample.presentationmodel;

import org.robobinding.albumsample.model.Album;
import org.robobinding.albumsample.store.AlbumStore;
import org.robobinding.annotation.PresentationModel;

/**
 * @author Robert Taylor
 * @version $Revision: 1.0 $
 * @since 1.0
 */
@PresentationModel
public class DeleteAlbumPresentationModel {
    private final DeleteAlbumView view;
    private final AlbumStore albumStore;
    private final Album album;

    public DeleteAlbumPresentationModel(DeleteAlbumView view, AlbumStore albumStore, Album album) {
        this.view = view;
        this.albumStore = albumStore;
        this.album = album;
    }

    public void deleteAlbum() {
        albumStore.delete(album);
        view.deleted();
    }

    public void dismissDialog() {
        view.cancelOperation();
    }

    public String getAlbumTitle() {
        return album.getTitle();
    }

    public String getAlbumArtist() {
        return album.getArtist();
    }
}
