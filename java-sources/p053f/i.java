package p053f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new h(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final IntentSender f15884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f15885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15887u;

    public i(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f15884r = intentSender;
        this.f15885s = intent;
        this.f15886t = i10;
        this.f15887u = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j.e(parcel, "dest");
        parcel.writeParcelable(this.f15884r, i10);
        parcel.writeParcelable(this.f15885s, i10);
        parcel.writeInt(this.f15886t);
        parcel.writeInt(this.f15887u);
    }
}
