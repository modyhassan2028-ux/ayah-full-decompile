package E6;

import android.os.Looper;
import com.google.android.gms.internal.measurement.H;
import i7.C1014r0;
import i7.C1023u0;
import i7.Y0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1955s;

    public /* synthetic */ s(int i10, Object obj) {
        this.f1954r = i10;
        this.f1955s = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1954r) {
            case 0:
                ((Executor) this.f1955s).execute(new r(runnable, 0));
                break;
            case 1:
                C1014r0 c1014r0 = ((C1023u0) ((Y0) this.f1955s).f16104r).f17585x;
                C1023u0.m(c1014r0);
                c1014r0.x(runnable);
                break;
            default:
                ((H) this.f1955s).post(runnable);
                break;
        }
    }

    public s() {
        this.f1954r = 2;
        H h7 = new H(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1955s = h7;
    }
}
