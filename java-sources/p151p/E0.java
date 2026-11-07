package p151p;

import Z0.B;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p140o.h;
import p140o.k;
import p140o.m;
import p151p.B0;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends A0 implements B0 {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Method f20539V;
    public B U;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f20539V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p151p.B0
    public final void c(k kVar, MenuItem menuItem) {
        B b5 = this.U;
        if (b5 != null) {
            b5.c(kVar, menuItem);
        }
    }

    @Override // p151p.B0
    public final void e(k kVar, m mVar) {
        B b5 = this.U;
        if (b5 != null) {
            b5.e(kVar, mVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView, p.p0] */
    @Override // p151p.A0
    public final C1261p0 q(final Context context, final boolean z10) {
        ?? r10 = new C1261p0(context, z10) { // from class: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public final int f11579D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            public final int f11580E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            public B0 f11581F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            public m f11582G;

            {
                super(context, z10);
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.f11579D = 21;
                    this.f11580E = 22;
                } else {
                    this.f11579D = 22;
                    this.f11580E = 21;
                }
            }

            @Override // p151p.C1261p0, android.view.View
            public final boolean onHoverEvent(MotionEvent motionEvent) {
                h hVar;
                int headersCount;
                int iPointToPosition;
                int i10;
                if (this.f11581F != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        hVar = (h) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        hVar = (h) adapter;
                        headersCount = 0;
                    }
                    m mVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= hVar.getCount()) ? null : hVar.b(i10);
                    m mVar = this.f11582G;
                    if (mVar != mVarB) {
                        k kVar = hVar.f20127r;
                        if (mVar != null) {
                            this.f11581F.c(kVar, mVar);
                        }
                        this.f11582G = mVarB;
                        if (mVarB != null) {
                            this.f11581F.e(kVar, mVarB);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null && i10 == this.f11579D) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                }
                if (listMenuItemView == null || i10 != this.f11580E) {
                    return super.onKeyDown(i10, keyEvent);
                }
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (h) adapter).f20127r.c(false);
                return true;
            }

            public void setHoverListener(B0 b5) {
                this.f11581F = b5;
            }

            @Override // p151p.C1261p0, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }
        };
        r10.setHoverListener(this);
        return r10;
    }
}
