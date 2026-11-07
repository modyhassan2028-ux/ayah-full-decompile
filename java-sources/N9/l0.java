package N9;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends O9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6217a = new AtomicReference(null);

    @Override // O9.d
    public final boolean a(O9.b bVar) {
        AtomicReference atomicReference = this.f6217a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC0419l.f6215c);
        return true;
    }

    @Override // O9.d
    public final p150o9.c[] b(O9.b bVar) {
        this.f6217a.set(null);
        return O9.c.f6517a;
    }
}
