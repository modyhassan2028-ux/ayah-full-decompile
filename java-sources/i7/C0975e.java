package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975e extends V6.a {
    public static final Parcelable.Creator<C0975e> CREATOR = new p053f.h(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f17323A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1022u f17324B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f17325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f17326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S1 f17327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f17330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1022u f17331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f17332y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1022u f17333z;

    public C0975e(C0975e c0975e) {
        U6.y.f(c0975e);
        this.f17325r = c0975e.f17325r;
        this.f17326s = c0975e.f17326s;
        this.f17327t = c0975e.f17327t;
        this.f17328u = c0975e.f17328u;
        this.f17329v = c0975e.f17329v;
        this.f17330w = c0975e.f17330w;
        this.f17331x = c0975e.f17331x;
        this.f17332y = c0975e.f17332y;
        this.f17333z = c0975e.f17333z;
        this.f17323A = c0975e.f17323A;
        this.f17324B = c0975e.f17324B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.z0(parcel, 2, this.f17325r);
        p017b7.g.z0(parcel, 3, this.f17326s);
        p017b7.g.y0(parcel, 4, this.f17327t, i10);
        long j = this.f17328u;
        p017b7.g.G0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z10 = this.f17329v;
        p017b7.g.G0(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p017b7.g.z0(parcel, 7, this.f17330w);
        p017b7.g.y0(parcel, 8, this.f17331x, i10);
        long j10 = this.f17332y;
        p017b7.g.G0(parcel, 9, 8);
        parcel.writeLong(j10);
        p017b7.g.y0(parcel, 10, this.f17333z, i10);
        p017b7.g.G0(parcel, 11, 8);
        parcel.writeLong(this.f17323A);
        p017b7.g.y0(parcel, 12, this.f17324B, i10);
        p017b7.g.F0(parcel, iD0);
    }

    public C0975e(String str, String str2, S1 s10, long j, boolean z10, String str3, C1022u c1022u, long j10, C1022u c1022u2, long j11, C1022u c1022u3) {
        this.f17325r = str;
        this.f17326s = str2;
        this.f17327t = s10;
        this.f17328u = j;
        this.f17329v = z10;
        this.f17330w = str3;
        this.f17331x = c1022u;
        this.f17332y = j10;
        this.f17333z = c1022u2;
        this.f17323A = j11;
        this.f17324B = c1022u3;
    }
}
