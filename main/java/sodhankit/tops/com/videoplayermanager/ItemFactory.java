package sodhankit.tops.com.videoplayermanager;

import android.app.Activity;

import com.squareup.picasso.Picasso;
import com.volokh.danylo.video_player_manager.manager.VideoPlayerManager;
import com.volokh.danylo.video_player_manager.meta.MetaData;

import java.io.IOException;

public class ItemFactory {

    public static BaseVideoItem createItemFromAsset(String title, int imageResource, Activity activity, VideoPlayerManager<MetaData> videoPlayerManager, String url) throws IOException {
        return new AssetVideoItem(title,  videoPlayerManager, Picasso.with(activity), imageResource, url);
    }
}