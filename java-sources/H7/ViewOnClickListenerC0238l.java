package H7;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import p084i.C0958f;
import p151p.d1;

/* JADX INFO: renamed from: H7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0238l implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3546s;

    public /* synthetic */ ViewOnClickListenerC0238l(int i10, Object obj) {
        this.f3545r = i10;
        this.f3546s = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f3545r) {
            case 0:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                w wVar = (w) this.f3546s;
                o oVar = wVar.f3579v;
                boolean z10 = true;
                if (oVar != null) {
                    oVar.f3552w = true;
                }
                p140o.m itemData = navigationMenuItemView.getItemData();
                boolean zQ = wVar.f3577t.q(itemData, wVar, 0);
                if (itemData != null && itemData.isCheckable() && zQ) {
                    wVar.f3579v.k(itemData);
                } else {
                    z10 = false;
                }
                o oVar2 = wVar.f3579v;
                if (oVar2 != null) {
                    oVar2.f3552w = false;
                }
                if (z10) {
                    wVar.e(false);
                }
                break;
            case 1:
                p140o.m itemData2 = ((NavigationBarItemView) view).getItemData();
                NavigationBarMenuView navigationBarMenuView = (NavigationBarMenuView) this.f3546s;
                if (!navigationBarMenuView.f15059V.q(itemData2, navigationBarMenuView.U, 0)) {
                    itemData2.setChecked(true);
                }
                break;
            case 2:
                MaterialCalendar materialCalendar = (MaterialCalendar) this.f3546s;
                int i10 = materialCalendar.f14825s0;
                if (i10 == 2) {
                    materialCalendar.T(1);
                } else if (i10 == 1) {
                    materialCalendar.T(2);
                }
                break;
            case 3:
                C0958f c0958f = (C0958f) this.f3546s;
                if (view == c0958f.f16590i && (message3 = c0958f.f16591k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != c0958f.f16592l || (message2 = c0958f.f16594n) == null) {
                    messageObtain = (view != c0958f.f16595o || (message = c0958f.f16597q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0958f.f16581F.obtainMessage(1, c0958f.f16584b).sendToTarget();
                break;
            case 4:
                ((p130n.a) this.f3546s).a();
                break;
            case 5:
                d1 d1Var = ((Toolbar) this.f3546s).f11697g0;
                p140o.m mVar = d1Var == null ? null : d1Var.f20653s;
                if (mVar != null) {
                    mVar.collapseActionView();
                }
                break;
            case 6:
                p193t7.e eVar = (p193t7.e) this.f3546s;
                if (eVar.f22631A && eVar.isShowing()) {
                    if (!eVar.f22633C) {
                        TypedArray typedArrayObtainStyledAttributes = eVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        eVar.f22632B = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        eVar.f22633C = true;
                    }
                    if (eVar.f22632B) {
                        eVar.cancel();
                    }
                    break;
                }
                break;
            default:
                ((Preference) this.f3546s).v(view);
                break;
        }
    }
}
