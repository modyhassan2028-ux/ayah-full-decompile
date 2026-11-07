package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f13092r = new o(1);

    @Override // p241y9.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        p251z9.j.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
