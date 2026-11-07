package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1072m implements Iterator, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18193a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f18194b;

    public C1072m(C1073n c1073n) {
        this.f18194b = c1073n.f18199a.iterator();
    }

    public C1072m(C1206t c1206t) {
        this.f18194b = c1206t.f18199a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18193a) {
            case 0:
                break;
        }
        return this.f18194b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18193a) {
            case 0:
                return this.f18194b.next();
            default:
                return new r((java.util.Map.Entry) this.f18194b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18193a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.InterfaceC1212z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f18193a) {
            case 0:
                AbstractC1062c.r(this.f18194b, consumer);
                break;
            default:
                AbstractC1062c.r(this.f18194b, new C1076q(0, consumer));
                break;
        }
    }
}
