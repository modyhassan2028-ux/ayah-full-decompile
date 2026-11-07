package android.support.v4.media;

import E2.O;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new O(21);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f11282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f11283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f11284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bitmap f11285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Uri f11286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f11287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Uri f11288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public MediaDescription f11289z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f11281r = str;
        this.f11282s = charSequence;
        this.f11283t = charSequence2;
        this.f11284u = charSequence3;
        this.f11285v = bitmap;
        this.f11286w = uri;
        this.f11287x = bundle;
        this.f11288y = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f11282s) + ", " + ((Object) this.f11283t) + ", " + ((Object) this.f11284u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionA = this.f11289z;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = f.b();
            f.n(builderB, this.f11281r);
            f.p(builderB, this.f11282s);
            f.o(builderB, this.f11283t);
            f.j(builderB, this.f11284u);
            f.l(builderB, this.f11285v);
            f.m(builderB, this.f11286w);
            f.k(builderB, this.f11287x);
            g.b(builderB, this.f11288y);
            mediaDescriptionA = f.a(builderB);
            this.f11289z = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i10);
    }
}
