package K0;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: K0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375w extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f5199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5200t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375w(AndroidComposeView androidComposeView, q9.c cVar) {
        super(cVar);
        this.f5199s = androidComposeView;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5198r = obj;
        this.f5200t |= Integer.MIN_VALUE;
        this.f5199s.P(null, this);
        return p161p9.a.f21156r;
    }
}
