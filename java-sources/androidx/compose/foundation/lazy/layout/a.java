package androidx.compose.foundation.lazy.layout;

import A.C0009b;
import A.EnumC0047u0;
import F.C0154c;
import F.C0155d;
import F9.d;
import l0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(C0155d c0155d, C0009b c0009b, EnumC0047u0 enumC0047u0) {
        return new LazyLayoutBeyondBoundsModifierElement(c0155d, c0009b, enumC0047u0);
    }

    public static final r b(r rVar, d dVar, C0154c c0154c, EnumC0047u0 enumC0047u0, boolean z10) {
        return rVar.b(new LazyLayoutSemanticsModifier(dVar, c0154c, enumC0047u0, z10));
    }
}
