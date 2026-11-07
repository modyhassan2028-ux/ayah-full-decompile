package R6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends V6.a {
    public static final Parcelable.Creator<d> CREATOR = new O(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f7240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7242t;

    public d() {
        this.f7240r = "CLIENT_TELEMETRY";
        this.f7242t = 1L;
        this.f7241s = -1;
    }

    public final long b() {
        long j = this.f7242t;
        return j == -1 ? this.f7241s : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f7240r;
            String str2 = this.f7240r;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == dVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7240r, Long.valueOf(b())});
    }

    public final String toString() {
        L5.c cVar = new L5.c(this);
        cVar.k(this.f7240r, "name");
        cVar.k(Long.valueOf(b()), "version");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.z0(parcel, 1, this.f7240r);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f7241s);
        long jB = b();
        p017b7.g.G0(parcel, 3, 8);
        parcel.writeLong(jB);
        p017b7.g.F0(parcel, iD0);
    }

    public d(long j, int i10, String str) {
        this.f7240r = str;
        this.f7241s = i10;
        this.f7242t = j;
    }
}
