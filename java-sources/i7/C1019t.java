package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: renamed from: i7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1019t extends V6.a implements Iterable {
    public static final Parcelable.Creator<C1019t> CREATOR = new p053f.h(10);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f17548r;

    public C1019t(Bundle bundle) {
        this.f17548r = bundle;
    }

    public final Object b(String str) {
        return this.f17548r.get(str);
    }

    public final Double c() {
        return Double.valueOf(this.f17548r.getDouble("value"));
    }

    public final String d() {
        return this.f17548r.getString("currency");
    }

    public final Bundle e() {
        return new Bundle(this.f17548r);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1016s(this);
    }

    public final String toString() {
        return this.f17548r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.w0(parcel, 2, e());
        p017b7.g.F0(parcel, iD0);
    }
}
