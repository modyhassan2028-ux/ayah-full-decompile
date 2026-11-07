package p179r9;

import android.support.v4.media.session.p;
import java.io.Serializable;
import p120l9.d;
import p120l9.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Enum[] f21636r;

    public b(Enum[] enumArr) {
        this.f21636r = enumArr;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f21636r.length;
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        return ((Enum) l.k0(r10.ordinal(), this.f21636r)) == r10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f21636r;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(p.w(i10, length, "index: ", ", size: "));
        }
        return enumArr[i10];
    }

    @Override // p120l9.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        if (((Enum) l.k0(iOrdinal, this.f21636r)) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p120l9.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        if (((Enum) l.k0(iOrdinal, this.f21636r)) == r10) {
            return iOrdinal;
        }
        return -1;
    }
}
