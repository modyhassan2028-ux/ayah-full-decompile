package p030c9;

import E6.k;
import F9.n;
import Z0.B;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.ayah.Hilt_AyahApplication;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p035d3.l;
import p035d3.o;
import p035d3.u;
import p035d3.v;
import p051e9.a;
import p051e9.b;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0949w;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13587r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13588s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile a f13589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13590u;

    public f(B b5) {
        this.f13590u = b5;
    }

    private final Object d() {
        if (((u) this.f13589t) == null) {
            synchronized (this.f13588s) {
                try {
                    if (((u) this.f13589t) == null) {
                        this.f13589t = new u(new k((Hilt_AyahApplication) ((B) this.f13590u).f10875s));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (u) this.f13589t;
    }

    private final Object e() {
        if (((o) this.f13589t) == null) {
            synchronized (this.f13588s) {
                try {
                    if (((o) this.f13589t) == null) {
                        this.f13589t = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (o) this.f13589t;
    }

    public o a() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) this.f13590u;
        C0949w c0949w = abstractComponentCallbacksC0947u.f16138L;
        if ((c0949w == null ? null : c0949w.f16176v) == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        p050e8.b.l((c0949w == null ? null : c0949w.f16176v) instanceof b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (c0949w == null ? null : c0949w.f16176v).getClass());
        C0949w c0949w2 = abstractComponentCallbacksC0947u.f16138L;
        l lVar = (l) ((g) AbstractC0813f2.C(c0949w2 != null ? c0949w2.f16176v : null, g.class));
        return new o(lVar.f15618b, lVar.f15619c, lVar.f15620d);
    }

    public v b() {
        View view = (View) this.f13590u;
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !b.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application applicationV = n.v(context.getApplicationContext());
        Object obj = context;
        if (context == applicationV) {
            p050e8.b.l(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass());
            obj = null;
        }
        if (!(obj instanceof b)) {
            throw new IllegalStateException(view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
        }
        l lVar = (l) ((k) AbstractC0813f2.C((b) obj, k.class));
        u uVar = lVar.f15618b;
        p035d3.n nVar = lVar.f15619c;
        l lVar2 = lVar.f15620d;
        view.getClass();
        return new v(uVar, nVar, lVar2);
    }

    @Override // p051e9.b
    public final Object c() {
        switch (this.f13587r) {
            case 0:
                return d();
            case 1:
                return e();
            default:
                if (((v) this.f13589t) == null) {
                    synchronized (this.f13588s) {
                        try {
                            if (((v) this.f13589t) == null) {
                                this.f13589t = b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return (v) this.f13589t;
        }
    }

    public f(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        this.f13590u = abstractComponentCallbacksC0947u;
    }

    public f(View view) {
        this.f13590u = view;
    }
}
