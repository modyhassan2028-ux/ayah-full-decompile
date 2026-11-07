package p104k1;

import androidx.compose.ui.window.PopupLayout;
import p063g1.m;
import p110k9.y;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f18910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f18911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f18912t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f18913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f18914v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PopupLayout popupLayout, a aVar, t tVar, String str, m mVar) {
        super(0);
        this.f18910r = popupLayout;
        this.f18911s = aVar;
        this.f18912t = tVar;
        this.f18913u = str;
        this.f18914v = mVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        this.f18910r.i(this.f18911s, this.f18912t, this.f18913u, this.f18914v);
        return y.f19095a;
    }
}
