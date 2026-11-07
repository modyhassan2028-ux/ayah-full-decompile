package com.google.android.material.bottomsheet;

import C6.b;
import H7.C0228b;
import I1.S;
import J1.d;
import Y7.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.ayah.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p193t7.c;
import u1.e;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f14704D = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f14705A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f14706B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f14707C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f14708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BottomSheetBehavior f14709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14712y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f14713z;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f14709v;
        c cVar = this.f14707C;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f14686o0.remove(cVar);
            this.f14709v.I(null);
        }
        this.f14709v = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.I(this);
            e(this.f14709v.f14674c0);
            ArrayList arrayList = this.f14709v.f14686o0;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        f();
    }

    public final boolean a() {
        if (!this.f14711x) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.f14708u;
        if (accessibilityManager != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(this.f14706B);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        BottomSheetBehavior bottomSheetBehavior = this.f14709v;
        boolean z10 = bottomSheetBehavior.f14691s;
        int i10 = bottomSheetBehavior.f14674c0;
        int i11 = 6;
        int i12 = 3;
        if (i10 == 4) {
            if (z10) {
                i11 = i12;
            }
        } else if (i10 != 3) {
            if (!this.f14712y) {
                i12 = 4;
            }
            i11 = i12;
        } else if (z10) {
            i11 = 4;
        }
        bottomSheetBehavior.L(i11);
        return true;
    }

    public final void e(int i10) {
        if (i10 == 4) {
            this.f14712y = true;
        } else if (i10 == 3) {
            this.f14712y = false;
        }
        S.m(this, d.g, this.f14712y ? this.f14713z : this.f14705A, new b(26, this));
    }

    public final void f() {
        this.f14711x = this.f14710w && this.f14709v != null;
        int i10 = this.f14709v == null ? 2 : 1;
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(i10);
        setClickable(this.f14711x);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f14710w = z10;
        f();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof e) {
                u1.b bVar = ((e) layoutParams).f22806a;
                if (bVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) bVar;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f14708u;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f14708u;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i10);
        this.f14713z = getResources().getString(R.string.bottomsheet_action_expand);
        this.f14705A = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f14706B = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f14707C = new c(this, 1);
        this.f14708u = (AccessibilityManager) getContext().getSystemService("accessibility");
        f();
        S.o(this, new C0228b(5, this));
    }
}
