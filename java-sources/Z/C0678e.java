package Z;

import K9.C0389g;
import W.C0557f1;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: renamed from: Z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0678e implements T {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0557f1 f10657r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Throwable f10659t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f10658s = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f10660u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f10661v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p074h0.a f10662w = new p074h0.a(0);

    public C0678e(C0557f1 c0557f1) {
        this.f10657r = c0557f1;
    }

    public static final void a(C0678e c0678e, Throwable th) {
        synchronized (c0678e.f10658s) {
            try {
                if (c0678e.f10659t != null) {
                    return;
                }
                c0678e.f10659t = th;
                ArrayList arrayList = c0678e.f10660u;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C0676d) arrayList.get(i10)).f10655b.resumeWith(p110k9.a.b(th));
                }
                c0678e.f10660u.clear();
                c0678e.f10662w.set(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p150o9.h
    public final p150o9.h A(p150o9.g gVar) {
        return Y2.a.Y(this, gVar);
    }

    @Override // p150o9.h
    public final Object F(Object obj, p241y9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // p150o9.h
    public final p150o9.h L(p150o9.h hVar) {
        return Y2.a.Z(this, hVar);
    }

    @Override // Z.T
    public final Object b0(p241y9.c cVar, p150o9.c cVar2) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar2));
        c0389g.s();
        C0676d c0676d = new C0676d(cVar, c0389g);
        synchronized (this.f10658s) {
            Throwable th = this.f10659t;
            if (th != null) {
                c0389g.resumeWith(p110k9.a.b(th));
            } else {
                boolean zIsEmpty = this.f10660u.isEmpty();
                this.f10660u.add(c0676d);
                if (zIsEmpty) {
                    this.f10662w.set(1);
                }
                c0389g.u(new X.L(3, this, c0676d));
                if (zIsEmpty) {
                    try {
                        this.f10657r.invoke();
                    } catch (Throwable th2) {
                        a(this, th2);
                    }
                }
            }
        }
        return c0389g.r();
    }

    public final void c(long j) {
        Object objB;
        synchronized (this.f10658s) {
            try {
                ArrayList arrayList = this.f10660u;
                this.f10660u = this.f10661v;
                this.f10661v = arrayList;
                this.f10662w.set(0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0676d c0676d = (C0676d) arrayList.get(i10);
                    C0389g c0389g = c0676d.f10655b;
                    try {
                        objB = c0676d.f10654a.e(Long.valueOf(j));
                    } catch (Throwable th) {
                        objB = p110k9.a.b(th);
                    }
                    c0389g.resumeWith(objB);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p150o9.f
    public final p150o9.g getKey() {
        return S.f10639s;
    }

    @Override // p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        return Y2.a.y(this, gVar);
    }
}
