package H8;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.K1;
import java.util.Set;
import java.util.concurrent.Executor;
import p100j8.l;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f3592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I8.b f3594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f3596e;

    public d(Context context, String str, Set set, I8.b bVar, Executor executor) {
        this.f3592a = new l(new b(0, context, str));
        this.f3595d = set;
        this.f3596e = executor;
        this.f3594c = bVar;
        this.f3593b = context;
    }

    public final o a() {
        if (Build.VERSION.SDK_INT >= 24 ? K1.j(this.f3593b) : true) {
            return p000a.a.o(this.f3596e, new c(this, 0));
        }
        return p000a.a.E("");
    }

    public final void b() {
        if (this.f3595d.size() <= 0) {
            p000a.a.E(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? K1.j(this.f3593b) : true) {
            p000a.a.o(this.f3596e, new c(this, 1));
        } else {
            p000a.a.E(null);
        }
    }
}
