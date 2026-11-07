package X7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class y extends Q1.b {
    public static final Parcelable.Creator<y> CREATOR = new x0(11);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f10103t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10104u;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10103t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f10104u = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10103t) + "}";
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f10103t, parcel, i10);
        parcel.writeInt(this.f10104u ? 1 : 0);
    }
}
