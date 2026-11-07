package p160p8;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f21086b;

    public l(m mVar, long j) {
        this.f21086b = mVar;
        this.f21085a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f21085a);
        this.f21086b.f21097k.i(bundle);
        return null;
    }
}
