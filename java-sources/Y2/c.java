package Y2;

import android.os.Parcel;
import android.support.v4.media.session.p;
import android.util.SparseIntArray;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f10383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f10384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10385f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10387i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10388k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1350e(0), new C1350e(0), new C1350e(0));
    }

    @Override // Y2.b
    public final c a() {
        Parcel parcel = this.f10384e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.j;
        if (i10 == this.f10385f) {
            i10 = this.g;
        }
        return new c(parcel, iDataPosition, i10, p.B(new StringBuilder(), this.f10386h, "  "), this.f10380a, this.f10381b, this.f10382c);
    }

    @Override // Y2.b
    public final boolean e(int i10) {
        while (this.j < this.g) {
            int i11 = this.f10388k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.f10384e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f10388k = parcel.readInt();
            this.j += i13;
        }
        return this.f10388k == i10;
    }

    @Override // Y2.b
    public final void i(int i10) {
        int i11 = this.f10387i;
        SparseIntArray sparseIntArray = this.f10383d;
        Parcel parcel = this.f10384e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f10387i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, C1350e c1350e, C1350e c1350e2, C1350e c1350e3) {
        super(c1350e, c1350e2, c1350e3);
        this.f10383d = new SparseIntArray();
        this.f10387i = -1;
        this.f10388k = -1;
        this.f10384e = parcel;
        this.f10385f = i10;
        this.g = i11;
        this.j = i10;
        this.f10386h = str;
    }
}
