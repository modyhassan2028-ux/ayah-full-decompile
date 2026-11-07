package com.google.android.gms.common.api;

import E2.O;
import U6.y;
import V6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p017b7.g;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new O(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f13983s;

    public Scope(int i10, String str) {
        y.d(str, "scopeUri must not be null or empty");
        this.f13982r = i10;
        this.f13983s = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f13983s.equals(((Scope) obj).f13983s);
    }

    public final int hashCode() {
        return this.f13983s.hashCode();
    }

    public final String toString() {
        return this.f13983s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = g.D0(parcel, 20293);
        g.G0(parcel, 1, 4);
        parcel.writeInt(this.f13982r);
        g.z0(parcel, 2, this.f13983s);
        g.F0(parcel, iD0);
    }
}
