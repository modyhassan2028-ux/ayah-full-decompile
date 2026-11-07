package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12684a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.f f12685b = new r.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12686c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f12688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f12689f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12691i;

    public z() {
        Object obj = j;
        this.f12689f = obj;
        this.f12688e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        q.a.S().f21181i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(p245z2.a.D("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(y yVar) {
        if (yVar.f12681b) {
            int i10 = yVar.f12682c;
            int i11 = this.g;
            if (i10 >= i11) {
                return;
            }
            yVar.f12682c = i11;
            Z0.B b5 = yVar.f12680a;
            Object obj = this.f12688e;
            b5.getClass();
            InterfaceC0771u interfaceC0771u = (InterfaceC0771u) obj;
            DialogFragment dialogFragment = (DialogFragment) b5.f10875s;
            if (interfaceC0771u == null || !dialogFragment.f12586v0) {
                return;
            }
            View viewN = dialogFragment.N();
            if (viewN.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (dialogFragment.f12590z0 != null) {
                if (p056f2.K.K(3)) {
                    Log.d("FragmentManager", "DialogFragment " + b5 + " setting the content view on " + dialogFragment.f12590z0);
                }
                dialogFragment.f12590z0.setContentView(viewN);
            }
        }
    }

    public final void c(y yVar) {
        if (this.f12690h) {
            this.f12691i = true;
            return;
        }
        this.f12690h = true;
        do {
            this.f12691i = false;
            if (yVar != null) {
                b(yVar);
                yVar = null;
            } else {
                r.f fVar = this.f12685b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f21381t.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((y) ((Map.Entry) dVar.next()).getValue());
                    if (this.f12691i) {
                        break;
                    }
                }
            }
        } while (this.f12691i);
        this.f12690h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.g++;
        this.f12688e = obj;
        c(null);
    }
}
