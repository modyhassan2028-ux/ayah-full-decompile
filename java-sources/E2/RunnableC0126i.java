package E2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: E2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0126i implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0138o f1680t;

    public /* synthetic */ RunnableC0126i(C0138o c0138o, ArrayList arrayList, int i10) {
        this.f1678r = i10;
        this.f1680t = c0138o;
        this.f1679s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1678r) {
            case 0:
                ArrayList arrayList = this.f1679s;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    C0138o c0138o = this.f1680t;
                    if (i10 >= size) {
                        arrayList.clear();
                        c0138o.f1742m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        C0136n c0136n = (C0136n) obj;
                        F0 f3 = c0136n.f1728a;
                        int i11 = c0136n.f1729b;
                        int i12 = c0136n.f1730c;
                        int i13 = c0136n.f1731d;
                        int i14 = c0136n.f1732e;
                        c0138o.getClass();
                        View view = f3.f1486a;
                        int i15 = i13 - i11;
                        int i16 = i14 - i12;
                        if (i15 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i16 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0138o.f1745p.add(f3);
                        viewPropertyAnimatorAnimate.setDuration(c0138o.f1692e).setListener(new C0130k(c0138o, f3, i15, view, i16, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f1679s;
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    C0138o c0138o2 = this.f1680t;
                    if (i17 >= size2) {
                        arrayList2.clear();
                        c0138o2.f1743n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i17);
                        i17++;
                        C0134m c0134m = (C0134m) obj2;
                        ArrayList arrayList3 = c0138o2.f1747r;
                        long j = c0138o2.f1693f;
                        F0 f7 = c0134m.f1709a;
                        View view2 = f7 == null ? null : f7.f1486a;
                        F0 f10 = c0134m.f1710b;
                        View view3 = f10 != null ? f10.f1486a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0134m.f1709a);
                            duration.translationX(c0134m.f1713e - c0134m.f1711c);
                            duration.translationY(c0134m.f1714f - c0134m.f1712d);
                            duration.alpha(0.0f).setListener(new C0132l(c0138o2, c0134m, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0134m.f1710b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0132l(c0138o2, c0134m, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f1679s;
                int size3 = arrayList4.size();
                int i18 = 0;
                while (true) {
                    C0138o c0138o3 = this.f1680t;
                    if (i18 >= size3) {
                        arrayList4.clear();
                        c0138o3.f1741l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i18);
                        i18++;
                        F0 f11 = (F0) obj3;
                        c0138o3.getClass();
                        View view4 = f11.f1486a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0138o3.f1744o.add(f11);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0138o3.f1690c).setListener(new C0128j(c0138o3, f11, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
