package P9;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0402u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p150o9.h f6772r;

    public d(p150o9.h hVar) {
        this.f6772r = hVar;
    }

    @Override // K9.InterfaceC0402u
    public final p150o9.h getCoroutineContext() {
        return this.f6772r;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f6772r + ')';
    }
}
