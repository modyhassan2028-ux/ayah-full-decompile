package i7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0904y;
import com.google.android.gms.internal.measurement.AbstractC0909z;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: i7.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1001m1 extends AbstractBinderC0904y implements N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17468f;
    public final /* synthetic */ C1021t1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1001m1(C1021t1 c1021t1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f17468f = atomicReference;
        this.g = c1021t1;
    }

    @Override // i7.N
    public final void I(K1 k7) {
        AtomicReference atomicReference = this.f17468f;
        synchronized (atomicReference) {
            X x9 = ((C1023u0) this.g.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17178E.b(Integer.valueOf(k7.f17026r.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(k7);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        K1 k7 = (K1) AbstractC0909z.a(parcel, K1.CREATOR);
        AbstractC0909z.d(parcel);
        I(k7);
        return true;
    }
}
