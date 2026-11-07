package P3;

import Z.C0677d0;
import Z.D0;
import Z.X;
import Z0.y;
import p093j0.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6599r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f6600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6603v;

    public /* synthetic */ a(M3.a aVar, X x9, X x10, p241y9.e eVar) {
        this.f6600s = x9;
        this.f6602u = eVar;
        this.f6603v = aVar;
        this.f6601t = x10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f6599r) {
            case 0:
                p241y9.e eVar = (p241y9.e) this.f6602u;
                M3.a aVar = (M3.a) this.f6603v;
                X x9 = (X) this.f6601t;
                this.f6600s.setValue(Boolean.FALSE);
                eVar.invoke(aVar, ((y) x9.getValue()).f10953a.f8060s);
                break;
            default:
                p241y9.c cVar = (p241y9.c) this.f6601t;
                p095j3.a aVar2 = (p095j3.a) this.f6602u;
                C0677d0 c0677d0 = (C0677d0) this.f6603v;
                cVar.e(aVar2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - ((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c > 5000) {
                    this.f6600s.setValue(Boolean.TRUE);
                    c0677d0.g(jCurrentTimeMillis);
                }
                break;
        }
        return p110k9.y.f19095a;
    }

    public /* synthetic */ a(p241y9.c cVar, p095j3.a aVar, C0677d0 c0677d0, X x9) {
        this.f6601t = cVar;
        this.f6602u = aVar;
        this.f6603v = c0677d0;
        this.f6600s = x9;
    }
}
