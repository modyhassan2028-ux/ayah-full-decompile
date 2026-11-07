package p056f2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p053f.h;

/* JADX INFO: renamed from: f2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929b implements Parcelable {
    public static final Parcelable.Creator<C0929b> CREATOR = new h(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16068A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CharSequence f16069B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f16070C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f16071D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f16072E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f16073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f16074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f16075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f16076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f16078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f16080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f16081z;

    public C0929b(C0928a c0928a) {
        int size = c0928a.f16050a.size();
        this.f16073r = new int[size * 6];
        if (!c0928a.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f16074s = new ArrayList(size);
        this.f16075t = new int[size];
        this.f16076u = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            T t2 = (T) c0928a.f16050a.get(i11);
            int i12 = i10 + 1;
            this.f16073r[i10] = t2.f16021a;
            ArrayList arrayList = this.f16074s;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = t2.f16022b;
            arrayList.add(abstractComponentCallbacksC0947u != null ? abstractComponentCallbacksC0947u.f16165v : null);
            int[] iArr = this.f16073r;
            iArr[i12] = t2.f16023c ? 1 : 0;
            iArr[i10 + 2] = t2.f16024d;
            iArr[i10 + 3] = t2.f16025e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = t2.f16026f;
            i10 += 6;
            iArr[i13] = t2.g;
            this.f16075t[i11] = t2.f16027h.ordinal();
            this.f16076u[i11] = t2.f16028i.ordinal();
        }
        this.f16077v = c0928a.f16055f;
        this.f16078w = c0928a.f16057i;
        this.f16079x = c0928a.f16067t;
        this.f16080y = c0928a.j;
        this.f16081z = c0928a.f16058k;
        this.f16068A = c0928a.f16059l;
        this.f16069B = c0928a.f16060m;
        this.f16070C = c0928a.f16061n;
        this.f16071D = c0928a.f16062o;
        this.f16072E = c0928a.f16063p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f16073r);
        parcel.writeStringList(this.f16074s);
        parcel.writeIntArray(this.f16075t);
        parcel.writeIntArray(this.f16076u);
        parcel.writeInt(this.f16077v);
        parcel.writeString(this.f16078w);
        parcel.writeInt(this.f16079x);
        parcel.writeInt(this.f16080y);
        TextUtils.writeToParcel(this.f16081z, parcel, 0);
        parcel.writeInt(this.f16068A);
        TextUtils.writeToParcel(this.f16069B, parcel, 0);
        parcel.writeStringList(this.f16070C);
        parcel.writeStringList(this.f16071D);
        parcel.writeInt(this.f16072E ? 1 : 0);
    }

    public C0929b(Parcel parcel) {
        this.f16073r = parcel.createIntArray();
        this.f16074s = parcel.createStringArrayList();
        this.f16075t = parcel.createIntArray();
        this.f16076u = parcel.createIntArray();
        this.f16077v = parcel.readInt();
        this.f16078w = parcel.readString();
        this.f16079x = parcel.readInt();
        this.f16080y = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16081z = (CharSequence) creator.createFromParcel(parcel);
        this.f16068A = parcel.readInt();
        this.f16069B = (CharSequence) creator.createFromParcel(parcel);
        this.f16070C = parcel.createStringArrayList();
        this.f16071D = parcel.createStringArrayList();
        this.f16072E = parcel.readInt() != 0;
    }
}
