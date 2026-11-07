package D0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements PointerInputEventHandler, p251z9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f1054r;

    public H(p241y9.e eVar) {
        this.f1054r = eVar;
    }

    @Override // p251z9.f
    public final p110k9.e c() {
        return this.f1054r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof p251z9.f)) {
            return false;
        }
        return p251z9.j.a(this.f1054r, ((p251z9.f) obj).c());
    }

    public final int hashCode() {
        return this.f1054r.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(z zVar, p150o9.c cVar) {
        return this.f1054r.invoke(zVar, cVar);
    }
}
