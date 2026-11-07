package com.google.android.material.button;

import H7.C0228b;
import I1.S;
import K0.H;
import R7.C0479a;
import R7.m;
import R7.o;
import Y7.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p151p.C1256n;
import p202u7.d;
import p202u7.e;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f14730B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public HashSet f14731A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f14732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1256n f14733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f14734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final H f14735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer[] f14736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14740z;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = S.f3689a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f14733s);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f14721F);
        o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f14732r.add(new d(shapeAppearanceModel.f7352e, shapeAppearanceModel.f7354h, shapeAppearanceModel.f7353f, shapeAppearanceModel.g));
        materialButton.setEnabled(isEnabled());
        S.o(materialButton, new C0228b(6, this));
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f14731A);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f14738x && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f14739y || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f14731A;
        this.f14731A = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f14737w = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f14737w = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f14734t.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(this, id, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f14735u);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f14736v = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                m mVarG = materialButton.getShapeAppearanceModel().g();
                d dVar2 = (d) this.f14732r.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    C0479a c0479a = d.f22982e;
                    if (i10 == firstVisibleChildIndex) {
                        dVar = z10 ? H7.H.l(this) ? new d(c0479a, c0479a, dVar2.f22984b, dVar2.f22985c) : new d(dVar2.f22983a, dVar2.f22986d, c0479a, c0479a) : new d(dVar2.f22983a, c0479a, dVar2.f22984b, c0479a);
                    } else if (i10 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (z10) {
                        dVar = H7.H.l(this) ? new d(dVar2.f22983a, dVar2.f22986d, c0479a, c0479a) : new d(c0479a, c0479a, dVar2.f22984b, dVar2.f22985c);
                    } else {
                        dVar = new d(c0479a, dVar2.f22986d, c0479a, dVar2.f22985c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    mVarG.b(0.0f);
                } else {
                    mVarG.f7341e = dVar2.f22983a;
                    mVarG.f7343h = dVar2.f22986d;
                    mVarG.f7342f = dVar2.f22984b;
                    mVarG.g = dVar2.f22985c;
                }
                materialButton.setShapeAppearanceModel(mVarG.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f14738x || this.f14731A.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f14731A.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f14731A.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f14736v;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f14740z;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) J1.e.a(1, getVisibleButtonCount(), this.f14738x ? 1 : 2).f4215a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f14732r.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f14739y = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f14738x != z10) {
            this.f14738x = z10;
            d(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.f14738x ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i10);
        this.f14732r = new ArrayList();
        this.f14733s = new C1256n(7, this);
        this.f14734t = new LinkedHashSet();
        this.f14735u = new H(2, this);
        this.f14737w = false;
        this.f14731A = new HashSet();
        TypedArray typedArrayM = H7.H.m(getContext(), attributeSet, p128m7.a.f19633A, i10, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM.getBoolean(3, false));
        this.f14740z = typedArrayM.getResourceId(1, -1);
        this.f14739y = typedArrayM.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM.getBoolean(0, true));
        typedArrayM.recycle();
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
