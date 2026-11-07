package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new q(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f11320A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Bundle f11321B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PlaybackState f11322C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f11324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f11325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f11326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f11327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f11329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f11330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f11331z;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new u();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f11332r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final CharSequence f11333s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f11334t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Bundle f11335u;

        public CustomAction(Parcel parcel) {
            this.f11332r = parcel.readString();
            this.f11333s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11334t = parcel.readInt();
            this.f11335u = parcel.readBundle(r.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f11333s) + ", mIcon=" + this.f11334t + ", mExtras=" + this.f11335u;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f11332r);
            TextUtils.writeToParcel(this.f11333s, parcel, i10);
            parcel.writeInt(this.f11334t);
            parcel.writeBundle(this.f11335u);
        }
    }

    public PlaybackStateCompat(int i10, long j, long j10, float f3, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f11323r = i10;
        this.f11324s = j;
        this.f11325t = j10;
        this.f11326u = f3;
        this.f11327v = j11;
        this.f11328w = i11;
        this.f11329x = charSequence;
        this.f11330y = j12;
        this.f11331z = new ArrayList(arrayList);
        this.f11320A = j13;
        this.f11321B = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f11323r);
        sb.append(", position=");
        sb.append(this.f11324s);
        sb.append(", buffered position=");
        sb.append(this.f11325t);
        sb.append(", speed=");
        sb.append(this.f11326u);
        sb.append(", updated=");
        sb.append(this.f11330y);
        sb.append(", actions=");
        sb.append(this.f11327v);
        sb.append(", error code=");
        sb.append(this.f11328w);
        sb.append(", error message=");
        sb.append(this.f11329x);
        sb.append(", custom actions=");
        sb.append(this.f11331z);
        sb.append(", active item id=");
        return p.x(this.f11320A, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11323r);
        parcel.writeLong(this.f11324s);
        parcel.writeFloat(this.f11326u);
        parcel.writeLong(this.f11330y);
        parcel.writeLong(this.f11325t);
        parcel.writeLong(this.f11327v);
        TextUtils.writeToParcel(this.f11329x, parcel, i10);
        parcel.writeTypedList(this.f11331z);
        parcel.writeLong(this.f11320A);
        parcel.writeBundle(this.f11321B);
        parcel.writeInt(this.f11328w);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f11323r = parcel.readInt();
        this.f11324s = parcel.readLong();
        this.f11326u = parcel.readFloat();
        this.f11330y = parcel.readLong();
        this.f11325t = parcel.readLong();
        this.f11327v = parcel.readLong();
        this.f11329x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f11331z = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f11320A = parcel.readLong();
        this.f11321B = parcel.readBundle(r.class.getClassLoader());
        this.f11328w = parcel.readInt();
    }
}
