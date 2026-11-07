package androidx.compose.ui.layout;

import H0.C0220t;
import H0.H;
import l0.r;
import p241y9.c;
import p241y9.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(H h7) {
        Object objI = h7.i();
        C0220t c0220t = objI instanceof C0220t ? (C0220t) objI : null;
        if (c0220t != null) {
            return c0220t.f3221F;
        }
        return null;
    }

    public static final r b(r rVar, f fVar) {
        return rVar.b(new LayoutElement(fVar));
    }

    public static final r c(r rVar, Object obj) {
        return rVar.b(new LayoutIdElement(obj));
    }

    public static final r d(r rVar, c cVar) {
        return rVar.b(new OnGloballyPositionedElement(cVar));
    }

    public static final r e(r rVar, c cVar) {
        return rVar.b(new OnSizeChangedModifier(cVar));
    }
}
