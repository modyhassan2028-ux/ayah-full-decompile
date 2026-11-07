package androidx.compose.foundation.layout;

import D.I;
import D.P;
import l0.r;
import p063g1.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final P a(float f3, float f7, float f10, float f11) {
        return new P(f3, f7, f10, f11);
    }

    public static P b(float f3, float f7, int i10) {
        float f10 = 0;
        if ((i10 & 2) != 0) {
            f3 = 0;
        }
        float f11 = 0;
        if ((i10 & 8) != 0) {
            f7 = 0;
        }
        return new P(f10, f3, f11, f7);
    }

    public static final float c(P p10, m mVar) {
        return mVar == m.f16261r ? p10.b(mVar) : p10.a(mVar);
    }

    public static final float d(P p10, m mVar) {
        return mVar == m.f16261r ? p10.a(mVar) : p10.b(mVar);
    }

    public static final r e(r rVar) {
        return rVar.b(new IntrinsicHeightElement());
    }

    public static final r f(float f3, float f7) {
        return new OffsetElement(f3, f7);
    }

    public static final r g(r rVar, P p10) {
        return rVar.b(new PaddingValuesElement(p10));
    }

    public static final r h(r rVar, float f3) {
        return rVar.b(new PaddingElement(f3, f3, f3, f3));
    }

    public static final r i(r rVar, float f3, float f7) {
        return rVar.b(new PaddingElement(f3, f7, f3, f7));
    }

    public static r j(r rVar, float f3, float f7, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f7 = 0;
        }
        return i(rVar, f3, f7);
    }

    public static final r k(r rVar, float f3, float f7, float f10, float f11) {
        return rVar.b(new PaddingElement(f3, f7, f10, f11));
    }

    public static r l(r rVar, float f3, float f7, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f7 = 0;
        }
        if ((i10 & 4) != 0) {
            f10 = 0;
        }
        if ((i10 & 8) != 0) {
            f11 = 0;
        }
        return k(rVar, f3, f7, f10, f11);
    }

    public static final r m(r rVar, I i10) {
        return rVar.b(new IntrinsicWidthElement(i10));
    }
}
