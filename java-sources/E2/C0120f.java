package E2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: E2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E1.c f1660h = new E1.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p248z6.c f1661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M.k f1662b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f1665e;
    public int g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f1664d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f1666f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E1.c f1663c = f1660h;

    public C0120f(p248z6.c cVar, M.k kVar) {
        this.f1661a = cVar;
        this.f1662b = kVar;
    }

    public final void a() {
        Iterator it = this.f1664d.iterator();
        while (it.hasNext()) {
            T t2 = ((S) it.next()).f1622a;
        }
    }
}
