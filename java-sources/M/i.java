package M;

import K.W;
import K9.A;
import O.N;
import U0.K;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5615b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f5614a = i10;
        this.f5615b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f5614a) {
            case 0:
                N n6 = (N) this.f5615b;
                if (n6 != null) {
                    W w9 = n6.f6311d;
                    if (w9 != null) {
                        w9.e(K.f8033b);
                    }
                    W w10 = n6.f6311d;
                    if (w10 != null) {
                        w10.f(K.f8033b);
                        break;
                    }
                }
                break;
            default:
                ((A) this.f5615b).e(null);
                break;
        }
    }
}
