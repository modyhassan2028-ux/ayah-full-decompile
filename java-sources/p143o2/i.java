package p143o2;

import E6.u;
import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public class i extends u {
    public final /* synthetic */ MediaBrowserServiceCompat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.g = mediaBrowserServiceCompat;
    }

    @Override // E6.u
    public final void v() {
        h hVar = new h(this, this.g);
        this.f1961c = hVar;
        hVar.onCreate();
    }
}
