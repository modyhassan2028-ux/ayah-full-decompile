package E2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: E2.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0137n0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F0 f1733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1736d;

    public C0137n0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1734b = new Rect();
        this.f1735c = true;
        this.f1736d = false;
    }

    public C0137n0(int i10, int i11) {
        super(i10, i11);
        this.f1734b = new Rect();
        this.f1735c = true;
        this.f1736d = false;
    }

    public C0137n0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1734b = new Rect();
        this.f1735c = true;
        this.f1736d = false;
    }

    public C0137n0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1734b = new Rect();
        this.f1735c = true;
        this.f1736d = false;
    }

    public C0137n0(C0137n0 c0137n0) {
        super((ViewGroup.LayoutParams) c0137n0);
        this.f1734b = new Rect();
        this.f1735c = true;
        this.f1736d = false;
    }
}
