package p214w;

import Z.L0;
import androidx.compose.animation.a;
import p063g1.l;
import p223x.AbstractC1413d;
import p223x.InterfaceC1435y;
import p223x.l0;
import p241y9.c;
import p251z9.j;
import p251z9.k;

/* JADX INFO: renamed from: w.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1398k extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1399l f23508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f23509t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1398k(C1399l c1399l, long j, int i10) {
        super(1);
        this.f23507r = i10;
        this.f23508s = c1399l;
        this.f23509t = j;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long j;
        InterfaceC1435y interfaceC1435y;
        long j10;
        switch (this.f23507r) {
            case 0:
                l0 l0Var = (l0) obj;
                Object objA = l0Var.a();
                C1399l c1399l = this.f23508s;
                if (j.a(objA, c1399l.f23512I.a())) {
                    j = l.a(c1399l.f23513J, a.f11739a) ? this.f23509t : c1399l.f23513J;
                } else {
                    L0 l10 = (L0) c1399l.f23512I.f23520d.g(l0Var.a());
                    j = l10 != null ? ((l) l10.getValue()).f16260a : 0L;
                }
                L0 l11 = (L0) c1399l.f23512I.f23520d.g(l0Var.c());
                long j11 = l11 != null ? ((l) l11.getValue()).f16260a : 0L;
                P p10 = (P) c1399l.f23511H.getValue();
                return (p10 == null || (interfaceC1435y = (InterfaceC1435y) p10.f23461a.invoke(new l(j), new l(j11))) == null) ? AbstractC1413d.p(400.0f, 5, null) : interfaceC1435y;
            default:
                C1399l c1399l2 = this.f23508s;
                if (j.a(obj, c1399l2.f23512I.a())) {
                    j10 = l.a(c1399l2.f23513J, a.f11739a) ? this.f23509t : c1399l2.f23513J;
                } else {
                    L0 l12 = (L0) c1399l2.f23512I.f23520d.g(obj);
                    j10 = l12 != null ? ((l) l12.getValue()).f16260a : 0L;
                }
                return new l(j10);
        }
    }
}
