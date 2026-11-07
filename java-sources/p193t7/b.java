package p193t7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Q1.b {
    public static final Parcelable.Creator<b> CREATOR = new x0(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f22620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f22621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f22622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f22623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f22624x;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22620t = parcel.readInt();
        this.f22621u = parcel.readInt();
        this.f22622v = parcel.readInt() == 1;
        this.f22623w = parcel.readInt() == 1;
        this.f22624x = parcel.readInt() == 1;
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f22620t);
        parcel.writeInt(this.f22621u);
        parcel.writeInt(this.f22622v ? 1 : 0);
        parcel.writeInt(this.f22623w ? 1 : 0);
        parcel.writeInt(this.f22624x ? 1 : 0);
    }

    public b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f22620t = bottomSheetBehavior.f14674c0;
        this.f22621u = bottomSheetBehavior.f14697v;
        this.f22622v = bottomSheetBehavior.f14691s;
        this.f22623w = bottomSheetBehavior.f14671Z;
        this.f22624x = bottomSheetBehavior.f14672a0;
    }
}
