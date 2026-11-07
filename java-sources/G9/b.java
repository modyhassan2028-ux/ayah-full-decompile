package G9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Iterator;
import p120l9.u;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2919r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Iterator f2920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2921t;

    public b(Iterator it) {
        p251z9.j.e(it, "iterator");
        this.f2920s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2919r) {
            case 0:
                break;
            default:
                return this.f2920s.hasNext();
        }
        while (true) {
            int i10 = this.f2921t;
            it = this.f2920s;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f2921t--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2919r) {
            case 0:
                break;
            default:
                int i10 = this.f2921t;
                this.f2921t = i10 + 1;
                if (i10 >= 0) {
                    return new u(i10, this.f2920s.next());
                }
                AbstractC0813f2.T();
                throw null;
        }
        while (true) {
            int i11 = this.f2921t;
            it = this.f2920s;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f2921t--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2919r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f2920s = cVar.f2922a.iterator();
        this.f2921t = cVar.f2923b;
    }
}
