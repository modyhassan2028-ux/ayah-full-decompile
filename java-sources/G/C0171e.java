package G;

import K9.C0389g;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: G.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171e implements l0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0389g f2694b;

    @Override // l0.r
    public final /* synthetic */ l0.r b(l0.r rVar) {
        return android.support.v4.media.session.p.d(this, rVar);
    }

    @Override // l0.r
    public final boolean g(p241y9.c cVar) {
        return ((Boolean) cVar.e(this)).booleanValue();
    }

    @Override // l0.r
    public final Object h(Object obj, p241y9.e eVar) {
        return eVar.invoke(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(q9.c cVar) {
        C0170d c0170d;
        C0389g c0389g;
        if (cVar instanceof C0170d) {
            c0170d = (C0170d) cVar;
            int i10 = c0170d.f2679u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0170d.f2679u = i10 - Integer.MIN_VALUE;
            } else {
                c0170d = new C0170d(this, cVar);
            }
        } else {
            c0170d = new C0170d(this, cVar);
        }
        Object obj = c0170d.f2677s;
        int i11 = c0170d.f2679u;
        p110k9.y yVar = p110k9.y.f19095a;
        if (i11 == 0) {
            p110k9.a.e(obj);
            if (!this.f2693a) {
                C0389g c0389g2 = this.f2694b;
                c0170d.f2676r = c0389g2;
                c0170d.f2679u = 1;
                C0389g c0389g3 = new C0389g(1, AbstractC0813f2.H(c0170d));
                c0389g3.s();
                this.f2694b = c0389g3;
                Object objR = c0389g3.r();
                p161p9.a aVar = p161p9.a.f21156r;
                if (objR == aVar) {
                    return aVar;
                }
                c0389g = c0389g2;
            }
            return yVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0389g = c0170d.f2676r;
        p110k9.a.e(obj);
        if (c0389g != null) {
            c0389g.resumeWith(yVar);
        }
        return yVar;
    }
}
