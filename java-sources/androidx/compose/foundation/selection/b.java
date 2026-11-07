package androidx.compose.foundation.selection;

import B.j;
import R0.g;
import l0.m;
import l0.r;
import p232y.J;
import p232y.O;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static r a(r rVar, boolean z10, J j, p241y9.a aVar) {
        r selectableElement;
        if (j instanceof O) {
            selectableElement = new SelectableElement(z10, null, (O) j, aVar);
        } else {
            selectableElement = j == null ? new SelectableElement(z10, null, null, aVar) : new m(new a(j, z10, aVar));
        }
        return rVar.b(selectableElement);
    }

    public static final r b(r rVar, boolean z10, j jVar, boolean z11, g gVar, c cVar) {
        return rVar.b(new ToggleableElement(z10, jVar, z11, gVar, cVar));
    }
}
