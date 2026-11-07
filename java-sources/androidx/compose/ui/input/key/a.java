package androidx.compose.ui.input.key;

import l0.r;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(c cVar) {
        return new KeyInputElement(cVar, null);
    }

    public static final r b(r rVar, c cVar) {
        return rVar.b(new KeyInputElement(null, cVar));
    }
}
