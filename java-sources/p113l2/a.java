package p113l2;

import Ba.b;
import Z.C0698o;
import Z.C0709z;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.K;
import androidx.lifecycle.V;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0709z f19381a = new C0709z(new b(17));

    public static V a(C0698o c0698o) {
        V vE = (V) c0698o.k(f19381a);
        if (vE == null) {
            c0698o.T(1260197609);
            vE = K.e((View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f));
        } else {
            c0698o.T(1260196493);
        }
        c0698o.p(false);
        return vE;
    }
}
