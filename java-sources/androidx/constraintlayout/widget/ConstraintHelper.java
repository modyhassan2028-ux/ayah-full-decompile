package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import p123m2.c;
import p153p1.e;
import p153p1.j;
import s1.g;
import s1.h;
import s1.m;
import s1.o;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f12260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f12262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f12263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View[] f12265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f12266x;

    public ConstraintHelper(Context context) {
        super(context);
        this.f12260r = new int[32];
        this.f12265w = null;
        this.f12266x = new HashMap();
        this.f12262t = context;
        g(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f12262t == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iE = e(strTrim);
        if (iE != 0) {
            this.f12266x.put(Integer.valueOf(iE), strTrim);
            b(iE);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f12261s + 1;
        int[] iArr = this.f12260r;
        if (i11 > iArr.length) {
            this.f12260r = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f12260r;
        int i12 = this.f12261s;
        iArr2[i12] = i10;
        this.f12261s = i12 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f12261s; i10++) {
            View viewD = constraintLayout.d(this.f12260r[i10]);
            if (viewD != null) {
                viewD.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewD.setTranslationZ(viewD.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f12262t.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    public final int e(String str) {
        int iD;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iD = 0;
        } else {
            Object obj = (c.D(str) && (map = constraintLayout.f12271D) != null && map.containsKey(str)) ? constraintLayout.f12271D.get(str) : null;
            if (obj instanceof Integer) {
                iD = ((Integer) obj).intValue();
            } else {
                iD = 0;
            }
        }
        if (iD == 0 && constraintLayout != null) {
            iD = d(constraintLayout, str);
        }
        if (iD == 0) {
            try {
                iD = o.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iD != 0) {
            return iD;
        }
        Context context = this.f12262t;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public final View[] f(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f12265w;
        if (viewArr == null || viewArr.length != this.f12261s) {
            this.f12265w = new View[this.f12261s];
        }
        for (int i10 = 0; i10 < this.f12261s; i10++) {
            this.f12265w[i10] = constraintLayout.d(this.f12260r[i10]);
        }
        return this.f12265w;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22038b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f12264v = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f12260r, this.f12261s);
    }

    public void h(g gVar, j jVar, m mVar, SparseArray sparseArray) {
        h hVar = gVar.f21936d;
        int[] iArr = hVar.f21970e0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = hVar.f21972f0;
            if (str != null && str.length() > 0) {
                String[] strArrSplit = hVar.f21972f0.split(",");
                getContext();
                int[] iArrCopyOf = new int[strArrSplit.length];
                int i11 = 0;
                for (String str2 : strArrSplit) {
                    int iE = e(str2.trim());
                    if (iE != 0) {
                        iArrCopyOf[i11] = iE;
                        i11++;
                    }
                }
                if (i11 != strArrSplit.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                }
                hVar.f21970e0 = iArrCopyOf;
            }
        }
        jVar.f20974h0 = 0;
        Arrays.fill(jVar.f20973g0, (Object) null);
        if (hVar.f21970e0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = hVar.f21970e0;
            if (i10 >= iArr2.length) {
                return;
            }
            e eVar = (e) sparseArray.get(iArr2[i10]);
            if (eVar != null) {
                jVar.C(eVar);
            }
            i10++;
        }
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public final void l() {
        if (this.f12263u == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof s1.c) {
            ((s1.c) layoutParams).f21902l0 = this.f12263u;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f12264v;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f12264v = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f12261s = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f12264v = null;
        this.f12261s = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12260r = new int[32];
        this.f12265w = null;
        this.f12266x = new HashMap();
        this.f12262t = context;
        g(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12260r = new int[32];
        this.f12265w = null;
        this.f12266x = new HashMap();
        this.f12262t = context;
        g(attributeSet);
    }

    public void j() {
    }

    public void i(e eVar, boolean z10) {
    }
}
