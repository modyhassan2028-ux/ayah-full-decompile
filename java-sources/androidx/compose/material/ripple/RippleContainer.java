package androidx.compose.material.ripple;

import L5.c;
import V.g;
import android.content.Context;
import android.view.ViewGroup;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f11902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f11903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f11904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11905v;

    public RippleContainer(Context context) {
        super(context);
        this.f11901r = 5;
        ArrayList arrayList = new ArrayList();
        this.f11902s = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f11903t = arrayList2;
        this.f11904u = new c(11);
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f11905v = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final RippleHostView a(g gVar) {
        c cVar = this.f11904u;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f5532s;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f5532s;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) cVar.f5533t;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(gVar);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        ArrayList arrayList = this.f11903t;
        j.e(arrayList, "<this>");
        RippleHostView rippleHostView2 = (RippleHostView) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (rippleHostView2 == null) {
            int i10 = this.f11905v;
            ArrayList arrayList2 = this.f11902s;
            if (i10 > AbstractC0813f2.E(arrayList2)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                arrayList2.add(rippleHostView2);
            } else {
                rippleHostView2 = (RippleHostView) arrayList2.get(this.f11905v);
                g gVar2 = (g) linkedHashMap3.get(rippleHostView2);
                if (gVar2 != null) {
                    gVar2.U();
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap2.get(gVar2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap2.remove(gVar2);
                    rippleHostView2.c();
                }
            }
            int i11 = this.f11905v;
            if (i11 < this.f11901r - 1) {
                this.f11905v = i11 + 1;
            } else {
                this.f11905v = 0;
            }
        }
        linkedHashMap2.put(gVar, rippleHostView2);
        linkedHashMap3.put(rippleHostView2, gVar);
        return rippleHostView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
