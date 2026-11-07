package T7;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new O(10);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f7861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f7862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f7863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7864v;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f7860r);
        parcel.writeFloat(this.f7861s);
        parcel.writeList(this.f7862t);
        parcel.writeFloat(this.f7863u);
        parcel.writeBooleanArray(new boolean[]{this.f7864v});
    }
}
