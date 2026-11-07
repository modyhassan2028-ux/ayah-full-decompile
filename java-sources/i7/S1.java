package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends V6.a {
    public static final Parcelable.Creator<S1> CREATOR = new p053f.h(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f17132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f17133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Long f17134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f17135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f17136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Double f17137x;

    public S1(int i10, String str, long j, Long l10, Float f3, String str2, String str3, Double d5) {
        this.f17131r = i10;
        this.f17132s = str;
        this.f17133t = j;
        this.f17134u = l10;
        this.f17137x = i10 == 1 ? f3 != null ? Double.valueOf(f3.doubleValue()) : null : d5;
        this.f17135v = str2;
        this.f17136w = str3;
    }

    public final Object b() {
        Long l10 = this.f17134u;
        if (l10 != null) {
            return l10;
        }
        Double d5 = this.f17137x;
        if (d5 != null) {
            return d5;
        }
        String str = this.f17135v;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        p053f.h.b(this, parcel);
    }

    public S1(String str, String str2, long j, Object obj) {
        U6.y.c(str);
        this.f17131r = 2;
        this.f17132s = str;
        this.f17133t = j;
        this.f17136w = str2;
        if (obj == null) {
            this.f17134u = null;
            this.f17137x = null;
            this.f17135v = null;
            return;
        }
        if (obj instanceof Long) {
            this.f17134u = (Long) obj;
            this.f17137x = null;
            this.f17135v = null;
        } else if (obj instanceof String) {
            this.f17134u = null;
            this.f17137x = null;
            this.f17135v = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f17134u = null;
                this.f17137x = (Double) obj;
                this.f17135v = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public S1(T1 t2) {
        this(t2.f17145c, t2.f17144b, t2.f17146d, t2.f17147e);
    }
}
