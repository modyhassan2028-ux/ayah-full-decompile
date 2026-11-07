package i7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0904y;
import com.google.android.gms.internal.measurement.AbstractC0909z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: i7.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0998l1 extends AbstractBinderC0904y implements L {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0998l1(C1021t1 c1021t1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f17452f = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(F1.CREATOR);
        AbstractC0909z.d(parcel);
        k0(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // i7.L
    public final void k0(List list) {
        AtomicReference atomicReference = this.f17452f;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
