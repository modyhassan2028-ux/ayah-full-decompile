package E2;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0120f f1623u;

    public T(AbstractC0114c abstractC0114c) {
        S s10 = new S(this);
        p248z6.c cVar = new p248z6.c(3, this);
        synchronized (AbstractC0114c.f1648a) {
            try {
                if (AbstractC0114c.f1649b == null) {
                    AbstractC0114c.f1649b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0120f c0120f = new C0120f(cVar, new M.k(6, AbstractC0114c.f1649b, abstractC0114c));
        this.f1623u = c0120f;
        c0120f.f1664d.add(s10);
    }

    public final void j(List list) {
        C0120f c0120f = this.f1623u;
        p248z6.c cVar = c0120f.f1661a;
        int i10 = c0120f.g + 1;
        c0120f.g = i10;
        List list2 = c0120f.f1665e;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            c0120f.f1665e = null;
            c0120f.f1666f = Collections.EMPTY_LIST;
            cVar.g(0, size);
            c0120f.a();
            return;
        }
        if (list2 != null) {
            ((Executor) c0120f.f1662b.f5618s).execute(new RunnableC0118e(c0120f, list2, list, i10));
            return;
        }
        c0120f.f1665e = list;
        c0120f.f1666f = DesugarCollections.unmodifiableList(list);
        cVar.s(0, list.size());
        c0120f.a();
    }
}
