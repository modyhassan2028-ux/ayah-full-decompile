package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.r;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends p010b.d {
    @Override // p010b.d
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = r.P(bundle);
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
