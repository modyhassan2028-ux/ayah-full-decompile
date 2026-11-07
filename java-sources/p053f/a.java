package p053f;

import E2.O;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new O(29);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f15870s;

    public a(Intent intent, int i10) {
        this.f15869r = i10;
        this.f15870s = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f15869r;
        if (i10 != -1) {
            strValueOf = i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f15870s);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j.e(parcel, "dest");
        parcel.writeInt(this.f15869r);
        Intent intent = this.f15870s;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
