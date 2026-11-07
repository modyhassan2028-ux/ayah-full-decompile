package Q8;

import android.content.Context;

/* JADX INFO: renamed from: Q8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466m implements S8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7039b;

    public /* synthetic */ C0466m(M m10, int i10) {
        this.f7038a = i10;
        this.f7039b = m10;
    }

    @Override // p101j9.a
    public final Object get() {
        int i10 = this.f7038a;
        M m10 = this.f7039b;
        switch (i10) {
            case 0:
                return new C0465l((I8.b) m10.f6904b);
            case 1:
                p050e8.f fVar = (p050e8.f) m10.f6904b;
                p251z9.j.e(fVar, "firebaseApp");
                S s10 = S.f6912a;
                return S.a(fVar);
            default:
                return new T8.a((Context) m10.f6904b);
        }
    }
}
