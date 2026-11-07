package G9;

import I1.V;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f2951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2952t;

    public q(V v10) {
        this.f2950r = 1;
        this.f2952t = new ArrayList();
        this.f2951s = v10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2950r) {
            case 0:
                break;
        }
        return this.f2951s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2950r) {
            case 0:
                return ((p) this.f2952t).f2949c.e(this.f2951s.next());
            default:
                Object next = this.f2951s.next();
                ArrayList arrayList = (ArrayList) this.f2952t;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                V v10 = viewGroup != null ? new V(0, viewGroup) : null;
                if (v10 == null || !v10.hasNext()) {
                    while (!this.f2951s.hasNext() && !arrayList.isEmpty()) {
                        this.f2951s = (Iterator) p120l9.m.m0(arrayList);
                        p120l9.m.u0(arrayList);
                    }
                } else {
                    arrayList.add(this.f2951s);
                    this.f2951s = v10;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2950r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(p pVar) {
        this.f2950r = 0;
        this.f2952t = pVar;
        this.f2951s = pVar.f2948b.iterator();
    }
}
