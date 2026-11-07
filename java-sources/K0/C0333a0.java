package K0;

import A.C0007a;
import K9.C0389g;
import Z.C0683g0;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: renamed from: K0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0333a0 implements Z.T {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f5055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f5056t;

    public C0333a0(Choreographer choreographer, Y y10) {
        this.f5054r = 0;
        this.f5055s = choreographer;
        this.f5056t = y10;
    }

    private final Object a(p241y9.c cVar, p150o9.c cVar2) {
        Y y10 = (Y) this.f5056t;
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar2));
        c0389g.s();
        Z z10 = new Z(c0389g, this, cVar);
        if (p251z9.j.a(y10.f5040t, (Choreographer) this.f5055s)) {
            synchronized (y10.f5042v) {
                y10.f5044x.add(z10);
                if (!y10.f5037A) {
                    y10.f5037A = true;
                    y10.f5040t.postFrameCallback(y10.f5038B);
                }
            }
            c0389g.u(new C0007a(20, y10, z10));
        } else {
            ((Choreographer) this.f5055s).postFrameCallback(z10);
            c0389g.u(new C0007a(21, this, z10));
        }
        return c0389g.r();
    }

    @Override // p150o9.h
    public final p150o9.h A(p150o9.g gVar) {
        switch (this.f5054r) {
            case 0:
                break;
        }
        return Y2.a.Y(this, gVar);
    }

    @Override // p150o9.h
    public final Object F(Object obj, p241y9.e eVar) {
        switch (this.f5054r) {
            case 0:
                break;
        }
        return eVar.invoke(obj, this);
    }

    @Override // p150o9.h
    public final p150o9.h L(p150o9.h hVar) {
        switch (this.f5054r) {
            case 0:
                break;
        }
        return Y2.a.Z(this, hVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // Z.T
    public final Object b0(p241y9.c cVar, p150o9.c cVar2) {
        C0683g0 c0683g0;
        Object objR;
        C0333a0 c0333a0;
        switch (this.f5054r) {
            case 0:
                return a(cVar, cVar2);
            default:
                if (cVar2 instanceof C0683g0) {
                    c0683g0 = (C0683g0) cVar2;
                    int i10 = c0683g0.f10673v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0683g0.f10673v = i10 - Integer.MIN_VALUE;
                    } else {
                        c0683g0 = new C0683g0(this, cVar2);
                    }
                } else {
                    c0683g0 = new C0683g0(this, cVar2);
                }
                Object obj = c0683g0.f10671t;
                p161p9.a aVar = p161p9.a.f21156r;
                int i11 = c0683g0.f10673v;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    Ca.r rVar = (Ca.r) this.f5056t;
                    c0683g0.f10669r = this;
                    c0683g0.f10670s = cVar;
                    c0683g0.f10673v = 1;
                    if (rVar.b()) {
                        objR = p110k9.y.f19095a;
                    } else {
                        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(c0683g0));
                        c0389g.s();
                        synchronized (rVar.f851e) {
                            ((ArrayList) rVar.f849c).add(c0389g);
                        }
                        c0389g.u(new X.L(4, rVar, c0389g));
                        objR = c0389g.r();
                        if (objR != aVar) {
                            objR = p110k9.y.f19095a;
                        }
                    }
                    if (objR != aVar) {
                        c0333a0 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                cVar = c0683g0.f10670s;
                c0333a0 = c0683g0.f10669r;
                p110k9.a.e(obj);
                Z.T t2 = (Z.T) c0333a0.f5055s;
                c0683g0.f10669r = null;
                c0683g0.f10670s = null;
                c0683g0.f10673v = 2;
                Object objB0 = t2.b0(cVar, c0683g0);
                if (objB0 != aVar) {
                    return objB0;
                }
                return aVar;
        }
    }

    @Override // p150o9.f
    public final p150o9.g getKey() {
        switch (this.f5054r) {
            case 0:
                break;
        }
        return Z.S.f10639s;
    }

    @Override // p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        switch (this.f5054r) {
            case 0:
                break;
        }
        return Y2.a.y(this, gVar);
    }

    public C0333a0(Z.T t2) {
        this.f5054r = 1;
        this.f5055s = t2;
        this.f5056t = new Ca.r();
    }
}
