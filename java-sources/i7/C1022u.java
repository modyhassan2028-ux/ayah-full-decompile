package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1022u extends V6.a {
    public static final Parcelable.Creator<C1022u> CREATOR = new p053f.h(11);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f17558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1019t f17559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f17560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f17561u;

    public C1022u(C1022u c1022u, long j) {
        U6.y.f(c1022u);
        this.f17558r = c1022u.f17558r;
        this.f17559s = c1022u.f17559s;
        this.f17560t = c1022u.f17560t;
        this.f17561u = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17559s);
        String str = this.f17560t;
        int length = String.valueOf(str).length();
        String str2 = this.f17558r;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        p245z2.a.I(sb, "origin=", str, ",name=", str2);
        return android.support.v4.media.session.p.B(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        p053f.h.a(this, parcel, i10);
    }

    public C1022u(String str, C1019t c1019t, String str2, long j) {
        this.f17558r = str;
        this.f17559s = c1019t;
        this.f17560t = str2;
        this.f17561u = j;
    }
}
