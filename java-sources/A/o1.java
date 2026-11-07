package A;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements p118l7.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f367t;

    public /* synthetic */ o1(Object obj, long j, int i10) {
        this.f365r = i10;
        this.f367t = obj;
        this.f366s = j;
    }

    public long a(D0.v vVar, float f3) {
        long jH = p171r0.c.h(this.f366s, p171r0.c.g(vVar.f1134c, vVar.g));
        this.f366s = jH;
        EnumC0047u0 enumC0047u0 = (EnumC0047u0) this.f367t;
        if ((enumC0047u0 == null ? p171r0.c.c(jH) : Math.abs(g(jH))) < f3) {
            return 9205357640488583168L;
        }
        if (enumC0047u0 == null) {
            long j = this.f366s;
            float fC = p171r0.c.c(j);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / fC;
            return p171r0.c.g(this.f366s, p171r0.c.i((4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / fC))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f3));
        }
        float fG = g(this.f366s) - (Math.signum(g(this.f366s)) * f3);
        long j10 = this.f366s;
        EnumC0047u0 enumC0047u1 = EnumC0047u0.f425s;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (enumC0047u0 == enumC0047u1 ? j10 & 4294967295L : j10 >> 32));
        if (enumC0047u0 == enumC0047u1) {
            return (((long) Float.floatToRawIntBits(fG)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fG)));
    }

    public void b(int i10) {
        if (i10 < 64) {
            this.f366s &= ~(1 << i10);
            return;
        }
        o1 o1Var = (o1) this.f367t;
        if (o1Var != null) {
            o1Var.b(i10 - 64);
        }
    }

    public int c(int i10) {
        o1 o1Var = (o1) this.f367t;
        if (o1Var == null) {
            return i10 >= 64 ? Long.bitCount(this.f366s) : Long.bitCount(this.f366s & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f366s & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f366s) + o1Var.c(i10 - 64);
    }

    public void d() {
        if (((o1) this.f367t) == null) {
            this.f367t = new o1();
        }
    }

    public boolean e(int i10) {
        if (i10 < 64) {
            return (this.f366s & (1 << i10)) != 0;
        }
        d();
        return ((o1) this.f367t).e(i10 - 64);
    }

    public void f(int i10, boolean z10) {
        if (i10 >= 64) {
            d();
            ((o1) this.f367t).f(i10 - 64, z10);
            return;
        }
        long j = this.f366s;
        boolean z11 = (Long.MIN_VALUE & j) != 0;
        long j10 = (1 << i10) - 1;
        this.f366s = ((j & (~j10)) << 1) | (j & j10);
        if (z10) {
            l(i10);
        } else {
            b(i10);
        }
        if (z11 || ((o1) this.f367t) != null) {
            d();
            ((o1) this.f367t).f(0, z11);
        }
    }

    public float g(long j) {
        return Float.intBitsToFloat((int) (((EnumC0047u0) this.f367t) == EnumC0047u0.f425s ? j >> 32 : j & 4294967295L));
    }

    @Override // p118l7.e
    public /* synthetic */ void h(Exception exc) {
        p074h0.i iVar = (p074h0.i) this.f367t;
        ((AtomicLong) iVar.f16424u).set(this.f366s);
    }

    public ka.l i() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strG = ((Da.j) this.f367t).G(this.f366s);
            this.f366s -= (long) strG.length();
            if (strG.length() == 0) {
                return new ka.l((String[]) arrayList.toArray(new String[0]));
            }
            int iB1 = H9.o.b1(strG, ':', 1, 4);
            if (iB1 != -1) {
                String strSubstring = strG.substring(0, iB1);
                p251z9.j.d(strSubstring, "substring(...)");
                String strSubstring2 = strG.substring(iB1 + 1);
                p251z9.j.d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(H9.o.t1(strSubstring2).toString());
            } else if (strG.charAt(0) == ':') {
                String strSubstring3 = strG.substring(1);
                p251z9.j.d(strSubstring3, "substring(...)");
                arrayList.add("");
                arrayList.add(H9.o.t1(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(H9.o.t1(strG).toString());
            }
        }
    }

    public boolean j(int i10) {
        if (i10 >= 64) {
            d();
            return ((o1) this.f367t).j(i10 - 64);
        }
        long j = 1 << i10;
        long j10 = this.f366s;
        boolean z10 = (j10 & j) != 0;
        long j11 = j10 & (~j);
        this.f366s = j11;
        long j12 = j - 1;
        this.f366s = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        o1 o1Var = (o1) this.f367t;
        if (o1Var != null) {
            if (o1Var.e(0)) {
                l(63);
            }
            ((o1) this.f367t).j(0);
        }
        return z10;
    }

    public void k() {
        this.f366s = 0L;
        o1 o1Var = (o1) this.f367t;
        if (o1Var != null) {
            o1Var.k();
        }
    }

    public void l(int i10) {
        if (i10 < 64) {
            this.f366s |= 1 << i10;
        } else {
            d();
            ((o1) this.f367t).l(i10 - 64);
        }
    }

    public String toString() {
        switch (this.f365r) {
            case 1:
                if (((o1) this.f367t) == null) {
                    return Long.toBinaryString(this.f366s);
                }
                return ((o1) this.f367t).toString() + "xx" + Long.toBinaryString(this.f366s);
            default:
                return super.toString();
        }
    }

    public o1(Y6.a aVar) {
        this.f365r = 3;
        U6.y.f(aVar);
        this.f367t = aVar;
    }

    public o1(Da.j jVar) {
        this.f365r = 4;
        p251z9.j.e(jVar, "source");
        this.f367t = jVar;
        this.f366s = 262144L;
    }

    public o1() {
        this.f365r = 1;
        this.f366s = 0L;
    }
}
