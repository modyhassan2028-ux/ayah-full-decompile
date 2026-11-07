package i7;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: i7.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1038z0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X1 f17703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f17704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0 f17705d;

    public /* synthetic */ CallableC1038z0(B0 b5, X1 x9, Bundle bundle, int i10) {
        this.f17702a = i10;
        this.f17703b = x9;
        this.f17704c = bundle;
        this.f17705d = b5;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f17702a) {
            case 0:
                B0 b5 = this.f17705d;
                b5.f16830f.B();
                return b5.f16830f.d0(this.f17704c, this.f17703b);
            default:
                B0 b10 = this.f17705d;
                b10.f16830f.B();
                return b10.f16830f.d0(this.f17704c, this.f17703b);
        }
    }
}
