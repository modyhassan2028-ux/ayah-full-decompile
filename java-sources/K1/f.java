package K1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InputContentInfo f5218r;

    public f(Object obj) {
        this.f5218r = (InputContentInfo) obj;
    }

    @Override // K1.g
    public final ClipDescription e() {
        return this.f5218r.getDescription();
    }

    @Override // K1.g
    public final Object p() {
        return this.f5218r;
    }

    @Override // K1.g
    public final Uri q() {
        return this.f5218r.getContentUri();
    }

    @Override // K1.g
    public final void r() {
        this.f5218r.requestPermission();
    }

    @Override // K1.g
    public final Uri t() {
        return this.f5218r.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5218r = new InputContentInfo(uri, clipDescription, uri2);
    }
}
