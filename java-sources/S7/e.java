package S7;

import E2.RunnableC0147v;
import I1.S;
import K0.RunnableC0354l;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f7526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.b f7527e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f7523a = 0;
        this.f7527e = sideSheetBehavior;
        this.f7526d = new RunnableC0354l(5, this);
    }

    public final void a(int i10) {
        int i11 = this.f7523a;
        Runnable runnable = this.f7526d;
        u1.b bVar = this.f7527e;
        switch (i11) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bVar;
                WeakReference weakReference = sideSheetBehavior.f15163G;
                if (weakReference != null && weakReference.get() != null) {
                    this.f7524b = i10;
                    if (!this.f7525c) {
                        WeakHashMap weakHashMap = S.f3689a;
                        ((View) sideSheetBehavior.f15163G.get()).postOnAnimation((RunnableC0354l) runnable);
                        this.f7525c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
                WeakReference weakReference2 = bottomSheetBehavior.f14683l0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f7524b = i10;
                    if (!this.f7525c) {
                        WeakHashMap weakHashMap2 = S.f3689a;
                        ((View) bottomSheetBehavior.f14683l0.get()).postOnAnimation((RunnableC0147v) runnable);
                        this.f7525c = true;
                    }
                    break;
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f7523a = 1;
        this.f7527e = bottomSheetBehavior;
        this.f7526d = new RunnableC0147v(29, this);
    }
}
