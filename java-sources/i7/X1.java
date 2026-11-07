package i7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X1 extends V6.a {
    public static final Parcelable.Creator<X1> CREATOR = new p053f.h(17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f17187A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f17188B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f17189C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f17190D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f17191E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f17192F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Boolean f17193G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f17194H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final List f17195I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f17196J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final String f17197K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f17198L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f17199M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final long f17200N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f17201O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final String f17202P;
    public final int Q;
    public final long R;
    public final String S;
    public final String T;
    public final long U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f17203V;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f17204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f17205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f17206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f17207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f17208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f17209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f17210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f17211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f17212z;

    public X1(String str, String str2, String str3, long j, String str4, long j10, long j11, String str5, boolean z10, boolean z11, String str6, long j12, int i10, boolean z12, boolean z13, Boolean bool, long j13, List list, String str7, String str8, String str9, boolean z14, long j14, int i11, String str10, int i12, long j15, String str11, String str12, long j16, int i13) {
        U6.y.c(str);
        this.f17204r = str;
        this.f17205s = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f17206t = str3;
        this.f17187A = j;
        this.f17207u = str4;
        this.f17208v = j10;
        this.f17209w = j11;
        this.f17210x = str5;
        this.f17211y = z10;
        this.f17212z = z11;
        this.f17188B = str6;
        this.f17189C = j12;
        this.f17190D = i10;
        this.f17191E = z12;
        this.f17192F = z13;
        this.f17193G = bool;
        this.f17194H = j13;
        this.f17195I = list;
        this.f17196J = str7;
        this.f17197K = str8;
        this.f17198L = str9;
        this.f17199M = z14;
        this.f17200N = j14;
        this.f17201O = i11;
        this.f17202P = str10;
        this.Q = i12;
        this.R = j15;
        this.S = str11;
        this.T = str12;
        this.U = j16;
        this.f17203V = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.z0(parcel, 2, this.f17204r);
        p017b7.g.z0(parcel, 3, this.f17205s);
        p017b7.g.z0(parcel, 4, this.f17206t);
        p017b7.g.z0(parcel, 5, this.f17207u);
        p017b7.g.G0(parcel, 6, 8);
        parcel.writeLong(this.f17208v);
        p017b7.g.G0(parcel, 7, 8);
        parcel.writeLong(this.f17209w);
        p017b7.g.z0(parcel, 8, this.f17210x);
        p017b7.g.G0(parcel, 9, 4);
        parcel.writeInt(this.f17211y ? 1 : 0);
        p017b7.g.G0(parcel, 10, 4);
        parcel.writeInt(this.f17212z ? 1 : 0);
        p017b7.g.G0(parcel, 11, 8);
        parcel.writeLong(this.f17187A);
        p017b7.g.z0(parcel, 12, this.f17188B);
        p017b7.g.G0(parcel, 14, 8);
        parcel.writeLong(this.f17189C);
        p017b7.g.G0(parcel, 15, 4);
        parcel.writeInt(this.f17190D);
        p017b7.g.G0(parcel, 16, 4);
        parcel.writeInt(this.f17191E ? 1 : 0);
        p017b7.g.G0(parcel, 18, 4);
        parcel.writeInt(this.f17192F ? 1 : 0);
        Boolean bool = this.f17193G;
        if (bool != null) {
            p017b7.g.G0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        p017b7.g.G0(parcel, 22, 8);
        parcel.writeLong(this.f17194H);
        List<String> list = this.f17195I;
        if (list != null) {
            int iD1 = p017b7.g.D0(parcel, 23);
            parcel.writeStringList(list);
            p017b7.g.F0(parcel, iD1);
        }
        p017b7.g.z0(parcel, 25, this.f17196J);
        p017b7.g.z0(parcel, 26, this.f17197K);
        p017b7.g.z0(parcel, 27, this.f17198L);
        p017b7.g.G0(parcel, 28, 4);
        parcel.writeInt(this.f17199M ? 1 : 0);
        p017b7.g.G0(parcel, 29, 8);
        parcel.writeLong(this.f17200N);
        p017b7.g.G0(parcel, 30, 4);
        parcel.writeInt(this.f17201O);
        p017b7.g.z0(parcel, 31, this.f17202P);
        p017b7.g.G0(parcel, 32, 4);
        parcel.writeInt(this.Q);
        p017b7.g.G0(parcel, 34, 8);
        parcel.writeLong(this.R);
        p017b7.g.z0(parcel, 35, this.S);
        p017b7.g.z0(parcel, 36, this.T);
        p017b7.g.G0(parcel, 37, 8);
        parcel.writeLong(this.U);
        p017b7.g.G0(parcel, 38, 4);
        parcel.writeInt(this.f17203V);
        p017b7.g.F0(parcel, iD0);
    }

    public X1(String str, String str2, String str3, String str4, long j, long j10, String str5, boolean z10, boolean z11, long j11, String str6, long j12, int i10, boolean z12, boolean z13, Boolean bool, long j13, ArrayList arrayList, String str7, String str8, String str9, boolean z14, long j14, int i11, String str10, int i12, long j15, String str11, String str12, long j16, int i13) {
        this.f17204r = str;
        this.f17205s = str2;
        this.f17206t = str3;
        this.f17187A = j11;
        this.f17207u = str4;
        this.f17208v = j;
        this.f17209w = j10;
        this.f17210x = str5;
        this.f17211y = z10;
        this.f17212z = z11;
        this.f17188B = str6;
        this.f17189C = j12;
        this.f17190D = i10;
        this.f17191E = z12;
        this.f17192F = z13;
        this.f17193G = bool;
        this.f17194H = j13;
        this.f17195I = arrayList;
        this.f17196J = str7;
        this.f17197K = str8;
        this.f17198L = str9;
        this.f17199M = z14;
        this.f17200N = j14;
        this.f17201O = i11;
        this.f17202P = str10;
        this.Q = i12;
        this.R = j15;
        this.S = str11;
        this.T = str12;
        this.U = j16;
        this.f17203V = i13;
    }
}
