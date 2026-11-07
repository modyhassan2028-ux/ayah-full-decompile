package androidx.compose.ui.focus;

import l0.r;
import p162q0.p;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(p pVar) {
        return new FocusRequesterElement(pVar);
    }

    public static final r b(r rVar, c cVar) {
        return rVar.b(new FocusChangedElement(cVar));
    }
}
