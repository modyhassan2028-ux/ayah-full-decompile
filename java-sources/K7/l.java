package K7;

import H7.H;
import H7.N;
import H7.w;
import I1.AbstractC0245c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import p140o.B;
import p140o.v;
import p151p.C1250k;
import p151p.E0;
import p151p.I;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5297s;

    public /* synthetic */ l(int i10, Object obj) {
        this.f5296r = i10;
        this.f5297s = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        Rect rect;
        C1250k c1250k;
        v vVar;
        int i10 = this.f5296r;
        int i11 = 0;
        Object obj = this.f5297s;
        switch (i10) {
            case 0:
                NavigationView navigationView = (NavigationView) obj;
                int[] iArr = navigationView.f15078B;
                navigationView.getLocationOnScreen(iArr);
                boolean z10 = iArr[1] == 0;
                w wVar = navigationView.f15091z;
                if (wVar.f3573O != z10) {
                    wVar.f3573O = z10;
                    int i12 = (wVar.f3576s.getChildCount() <= 0 && wVar.f3573O) ? wVar.Q : 0;
                    NavigationMenuView navigationMenuView = wVar.f3575r;
                    navigationMenuView.setPadding(0, i12, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z10 && navigationView.f15081E);
                int i13 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i13 == 0 || navigationView.getWidth() + i13 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    int i14 = Build.VERSION.SDK_INT;
                    int i15 = H.f3450d;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    if (i14 >= 30) {
                        rect = N.a(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.setDrawBottomInsetForeground((rect.height() - navigationView.getHeight() == iArr[1]) == true && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) == true && navigationView.f15082F);
                    navigationView.setDrawRightInsetForeground(rect.width() == iArr[0] || rect.width() - navigationView.getWidth() == iArr[0]);
                }
                break;
            case 1:
                p140o.e eVar = (p140o.e) obj;
                ArrayList arrayList = eVar.f20117y;
                if (eVar.a() && arrayList.size() > 0 && !((p140o.d) arrayList.get(0)).f20092a.f20523P) {
                    View view = eVar.f20100F;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            ((p140o.d) obj2).f20092a.d();
                        }
                    } else {
                        eVar.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                B b5 = (B) obj;
                E0 e10 = b5.f20072y;
                if (b5.a() && !e10.f20523P) {
                    View view2 = b5.f20058D;
                    if (view2 != null && view2.isShown()) {
                        e10.d();
                    } else {
                        b5.dismiss();
                    }
                    break;
                }
                break;
            case 3:
                ActivityChooserView activityChooserView = (ActivityChooserView) obj;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        break;
                    } else {
                        activityChooserView.getListPopupWindow().d();
                        AbstractC0245c abstractC0245c = activityChooserView.f11493x;
                        if (abstractC0245c != null && (c1250k = abstractC0245c.f3714a) != null && (vVar = c1250k.f20711v) != null) {
                            vVar.h(c1250k.f20709t);
                            break;
                        }
                    }
                }
                break;
            case 4:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                if (!appCompatSpinner.getInternalPopup().a()) {
                    appCompatSpinner.f11540w.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                I i16 = (I) obj;
                AppCompatSpinner appCompatSpinner2 = i16.f20560Y;
                i16.getClass();
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(i16.f20558W)) {
                    i16.s();
                    i16.d();
                } else {
                    i16.dismiss();
                }
                break;
        }
    }
}
