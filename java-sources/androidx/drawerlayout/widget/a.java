package androidx.drawerlayout.widget;

import K0.RunnableC0354l;
import R1.c;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p000a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f12572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RunnableC0354l f12573d = new RunnableC0354l(12, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f12574e;

    public a(DrawerLayout drawerLayout, int i10) {
        this.f12574e = drawerLayout;
        this.f12571b = i10;
    }

    @Override // p000a.a
    public final int L(View view) {
        if (DrawerLayout.l(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p000a.a
    public final void T(int i10, int i11) {
        int i12 = i10 & 1;
        DrawerLayout drawerLayout = this.f12574e;
        View viewE = i12 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
        if (viewE == null || drawerLayout.g(viewE) != 0) {
            return;
        }
        this.f12572c.c(i11, viewE);
    }

    @Override // p000a.a
    public final void U(int i10) {
        this.f12574e.postDelayed(this.f12573d, 160L);
    }

    @Override // p000a.a
    public final void Y(View view, int i10) {
        ((Z1.c) view.getLayoutParams()).f10960c = false;
        int i11 = this.f12571b == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f12574e;
        View viewE = drawerLayout.e(i11);
        if (viewE != null) {
            drawerLayout.c(viewE, true);
        }
    }

    @Override // p000a.a
    public final void Z(int i10) {
        this.f12574e.t(i10, this.f12572c.f7218t);
    }

    @Override // p000a.a
    public final void a0(View view, int i10, int i11) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f12574e;
        float width2 = (drawerLayout.b(3, view) ? i10 + width : drawerLayout.getWidth() - i10) / width;
        drawerLayout.p(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // p000a.a
    public final void b0(View view, float f3, float f7) {
        int i10;
        int[] iArr = DrawerLayout.f12532h0;
        float f10 = ((Z1.c) view.getLayoutParams()).f10959b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f12574e;
        if (drawerLayout.b(3, view)) {
            i10 = (f3 > 0.0f || (f3 == 0.0f && f10 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f3 < 0.0f || (f3 == 0.0f && f10 > 0.5f)) {
                width2 -= width;
            }
            i10 = width2;
        }
        this.f12572c.s(i10, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // p000a.a
    public final boolean o0(int i10, View view) {
        if (!DrawerLayout.l(view)) {
            return false;
        }
        int i11 = this.f12571b;
        DrawerLayout drawerLayout = this.f12574e;
        return drawerLayout.b(i11, view) && drawerLayout.g(view) == 0;
    }

    @Override // p000a.a
    public final int p(int i10, View view) {
        DrawerLayout drawerLayout = this.f12574e;
        if (drawerLayout.b(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i10, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i10, width));
    }

    @Override // p000a.a
    public final int q(int i10, View view) {
        return view.getTop();
    }
}
