package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p074h0.i;
import p140o.j;
import p140o.k;
import p140o.m;
import p140o.y;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements j, y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f11400s = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f11401r;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // p140o.y
    public final void b(k kVar) {
        this.f11401r = kVar;
    }

    @Override // p140o.j
    public final boolean c(m mVar) {
        return this.f11401r.q(mVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        c((m) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        i iVarB = i.B(context, attributeSet, f11400s, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(iVarB.r(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(iVarB.r(1));
        }
        iVarB.C();
    }
}
