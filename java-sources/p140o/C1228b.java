package p140o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActivityChooserView;
import p151p.AbstractViewOnTouchListenerC1266s0;
import p151p.C1240f;
import p151p.C1242g;
import p151p.C1246i;
import p151p.C1250k;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1228b extends AbstractViewOnTouchListenerC1266s0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f20090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ View f20091B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1228b(View view, View view2, int i10) {
        super(view2);
        this.f20090A = i10;
        this.f20091B = view;
    }

    @Override // p151p.AbstractViewOnTouchListenerC1266s0
    public final A b() {
        C1240f c1240f;
        switch (this.f20090A) {
            case 0:
                AbstractC1229c abstractC1229c = ((ActionMenuItemView) this.f20091B).f11392D;
                if (abstractC1229c == null || (c1240f = ((C1242g) abstractC1229c).f20659a.f20702L) == null) {
                    return null;
                }
                return c1240f.a();
            case 1:
                C1240f c1240f2 = ((C1246i) this.f20091B).f20673u.f20701K;
                if (c1240f2 == null) {
                    return null;
                }
                return c1240f2.a();
            default:
                return ((ActivityChooserView) this.f20091B).getListPopupWindow();
        }
    }

    @Override // p151p.AbstractViewOnTouchListenerC1266s0
    public final boolean c() {
        A aB;
        switch (this.f20090A) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f20091B;
                j jVar = actionMenuItemView.f11390B;
                return jVar != null && jVar.c(actionMenuItemView.f11398y) && (aB = b()) != null && aB.a();
            case 1:
                ((C1246i) this.f20091B).f20673u.n();
                return true;
            default:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.f20091B;
                if (activityChooserView.b() || !activityChooserView.f11486B) {
                    return true;
                }
                activityChooserView.f11487r.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    @Override // p151p.AbstractViewOnTouchListenerC1266s0
    public boolean d() {
        switch (this.f20090A) {
            case 1:
                C1250k c1250k = ((C1246i) this.f20091B).f20673u;
                if (c1250k.f20703M != null) {
                    return false;
                }
                c1250k.d();
                return true;
            case 2:
                ((ActivityChooserView) this.f20091B).a();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f20090A = 0;
        this.f20091B = actionMenuItemView;
    }
}
