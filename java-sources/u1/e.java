package u1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f22806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22811f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22813i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f22814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f22815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f22819p;

    public e() {
        super(-2, -2);
        this.f22807b = false;
        this.f22808c = 0;
        this.f22809d = 0;
        this.f22810e = -1;
        this.f22811f = -1;
        this.g = 0;
        this.f22812h = 0;
        this.f22819p = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f22816m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f22817n;
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f22807b = false;
        this.f22808c = 0;
        this.f22809d = 0;
        this.f22810e = -1;
        this.f22811f = -1;
        this.g = 0;
        this.f22812h = 0;
        this.f22819p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p188t1.a.f22582b);
        this.f22808c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f22811f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f22809d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f22810e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f22812h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f22807b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f12289K;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f12289K;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f12291M;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f12290L);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(p123m2.c.s("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f22806a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f22806a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f22807b = false;
        this.f22808c = 0;
        this.f22809d = 0;
        this.f22810e = -1;
        this.f22811f = -1;
        this.g = 0;
        this.f22812h = 0;
        this.f22819p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f22807b = false;
        this.f22808c = 0;
        this.f22809d = 0;
        this.f22810e = -1;
        this.f22811f = -1;
        this.g = 0;
        this.f22812h = 0;
        this.f22819p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f22807b = false;
        this.f22808c = 0;
        this.f22809d = 0;
        this.f22810e = -1;
        this.f22811f = -1;
        this.g = 0;
        this.f22812h = 0;
        this.f22819p = new Rect();
    }
}
