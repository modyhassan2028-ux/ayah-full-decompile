package G9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f2918a;

    public a(i iVar) {
        this.f2918a = new AtomicReference(iVar);
    }

    @Override // G9.i
    public final Iterator iterator() {
        i iVar = (i) this.f2918a.getAndSet(null);
        if (iVar != null) {
            return iVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
