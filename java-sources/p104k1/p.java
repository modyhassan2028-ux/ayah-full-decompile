package p104k1;

import androidx.compose.ui.window.PopupLayout;
import p110k9.y;
import p241y9.a;
import p251z9.k;
import p251z9.u;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f18944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f18945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p063g1.k f18946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f18947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f18948v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, PopupLayout popupLayout, p063g1.k kVar, long j, long j10) {
        super(0);
        this.f18944r = uVar;
        this.f18945s = popupLayout;
        this.f18946t = kVar;
        this.f18947u = j;
        this.f18948v = j10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        PopupLayout popupLayout = this.f18945s;
        this.f18944r.f24885r = popupLayout.getPositionProvider().a(this.f18946t, this.f18947u, popupLayout.getParentLayoutDirection(), this.f18948v);
        return y.f19095a;
    }
}
