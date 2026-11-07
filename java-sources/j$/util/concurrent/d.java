package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f18114b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f18106b;
        Object obj2 = lVar.f18107c;
        this.j = lVar;
        a();
        return new k(obj, obj2, this.f18096i);
    }
}
