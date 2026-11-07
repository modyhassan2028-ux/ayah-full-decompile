package O9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d[] f6513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x f6516u;

    public final d e() {
        d dVarH;
        x xVar;
        synchronized (this) {
            try {
                d[] dVarArrI = this.f6513r;
                if (dVarArrI == null) {
                    dVarArrI = i();
                    this.f6513r = dVarArrI;
                } else if (this.f6514s >= dVarArrI.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrI, dVarArrI.length * 2);
                    p251z9.j.d(objArrCopyOf, "copyOf(...)");
                    this.f6513r = (d[]) objArrCopyOf;
                    dVarArrI = (d[]) objArrCopyOf;
                }
                int i10 = this.f6515t;
                do {
                    dVarH = dVarArrI[i10];
                    if (dVarH == null) {
                        dVarH = h();
                        dVarArrI[i10] = dVarH;
                    }
                    i10++;
                    if (i10 >= dVarArrI.length) {
                        i10 = 0;
                    }
                } while (!dVarH.a(this));
                this.f6515t = i10;
                this.f6514s++;
                xVar = this.f6516u;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null) {
            xVar.y(1);
        }
        return dVarH;
    }

    public abstract d h();

    public abstract d[] i();

    public final void j(d dVar) {
        x xVar;
        int i10;
        p150o9.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f6514s - 1;
                this.f6514s = i11;
                xVar = this.f6516u;
                if (i11 == 0) {
                    this.f6515t = 0;
                }
                p251z9.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p150o9.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(p110k9.y.f19095a);
            }
        }
        if (xVar != null) {
            xVar.y(-1);
        }
    }

    public final x k() {
        x xVar;
        synchronized (this) {
            xVar = this.f6516u;
            if (xVar == null) {
                int i10 = this.f6514s;
                xVar = new x(1, Integer.MAX_VALUE, M9.a.f5831s);
                xVar.g(Integer.valueOf(i10));
                this.f6516u = xVar;
            }
        }
        return xVar;
    }
}
