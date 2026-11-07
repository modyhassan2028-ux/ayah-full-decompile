package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new q(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f11312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f11313t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f11311r = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Y2.d f11314u = null;

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.f11312s = obj;
        this.f11313t = dVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f11311r) {
            dVar = this.f11313t;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f11311r) {
            this.f11313t = dVar;
        }
    }

    public final void c(Y2.d dVar) {
        synchronized (this.f11311r) {
            this.f11314u = dVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).f11312s;
        Object obj3 = this.f11312s;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f11312s;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.f11312s, i10);
    }
}
