package com.google.android.material.behavior;

import I1.S;
import J1.d;
import R1.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p151p.V;
import p169q7.a;
import u1.b;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f14609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14612u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f14613v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14614w = 0.5f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f14615x = new a(this);

    @Override // u1.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zT = this.f14610s;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zT = coordinatorLayout.t(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f14610s = zT;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14610s = false;
        }
        if (zT) {
            if (this.f14609r == null) {
                this.f14609r = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f14615x);
            }
            if (!this.f14611t && this.f14609r.t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // u1.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = S.f3689a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.l(1048576, view);
            S.i(0, view);
            if (w(view)) {
                S.m(view, d.f4203n, null, new V(this));
            }
        }
        return false;
    }

    @Override // u1.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f14609r == null) {
            return false;
        }
        if (this.f14611t && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f14609r.m(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
