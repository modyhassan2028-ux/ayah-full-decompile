package p033d0;

import A9.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p120l9.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d implements List, Collection, a {
    public abstract c c(int i10, Object obj);

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c d(Object obj);

    public c e(Collection collection) {
        f fVarF = f();
        fVarF.addAll(collection);
        return fVarF.d();
    }

    public abstract f f();

    public abstract c g(b bVar);

    public abstract c h(int i10);

    @Override // p120l9.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i10, Object obj);

    @Override // p120l9.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p120l9.d, java.util.List
    public final List subList(int i10, int i11) {
        return new p021c0.a(this, i10, i11);
    }
}
