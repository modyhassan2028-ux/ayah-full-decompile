package p159p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new h(20);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f21015A;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Locale f21019E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f21020F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f21021G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f21022H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f21023I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Integer f21024J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Integer f21026L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Integer f21027M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f21028N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Integer f21029O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Integer f21030P;
    public Integer Q;
    public Integer R;
    public Integer S;
    public Integer T;
    public Boolean U;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f21032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f21033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f21034u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f21035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f21036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f21037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f21038y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21039z = 255;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f21016B = -2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f21017C = -2;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f21018D = -2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Boolean f21025K = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21031r);
        parcel.writeSerializable(this.f21032s);
        parcel.writeSerializable(this.f21033t);
        parcel.writeSerializable(this.f21034u);
        parcel.writeSerializable(this.f21035v);
        parcel.writeSerializable(this.f21036w);
        parcel.writeSerializable(this.f21037x);
        parcel.writeSerializable(this.f21038y);
        parcel.writeInt(this.f21039z);
        parcel.writeString(this.f21015A);
        parcel.writeInt(this.f21016B);
        parcel.writeInt(this.f21017C);
        parcel.writeInt(this.f21018D);
        CharSequence charSequence = this.f21020F;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f21021G;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f21022H);
        parcel.writeSerializable(this.f21024J);
        parcel.writeSerializable(this.f21026L);
        parcel.writeSerializable(this.f21027M);
        parcel.writeSerializable(this.f21028N);
        parcel.writeSerializable(this.f21029O);
        parcel.writeSerializable(this.f21030P);
        parcel.writeSerializable(this.Q);
        parcel.writeSerializable(this.T);
        parcel.writeSerializable(this.R);
        parcel.writeSerializable(this.S);
        parcel.writeSerializable(this.f21025K);
        parcel.writeSerializable(this.f21019E);
        parcel.writeSerializable(this.U);
    }
}
