package p123m2;

import androidx.lifecycle.P;
import androidx.lifecycle.S;
import p105k2.d;
import p251z9.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19522a = new a();

    @Override // androidx.lifecycle.S
    public final P a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.S
    public final P b(Class cls, d dVar) {
        a(cls);
        throw null;
    }

    @Override // androidx.lifecycle.S
    public final P c(e eVar, d dVar) {
        return p000a.a.y(p171r0.a.d(eVar));
    }
}
