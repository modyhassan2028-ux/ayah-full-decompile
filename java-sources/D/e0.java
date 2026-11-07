package D;

import K.w0;
import Z.L0;
import android.content.Context;
import android.view.View;
import com.ayah.MainActivity;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p223x.k0;
import p223x.n0;
import p223x.q0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Z.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f952c;

    public /* synthetic */ e0(int i10, Object obj, Object obj2) {
        this.f950a = i10;
        this.f951b = obj;
        this.f952c = obj2;
    }

    @Override // Z.E
    public final void a() {
        int i10 = this.f950a;
        Object obj = this.f952c;
        Object obj2 = this.f951b;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) obj2;
                View view = (View) obj;
                int i11 = f0Var.f972s - 1;
                f0Var.f972s = i11;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = I1.S.f3689a;
                    I1.I.m(view, null);
                    I1.S.r(view, null);
                    view.removeOnAttachStateChangeListener(f0Var.f973t);
                }
                break;
            case 1:
                ((G.Y) obj2).f2649c.j(obj);
                break;
            case 2:
                Z.X x9 = (Z.X) obj2;
                B.l lVar = (B.l) x9.getValue();
                if (lVar != null) {
                    B.k kVar = new B.k(lVar);
                    B.j jVar = (B.j) obj;
                    if (jVar != null) {
                        jVar.b(kVar);
                    }
                    x9.setValue(null);
                }
                break;
            case 3:
                ((w0) obj2).f4814c.remove((p241y9.c) obj);
                break;
            case 4:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((K0.S) obj);
                break;
            case 5:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((K0.T) obj);
                break;
            case 6:
                if (!((Boolean) ((Z.X) obj2).getValue()).booleanValue()) {
                    Object obj3 = (Context) obj;
                    U3.a aVar = obj3 instanceof U3.a ? (U3.a) obj3 : null;
                    if (aVar != null) {
                        ((MainActivity) aVar).D();
                    }
                }
                break;
            case 7:
                ((p173r2.j) obj2).f21448y.j.f((p181s2.k) obj);
                break;
            case 8:
                Iterator it = ((List) ((L0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((p181s2.i) obj).b().c((p173r2.j) it.next());
                }
                break;
            case 9:
                ((p223x.F) obj2).f23848a.k((p223x.D) obj);
                break;
            case 10:
                ((q0) obj2).j.remove((q0) obj);
                break;
            case 11:
                q0 q0Var = (q0) obj2;
                q0Var.getClass();
                p223x.j0 j0Var = (p223x.j0) ((k0) obj).f24034b.getValue();
                if (j0Var != null) {
                    q0Var.f24072i.remove(j0Var.f24023r);
                }
                break;
            default:
                ((q0) obj2).f24072i.remove((n0) obj);
                break;
        }
    }
}
