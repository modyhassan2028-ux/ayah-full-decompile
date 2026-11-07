package androidx.compose.ui.draw;

import l0.j;
import l0.r;
import p180s0.C1303l;
import p215w0.b;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(r rVar, c cVar) {
        return rVar.b(new DrawBehindElement(cVar));
    }

    public static final r b(r rVar, c cVar) {
        return rVar.b(new DrawWithCacheElement(cVar));
    }

    public static final r c(r rVar, c cVar) {
        return rVar.b(new DrawWithContentElement(cVar));
    }

    public static r d(r rVar, b bVar, float f3, C1303l c1303l, int i10) {
        j jVar = l0.c.f19317v;
        if ((i10 & 16) != 0) {
            f3 = 1.0f;
        }
        return rVar.b(new PainterElement(bVar, jVar, f3, c1303l));
    }
}
