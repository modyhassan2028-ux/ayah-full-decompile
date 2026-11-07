package K0;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AbstractComposeView;
import com.ayah.R;
import com.google.android.material.search.SearchBar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: K0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0381z implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5211s;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0381z(int i10, Object obj) {
        this.f5210r = i10;
        this.f5211s = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f5210r;
        Object obj = this.f5211s;
        switch (i10) {
            case 0:
                E e10 = (E) obj;
                AccessibilityManager accessibilityManager = e10.g;
                accessibilityManager.addAccessibilityStateChangeListener(e10.f4906i);
                accessibilityManager.addTouchExplorationStateChangeListener(e10.j);
                break;
            case 3:
                SearchBar searchBar = (SearchBar) obj;
                searchBar.f15117B0.addTouchExplorationStateChangeListener(new J1.b(searchBar.f15118C0));
                break;
            case 4:
                X7.m mVar = (X7.m) obj;
                AccessibilityManager accessibilityManager2 = mVar.f10034K;
                if (mVar.f10035L != null && accessibilityManager2 != null) {
                    WeakHashMap weakHashMap = I1.S.f3689a;
                    if (mVar.isAttachedToWindow()) {
                        accessibilityManager2.addTouchExplorationStateChangeListener(new J1.b(mVar.f10035L));
                    }
                    break;
                }
                break;
            case 5:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = I1.S.f3689a;
                I1.G.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        AccessibilityManager accessibilityManager;
        switch (this.f5210r) {
            case 0:
                E e10 = (E) this.f5211s;
                e10.f4908l.removeCallbacks(e10.f4899M);
                AccessibilityManager accessibilityManager2 = e10.g;
                accessibilityManager2.removeAccessibilityStateChangeListener(e10.f4906i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(e10.j);
                break;
            case 1:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.f5211s;
                Iterator it = G9.k.b0(abstractComposeView.getParent(), I1.X.f3704z).iterator();
                while (true) {
                    z10 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            p251z9.j.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    abstractComposeView.c();
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((K9.A) this.f5211s).e(null);
                break;
            case 3:
                SearchBar searchBar = (SearchBar) this.f5211s;
                searchBar.f15117B0.removeTouchExplorationStateChangeListener(new J1.b(searchBar.f15118C0));
                break;
            case 4:
                X7.m mVar = (X7.m) this.f5211s;
                C6.b bVar = mVar.f10035L;
                if (bVar != null && (accessibilityManager = mVar.f10034K) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new J1.b(bVar));
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                p140o.e eVar = (p140o.e) this.f5211s;
                ViewTreeObserver viewTreeObserver = eVar.f20109O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.f20109O = view.getViewTreeObserver();
                    }
                    eVar.f20109O.removeGlobalOnLayoutListener(eVar.f20118z);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                p140o.B b5 = (p140o.B) this.f5211s;
                ViewTreeObserver viewTreeObserver2 = b5.f20060F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        b5.f20060F = view.getViewTreeObserver();
                    }
                    b5.f20060F.removeGlobalOnLayoutListener(b5.f20073z);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
