package p056f2;

import android.os.Parcel;
import android.os.Parcelable;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new h(5);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f16000A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f16001B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16002C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f16003D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f16004E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f16005F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f16006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f16007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f16009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f16011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f16012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f16013y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f16014z;

    public P(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        this.f16006r = abstractComponentCallbacksC0947u.getClass().getName();
        this.f16007s = abstractComponentCallbacksC0947u.f16165v;
        this.f16008t = abstractComponentCallbacksC0947u.f16131E;
        this.f16009u = abstractComponentCallbacksC0947u.f16133G;
        this.f16010v = abstractComponentCallbacksC0947u.f16141O;
        this.f16011w = abstractComponentCallbacksC0947u.f16142P;
        this.f16012x = abstractComponentCallbacksC0947u.Q;
        this.f16013y = abstractComponentCallbacksC0947u.T;
        this.f16014z = abstractComponentCallbacksC0947u.f16129C;
        this.f16000A = abstractComponentCallbacksC0947u.S;
        this.f16001B = abstractComponentCallbacksC0947u.R;
        this.f16002C = abstractComponentCallbacksC0947u.f16153f0.ordinal();
        this.f16003D = abstractComponentCallbacksC0947u.f16168y;
        this.f16004E = abstractComponentCallbacksC0947u.f16169z;
        this.f16005F = abstractComponentCallbacksC0947u.f16147Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f16006r);
        sb.append(" (");
        sb.append(this.f16007s);
        sb.append(")}:");
        if (this.f16008t) {
            sb.append(" fromLayout");
        }
        if (this.f16009u) {
            sb.append(" dynamicContainer");
        }
        int i10 = this.f16011w;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f16012x;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f16013y) {
            sb.append(" retainInstance");
        }
        if (this.f16014z) {
            sb.append(" removing");
        }
        if (this.f16000A) {
            sb.append(" detached");
        }
        if (this.f16001B) {
            sb.append(" hidden");
        }
        String str2 = this.f16003D;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f16004E);
        }
        if (this.f16005F) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16006r);
        parcel.writeString(this.f16007s);
        parcel.writeInt(this.f16008t ? 1 : 0);
        parcel.writeInt(this.f16009u ? 1 : 0);
        parcel.writeInt(this.f16010v);
        parcel.writeInt(this.f16011w);
        parcel.writeString(this.f16012x);
        parcel.writeInt(this.f16013y ? 1 : 0);
        parcel.writeInt(this.f16014z ? 1 : 0);
        parcel.writeInt(this.f16000A ? 1 : 0);
        parcel.writeInt(this.f16001B ? 1 : 0);
        parcel.writeInt(this.f16002C);
        parcel.writeString(this.f16003D);
        parcel.writeInt(this.f16004E);
        parcel.writeInt(this.f16005F ? 1 : 0);
    }

    public P(Parcel parcel) {
        this.f16006r = parcel.readString();
        this.f16007s = parcel.readString();
        this.f16008t = parcel.readInt() != 0;
        this.f16009u = parcel.readInt() != 0;
        this.f16010v = parcel.readInt();
        this.f16011w = parcel.readInt();
        this.f16012x = parcel.readString();
        this.f16013y = parcel.readInt() != 0;
        this.f16014z = parcel.readInt() != 0;
        this.f16000A = parcel.readInt() != 0;
        this.f16001B = parcel.readInt() != 0;
        this.f16002C = parcel.readInt();
        this.f16003D = parcel.readString();
        this.f16004E = parcel.readInt();
        this.f16005F = parcel.readInt() != 0;
    }
}
