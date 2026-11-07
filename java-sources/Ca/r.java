package Ca;

import K9.a0;
import U6.y;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import i7.C0985h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p151p.C1256n;
import p207v2.f0;
import p207v2.g0;
import p207v2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f851e;

    public r(C0985h0 c0985h0, String str) {
        this.f847a = 3;
        this.f851e = c0985h0;
        y.c(str);
        this.f849c = str;
    }

    public oa.n a() {
        pa.c cVarD = ((pa.d) this.f851e).d();
        oa.n nVar = cVarD instanceof oa.n ? (oa.n) cVarD : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f851e) {
            z10 = this.f848b;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(a0 a0Var, q9.c cVar) {
        g0 g0Var;
        S9.c cVar2;
        r rVar;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f23240w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f23240w = i10 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object obj = g0Var.f23238u;
        int i11 = g0Var.f23240w;
        if (i11 == 0) {
            p110k9.a.e(obj);
            cVar2 = (S9.c) this.f850d;
            g0Var.f23235r = this;
            g0Var.f23236s = a0Var;
            g0Var.f23237t = cVar2;
            g0Var.f23240w = 1;
            Object objE = cVar2.e(g0Var);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
            rVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S9.c cVar3 = g0Var.f23237t;
            a0 a0Var2 = g0Var.f23236s;
            rVar = g0Var.f23235r;
            p110k9.a.e(obj);
            cVar2 = cVar3;
            a0Var = a0Var2;
        }
        try {
            if (a0Var == ((a0) rVar.f851e)) {
                rVar.f851e = null;
            }
            return p110k9.y.f19095a;
        } finally {
            cVar2.b(null);
        }
    }

    public Da.i d() {
        return (Da.i) p123m2.c.q(1, (ArrayList) this.f849c);
    }

    public void e(IOException iOException) {
        this.f848b = true;
        ((pa.d) this.f851e).d().g((oa.m) this.f849c, iOException);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [K9.a0] */
    /* JADX WARN: Type inference failed for: r10v1, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [K9.a0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public Object f(a0 a0Var, q9.c cVar) {
        h0 h0Var;
        r rVar;
        ?? r10;
        S9.a aVar;
        r rVar2;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f23249w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f23249w = i10 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object obj = h0Var.f23247u;
        int i11 = h0Var.f23249w;
        boolean z10 = true;
        p161p9.a aVar2 = p161p9.a.f21156r;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                S9.c cVar2 = (S9.c) this.f850d;
                h0Var.f23244r = this;
                h0Var.f23245s = a0Var;
                h0Var.f23246t = cVar2;
                h0Var.f23249w = 1;
                if (cVar2.e(h0Var) != aVar2) {
                    rVar = this;
                    r10 = a0Var;
                    aVar = cVar2;
                }
                return aVar2;
            }
            if (i11 == 1) {
                S9.a aVar3 = h0Var.f23246t;
                a0 a0Var2 = h0Var.f23245s;
                rVar = h0Var.f23244r;
                p110k9.a.e(obj);
                r10 = a0Var2;
                aVar = aVar3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S9.a aVar4 = h0Var.f23246t;
                a0 a0Var3 = h0Var.f23245s;
                rVar2 = h0Var.f23244r;
                p110k9.a.e(obj);
                r10 = a0Var3;
                aVar = aVar4;
            }
            rVar = rVar2;
            rVar.f851e = r10;
            a0Var = aVar;
            Boolean boolValueOf = Boolean.valueOf(z10);
            a0Var.b(null);
            return boolValueOf;
            a0 a0Var4 = (a0) rVar.f851e;
            if (a0Var4 == null || !a0Var4.b() || rVar.f848b) {
                if (a0Var4 != null) {
                    a0Var4.e(new f0((C1256n) rVar.f849c));
                }
                if (a0Var4 != null) {
                    h0Var.f23244r = rVar;
                    h0Var.f23245s = r10;
                    h0Var.f23246t = aVar;
                    h0Var.f23249w = 2;
                    if (a0Var4.w(h0Var) != aVar2) {
                        rVar2 = rVar;
                        r10 = r10;
                        aVar = aVar;
                        rVar = rVar2;
                    }
                    return aVar2;
                }
                rVar.f851e = r10;
                a0Var = aVar;
            } else {
                z10 = false;
                a0Var = aVar;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z10);
            a0Var.b(null);
            return boolValueOf2;
        } catch (Throwable th) {
            a0Var.b(null);
            throw th;
        }
    }

    public void g(String str, int i10, long j, p241y9.c cVar) {
        p251z9.j.e(str, "name");
        Da.h hVar = new Da.h();
        ArrayList arrayList = (ArrayList) this.f849c;
        arrayList.add(hVar);
        this.f848b = false;
        ArrayList arrayList2 = (ArrayList) this.f851e;
        arrayList2.add(str);
        try {
            cVar.e(hVar);
            int i11 = this.f848b ? 32 : 0;
            this.f848b = true;
            arrayList.remove(arrayList.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            Da.i iVarD = d();
            if (j < 31) {
                iVarD.writeByte(i10 | i11 | ((int) j));
            } else {
                iVarD.writeByte(i10 | i11 | 31);
                i(j);
            }
            long j10 = hVar.f1362s;
            if (j10 >= 128) {
                int iNumberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(j10)) / 8;
                iVarD.writeByte(iNumberOfLeadingZeros | 128);
                int i12 = (iNumberOfLeadingZeros - 1) * 8;
                int iC = p186s9.b.c(i12, 0, -8);
                if (iC <= i12) {
                    while (true) {
                        iVarD.writeByte((int) (j10 >> i12));
                        if (i12 == iC) {
                            break;
                        } else {
                            i12 -= 8;
                        }
                    }
                }
            } else {
                iVarD.writeByte((int) j10);
            }
            iVarD.W(hVar);
        } catch (Throwable th) {
            arrayList.remove(arrayList.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            throw th;
        }
    }

    public void h(String str) {
        p251z9.j.e(str, "value");
        d().T(str);
    }

    public void i(long j) {
        Da.i iVarD = d();
        int iNumberOfLeadingZeros = (((70 - Long.numberOfLeadingZeros(j)) / 7) - 1) * 7;
        int iC = p186s9.b.c(iNumberOfLeadingZeros, 0, -7);
        if (iC > iNumberOfLeadingZeros) {
            return;
        }
        while (true) {
            iVarD.writeByte((iNumberOfLeadingZeros == 0 ? 0 : 128) | ((int) ((j >> iNumberOfLeadingZeros) & 127)));
            if (iNumberOfLeadingZeros == iC) {
                return;
            } else {
                iNumberOfLeadingZeros -= 7;
            }
        }
    }

    public String j() {
        if (!this.f848b) {
            this.f848b = true;
            C0985h0 c0985h0 = (C0985h0) this.f851e;
            this.f850d = c0985h0.s().getString((String) this.f849c, null);
        }
        return (String) this.f850d;
    }

    public void k(String str) {
        SharedPreferences.Editor editorEdit = ((C0985h0) this.f851e).s().edit();
        editorEdit.putString((String) this.f849c, str);
        editorEdit.apply();
        this.f850d = str;
    }

    public String toString() {
        switch (this.f847a) {
            case 0:
                return p120l9.m.l0((ArrayList) this.f851e, " / ", null, null, null, 62);
            default:
                return super.toString();
        }
    }

    public r(Da.h hVar) {
        this.f847a = 0;
        this.f849c = AbstractC0813f2.M(hVar);
        this.f850d = new ArrayList();
        this.f851e = new ArrayList();
    }

    public r() {
        this.f847a = 2;
        this.f851e = new Object();
        this.f849c = new ArrayList();
        this.f850d = new ArrayList();
        this.f848b = true;
    }

    public r(oa.m mVar, oa.g gVar, pa.d dVar) {
        this.f847a = 4;
        p251z9.j.e(gVar, "finder");
        this.f849c = mVar;
        this.f850d = gVar;
        this.f851e = dVar;
    }

    public r(C1256n c1256n, boolean z10) {
        this.f847a = 6;
        this.f849c = c1256n;
        this.f848b = z10;
        this.f850d = S9.d.a();
    }

    public r(p213v8.b bVar, boolean z10) {
        this.f847a = 5;
        this.f851e = bVar;
        this.f850d = new AtomicReference(null);
        this.f848b = z10;
        this.f849c = new AtomicMarkableReference(new p178r8.e(z10 ? 8192 : 1024), false);
    }

    public r(int i10) {
        this.f847a = 1;
        this.f849c = new ReentrantLock();
        this.f850d = new long[i10];
        this.f851e = new boolean[i10];
    }
}
