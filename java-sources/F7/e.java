package F7;

import H7.H;
import I1.InterfaceC0242a0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import io.realm.RealmFieldTypeConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2446b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f2445a = i10;
        this.f2446b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2445a) {
            case 0:
                ((b) this.f2446b).d();
                break;
            case 2:
                ((InterfaceC0242a0) this.f2446b).b();
                break;
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2446b;
                actionBarOverlayLayout.f11463N = null;
                actionBarOverlayLayout.f11450A = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2445a) {
            case 0:
                ((b) this.f2446b).e();
                break;
            case 1:
                android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) this.f2446b;
                if (((ValueAnimator) rVar.f11364s) == animator) {
                    rVar.f11364s = null;
                }
                break;
            case 2:
                ((InterfaceC0242a0) this.f2446b).a();
                break;
            case 3:
                J7.g gVar = (J7.g) this.f2446b;
                gVar.f4367b.setTranslationY(0.0f);
                gVar.c(0.0f);
                break;
            case 4:
                View view = (View) this.f2446b;
                if (view != null) {
                    view.setVisibility(0);
                }
                break;
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2446b;
                sideSheetBehavior.x(5);
                WeakReference weakReference = sideSheetBehavior.f15163G;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f15163G.get()).requestLayout();
                    break;
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                T7.c cVar = (T7.c) this.f2446b;
                ViewGroup viewGroupI = H.i(cVar);
                O8.c cVar2 = viewGroupI == null ? null : new O8.c(viewGroupI);
                ArrayList arrayList = cVar.f7869C;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ViewOverlay) cVar2.f6511r).remove((Z7.a) obj);
                }
                break;
            case 8:
                ((W2.p) this.f2446b).m();
                animator.removeListener(this);
                break;
            case 9:
                X2.e eVar = (X2.e) this.f2446b;
                ArrayList arrayList2 = new ArrayList(eVar.f9873v);
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((M7.c) arrayList2.get(i11)).a(eVar);
                }
                break;
            case 10:
                X7.j jVar = (X7.j) this.f2446b;
                jVar.p();
                jVar.f10021r.start();
                break;
            case 11:
                ((ExpandableTransformationBehavior) this.f2446b).f15383s = null;
                break;
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2446b;
                actionBarOverlayLayout.f11463N = null;
                actionBarOverlayLayout.f11450A = false;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                ((HideBottomViewOnScrollBehavior) this.f2446b).f14608z = null;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2446b;
                bottomSheetBehavior.M(5);
                WeakReference weakReference2 = bottomSheetBehavior.f14683l0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f14683l0.get()).requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f2445a) {
            case 5:
                super.onAnimationRepeat(animator);
                M7.q qVar = (M7.q) this.f2446b;
                qVar.f5814f = (qVar.f5814f + 1) % qVar.f5813e.f5754c.length;
                qVar.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2445a) {
            case 0:
                ((b) this.f2446b).f(animator);
                break;
            case 2:
                ((InterfaceC0242a0) this.f2446b).c();
                break;
            case 9:
                X2.e eVar = (X2.e) this.f2446b;
                ArrayList arrayList = new ArrayList(eVar.f9873v);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((M7.c) arrayList.get(i10)).b(eVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public e(InterfaceC0242a0 interfaceC0242a0, View view) {
        this.f2445a = 2;
        this.f2446b = interfaceC0242a0;
    }
}
