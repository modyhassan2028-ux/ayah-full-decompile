package p223x;

import Z.C0672b;
import Z.C0681f0;
import p241y9.a;
import p251z9.k;

/* JADX INFO: renamed from: x.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1420i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f24007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f24010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f24011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC1427p f24012f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24013h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0681f0 f24014i = C0672b.r(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public C1420i(Object obj, v0 v0Var, AbstractC1427p abstractC1427p, long j, Object obj2, long j10, a aVar) {
        this.f24007a = v0Var;
        this.f24008b = obj2;
        this.f24009c = j10;
        this.f24010d = (k) aVar;
        this.f24011e = C0672b.r(obj);
        this.f24012f = AbstractC1413d.j(abstractC1427p);
        this.g = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [y9.a, z9.k] */
    public final void a() {
        this.f24014i.setValue(Boolean.FALSE);
        this.f24010d.invoke();
    }
}
