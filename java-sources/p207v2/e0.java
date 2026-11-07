package p207v2;

import K9.InterfaceC0402u;
import M9.e;
import M9.v;
import p150o9.c;
import p150o9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements InterfaceC0402u, v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f23228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f23229s;

    public e0(InterfaceC0402u interfaceC0402u, e eVar) {
        j.e(interfaceC0402u, "scope");
        this.f23228r = eVar;
        this.f23229s = interfaceC0402u;
    }

    @Override // M9.v
    public final Object d(Object obj, c cVar) {
        return this.f23228r.d(obj, cVar);
    }

    @Override // K9.InterfaceC0402u
    public final h getCoroutineContext() {
        return this.f23229s.getCoroutineContext();
    }

    @Override // M9.v
    public final Object k(Object obj) {
        throw null;
    }
}
