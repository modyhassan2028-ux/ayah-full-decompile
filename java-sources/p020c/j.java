package p020c;

import F2.x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.N;
import p110k9.y;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f13390s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ComponentActivity componentActivity, int i10) {
        super(0);
        this.f13389r = i10;
        this.f13390s = componentActivity;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f13389r;
        int i11 = 1;
        ComponentActivity componentActivity = this.f13390s;
        switch (i10) {
            case 0:
                return new N(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            case 1:
                componentActivity.reportFullyDrawn();
                return y.f19095a;
            case 2:
                return new r(componentActivity.f11382w, new j(componentActivity, i11));
            default:
                D d5 = new D(new RunnableC0778c(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (p251z9.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        int i12 = ComponentActivity.f11367K;
                        componentActivity.f12313r.a(new C0781f(d5, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new x(3, componentActivity, d5));
                    }
                }
                return d5;
        }
    }
}
