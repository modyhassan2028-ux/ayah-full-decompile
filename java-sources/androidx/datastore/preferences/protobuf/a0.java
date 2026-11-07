package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.N2;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Iterator f12431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f12432v;

    public /* synthetic */ a0(M2 m10) {
        this.f12428r = 1;
        Objects.requireNonNull(m10);
        this.f12432v = m10;
        this.f12429s = -1;
    }

    public Iterator a() {
        if (this.f12431u == null) {
            this.f12431u = ((Y) this.f12432v).f12421s.entrySet().iterator();
        }
        return this.f12431u;
    }

    public Iterator b() {
        if (this.f12431u == null) {
            this.f12431u = ((M2) this.f12432v).f14073t.entrySet().iterator();
        }
        return this.f12431u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12428r) {
            case 0:
                int i10 = this.f12429s + 1;
                Y y10 = (Y) this.f12432v;
                if (i10 >= y10.f12420r.size()) {
                    return !y10.f12421s.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i11 = this.f12429s + 1;
                M2 m10 = (M2) this.f12432v;
                if (i11 >= m10.f14072s) {
                    return !m10.f14073t.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12428r) {
            case 0:
                this.f12430t = true;
                int i10 = this.f12429s + 1;
                this.f12429s = i10;
                Y y10 = (Y) this.f12432v;
                return i10 < y10.f12420r.size() ? (Map.Entry) y10.f12420r.get(this.f12429s) : (Map.Entry) a().next();
            default:
                this.f12430t = true;
                int i11 = this.f12429s + 1;
                this.f12429s = i11;
                M2 m10 = (M2) this.f12432v;
                return i11 < m10.f14072s ? (N2) m10.f14071r[i11] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f12428r;
        AbstractMap abstractMap = this.f12432v;
        switch (i10) {
            case 0:
                Y y10 = (Y) abstractMap;
                if (!this.f12430t) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f12430t = false;
                int i11 = Y.f12419w;
                y10.b();
                if (this.f12429s >= y10.f12420r.size()) {
                    a().remove();
                    return;
                }
                int i12 = this.f12429s;
                this.f12429s = i12 - 1;
                y10.h(i12);
                return;
            default:
                if (!this.f12430t) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f12430t = false;
                M2 m10 = (M2) abstractMap;
                m10.f();
                int i13 = this.f12429s;
                if (i13 >= m10.f14072s) {
                    b().remove();
                    return;
                } else {
                    this.f12429s = i13 - 1;
                    m10.d(i13);
                    return;
                }
        }
    }

    public a0(Y y10) {
        this.f12428r = 0;
        this.f12432v = y10;
        this.f12429s = -1;
    }
}
