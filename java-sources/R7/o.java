package R7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f7347m = new k(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p050e8.b f7348a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p050e8.b f7349b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p050e8.b f7350c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p050e8.b f7351d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0482d f7352e = new C0479a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0482d f7353f = new C0479a(0.0f);
    public InterfaceC0482d g = new C0479a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0482d f7354h = new C0479a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f7355i;
    public f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f7356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f7357l;

    public o() {
        int i10 = 0;
        this.f7355i = new f(i10);
        this.j = new f(i10);
        this.f7356k = new f(i10);
        this.f7357l = new f(i10);
    }

    public static m a(Context context, int i10, int i11) {
        return b(context, i10, i11, new C0479a(0));
    }

    public static m b(Context context, int i10, int i11, InterfaceC0482d interfaceC0482d) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(p128m7.a.f19650W);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            InterfaceC0482d interfaceC0482dE = e(typedArrayObtainStyledAttributes, 5, interfaceC0482d);
            InterfaceC0482d interfaceC0482dE2 = e(typedArrayObtainStyledAttributes, 8, interfaceC0482dE);
            InterfaceC0482d interfaceC0482dE3 = e(typedArrayObtainStyledAttributes, 9, interfaceC0482dE);
            InterfaceC0482d interfaceC0482dE4 = e(typedArrayObtainStyledAttributes, 7, interfaceC0482dE);
            InterfaceC0482d interfaceC0482dE5 = e(typedArrayObtainStyledAttributes, 6, interfaceC0482dE);
            m mVar = new m();
            mVar.f7337a = u0.l(i13);
            mVar.f7341e = interfaceC0482dE2;
            mVar.f7338b = u0.l(i14);
            mVar.f7342f = interfaceC0482dE3;
            mVar.f7339c = u0.l(i15);
            mVar.g = interfaceC0482dE4;
            mVar.f7340d = u0.l(i16);
            mVar.f7343h = interfaceC0482dE5;
            return mVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static m c(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC0482d interfaceC0482d) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19640H, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, interfaceC0482d);
    }

    public static m d(Context context, AttributeSet attributeSet, int i10, int i11) {
        return c(context, attributeSet, i10, i11, new C0479a(0));
    }

    public static InterfaceC0482d e(TypedArray typedArray, int i10, InterfaceC0482d interfaceC0482d) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C0479a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new k(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0482d;
    }

    public final boolean f(RectF rectF) {
        boolean z10 = this.f7357l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.f7355i.getClass().equals(f.class) && this.f7356k.getClass().equals(f.class);
        float fA = this.f7352e.a(rectF);
        return z10 && ((this.f7353f.a(rectF) > fA ? 1 : (this.f7353f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f7354h.a(rectF) > fA ? 1 : (this.f7354h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f7349b instanceof l) && (this.f7348a instanceof l) && (this.f7350c instanceof l) && (this.f7351d instanceof l));
    }

    public final m g() {
        m mVar = new m();
        mVar.f7337a = this.f7348a;
        mVar.f7338b = this.f7349b;
        mVar.f7339c = this.f7350c;
        mVar.f7340d = this.f7351d;
        mVar.f7341e = this.f7352e;
        mVar.f7342f = this.f7353f;
        mVar.g = this.g;
        mVar.f7343h = this.f7354h;
        mVar.f7344i = this.f7355i;
        mVar.j = this.j;
        mVar.f7345k = this.f7356k;
        mVar.f7346l = this.f7357l;
        return mVar;
    }

    public final o h(n nVar) {
        m mVarG = g();
        mVarG.f7341e = nVar.c(this.f7352e);
        mVarG.f7342f = nVar.c(this.f7353f);
        mVarG.f7343h = nVar.c(this.f7354h);
        mVarG.g = nVar.c(this.g);
        return mVarG.a();
    }
}
