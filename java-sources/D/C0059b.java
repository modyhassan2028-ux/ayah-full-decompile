package D;

import A.C0007a;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0059b implements InterfaceC0062e, InterfaceC0064g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f938r;

    public /* synthetic */ C0059b(int i10) {
        this.f938r = i10;
    }

    public static final C0058a c(int i10, String str) {
        WeakHashMap weakHashMap = f0.f955u;
        return new C0058a(i10, str);
    }

    public static final b0 e(int i10, String str) {
        WeakHashMap weakHashMap = f0.f955u;
        return new b0(new G(0, 0, 0, 0), str);
    }

    public static f0 f(C0698o c0698o) {
        f0 f0Var;
        View view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
        WeakHashMap weakHashMap = f0.f955u;
        synchronized (weakHashMap) {
            try {
                Object f0Var2 = weakHashMap.get(view);
                if (f0Var2 == null) {
                    f0Var2 = new f0(view);
                    weakHashMap.put(view, f0Var2);
                }
                f0Var = (f0) f0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zI = c0698o.i(f0Var) | c0698o.i(view);
        Object objH = c0698o.H();
        if (zI || objH == C0690k.f10683a) {
            objH = new C0007a(4, f0Var, view);
            c0698o.e0(objH);
        }
        C0672b.d(f0Var, (p241y9.c) objH, c0698o);
        return f0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // D.InterfaceC0062e, D.InterfaceC0064g
    public float a() {
        switch (this.f938r) {
        }
        return 0;
    }

    @Override // D.InterfaceC0062e
    public void b(p063g1.c cVar, int i10, int[] iArr, p063g1.m mVar, int[] iArr2) {
        switch (this.f938r) {
            case 0:
                AbstractC0066i.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC0066i.c(i10, iArr, iArr2, false);
                break;
            case 2:
            default:
                if (mVar != p063g1.m.f16261r) {
                    AbstractC0066i.c(i10, iArr, iArr2, true);
                } else {
                    AbstractC0066i.b(iArr, iArr2, false);
                }
                break;
            case 3:
                if (mVar != p063g1.m.f16261r) {
                    AbstractC0066i.b(iArr, iArr2, true);
                } else {
                    AbstractC0066i.c(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // D.InterfaceC0064g
    public void d(int i10, H0.K k7, int[] iArr, int[] iArr2) {
        switch (this.f938r) {
            case 2:
                AbstractC0066i.c(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC0066i.b(iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f938r) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#Bottom";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            case 5:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
