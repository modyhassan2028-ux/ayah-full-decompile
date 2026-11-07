package p094j1;

import J0.r0;
import Z.C0694m;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import p085i0.j;
import p241y9.a;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p251z9.k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f18738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f18739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0694m f18740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f18741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f18743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, c cVar, C0694m c0694m, j jVar, int i10, View view) {
        super(0);
        this.f18738r = context;
        this.f18739s = cVar;
        this.f18740t = c0694m;
        this.f18741u = jVar;
        this.f18742v = i10;
        this.f18743w = view;
    }

    @Override // p241y9.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f18743w;
        p251z9.j.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(this.f18738r, this.f18739s, this.f18740t, this.f18741u, this.f18742v, (r0) callback).getLayoutNode();
    }
}
