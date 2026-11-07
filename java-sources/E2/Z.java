package E2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1635s;

    public /* synthetic */ Z(RecyclerView recyclerView, int i10) {
        this.f1634r = i10;
        this.f1635s = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f1634r;
        RecyclerView recyclerView = this.f1635s;
        switch (i10) {
            case 0:
                if (recyclerView.f12877L && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f12873J) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.f12882O) {
                        recyclerView.p();
                    } else {
                        recyclerView.f12880N = true;
                    }
                    break;
                }
                break;
            default:
                AbstractC0129j0 abstractC0129j0 = recyclerView.f12897g0;
                if (abstractC0129j0 != null) {
                    C0138o c0138o = (C0138o) abstractC0129j0;
                    long j = c0138o.f1691d;
                    ArrayList arrayList = c0138o.f1738h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0138o.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0138o.f1740k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0138o.f1739i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z10 = false;
                    } else {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            int i12 = i11 + 1;
                            F0 f3 = (F0) obj;
                            View view = f3.f1486a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c0138o.f1746q.add(f3);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C0128j(c0138o, f3, viewPropertyAnimatorAnimate, view)).start();
                            i11 = i12;
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z11 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c0138o.f1742m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC0126i runnableC0126i = new RunnableC0126i(c0138o, arrayList5, 0);
                            if (z11) {
                                runnableC0126i.run();
                            } else {
                                View view2 = ((C0136n) arrayList5.get(0)).f1728a.f1486a;
                                WeakHashMap weakHashMap = I1.S.f3689a;
                                view2.postOnAnimationDelayed(runnableC0126i, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c0138o.f1743n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC0126i runnableC0126i2 = new RunnableC0126i(c0138o, arrayList6, 1);
                            if (z11) {
                                runnableC0126i2.run();
                            } else {
                                View view3 = ((C0134m) arrayList6.get(0)).f1709a.f1486a;
                                WeakHashMap weakHashMap2 = I1.S.f3689a;
                                view3.postOnAnimationDelayed(runnableC0126i2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z10 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c0138o.f1741l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0126i runnableC0126i3 = new RunnableC0126i(c0138o, arrayList7, 2);
                            if (z11 && zIsEmpty2 && zIsEmpty3) {
                                runnableC0126i3.run();
                                z10 = false;
                            } else {
                                if (z11) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c0138o.f1692e : 0L, zIsEmpty3 ? 0L : c0138o.f1693f) + j;
                                z10 = false;
                                View view4 = ((F0) arrayList7.get(0)).f1486a;
                                WeakHashMap weakHashMap3 = I1.S.f3689a;
                                view4.postOnAnimationDelayed(runnableC0126i3, jMax);
                            }
                        }
                    }
                } else {
                    z10 = false;
                }
                recyclerView.f12864E0 = z10;
                break;
        }
    }
}
