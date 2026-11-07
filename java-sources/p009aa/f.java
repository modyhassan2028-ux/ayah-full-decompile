package p009aa;

import E2.C0124h;
import H9.v;
import U6.C0532j;
import Z9.b;
import com.google.android.gms.internal.measurement.B1;
import p017b7.g;
import p110k9.p;
import p110k9.r;
import p110k9.t;
import p110k9.w;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0124h f11239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0532j f11240e;

    public f(C0124h c0124h, b bVar) {
        j.e(bVar, "json");
        this.f11239d = c0124h;
        this.f11240e = bVar.f11044b;
    }

    @Override // p017b7.g, X9.b
    public final long a() {
        C0124h c0124h = this.f11239d;
        String strL = c0124h.l();
        try {
            j.e(strL, "<this>");
            t tVarM = B1.M(strL);
            if (tVarM != null) {
                return tVarM.f19090r;
            }
            v.M0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0124h.p(c0124h, a.A('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // X9.a
    public final int h(W9.f fVar) {
        j.e(fVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // p017b7.g, X9.b
    public final int o() {
        C0124h c0124h = this.f11239d;
        String strL = c0124h.l();
        try {
            j.e(strL, "<this>");
            r rVarL = B1.L(strL);
            if (rVarL != null) {
                return rVarL.f19088r;
            }
            v.M0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0124h.p(c0124h, a.A('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // X9.a
    public final C0532j q() {
        return this.f11240e;
    }

    @Override // p017b7.g, X9.b
    public final byte r() {
        p pVar;
        C0124h c0124h = this.f11239d;
        String strL = c0124h.l();
        try {
            j.e(strL, "<this>");
            r rVarL = B1.L(strL);
            if (rVarL != null) {
                int i10 = rVarL.f19088r;
                pVar = Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) > 0 ? null : new p((byte) i10);
            }
            if (pVar != null) {
                return pVar.f19086r;
            }
            v.M0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0124h.p(c0124h, a.A('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // p017b7.g, X9.b
    public final short v() {
        w wVar;
        C0124h c0124h = this.f11239d;
        String strL = c0124h.l();
        try {
            j.e(strL, "<this>");
            r rVarL = B1.L(strL);
            if (rVarL != null) {
                int i10 = rVarL.f19088r;
                wVar = Integer.compare(Integer.MIN_VALUE ^ i10, -2147418113) > 0 ? null : new w((short) i10);
            }
            if (wVar != null) {
                return wVar.f19093r;
            }
            v.M0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0124h.p(c0124h, a.A('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
