package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.Z1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0730d implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12438r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12439s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12441u;

    public C0730d(Z1 z10) {
        this.f12441u = z10;
        this.f12440t = z10.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12438r) {
            case 0:
                return this.f12439s < this.f12440t;
            default:
                return this.f12439s < this.f12440t;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12438r) {
            case 0:
                int i10 = this.f12439s;
                if (i10 >= this.f12440t) {
                    throw new NoSuchElementException();
                }
                this.f12439s = i10 + 1;
                return Byte.valueOf(((C0733g) this.f12441u).g(i10));
            default:
                int i11 = this.f12439s;
                if (i11 >= this.f12440t) {
                    throw new NoSuchElementException();
                }
                this.f12439s = i11 + 1;
                return Byte.valueOf(((Z1) this.f12441u).c(i11));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12438r) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0730d(C0733g c0733g) {
        this.f12441u = c0733g;
        this.f12440t = c0733g.size();
    }
}
