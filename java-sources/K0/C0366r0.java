package K0;

import java.util.Map;

/* JADX INFO: renamed from: K0.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366r0 implements p085i0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0370t0 f5154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p085i0.k f5155b;

    public C0366r0(p085i0.k kVar, C0370t0 c0370t0) {
        this.f5154a = c0370t0;
        this.f5155b = kVar;
    }

    @Override // p085i0.j
    public final boolean b(Object obj) {
        return this.f5155b.b(obj);
    }

    @Override // p085i0.j
    public final Map c() {
        return this.f5155b.c();
    }

    @Override // p085i0.j
    public final Object d(String str) {
        return this.f5155b.d(str);
    }

    @Override // p085i0.j
    public final p085i0.i e(String str, p241y9.a aVar) {
        return this.f5155b.e(str, aVar);
    }
}
