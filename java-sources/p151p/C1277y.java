package p151p;

import X4.c;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p034d2.g;
import p073h.a;

/* JADX INFO: renamed from: p.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1277y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20803b;

    public C1277y(TextView textView) {
        this.f20802a = textView;
        c cVar = new c();
        cVar.f9953r = new g(textView);
        this.f20803b = cVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((B0.c) this.f20803b.f9953r).F(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f20802a.getContext().obtainStyledAttributes(attributeSet, a.j, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        ((B0.c) this.f20803b.f9953r).c0(z10);
    }

    public final void d(boolean z10) {
        ((B0.c) this.f20803b.f9953r).e0(z10);
    }
}
