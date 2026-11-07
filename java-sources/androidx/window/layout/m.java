package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f13090r = new m(1);

    @Override // p241y9.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        p251z9.j.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
