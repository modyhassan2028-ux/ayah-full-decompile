package J0;

import A.M0;
import H0.AbstractC0204c;
import H0.C0214m;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0.U f3934a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3939f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0273a f3940h;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3935b = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f3941i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public J(InterfaceC0273a interfaceC0273a, int i10) {
        this.j = i10;
        this.f3934a = (H0.U) interfaceC0273a;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [y9.e, z9.h] */
    /* JADX WARN: Type inference failed for: r3v6, types: [H0.U, J0.a] */
    public static final void a(J j, C0214m c0214m, int i10, j0 j0Var) {
        HashMap map = j.f3941i;
        float f3 = i10;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f3)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        while (true) {
            long jG = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (j.j) {
                    case 0:
                        q0 q0Var = j0Var.f4140W;
                        if (q0Var != null) {
                            jG = q0Var.a(jG, false);
                        }
                        jG = va.g.G(jG, j0Var.f4136N);
                        break;
                    default:
                        Q qC0 = j0Var.C0();
                        p251z9.j.b(qC0);
                        long j10 = qC0.f3973D;
                        jG = p171r0.c.h((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32), jG);
                        break;
                }
                j0Var = j0Var.f4127E;
                p251z9.j.b(j0Var);
                if (j0Var.equals(j.f3934a.o())) {
                    int iRound = Math.round(c0214m instanceof C0214m ? Float.intBitsToFloat((int) (jG & 4294967295L)) : Float.intBitsToFloat((int) (jG >> 32)));
                    if (map.containsKey(c0214m)) {
                        int iIntValue = ((Number) p120l9.w.f0(c0214m, map)).intValue();
                        C0214m c0214m2 = AbstractC0204c.f3185a;
                        iRound = ((Number) c0214m.f3209a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(c0214m, Integer.valueOf(iRound));
                    return;
                }
            } while (!j.b(j0Var).containsKey(c0214m));
            float fC = j.c(j0Var, c0214m);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(j0 j0Var) {
        switch (this.j) {
            case 0:
                return j0Var.n0().c();
            default:
                Q qC0 = j0Var.C0();
                p251z9.j.b(qC0);
                return qC0.n0().c();
        }
    }

    public final int c(j0 j0Var, C0214m c0214m) {
        switch (this.j) {
            case 0:
                return j0Var.R(c0214m);
            default:
                Q qC0 = j0Var.C0();
                p251z9.j.b(qC0);
                return qC0.R(c0214m);
        }
    }

    public final boolean d() {
        return this.f3936c || this.f3938e || this.f3939f || this.g;
    }

    public final boolean e() {
        h();
        return this.f3940h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H0.U, J0.a] */
    public final void f() {
        this.f3935b = true;
        ?? r10 = this.f3934a;
        InterfaceC0273a interfaceC0273aQ = r10.q();
        if (interfaceC0273aQ == null) {
            return;
        }
        if (this.f3936c) {
            interfaceC0273aQ.L();
        } else if (this.f3938e || this.f3937d) {
            interfaceC0273aQ.requestLayout();
        }
        if (this.f3939f) {
            r10.L();
        }
        if (this.g) {
            r10.requestLayout();
        }
        interfaceC0273aQ.c().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [H0.U, J0.a] */
    public final void g() {
        HashMap map = this.f3941i;
        map.clear();
        M0 m10 = new M0(10, this);
        ?? r10 = this.f3934a;
        r10.e(m10);
        map.putAll(b(r10.o()));
        this.f3935b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [H0.U, J0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [J0.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        InterfaceC0273a interfaceC0273a;
        J jC;
        J jC2;
        boolean zD = d();
        ?? r10 = this.f3934a;
        ?? r11 = r10;
        if (!zD) {
            InterfaceC0273a interfaceC0273aQ = r10.q();
            if (interfaceC0273aQ == null) {
                return;
            }
            interfaceC0273a = interfaceC0273aQ.c().f3940h;
            if (interfaceC0273a == null || !interfaceC0273a.c().d()) {
                r11 = interfaceC0273a;
                InterfaceC0273a interfaceC0273a2 = this.f3940h;
                if (interfaceC0273a2 == null || interfaceC0273a2.c().d()) {
                    return;
                }
                InterfaceC0273a interfaceC0273aQ2 = interfaceC0273a2.q();
                if (interfaceC0273aQ2 != null && (jC2 = interfaceC0273aQ2.c()) != null) {
                    jC2.h();
                }
                InterfaceC0273a interfaceC0273aQ3 = interfaceC0273a2.q();
                r11 = (interfaceC0273aQ3 == null || (jC = interfaceC0273aQ3.c()) == null) ? 0 : jC.f3940h;
            }
        }
        r11 = interfaceC0273a;
        this.f3940h = r11;
    }
}
