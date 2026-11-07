package p094j1;

import Z.C0672b;
import Z.C0698o;
import androidx.compose.ui.viewinterop.a;
import l0.r;
import p110k9.y;
import p241y9.c;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f18726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f18727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f18728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18729v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(c cVar, r rVar, c cVar2, int i10, int i11) {
        super(2);
        this.f18725r = i11;
        this.f18726s = cVar;
        this.f18727t = rVar;
        this.f18728u = cVar2;
        this.f18729v = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f18725r;
        C0698o c0698o = (C0698o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                a.a(this.f18726s, this.f18727t, this.f18728u, c0698o, C0672b.y(this.f18729v | 1));
                break;
            default:
                a.b(this.f18726s, this.f18727t, this.f18728u, c0698o, C0672b.y(this.f18729v | 1));
                break;
        }
        return y.f19095a;
    }
}
