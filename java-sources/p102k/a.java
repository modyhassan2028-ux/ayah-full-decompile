package p102k;

import X2.e;
import android.graphics.drawable.Animatable;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Animatable f18822e;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.f18821d = i10;
        this.f18822e = animatable;
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final void J() {
        switch (this.f18821d) {
            case 0:
                this.f18822e.start();
                break;
            default:
                ((e) this.f18822e).start();
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final void K() {
        switch (this.f18821d) {
            case 0:
                this.f18822e.stop();
                break;
            default:
                ((e) this.f18822e).stop();
                break;
        }
    }
}
