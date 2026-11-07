package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18100k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(lVarArr, i10, i11, concurrentHashMap);
        this.f18100k = i12;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18100k) {
            case 0:
                l lVar = this.f18114b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar.f18106b;
                this.j = lVar;
                a();
                return obj;
            default:
                l lVar2 = this.f18114b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = lVar2.f18107c;
                this.j = lVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f18100k) {
            case 0:
                break;
        }
        return next();
    }
}
