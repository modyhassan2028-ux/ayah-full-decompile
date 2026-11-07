package androidx.compose.foundation.text.handwriting;

import J0.C0292o;
import L.c;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import l0.o;
import l0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0292o f11873a;

    static {
        float f3 = 40;
        float f7 = 10;
        f11873a = new C0292o(f7, f3, f7, f3);
    }

    public static final r a(boolean z10, boolean z11, p241y9.a aVar) {
        r stylusHoverIconModifierElement = o.f19333a;
        if (!z10 || !c.f5429a) {
            return stylusHoverIconModifierElement;
        }
        if (z11) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f11873a);
        }
        return stylusHoverIconModifierElement.b(new StylusHandwritingElement(aVar));
    }
}
